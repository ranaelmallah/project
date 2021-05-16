package restaurantmanager;

import java.util.Scanner;

class HelthyBurger extends Resturant{

    public HelthyBurger() {
        
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
       Resturant t=new Resturant();
       t.setName("Healthy");
       String q=t.getName();
       t.setTypeOfRollBread("brown");
       String o=t.getTypeOfRollBread();
         System.out.println("what would you prefer: beaf or chicken");
      t.setTypeOfMeat(s.next());
      String e=t.getTypeOfMeat();
        
         if (e.equals("beaf")){
             price=20; }
         else  {
             price=15;    }
         
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
