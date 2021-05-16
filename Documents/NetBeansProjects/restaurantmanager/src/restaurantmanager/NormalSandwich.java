
package restaurantmanager;
import java.util.Scanner;
public class NormalSandwich extends Resturant{
     
  final int cheesePrice=10;
  final int potatoPrice=9;
  final int tomatoPrice=5;
  final int drinkPrice=15;
 
 

    public NormalSandwich() {
        
    }

       public int getCheesePrice() {
        return cheesePrice;
    }

    public int getPotatoPrice() {
        return potatoPrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }
    
   
    
     public int priceOfSandwich(){
       Scanner s =new Scanner (System.in);
       Resturant t=new Resturant();
         System.out.println("what would you prefer: beaf or chicken");
      t.setTypeOfMeat(s.next());
      String e=t.getTypeOfMeat();
         System.out.println("what would you prefer: brown bread or white bread");
         t.setTypeOfRollBread(   s.next());
         String f=t.getTypeOfRollBread();
         if (f.equals("brown")&&e.equals("beaf")){
             price=20; }
         else  if (f.equals("brown")&&e.equals("chicken")){
             price=15;    }
           else  if (f.equals("white")&&e.equals("chicken")){
             price=25;    }
           else  {
             price=30; }
          System.out.println("Are you want any additions?: yes or No");
          String n=s.next();
          String test ="yes";
          if (n.equals(test)){
              System.out.println("Do you want extra tomato");
             String v=s.next();
             if (v.equals(test)){
                 price+=tomatoPrice;   }
               System.out.println("Do you want extra potato");
             String l=s.next();
             if (l.equals(test)){
                 price+=potatoPrice;  }
               System.out.println("Do you want extra cheese");
             String z=s.next();
             if (z.equals(test)){
                 price+=cheesePrice;  }
                System.out.println("Do you want drink");
             String w=s.next();
             if (w.equals(test)){
                 price+=drinkPrice;
             }  }
       return price;}
  
 
     }
