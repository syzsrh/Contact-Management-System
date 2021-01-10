package contactmanagementsoftware;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationUtil extends FileConvert implements Serializable {

//    public static Object deserialize(File file) throws IOException,
//            ClassNotFoundException {
//        FileInputStream fis = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Object obj = ois.readObject();
//        ois.close();
//        return obj;
//    }

//    // serialize the given object and save it to file
//    public static void serialize(Object obj, String fileName)
//            throws IOException {
//        FileOutputStream fos = new FileOutputStream(fileName);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(obj);
//        fos.close();
//    }

    @Override
    public void saveContact(ArrayList<ArrayList<Acquaintances>> ac, String fileName) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ac);
        fos.close();
    }

    @Override
    public Object readContact(File file) throws IOException,
            ClassNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

}
