package org.proposal.book.ex;

import java.util.Comparator;

public class BookNumDescending implements Comparator {
	
	public int compare(Object o1, Object o2) {
	        if (o1 instanceof Books && o2 instanceof Books) {
	        	Books s1 = (Books) o1;
	        	Books s2 = (Books) o2;
	 
	            return (s1.bookNum < s2.bookNum) ? 1 : (s1.bookNum == s2.bookNum ? 0 : -1);
	        }
	        return -1;
	    }

}
