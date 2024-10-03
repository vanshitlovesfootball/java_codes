interface Mycamera{
      void recordVideo4k();
      void takeSnap();
}

interface Mywifi{
      String [] getNetworks();

      void connectToNetworks(String Networks);
}


class MycellPhone{


      void makingCall(int phoneNumber){
            // this.phoneNumber= phoneNumber;
            System.out.println("Calling : "+phoneNumber);
      }

      void muteCall(){
            System.out.println("Your call is muted..");
      }



}


class Mysmartphone extends MycellPhone implements Mycamera,Mywifi{

      public void recordVideo4k(){
            System.out.println("Wow what a camera quality!!!!!");
      }

      public void takeSnap(){
            System.out.println("Taking snap");
      }

      public String [] getNetworks(){
            System.out.println("Connecting to networks");
            String [] networklist={"4g" , "Router" , "5g" , "Broadband"};
            return networklist;
      }

      public void connectToNetworks(String Networks){
            System.out.println("Connecting to : "+Networks);
      }




+
}


public class interfaceclass {
      public static void main(String[] args) {

            Mysmartphone ob = new Mysmartphone();  
            String [] arr= ob.getNetworks();
            for(String item : arr){
                  System.out.println(item);
            }

            ob.makingCall(97295246);
            ob.connectToNetworks("4g");
            
      }
      C:\Users\HP\Desktop\Java\interfaceclass.java
}
