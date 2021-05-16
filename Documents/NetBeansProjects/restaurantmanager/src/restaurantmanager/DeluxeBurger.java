package restaurantmanager;

import java.util.Scanner;


public class DeluxeBurger extends Resturant {

    public DeluxeBurger(String name, String TypeOfMeat, String TypeOfRollBread, int price) {
        super("Deluxe", "beaf","white", 40);
    }

     final int tomatoPrice=5;
     final int drinkPrice=15;

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }
      public int priceOfSandwich(){
       Scanner s =new Scanner (System.in);
       Resturant t=new Resturant("Deluxe", "beaf","white", 40);
       
          System.out.println("Are you want any additions?: yes or No");
          String n=s.next();
          String test ="yes";
          if (n.equals(test)){
              System.out.println("Do you want extra tomato");
             String v=s.next();
             if (v.equals(test)){
                 price+=tomatoPrice;   }
             
                System.out.println("Do you want drink");
             String w=s.next();
             if (w.equals(test)){
                 price+=drinkPrice;
             }  }
       return price;}
  
 
}