import java.util.LinkedList;
public class DFSNode
{
   private int data;
   private boolean visited;
   private LinkedList<DFSNode> neighbours;

   DFSNode(int newData)
   {
       data = newData;
       neighbours = new LinkedList<DFSNode>();
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
  
   public void addNeighbour(DFSNode newNeighbour)
   {
       neighbours.add(newNeighbour);
   }

   public LinkedList<DFSNode> getNeighbours()
   {
       return neighbours;
   }

   public void setNeighbours(LinkedList<DFSNode> newNeighbours)
   {
       neighbours = newNeighbours;
   }

   public String toString()
   {
       return "" + data;
   }
}