/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author sarahsyazwina
 */
public class ContactManager {
    Contact c;
    
    public void setContact(Contact c){
        this.c = c;
    }
    
    public String process(Acquaintances a){
        return c.execute(a);
    }
}
