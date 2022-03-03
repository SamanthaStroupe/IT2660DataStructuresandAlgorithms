class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    LinkedList l1 = new LinkedList();
    l1.insert(2);
    l1.insert(1);
    l1.insert(7); 
    l1.printLinkedList();
    l1.insertAt(15, 1); 
    System.out.println("Insert At n: ");
    l1.printLinkedList();
    l1.deleteAt(1);
    System.out.println("Delete At n: ");
    l1.printLinkedList();
    l1.insertAtStart(10);
    System.out.println("Insert At Start: ");
    l1.printLinkedList();
    
  }
}