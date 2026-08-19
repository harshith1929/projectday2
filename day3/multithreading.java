package day_3;
public class multithreading extends Thread {
		public void run() {
			for(int i=0;i<5;i++) {
			System.out.println("method" +i);
			}
		}
		public static void main(String[] args) {
			multithreading bb=new multithreading();
			bb.start();
			for(int i=0;i<5;i++) {
			System.out.println("main method"+i);	
	}
	}
}
