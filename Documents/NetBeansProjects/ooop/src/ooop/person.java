
package ooop;

public class person {

    String ID;
    String Name;
    String adress;

    public person(String id, String n, String ad) {
        Name = n;
        ID = id;
        adress = ad;
    }

    person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String Name) {
        this.Name = Name;

    }

    public String getName() {

        return Name;
    }

    public void setID(String Name) {
    }

    public String getID() {
        return ID;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
