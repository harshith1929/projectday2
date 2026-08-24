package day_4_;


	import java.util.HashSet;

	public class patter_recognition {
		public static void main(String[] args) {
			
			int[] numbers = {10, 20,20, 30 , 40, 50,50};
			
			HashSet<Integer> set = new HashSet<>();
			
			for(int number : numbers) {
				
				if (set.contains(number)) {
					System.out.println("Duplicaates: "+ number);
					
				}else {
					set.add(number);
				}
				
			}
		}
	}

