import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        try(
                BufferedReader bfr =
                        new BufferedReader(
                                new FileReader("res/words.txt"));
                BufferedWriter bfw =
                        new BufferedWriter(
                                new FileWriter("res/count-chars.txt"))
        ){
            String line;
            int vowels = 0;
            int consonants = 0;
            int punctiationMarks = 0;
            while(!((line = bfr.readLine())== null)){
                punctiationMarks +=
                        line.toLowerCase().chars().filter(ch ->
                                ch == '!' || ch == ',' || ch == '?' || ch == '.' || ch == ';').count();
                consonants +=
                        line.toLowerCase().chars().filter(ch ->
                                !(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'|| ch == ' ' ||
                                ch == '!' || ch == ',' || ch == '?' || ch == '.' || ch == ';')).count();
                vowels +=
                        line.toLowerCase().chars().filter(ch ->
                                ch=='a' ||  ch=='e' || ch=='i' || ch=='o' || ch=='u').count();
            }

            System.out.println(vowels);
            System.out.println(consonants);
            System.out.println(punctiationMarks);
            bfw.write("Vowels: " + vowels);
            bfw.newLine();
            bfw.write("Consonants: " + consonants );
            bfw.newLine();
            bfw.write( "Punctuation: " + punctiationMarks);
            bfw.newLine();
        }
        catch (IOException ioe){
            System.out.println(ioe.toString());
        }
    }
}
