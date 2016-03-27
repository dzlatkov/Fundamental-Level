import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try(
                BufferedReader bfr =
                        new BufferedReader(
                                new FileReader("res/textTask2.txt"));
                BufferedWriter bfw =
                        new BufferedWriter(
                                new FileWriter("res/textTask2Output.txt"));
        ){
            String line;
            while(!((line = bfr.readLine())== null)){
                bfw.write(line.toUpperCase());
                bfw.newLine();
            }
        }
        catch (IOException ioe){
            System.out.println(ioe.toString());
        }
    }
}
