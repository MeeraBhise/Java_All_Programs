package AbstractionPractise;

public class Mainn extends Main{
 public void method ()
 {
     System.out.println("abstract class");
 }
 public static void main(String args[])
 {
     System.out.println("main method");
     Mainn m=new Mainn();
     m.method();
     m.method2();

 }
}
