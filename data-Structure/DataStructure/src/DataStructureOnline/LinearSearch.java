package DataStructureOnline;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		// 0 1 2 3 4 5
		int a[] = { 10, 30, 22, 19, 63, 73 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key : ");
		int key = sc.nextInt();

		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Found at " + i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Element not found");
		}
	}
}
