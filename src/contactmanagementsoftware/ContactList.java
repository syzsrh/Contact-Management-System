/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ContactList implements Serializable{
    void saveContact(ArrayList<ArrayList<Acquaintances>> ac,String fileName){
        try {
            FileWriter myWriter = new FileWriter(fileName);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < ac.get(i).size(); j++) {
                    if(i==0){
                        PersonalFriends perF=(PersonalFriends)ac.get(i).get(j);
                        myWriter.write("-----Personal Friends-----"+ System.getProperty("line.separator"));
                        myWriter.write("Name : "+ac.get(i).get(j).getName()+ System.getProperty("line.separator"));
                        myWriter.write("Mobile No. : "+ac.get(i).get(j).getMobileNo()+ System.getProperty("line.separator"));
                        myWriter.write("Email : "+ac.get(i).get(j).getEmail()+ System.getProperty("line.separator"));
                        myWriter.write("Specific events: "+perF.getEvents()+ System.getProperty("line.separator"));
                        myWriter.write("First Acquaintance context: "+perF.getAContext()+ System.getProperty("line.separator"));
                        myWriter.write("First Acquaintance date: "+perF.getADate()+ System.getProperty("line.separator"));
                        myWriter.write(System.getProperty("line.separator"));
                    }else if(i==1){
                        Relatives r=(Relatives)ac.get(i).get(j);
                        myWriter.write("-----Relatives-----"+ System.getProperty("line.separator"));
                        myWriter.write("Name : "+ac.get(i).get(j).getName()+ System.getProperty("line.separator"));
                        myWriter.write("Mobile No. : "+ac.get(i).get(j).getMobileNo()+ System.getProperty("line.separator"));
                        myWriter.write("Email : "+ac.get(i).get(j).getEmail()+ System.getProperty("line.separator"));
                        myWriter.write("Relatives Birthday: "+r.getBDate()+ System.getProperty("line.separator"));
                        myWriter.write("Last met date: "+r.getLDate()+ System.getProperty("line.separator"));
                        myWriter.write("");
                        myWriter.write(System.getProperty("line.separator"));
                    }else if(i==2){
                        ProfessionalFriends pF=(ProfessionalFriends)ac.get(i).get(j);
                        myWriter.write("-----Professional Friends-----"+ System.getProperty("line.separator"));
                        myWriter.write("Name : "+ac.get(i).get(j).getName()+ System.getProperty("line.separator"));
                        myWriter.write("Mobile No. : "+ac.get(i).get(j).getMobileNo()+ System.getProperty("line.separator"));
                        myWriter.write("Email : "+ac.get(i).get(j).getEmail()+ System.getProperty("line.separator"));
                        myWriter.write("Common Interests : "+pF.getCommonInterests()+ System.getProperty("line.separator"));
                        myWriter.write("");
                        myWriter.write(System.getProperty("line.separator"));
                    }else if(i==3){
                        CasualAcquaintances cA=(CasualAcquaintances)ac.get(i).get(j);
                        myWriter.write("-----Casual Acquaintances-----"+ System.getProperty("line.separator"));
                        myWriter.write("Name : "+ ac.get(i).get(j).getName()+ System.getProperty("line.separator"));
                        myWriter.write("Mobile No. : "+ac.get(i).get(j).getMobileNo()+ System.getProperty("line.separator"));
                        myWriter.write("Email : "+ac.get(i).get(j).getEmail()+ System.getProperty("line.separator"));
                        myWriter.write("First met location & time: " +cA.getWhenWhere()+ System.getProperty("line.separator"));
                        myWriter.write("Other useful information: " +cA.getCircumstances()+ System.getProperty("line.separator"));
                        myWriter.write("First met circumstances: "+cA.getOtherInfo()+ System.getProperty("line.separator"));
                        myWriter.write(System.getProperty("line.separator"));
                    }
                }
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
    
}
