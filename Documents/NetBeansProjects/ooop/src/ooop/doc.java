/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooop;

/**
 *
 * @author Rana
 */
public class doc extends person {
    String salary ;
    public doc( String s,String id, String n, String ad) {
        super(id, n, ad);
   this.salary =s; 
    }

    doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
public String getSalary()
{
return salary;
}
    
    

}
