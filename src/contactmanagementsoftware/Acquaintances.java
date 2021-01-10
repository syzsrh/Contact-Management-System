package contactmanagementsoftware;

import java.io.Serializable;

public class Acquaintances implements Serializable {

    private String Name;
    private String MobileNo;
    private String Email;
    
    Acquaintances() {
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public String getEmail() {
        return Email;
    }

}
