Object[][] data = {{"house","maison"}, {"apple","pomme"}, {"tree","arbre"}, {"horse","cheval"}, {"yellow","jaune"}, 
			  {"tooth","dent"}};
String[] columnName = {"English", "French"};
DefaultTableModel defaultTableModel = new DefaultTableModel(data,columnName);
table = new JTable(defaultTableModel);
