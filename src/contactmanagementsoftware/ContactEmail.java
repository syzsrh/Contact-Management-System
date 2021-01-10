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
public class ContactEmail implements Contact{
    
    private Action a;
    
    public ContactEmail(Action a){
        this.a = a;
    }

    @Override
    public String execute(Acquaintances c) {
        return a.email(c);
    }
}
