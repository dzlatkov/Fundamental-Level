import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumLines {
    public static void main(String[] args) {

        try (BufferedReader fileReader = new BufferedReader(new FileReader("res/text.txt"));
        ){
            while (true){
                int count = 0;
                String line = fileReader.readLine();
                if (line == null) break;
//                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    count += line.charAt(i);
                }
                System.out.println(count);
            }
        } catch (IOException ioex) {
            System.out.println("Cannot read the file");
        }
    }
}
