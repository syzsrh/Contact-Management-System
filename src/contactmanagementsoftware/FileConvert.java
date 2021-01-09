/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;



/**
 *
 * @author HP
 */
public abstract class FileConvert implements Serializable{
    public abstract void saveContact(ArrayList<ArrayList<Acquaintances>> ac,String fileName)throws FileNotFoundException, IOException;
    public abstract Object readContact(File file) throws IOException,ClassNotFoundException;
}
