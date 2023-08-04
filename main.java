import java.util.Scanner; //Import the scanner class;

public class MyClass {
    public static void main(String args[]) {
        
      Scanner myObj = new Scanner(System.in); // Created a scanner object
      System.out.println("Insira os 3 lados do triangulo");
      
      float x = myObj.nextFloat();
      float y = myObj.nextFloat();
      float z = myObj.nextFloat();
      checkTriangle(x,y,z);   
    }
    
    static void checkTriangle(float x, float y, float z){
      
     
        if(x == y && y == z){
            
              System.out.println("Triangulo equilatero.");
        }
         else if(x == y || x == z || y == z){
            
            
              System.out.println("Triangulo Isosceles");
              
        }
         else{
              System.out.println("Triangulo Escaleno.");
        }
    }
}
