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
}
