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
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean friend){   
      if(friend){
         return new FriendFactory();         
      }else{
         return new AcquaintanceFactory();
      }
   }
}
