class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println();
        System.out.println("In Order:");

        
        AnimalShelter shelter1 = new AnimalShelter(new Animal("Bob"));
        shelter1.insert(new Animal("Jilly"), 1);
        shelter1.insert(new Animal("Billy"), 0);
        
        shelter1.print();
        System.out.println("Delete: ");
        shelter1.delete(1);
        shelter1.print();

        System.out.println("Append items: ");
        shelter1.append(1, new Animal("Sam"));
        shelter1.print();
  }
}