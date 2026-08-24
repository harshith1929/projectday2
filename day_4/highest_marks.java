package day_4_;

public class highest_marks {
	public static void main(String[]args) {

		        int[] marks = {78, 65, 89, 92, 71};

		        int highestMark = marks[0];
		       
		        for (int i = 1; i < marks.length; i++) {
		            if (marks[i] > highestMark) {
		                highestMark = marks[i];
		            }
		        }
		        
		        System.out.println("The highest mark is: " + highestMark);
		    }
		
		
	}


