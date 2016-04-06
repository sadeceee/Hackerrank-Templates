package dataStructure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Tim Kilian on 3/30/16.
 */
abstract class Graph {
    Set<Node> graph = new HashSet<>();
    Set<Edge> edges = new HashSet<>();
    public void addNode(Node n) { graph.add(n); }
    public boolean containsNode(Node m) { for (Node n : graph) if (n.equals(m)) return true; return false; }
    public boolean containsNode(int id) { for (Node n : graph) if (n.id==id) return true; return false; }
    public Node getNode(int id) { for (Node n : graph) if (n.id==id) return n; return null; }
    public Edge getEdge(Node a, Node b) { for (Edge e : edges) if(e.start.equals(a) && e.end.equals(b)) return e; return null; }
    public Edge getEdge(int a, int b) { for (Edge e : edges) if(e.start.id==a && e.end.id==b) return e; return null; }
    public abstract void bindNodes(Node a, Node b);
    public abstract void bindNodes(Node a, Node b, int w);
}

class UndirectedGraph extends Graph {
    public void bindNodes(Node a, Node b) { edges.add(new Edge(a, b)); edges.add(new Edge(b, a)); }
    public void bindNodes(Node a, Node b, int w) { edges.add(new Edge(a, b, w)); edges.add(new Edge(b, a, w)); }
}

class DirectedGraph extends Graph {
    public void bindNodes(Node a, Node b) { edges.add(new Edge(a, b)); }
    public void bindNodes(Node a, Node b, int w) { edges.add(new Edge(a, b, w)); }
}

class Node implements Comparable {
    int id;
    int data;
    Set<Node> children = new TreeSet<>();
    public Node(int i) { id=i; }
    public Node(int i, int d) { id=i; data=d; }
    public Node(int i, Node node) { id=i; children.add(node); }
    public Node(int i, int d, Node node) { id=i; data=d; children.add(node); }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return id == node.id;
    }
    @Override
    public int hashCode() { return id; }
    @Override
    public int compareTo(Object o) {
        Node n = (Node) o;
        if (id<n.id) return -1;
        if (id>n.id) return 1;
        return 0;
    }
}

class Edge {
    int weight = 0;
    Node start;
    Node end;
    public Edge(Node a, Node b) { start=a; end=b; a.children.add(b); }
    public Edge(Node a, Node b, int w) { start=a; end=b; a.children.add(b); weight=w; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        if (!start.equals(edge.start)) return false;
        return end.equals(edge.end);
    }
    @Override
    public int hashCode() { return  31 * start.hashCode() + end.hashCode(); }
}
