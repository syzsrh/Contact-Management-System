/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.Serializable;

/**
 *
 * @author Mohid Khan
 */
public class CantAnnoy implements Annoy, Serializable {

    @Override
    public String annoy() {
        return "Not Annoying.";
    }

}
