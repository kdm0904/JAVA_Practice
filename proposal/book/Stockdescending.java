package org.proposal.book;

import java.util.Comparator;


public class Stockdescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		 if (o1 instanceof Book&& o2 instanceof Book) {
	            Books s1 = (Books) o1;
	            Books s2 = (Books) o2;
	            return (s1.sells < s2.sells) ? 1 : (s1.sells == s2.sells ? 0 : -1);
	        }
	        return -1;
	}

}
