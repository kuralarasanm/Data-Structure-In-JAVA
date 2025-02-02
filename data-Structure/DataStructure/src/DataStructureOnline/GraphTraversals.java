package DataStructureOnline;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
class MyGraphs {
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();

	public MyGraphs(int v) {
		for (int i = 0; i < v; i++) {
			list.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elements in list " + 0);
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.println(list.get(i).get(j));
			}
		}
	}

	public void bfs(int v) {
		Queue<Integer> q = new LinkedList();
		boolean visited[] = new boolean[list.size()];
		q.add(v);

		visited[v] = true;
		System.out.println("Breadth first search");
		while (q.size() != 0) {
			int vertex = q.remove();
			System.out.print(vertex + " ");
			for (int i = 0; i < list.get(vertex).size(); i++) {
				int av = list.get(vertex).get(i);
				if (!visited[av]) {
					q.add(av);
					visited[av] = true;
				}
			}
		}
	}
	public void dfs(int v) {//recursion
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[list.size()];
		s.add(v);

		visited[v] = true;
		System.out.println("Depth First Search");
		while (s.size() != 0) {
			int vertex = s.pop();
			System.out.print(+vertex + " ");
			for (int i = 0; i < list.get(vertex).size(); i++) {
				int av = list.get(vertex).get(i);
				if (!visited[av]) {
					s.add(av);
					visited[av] = true;
				}
			}
		}
	}
}

public class GraphTraversals {
	public static void main(String[] args) {
		MyGraphs g = new MyGraphs(5);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
//		g.display();
		g.bfs(0);
		System.out.println();
		g.dfs(0);
	}
}
