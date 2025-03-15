import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Character {

    public static void main(String[] args){

        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("characterStream.txt"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
