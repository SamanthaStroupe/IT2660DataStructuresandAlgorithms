// This is assignment 30 and 31.
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    DataStructure1 d = new DataStructure1();
       StudentListings s = new StudentListings();
       int option;
       StudentListings u = new StudentListings();

       do
       {
       option = Integer.parseInt(JOptionPane.showInputDialog("1 to insert a new student's information\n"+
           "2 to fetch and output a student's information\n"+
           "3 to delete a student's information\n"+
           "4 to update a student's information\n"+
           "5 to output all the student information in reverse order\n"+
            // I do not know how to get them in reverse order. 
           "6 to exit the program"));

       if(option < 1 || option > 6){
           JOptionPane.showMessageDialog(null, "Input was out of range.");
       }

       switch(option){

       case 1: s.input();
           d.insert(s);
           break;

       case 2: JOptionPane.showMessageDialog(null, d.fetch(name = JOptionPane.showInputDialog("search name")));
           break;

       case 3:   JOptionPane.showMessageDialog(null, d.delete(name = JOptionPane.showInputDialog("student to delete")));
           break;

       case 4: u.input();
           d.update(JOptionPane.showInputDialog(null, "student name to update"), u);
           break;

       case 5: 
           break;
       }
    }while(option != 6);
  }
}