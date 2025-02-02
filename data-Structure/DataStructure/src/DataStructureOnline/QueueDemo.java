package DataStructureOnline;

class Queue {
	int a[] = new int[5];
	int r = -1;
	int f = -1;

	public void enqueue(int data) {

		if (r == a.length - 1) {
			System.out.println("stack is full");
		} else if (r == -1 && f == -1) {
			r = 0;
			f = 0;
			a[r] = data;
		} else {
			r++;
			a[r] = data;
		}
	}

	public void display() {
		if (r == -1 && f == -1) {
			System.out.println("queue empty");
		} else {
			for (int i = f; i <= r; i++) {
				System.out.println(a[i]);
			}
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
			f++;
		}
	}

	public void peek() {
		System.out.println("peek = " + a[f]);
	}
}

public class QueueDemo {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();// remove
		q.display();
		q.peek();
		q.enqueue(60);
	}
}
