package hashmap.test;

import java.util.HashMap;

public class TestHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(1, "abc", 1000);
		Employee e2 = new Employee(2, "abc", 1000);
		
		map.put(e1 , "Developer");
		map.put(e2 , "Developer");
		
		for(Employee obj : map.keySet())
		{
			System.out.println("Key : ["+obj.getEmpId()+", "+obj.getEmpName()+", "+obj.getSalary()+"]" + ">>>> Value : "+map.get(obj));
		}
		
		System.out.println("hashcode : e1 >>>"+ e1.hashCode()+ ", e2 >>>" +e2.hashCode());
		System.out.println("equals "+ e1.equals(e2));
		
	}

}
