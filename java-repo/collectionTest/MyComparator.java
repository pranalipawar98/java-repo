package collectionTest;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		/*if(i2 > i1)
		{
			return 1;
		}
		else if(i1 > i2)
		{
			return -1;
		}
		else
			return 0;*/
		
		return i2.compareTo(i1);
		
		
	}

	
	
}
