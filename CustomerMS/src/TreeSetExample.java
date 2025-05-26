import java.util.TreeSet;
public class TreeSetExample {
	
	    public static void main(String[] args) {
	        
	        TreeSet<Integer> numbers = new TreeSet<>();

	        
	        numbers.add(10);
	        numbers.add(5);
	        numbers.add(20);
	        numbers.add(1);
	        System.out.println("Sorted numbers: " + numbers);

	        if (numbers.contains(10)) {
	            System.out.println("10 is in the set.");
	        }

	        
	        numbers.remove(5);

	        
	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	    }
	}



