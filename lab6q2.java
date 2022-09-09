public static Point highestPoint(List<Point> points) {
	    Iterator<Point> pointIterator = points.iterator();
	    Point highestPoint = new Point();
	    Point newPoint = new Point();
	    if(points.size() == 0) {
	    	highestPoint = null;
	    } else if(points.size() == 1) {
		    highestPoint = points.get(0);
		} else {
		    while(pointIterator.hasNext()) {
	    		newPoint = pointIterator.next();
	    		if(highestPoint.y < newPoint.y) {
	    			highestPoint.x = newPoint.x;
	    			highestPoint.y = newPoint.y;
	    		}
		    }
	   
	   }
	    return highestPoint;
	}
