public class AnimalShelter {

    private Animal[] shelter; 
    
    public AnimalShelter(Animal firstAnimal){
        this.shelter = new Animal[1];
        this.shelter[0] = firstAnimal;
    }
    
    public void print()
    {
        for(Animal animal : this.shelter)
        {
            System.out.println(animal.getAnimalName());
        }
    }
    
    public void insert(Animal animal, int position)
    {
        // adding an animal to an empty shelter like in example. 
        // determines if this is the first book and if so, exits method. 
        if(this.shelter.length == 0 && position == 0)
        {
            this.shelter = new Animal[1];
            this.shelter[0] = animal;
            return;
        }
        
        // makes sure that the object is placed in a valid position.
        if(position < 0 || position > this.shelter.length)
        {
            return;
        }
        
        // increase the size of the array.
        Animal[] newAnimalShelter = new Animal[this.shelter.length + 1];
        
        for (int i=0; i<this.shelter.length+1; i++) {
            if (i < position) {
                newAnimalShelter[i] = this.shelter[i];
            }
            else if (i > position) {
                newAnimalShelter[i] = this.shelter[i-1];
            }
            else {
                newAnimalShelter[i] = animal;
            }
    }
    this.shelter = newAnimalShelter;
}

public void delete(int position)
{
  
Animal[] newAnimalShelter = new Animal[shelter.length - 1];
while(position < shelter.length)
{
  newAnimalShelter[position - 1] = shelter[position]; 
  position = position + 1; 
}
shelter = newAnimalShelter; 
}

public void append(int position, Animal name)
{
  shelter[position - 1] =  name;
}
}
