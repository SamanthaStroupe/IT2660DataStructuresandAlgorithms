import java.util.Stack;
import java.util.LinkedList;
public class DepthFirstSearchAlgorithm
{
   public DepthFirstSearchAlgorithm()
   {}

   public int dfs(DFSNode node, LinkedList<DFSNode> list)
   {
       int count = 0;
       Stack<DFSNode> stack = new Stack<DFSNode>();
       stack.add(node);

       while (!stack.isEmpty())
       {
           count++;
           DFSNode currNode = stack.pop();
           if (!currNode.isVisited())
           {
               list.add(currNode);
               currNode.setVisited(true);
           }

           LinkedList<DFSNode> neighbours = currNode.getNeighbours();
           for (int i = 0; i < neighbours.size(); i++)
           {
               count++;
               DFSNode temp = neighbours.get(i);
               if (temp != null && !temp.isVisited())
               {
                   stack.add(temp);
               }
           }
       }

       return count;
   }
}