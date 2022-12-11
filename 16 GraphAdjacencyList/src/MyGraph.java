import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyGraph {
	private HashMap<Integer, List<Integer>> adjacencyList;
	private int numberOfNodes;

	public MyGraph() {
		this.adjacencyList = new HashMap<>();
		this.numberOfNodes = 0;
	}

	public void addNode(int value) {
		adjacencyList.put(value, new ArrayList<>());
		numberOfNodes++;
	}

	public void addEdge(int value1, int value2) {
		adjacencyList.get(value1).add(value2);
		adjacencyList.get(value2).add(value1);
	}

	public void showConnections() {
		Object[] keys = adjacencyList.keySet().toArray();
		for (Object key : keys) {
			System.out.println(key + " ---> " + adjacencyList.get(Integer.parseInt(key.toString())));
		}

//		Set<Integer> keys = adjacencyList.keySet();
//		for (int node : keys) {
//			List<Integer> nodeConnections = adjacencyList.get(node);
//			StringBuilder connections = new StringBuilder();
//			for (int edge : nodeConnections) {
//				connections.append(edge).append(" ");
//			}
//			System.out.println(node + "-->" + connections);
//		}
	}

	public int getNumberOfNodes() {
		return numberOfNodes;
	}

}
