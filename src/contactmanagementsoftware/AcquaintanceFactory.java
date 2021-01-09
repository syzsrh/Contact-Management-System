/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author Id
 */
public class AcquaintanceFactory extends AbstractFactory{

//    @Override
//    public Acquaintances createAcquaintance(String type) {
//        if (type.equalsIgnoreCase("CasualAcquaintances")) {
//            return new CasualAcquaintances();
//        } else if (type.equalsIgnoreCase("PersonalFriends")) {
//            return new PersonalFriends();
//        } else if (type.equalsIgnoreCase("ProfessionalFriends")) {
//            return new ProfessionalFriends(); 
//        } else if (type.equalsIgnoreCase("Relatives")) {
//            return new Relatives();
//        }
//        return null;
//    }

    @Override
    public Acquaintances createAcquaintances(String type) {
        if (type.equalsIgnoreCase("CasualAcquaintances")) {
            return new CasualAcquaintances();
        }
        else if (type.equalsIgnoreCase("Relatives")) {
            return new Relatives();
        }
        return null;
    }
    
}
