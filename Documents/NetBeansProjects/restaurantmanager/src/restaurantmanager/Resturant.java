package restaurantmanager;


public class Resturant {
  private String name;
  private String TypeOfMeat;
 private  String TypeOfRollBread;
   int price;
    public Resturant() {
          }

    public Resturant(String name, String TypeOfMeat, String TypeOfRollBread, int price) {
        this.name = name;
        this.TypeOfMeat = TypeOfMeat;
        this.TypeOfRollBread = TypeOfRollBread;
        this.price = price;
    }
    
    public String getName() {
        return name;  }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeOfMeat() {
        return TypeOfMeat;
    }
    public void setTypeOfMeat(String TypeOfMeat) {
        this.TypeOfMeat = TypeOfMeat;
    }
    public String getTypeOfRollBread() {
        return TypeOfRollBread;
    }
    public void setTypeOfRollBread(String TypeOfRollBread) {
        this.TypeOfRollBread = TypeOfRollBread;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
}