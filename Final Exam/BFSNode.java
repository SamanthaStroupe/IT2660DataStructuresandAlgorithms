import java.util.LinkedList;
public class BFSNode
{
   private int data;
   private boolean visited;
   private LinkedList<BFSNode> neighbours;

   public BFSNode(int newData)
   {
       data = newData;
       neighbours = new LinkedList<BFSNode>();
   }
  
   public int getData()
   {
       return data;
   }
  
   public void setData(int newData)
   {
       data = newData;
   }

   public boolean isVisited()
   {
       return visited;
   }

   public void setVisited(boolean newVisited)
   {
       visited = newVisited;
   }
  
   public void addNeighbour(BFSNode newNeighbour)
   {
       neighbours.add(newNeighbour);
   }

   public LinkedList<BFSNode> getNeighbours()
   {
       return neighbours;
   }

   public void setNeighbours(LinkedList<BFSNode> newNeighbours)
   {
       neighbours = newNeighbours;
   }

   public String toString()
   {
       return "" + data;
   }
}