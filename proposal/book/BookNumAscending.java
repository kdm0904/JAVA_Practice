package org.proposal.book;

import java.util.Comparator;

public class BookNumAscending implements Comparator {
	
	public int compare(Object o1, Object o2) {
		 if (o1 instanceof Books && o2 instanceof Books) {
	        	Books s1 = (Books) o1;
	        	Books s2 = (Books) o2;
	 
	            return (s1.bookNum).compareTo(s2.bookNum);
	        }
	        return -1;
	       
	    }

}
