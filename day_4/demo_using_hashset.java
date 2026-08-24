package day_4_;
import java.util.HashSet;
import java.util.Set;

public class demo_using_hashset {


	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        int target =20;

	        Set<Integer> numberSet = new HashSet<>();
	        for (int num : numbers) {
	            numberSet.add(num);
	        }

	        if (numberSet.contains(target)) {
	            System.out.println("Number found");
	        } else {
	            System.out.println("Number not found");
	        }
	    }
	}


