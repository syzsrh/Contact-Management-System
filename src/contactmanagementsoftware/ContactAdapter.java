/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContactAdapter extends FileConvert implements Serializable{

    private ContactList contactList;   
    public ContactAdapter(ContactList contactList){
        super();
        this.contactList=contactList;
    }
    @Override
    public void saveContact(ArrayList<ArrayList<Acquaintances>> ac,String fileName) {
        contactList.saveContact(ac,fileName);
    }

    @Override
    public Object readContact(File file) {
        return null;
    }
}
