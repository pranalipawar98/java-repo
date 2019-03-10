package collectionTest;

import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet<>(new MyComparator());
		t.add(20);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(10);
		System.out.println(t);
		
	}

}
