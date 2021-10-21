class Prims { 

// Number of vertices in the graph 

 int V = 5; 

// function to find the vertex with minimum key 

int minKey(int key[], Boolean mstSet[]){ 

// Initialize min value 

int min = Integer.MAX_VALUE, min_index = -1; 

for (int v = 0; v < V; v++) 

if (mstSet[v] == false && key[v] < min) { 

min = key[v]; 

min_index = v; 

} 

return min_index; 

} 

void printMST(int parent[], int graph[][]) 

{ 

System.out.println("Edge \tWeight"); 

for (int i = 1; i < V; i++) 

System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]); 

} 

    void primMST(int graph[][]) 

{ 

// Array to store constructed MST 

int parent[] = new int[V]; 

// Key values used to pick minimum weight edge in cut 

int key[] = new int[V]; 

// To represent set of vertices not yet included in MST 

Boolean mstSet[] = new Boolean[V]; 

// Initialize all keys as INFINITE 

for (int i = 0; i < V; i++) { 

key[i] = Integer.MAX_VALUE; 

mstSet[i] = false; 

} 

// Always include first 1st vertex in MST. 

key[0] = 0; // Make key 0 so that this vertex is 

// picked as first vertex 

parent[0] = -1; // First node is always root of MST 

// The MST will have V vertices 

for (int count = 0; count < V - 1; count++) { 

// Pick thd minimum key vertex from the set of vertices 

// not yet included in MST 

int u = minKey(key, mstSet); 

// Add the picked vertex to the MST Set 

mstSet[u] = true; 

 for (int v = 0; v < V; v++) 

if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) { 

parent[v] = u; 

key[v] = graph[u][v]; 

} 

} 

        printMST(parent, graph); 

} 

public static void main(String[] args) 

{ 

Prims t = new Prims(); 

int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 

{ 2, 0, 3, 8, 5 }, 

{ 0, 3, 0, 0, 7 }, 

{ 6, 8, 0, 0, 9 }, 

{ 0, 5, 7, 9, 0 } }; 

    t.primMST(graph); 

} 

}

