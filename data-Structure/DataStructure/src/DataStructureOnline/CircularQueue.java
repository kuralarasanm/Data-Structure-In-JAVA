package DataStructureOnline;

class Queue1 {
	int a[] = new int[5];
	int r = -1;
	int f = -1;

	public void enqueue(int data) {

		if (f == (r + 1) % 5) {
			System.out.println("stack is full");
		} else if (r == -1 && f == -1) {
			r = 0;
			f = 0;
			a[r] = data;
		} else {
			r = (r + 1) % 5;
			a[r] = data;
		}
	}

	public void display() {
		if (r == -1 && f == -1) {
			System.out.println("queue empty");
		} else {
			int i = f;
			while (i != r) {
				System.out.println(a[i]);
				i = (i + 1) % 5;
			}
			System.out.println(a[r]);
		}
	}

	public void dequeue() {
		if (r == -1 && f == -1) {
			System.out.println("queue empty");
		} else if (r == f) {
			System.out.println("popped element = " + a[f]);
			r = -1;
			f = -1;

		} else {
			System.out.println("popped element = " + a[f]);
			f = (f + 1) % 5;
		}
	}

	public void peek() {
		System.out.println("peek = " + a[f]);
	}
}

public class CircularQueue {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.display();
		System.out.println("-----------------------------------");
		q.peek();
		q.enqueue(60);
		q.display();
	}
}
