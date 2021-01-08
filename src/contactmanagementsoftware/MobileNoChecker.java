/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author ritz619
 */
public class MobileNoChecker{
    public boolean MobileNoChecker() {
        int x;
        if (number.isEmpty() || number.length() < 6 || number.length() > 15) {
            return false;
        }
        for (int j = 0; j < number.length(); j++) {
            x = (int) number.charAt(j);
            if (x < 48 || x > 57) {
                return false;
            }
        }
        return true;
    }
    
    String number;
    
    public MobileNoChecker(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }
}
