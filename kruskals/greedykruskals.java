
import java.util.*;

class greedykruskals{

	class Edge implements Comparable<Edge>{
		
		int source,destination,weight;
		
		@Override
		public int compareTo(Edge o) {
			
			return this.weight-o.weight;
		}
		
	};
	
	
	class subset{
		int parent,rank;
	};
	
	int vertices,edges;
	Edge edge[];
	
	
	greedykruskals(int v,int e){
		vertices=v;
		edges=e;
		edge=new Edge[edges];
		
		for(int i=0;i<e;i++) 
			edge[i]=new Edge();
		
		
	}
	
	int find(subset subsets[],int i) {
		if(subsets[i].parent!=i) 
			subsets[i].parent=find(subsets,subsets[i].parent);
			return subsets[i].parent;
	}
	
	void union(subset subsets[],int x,int y) {
		
		int xroot=find(subsets,x);
		int yroot=find(subsets,y);
		
		if(subsets[xroot].rank<subsets[yroot].rank)
			subsets[xroot].parent=yroot;
		else if(subsets[xroot].rank>subsets[yroot].rank)
			subsets[yroot].parent=xroot;
		else {
			subsets[yroot].parent=xroot;
			subsets[xroot].rank++;
		}
	}
	
	
	
	void kruskalsalgo() {
		Edge result[]=new Edge[vertices];
		
		int e=0;
		int i=0;
		
		for(i=0;i<vertices;++i) 
			result[i]=new Edge();
		
	
	    Arrays.sort(edge);
	    subset subsets[] = new subset[vertices];
	    for (i = 0; i < vertices; ++i)
	      subsets[i] = new subset();

	    for (int v = 0; v < vertices; ++v) {
	      subsets[v].parent = v;
	      subsets[v].rank = 0;
	    }
	    i = 0;
	    while (e < vertices - 1) {
	      Edge next_edge = new Edge();
	      next_edge = edge[i++];
	      int x = find(subsets, next_edge.source);
	      int y = find(subsets, next_edge.destination);
	      if (x != y) {
	        result[e++] = next_edge;
	        union(subsets, x, y);
	      }
	    }
	    for (i = 0; i < e; ++i)
	      System.out.println(result[i].source + " - " + result[i].destination + ": " + result[i].weight);
	  }
public static void main(String[] args) {
    int vertices = 6; 
    int edges = 8; 
    greedykruskals G = new greedykruskals(vertices, edges);

    G.edge[0].source = 0;
    G.edge[0].destination = 1;
    G.edge[0].weight = 4;

    G.edge[1].source = 0;
    G.edge[1].destination = 2;
    G.edge[1].weight = 4;

    G.edge[2].source = 1;
    G.edge[2].destination = 2;
    G.edge[2].weight = 2;

    G.edge[3].source = 2;
    G.edge[3].destination = 3;
    G.edge[3].weight = 3;

    G.edge[4].source = 2;
    G.edge[4].destination = 5;
    G.edge[4].weight = 2;

    G.edge[5].source = 2;
    G.edge[5].destination = 4;
    G.edge[5].weight = 4;

    G.edge[6].source = 3;
    G.edge[6].destination = 4;
    G.edge[6].weight = 3;

    G.edge[7].source = 5;
    G.edge[7].destination = 4;
    G.edge[7].weight = 3;
    G.kruskalsalgo();
  }
}
	

