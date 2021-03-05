import java.util.Scanner;

class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Which data type would you use to show the number of cookies in a jar?");

String integer = scan.next();
int score = 0;
if(integer.equals("integer")){
  score++;
}else{
  System.out.print("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to answer if it is raining outside or if it is not?");

String booleanA = scan.next();
if(booleanA.equals("boolean")){
  score++;
}else{
  System.out.print("Wrong Answer. No points awarded");
}
System.out.print("\nWhich data type would you use to show a decimal?");

String doubleA = scan.next();
if(doubleA.equals("\ndouble")){
  score++;
}else{
  System.out.println("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to show a fraction?");

String floatA = scan.next();
if(floatA.equals("float")){
  score++;
}else{
   System.out.println("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to show single letters or numbers?");

String charA = scan.next();
if(charA.equals("char")){
  score++;
}else{
   System.out.println("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to reprsent numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807?");

String longA = scan.next();
if(longA.equals("long")){
  score++;
}else{
    System.out.println("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to represent 32,767 grains of sand on a beach?");

String shortA = scan.next();
if(shortA.equals("short")){
  score++; 
}else{
   System.out.println("Wrong Answer. No points awarded");
}
System.out.println("\nWhich data type would you use to represent 127 monkeys in a forest?");

String byteA = scan.next();
if(byteA.equals("byte")){
  score++;
}else{
  System.out.println("Wrong Answer. No points awarded");
    }
    System.out.println("You got " + score + " points on the quiz");
  }
}