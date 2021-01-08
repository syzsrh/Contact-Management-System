/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author NUR FARAHIN
 */
public class FriendFactory extends AbstractFactory{

    @Override
    public Acquaintances createAcquaintances(String type) {
        if (type.equalsIgnoreCase("PersonalFriends")) {
            return new PersonalFriends();
        } else if (type.equalsIgnoreCase("ProfessionalFriends")) {
            return new ProfessionalFriends(); 
        } 
        return null;
    }
    
}
