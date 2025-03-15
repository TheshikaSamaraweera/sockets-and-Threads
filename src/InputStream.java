import java.io.*;

public class InputStream {


    public static void main(String[] args) throws FileNotFoundException {

        try {
            //get file
            FileInputStream  inputStream = new FileInputStream("example.txt");

            //The read() method of FileInputStream is called to read the first byte of data from the file.
            int data = inputStream.read();

            //A while loop continues as long as data is not -1 (which indicates the end of the file).
            while (data != -1){
                System.out.print((char) data); //convert asci values to charters
                data = inputStream.read();
                 // The first line reads the very first byte of the file, while the second line is used to read subsequent bytes
            }
            // close the file
            inputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
