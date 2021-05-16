
package restaurantmanager;
import java.util.Scanner;

public class Restaurantmanager {

    
    public static void main(String[] args) {
        System.out.println("What kind of burger do you want?: Normal or Healthy or Deluxe");
        Scanner c=new Scanner (System.in);
       String e=c.next();
       if (e.equals("Normal")){
           NormalSandwich b=new NormalSandwich();
            int x = b.priceOfSandwich();
        System.out.println(x); 
       }
       else if (e.equals("Helthy")){
       HelthyBurger r1=new  HelthyBurger();
     int x = r1.priceOfSandwich();
        System.out.println(x);
    }
       else{
            DeluxeBurger f=new  DeluxeBurger("Deluxe", "beaf","white", 40);
     int x = f.priceOfSandwich();
        System.out.println(x);
       }
   
    
}}