package DataStructureOnline;

import java.util.ArrayList;

class MyGraph{
	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	public MyGraph(int v) {
		for(int i=0;i<v;i++) {
			list.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u,int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	public void display() {
		for(int i=0;i<list.size();i++) {
			System.out.println("Elements in list "+0);
			for(int j=0;j<list.get(i).size();j++) {
				System.out.println(list.get(i).get(j));
			}
		}
	}
	
}
public class GraphRepresentations {
	public static void main(String[] args) {
		MyGraph g=new MyGraph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.display();
	}
}
