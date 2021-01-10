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
public class ContactCall implements Contact{
    
    private Action a;
    
    public ContactCall(Action a){
        this.a = a;
    }

    @Override
    public String execute(Acquaintances c) {
        return a.call(c);
    }
    
}