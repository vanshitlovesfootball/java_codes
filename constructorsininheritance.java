class base{
      int x;

      public base(){
            System.out.println("I am the constructor of base class.");
      }

      public base(int y){

            System.out.println("I am the parameterized constructor of base class with value of y as : "+y);

      }
}

class derived extends base{
      public derived(){

            // super(4);
            System.out.println("I am the constructor of derived class.");
      }

      public derived(int y, int u){
            super(y);
            System.out.println("I am the parameterized constructor of derived class with value of u as : "+u);
      }


}


class childofDerived extends derived{
      public childofDerived(){
            System.out.println("I am the default constructor of childderived class from the derived class.");
      }

      public childofDerived(int y , int u , int z){

            super(y,u);
            System.out.println("I am the parameterized constructor of child derived class wih value of z as : "+z);
      }
}




public class constructorsininheritance {

      public static void main(String[] args) {

            // derived ob1 = new derived(9,7);

            childofDerived ob2 = new childofDerived(3,5,8);

            
            
      }
      
}
