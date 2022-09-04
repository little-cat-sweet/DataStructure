package HongYun.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

//This is the structure of Graph. And this is use cornerLinkMatrix.
public class Graph {
    //Storing the map's real size.
    private int mapSize;
    //Storing the nodes.
    private ArrayList<String> nodeList;
    //Storing the edgeNumbers of the map.
    private int edgeNumbers;
    //Storing the map.
    private int [][] map;
    //Storing the nodesNumber of this map.
    private int nodesNumber;
    //Storing the sign whether the element has been visited.
    private boolean[] isVisited;
    public Graph(int n){
        this.mapSize=n;
        nodeList=new ArrayList<>(n);
        map=new int[n][n];
        isVisited=new boolean[n];
    }
    //Insert a element to this map.
    public void insertNode(String element) {
        if (nodesNumber < mapSize) {
            nodeList.add(element);
            nodesNumber++;
        } else {
            System.out.println("This arrayList has been fulled, and you can't add anymore..");
        }
    }
    //Insert a edge to this map.
    public void insertEdge(int location1, int location2, int weight) {
        if (location1 <= nodeList.size() || location2 <= nodeList.size()) {
            map[location1][location2] = weight;
            map[location2][location1] = weight;
            edgeNumbers++;
        } else if (location1 == location2) {
            System.out.println("This location1 can't equals location2");

        } else {
            System.out.println("The location which you insert is not in map's range..");
        }
    }
    //Get the nowadays element's size of this map.
    public int getNodesNumber(){
        return nodesNumber;
    }
    //Get the edgesNumber of this map.
    public int getEdgeNumbers(){
        return edgeNumbers;
    }
    //Get the element what the location is i in the ArrayList.
    public String getElement(int i){
        return  nodeList.get(i);

    }
    //Show the map.
    public void showMap(){
        for (int i=0;i<nodesNumber;i++){
            for(int j=0;j<nodesNumber;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
    }
    //Show the element of this map.
    public void showNodeElement(){
        System.out.println(nodeList);
    }

    //Show the element of this map by Depth First Search..
    private void DFS(boolean[] isVisited,int i){
        //Show the element which the index is i.
        System.out.print(getElement(i)+"->");
        //Set the sign that signify the element has been showed.
        isVisited[i]=true;
        //Get the firstNeighbor's index, and it will used in judge whether the firstNeighbor is exist..
        int test=getFirstNeighbor(i);
        //If the firstNeighbor is exist..
        while (test!=-1){
            if(!isVisited[test]){
                DFS(isVisited,test);
            }
            test=getNextNeighbor(i,test);
        }
    }
    //Make every node do the DFS()..
    public void DFS(){
        for(int i=0;i<getNodesNumber();i++){
            if(!isVisited[i]){
                DFS(isVisited,i);
            }
        }
    }
    //Get the firstNeighbor of the element which the index is index.
    public int getFirstNeighbor(int index){
        for(int i=0;i<nodeList.size();i++){
            if(map[index][i]==1){
                return i;
            }
        }
        return -1;
    }
    //Get the element which the index is index 's firstNeighbor's firstNeighbor.
    public int getNextNeighbor(int index,int j){
        for(int m=j+1;m<nodeList.size();m++){
            if(map[index][m]==1){
                return m;
            }
        }
        return -1;
    }

    //This is the way which is the Broad First Search.
    private void BFS(boolean[] isVisited,int n){
        //Visit the element. Case it's the original element, it can't be visited.
        System.out.print(getElement(n)+"->");
        //Make a sign which is signify the element has been visited.
        isVisited[n]=true;
        //Storing the headElement of queue.
        int h=0;
        LinkedList queue=new LinkedList();
        queue.addFirst(n);
        //Judging the queue whether is null. If the queue is not null, then just do the algorithm, or the algorithm is gone.
        while (!queue.isEmpty()){
            //Get the head of queue.
            h=(Integer) queue.removeFirst();
            //Get the firstNeighborElement's index.
            int firstNeighbor=getFirstNeighbor(h);
            //Judging the firstNeighbor whether is exist. If is exist, then do the code which is below this line.
            while (firstNeighbor!=-1){
                //Judging the firstNeighbor whether is visited. If it hasn't been visited,
                // then visit it and make it be visit.
                //And make it into the queue.
                if(!isVisited[firstNeighbor]){
                    System.out.print(getElement(firstNeighbor)+"->");
                    isVisited[firstNeighbor]=true;
                    queue.addLast(firstNeighbor);
                }
                //Get the firstNeighbor of firstNeighbor's firstNeighbor. And the firstNeighbor is a opposite concept.
                firstNeighbor=getNextNeighbor(h,firstNeighbor);
            }
        }

    }
    //The final BFS
    public void BFS(){
        //Make every element which is not visited do the BFS.
        for(int i=0;i<getNodesNumber();i++){
            //Judging the element whether is been visited.
            if(!isVisited[i]){
                BFS(isVisited,i);
            }
        }
    }
    //This is test method
    //This is own findTheFirstNode.
    public int getFirstNext(int now){
        int i=0;
        while (i<getNodesNumber()){
            if(map[now][i]==1&&!isVisited[i]){
                return i;
            }
            i=i+1;
        }
        return -1;
    }
    //And I won, in the end.
    //This is a test method
    public void DFS1(int index){
        System.out.print(getElement(index)+"->");
        isVisited[index]=true;
        int firstNext=getFirstNext(index);
        if(firstNext!=-1){
            DFS1(firstNext);
        }
    }
    //This is a test..
    public void DFS1(){
        for(int i=0;i<getNodesNumber();i++){
            if(!isVisited[i]){
                DFS1(i);
            }
        }
    }
    //This is made by own ..
    public void BFS1(int i){
        System.out.print(getElement(i)+"->");
        isVisited[i]=true;
        while (getFirstNext(i)!=-1 && i <getNodesNumber()){
            System.out.print(getElement(getFirstNext(i))+"->");
            isVisited[getFirstNext(i)]=true;

        }
    }
    //This is made by own.
    public void BFS1(){
        for(int i=0;i<getNodesNumber();i++){
            if(!isVisited[i]){
                BFS1(i);
            }
        }
    }
}
