class Stack
{
  int[] stack;
  int top = 0;
  
  public Stack(int num){
        this.stack = new int[1];
        this.stack[0] = num;
        top++;
    }
  
  public void print(){
    for(int i = 0; i < stack.length; i++)
    {
      System.out.println(stack[i]);
    }
  }

  public void push(int data)
  {
    if(this.stack.length == 0 && top == 0)
    {
      this.stack = new int[1];
      this.stack[0] = data;
      return;
    }
    
    int[] newstack = new int[this.stack.length + 1];
    for (int i=0; i<this.stack.length+1; i++) {
            if (i < top) {
                newstack[i] = this.stack[i];
            }
            else if (i > top) {
                newstack[i] = this.stack[i-1];
            }
            else {
                newstack[i] = data;
            }
    }
    this.stack = newstack;
    top++;
     
  }

  public void pop()
  {
     int[] newstack = new int[top-1];
     
        
        for(int i = 0; i < top; i++)
        {
        newstack[i] = this.stack[i];
        top--;
        
        } 
        top = newstack.length;
        stack = newstack; 
        
          
        }
  
}