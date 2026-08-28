package day_8;

public class queue {


	    static int front = 0;
	    static int rear = -1;
	    static int[] queue = new int[5];

	    static void enqueue(int value) {

	        if (rear == queue.length - 1) {
	            System.out.println("Queue is full");
	        } 
	        else {
	            rear++;
	            queue[rear] = value;
	            System.out.println(value + " added");
	        }
	    }

	    static void dequeue() {

	        if (front > rear) {
	            System.out.println("Queue is empty");
	        } 
	        else {
	            System.out.println(queue[front] + " removed");
	            front++;
	        }
	    }

	    static void display() {

	        System.out.println("Queue is available");

	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {

	        enqueue(10);
	        enqueue(20);
	        enqueue(30);
	        enqueue(40);
	        enqueue(50);

	        display();

	        dequeue();

	        display();
	    }
	}


