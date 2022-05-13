import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
     final int NUMBER_OF_NODES = 1000;
       Scanner input = new Scanner(System.in);
       Random rand = new Random();

       LinkedList<BFSNode> bfsNodes = new LinkedList<BFSNode>();
       LinkedList<DFSNode> dfsNodes = new LinkedList<DFSNode>();

       for (int i = 0; i < NUMBER_OF_NODES; i++)
       {
           int n = 1 + rand.nextInt(100000);
           System.out.println(n);
           bfsNodes.add(new BFSNode(n));
           dfsNodes.add(new DFSNode(n));
       }
       
       for (int i = 0; i < NUMBER_OF_NODES; i++)
       {
           int connections = 1 + rand.nextInt(5);

           for (int j = 0; j < connections; j++)
           {
               int k = rand.nextInt(NUMBER_OF_NODES);

               bfsNodes.get(i).addNeighbour(bfsNodes.get(k));
               dfsNodes.get(i).addNeighbour(dfsNodes.get(k));
               int distance = 1 + rand.nextInt(100000);
           }
       }

       System.out.print("Pick a number between 1 and 100000: ");
       int number = input.nextInt();
       input.close();

       BFSNode bfsNumNode = findBFSNode(bfsNodes, number);
       DFSNode dfsNumNode = findDFSNode(dfsNodes, number);
       String result = "Failed";
       int bfsLength = 0;
       int bfsCount = 0;
       int dfsLength = 0;
       int dfsCount = 0;
       
      
       if (bfsNumNode != null && dfsNumNode != null)
       {
           result = "Succsess";
          
           LinkedList<BFSNode> bfsList = new LinkedList<BFSNode>();
           LinkedList<DFSNode> dfsList = new LinkedList<DFSNode>();
          
           BreadthFirstSearchAlgorithm bfsObj = new BreadthFirstSearchAlgorithm();
           bfsCount = bfsObj.bfs(bfsNumNode, bfsList);
           bfsLength = bfsList.size();
          
           DepthFirstSearchAlgorithm dfsObj = new DepthFirstSearchAlgorithm();          
           dfsCount = dfsObj.dfs(dfsNumNode, dfsList);
           dfsLength = dfsList.size();  
          
       }
      
       System.out.println("Breadth-First: " + result);
       System.out.println("Length of shortest path = " + bfsLength);
       System.out.println("Total number of nodes examined: " + bfsCount);          
       System.out.println("Depth-First: Success");
       System.out.println("Length of shortest path = " + dfsLength);
       System.out.println("Total number of nodes examined: " + dfsCount);          
   }

   private static BFSNode findBFSNode(LinkedList<BFSNode> bfsNodes, int number)
   {
       for (int i = 0; i < bfsNodes.size(); i++)
       {
           if (bfsNodes.get(i).getData() == number)
               return bfsNodes.get(i);
       }

       return null;
   }

   private static DFSNode findDFSNode(LinkedList<DFSNode> dfsNodes, int number)
   {
       for (int i = 0; i < dfsNodes.size(); i++)
       {
           if (dfsNodes.get(i).getData() == number)
               return dfsNodes.get(i);
       }

       return null;
   }

   
} 
