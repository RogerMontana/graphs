package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GraphAdjList extends Graph {

	private Map<Integer, ArrayList<Integer>> adjListMap;

	public void implementAddVertex() {
		int numV = getNumVertices();
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		adjListMap.put(numV, neighbors);

	}

	public void implementAddEdge(int v, int w) {
		(adjListMap.get(v)).add(w);
	}

	public List<Integer> getNeighbours(int v) {
		return new ArrayList<Integer>(adjListMap.get(v));
	}

	public List<Integer> getDistance(int v) {
		List<Integer> twoHop = new ArrayList<Integer>();
		List<Integer> oneHop = adjListMap.get(v);
		for (Integer vertex : oneHop) {
			getNeighbours(vertex);

		}
		return new ArrayList<Integer>();
		
	}
}
