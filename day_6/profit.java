package day_6;

public class profit {
	public static void main(String[] args) {
		int[] profit = {5,3,-2,4,-10,6,2};
		int currentprofit = 0;
		int bestprofit=0;
		for(int i=0; i < profit.length; i++) {
			currentprofit = currentprofit + profit[i];
			if(currentprofit<0) {
				currentprofit = 0;
				
			}
			if(currentprofit > bestprofit) {
				bestprofit = currentprofit;
			}
		}
		System.out.println("Maximum Profit="+ bestprofit);
	}

}
