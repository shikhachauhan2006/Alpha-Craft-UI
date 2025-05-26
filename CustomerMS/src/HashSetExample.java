import java.util.HashSet;
public class HashSetExample {

	    public static void main(String[] args) {
	        
	        HashSet<String> fruits = new HashSet<>();

	        
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple"); 

	        
	        System.out.println("Fruits: " + fruits);

	        
	        if (fruits.contains("Banana")) {
	            System.out.println("Banana is in the set.");
	        }

	        
	        fruits.remove("Orange");

	        
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}



