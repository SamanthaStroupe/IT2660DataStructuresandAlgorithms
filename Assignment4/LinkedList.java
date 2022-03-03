class LinkedList{
  Node head = null; 

  public void insert(int data)
  {
    Node node = new Node();
    node.data = data; 

    if(head == null)
    {
      head = node; 
    }

    else
    {
      Node temp = head; 
      while(temp.next != null)
      {
        temp = temp.next; 
      }
      temp.next = node; 
    }
  }

  public void insertAt(int data, int position) // not beginning. 
  {
    Node node = new Node();
    node.data = data; 

    Node temp = head; 

    for(int i = 0; i < position - 1;i ++)
      {
        temp = temp.next; 
      }
    node.next = temp.next; 
    temp.next = node; 
  }
  public void deleteAt(int position)
  {
    Node temp = head; 
    if(position == 0)
    {
      head = temp.next;
      return; 
    }
    for(int i = 0; temp != null && i < position - 1; i++)
      {
        temp = temp.next; 
        if(temp == null || temp.next == null)
        {
          return;
        }
        
      }
    Node next = temp.next.next; 
    temp.next = next; 
  }
  public void insertAtStart(int data)
  {
    Node node = new Node();
    node.data = data;

    node.next = head;
    head = node; 
    
  }
  
  public void printLinkedList()
  {
  Node node = head; 
   while(node.next != null)
     {
       System.out.println(node.data);
       node = node.next;
     }
    System.out.println(node.data);
  }
}