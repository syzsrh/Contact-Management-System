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
public class Action {
    public String poke(Acquaintances a){
        System.out.println("poke");
        return "You're sending a poke to " + a.getName();
    }
    public String call(Acquaintances a){
        System.out.println("call");
        return "You're calling " + a.getMobileNo();
    }
    public String email(Acquaintances a){
        System.out.println("email");
        return "You're emailing " + a.getEmail();
    }
}
