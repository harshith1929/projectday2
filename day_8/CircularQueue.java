package day_8;

public class CircularQueue {

	    static int front = 0;
	    static int rear = -1;
	    static int[] queue = new int[5];

	    static void enqueue(int value) {

	        if ((rear + 1) % queue.length == front) {
	            System.out.println("Queue is full");
	        } 
	        else {
	            rear = (rear + 1) % queue.length;
	            queue[rear] = value;
	            System.out.println(value + " added");
	        }
	    }

	    static void dequeue() {

	        if (front == (rear + 1) % queue.length) {
	            System.out.println("Queue is empty");
	        } 
	        else {
	            System.out.println(queue[front] + " removed");
	            front = (front + 1) % queue.length;
	        }
	    }

	    static void display() {

	        System.out.println("Queue is available");

	        if (front == (rear + 1) % queue.length) {
	            System.out.println("Queue is empty");
	            return;
	        }

	        int i = front;

	        do {
	            System.out.print(queue[i] + " ");
	            i = (i + 1) % queue.length;
	        } while (i != (rear + 1) % queue.length);

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
	        dequeue();

	        enqueue(60);
	        enqueue(70);

	        display();
	    }
	}

