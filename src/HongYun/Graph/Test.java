package HongYun.Graph;

public class Test {
    public static void main(String[] args) {
        Graph graph=new Graph(3);
        graph.insertNode("A");
        graph.insertNode("B");
        graph.insertNode("C");
        graph.showNodeElement();
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.showMap();
        graph.BFS1();
    }
}
