import java.util.Queue;
import java.util.LinkedList;
public class BreadthFirstSearchAlgorithm
{
   public BreadthFirstSearchAlgorithm()
   {}

   public int bfs(BFSNode node, LinkedList<BFSNode> list)
   {
       int count = 0;
       Queue<BFSNode> queue = new LinkedList<BFSNode>();

       queue.add(node);
       node.setVisited(true);

       while (!queue.isEmpty())
       {
           BFSNode currNode = queue.remove();
           list.add(currNode);
           LinkedList<BFSNode> neighbours = currNode.getNeighbours();
           for (int i = 0; i < neighbours.size(); i++)
           {
               count++;
               BFSNode temp = neighbours.get(i);
               if (temp != null && !temp.isVisited())
               {
                   queue.add(temp);
                   temp.setVisited(true);                  
               }
           }
       }

       return count;
   }
}