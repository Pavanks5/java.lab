
interface Test
{
    
    public  void square();
    
}

class arth implements Test
{
    public void square()
    {
        System.out.println(" learning interace:");
        
    }
     public void square2()
    {
        System.out.println(" learning interace2:");
        
    }
    
    
}

class Main
{
    public static void main(String [] args)
    {
      arth c1=new arth();
      c1.square();
       arth c2=new arth();
      c1.square();
      
      
    }
}

