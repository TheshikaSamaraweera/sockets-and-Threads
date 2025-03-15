import java.io.*;

public class DataStream {
    public static void main(String[] args){
        //DataInputStream - to read java primitive data
        //DataOutputStream - to write java primitive data

        File file = new File("dataStream.txt");

        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exist. Creating new file...");
            try{
                file.createNewFile();
                System.out.println("File was created successfully");
                System.out.println("File path: " + file.getAbsolutePath());
            }
            catch(Exception e){
                System.out.println("Error creating file: " + e.getMessage());
            }
            //file creating is successful
        }
        try{
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream inputStream = new DataInputStream(new FileInputStream(file.getName()));



//            1.
//            DataOutputStream: This line creates a DataOutputStream object named outputStream.
//            It wraps a FileOutputStream that is initialized with the file name file.getName().
//            The DataOutputStream is used to write Java primitive data types (like int, double, UTF strings, etc.)
//            to the file in a portable way. This means that the data can be read back in the same format
//            using a DataInputStream.


//            2.
//            DataInputStream: This line creates a DataInputStream object named inputStream.
//            It wraps a FileInputStream that is initialized with the file name file.getName().
//                    The DataInputStream is used to read Java primitive data types from the file.
//            It reads the data in the same format that it was written by the DataOutputStream,
//                    ensuring that the data is correctly interpreted.



            outputStream.writeInt(75);
            outputStream.writeDouble(3.14);
            outputStream.writeUTF("Hello World");
            outputStream.writeFloat(425.254F);

            int var1 = inputStream.readInt();
            double var2 = inputStream.readDouble();
            String var3 = inputStream.readUTF();
            float var4 = inputStream.readFloat();


            System.out.println("integer value is " + var1);
            System.out.println("double value is " + var2);
            System.out.println("string value is " + var3);
            System.out.println("float value is " + var4);

        }catch(Exception e){
            System.out.println("Error reading or writing to file: " + e.getMessage());
        }



    }
}
