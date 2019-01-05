import java.util.HashMap;
import java.util.Map;

public class TestPassByValue {

	public int num =0;
	
	
	public TestPassByValue(int num) {
		super();
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 4;
		Integer i2 = 5;
		
		TestPassByValue obj1 = new TestPassByValue(1);
		TestPassByValue obj2 = new TestPassByValue(1);
	
		//TestPassByValue.show( i1, i2);
		System.out.println("i1 = "+i1 + "	i2 = "+ i2);
		
		//modify(obj1, obj2);
		System.out.println("obj1.num : "+obj1.num + "		obj2.num : "+obj2.num); Map<String,String> gfg = new HashMap<String,String>(); 
      
		// Map iteration methods
		
		Map<String, String> m = new HashMap<>();
		
        m.put("GFG", "geeksforgeeks.org"); 
        m.put("Practice", "practice.geeksforgeeks.org"); 
        m.put("Code", "code.geeksforgeeks.org"); 
        m.put("Quiz", "quiz.geeksforgeeks.org"); 
        
        //method 1  
		for (Map.Entry<String, String> entry : m.entrySet())
		{
			System.out.println(entry.getKey() + ">>  "+entry.getValue());
		}
		
		//method 2
		for(String key1 : m.keySet())
		{
			System.out.println(key1);
		}
		
		
		
	}
	/*public static void show(int x1, Integer x2)
	{
		x1 = 8;
		x2 = 10;
	}
	
	public static void modify(TestPassByValue a1, TestPassByValue b1) {
        a1.num++;
        
        b1 = new TestPassByValue(1);
        b1.num++;
    }*/

}
