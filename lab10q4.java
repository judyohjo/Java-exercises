 public DefaultMutableTreeNode createCountryNode(String countryName, String[] cities) {
	  DefaultMutableTreeNode country = new DefaultMutableTreeNode(countryName);
	  DefaultMutableTreeNode child = new DefaultMutableTreeNode();
	  for(int i=0; i<cities.length; i++) {
		  child = new DefaultMutableTreeNode(cities[i]);
		  country.add(child);
	  }
	  return country;
  }
