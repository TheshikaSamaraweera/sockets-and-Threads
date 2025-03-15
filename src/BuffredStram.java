import java.io.*;

public class BuffredStram {

    public static  void main(String[] args){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("bufferedreader.txt"),1024);
            BufferedWriter writer = new BufferedWriter(new FileWriter("writer.txt"));

            String line;
            while ((line = reader.readLine())!= null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Files copied successfully!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
