package DataStructureOnline;

class Stack {
	int a[] = new int[5];
	int top = -1;

	public void push(int data) {
		if (top == a.length - 1) {
			System.out.println("stack is full");
		} else {
			top++;
			a[top] = data;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("stack empty");
		} else {
			System.out.println("popped element = " + a[top]);
			top--;
		}
	}

	public void peek() {
		if (top == -1) {
			System.out.println("stack empty");
		} else {
			System.out.println("peek element = " + a[top]);
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("stack empty");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(a[i]);
			}
		}
	}
}

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.peek();
		s.pop();
		s.display();
	}
}
