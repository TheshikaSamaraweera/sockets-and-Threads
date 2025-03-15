import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

    public static void main(String[] args){
        try {
            FileOutputStream outputStream = new FileOutputStream("outputFilestream.txt",false);
            char H = 'H';
            outputStream.write((char)H);

            String text = "this is a test output Stream";
            outputStream.write(text.getBytes()); //save as byte streamv

            outputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }
}
