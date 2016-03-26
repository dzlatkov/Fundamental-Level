import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] twoWords = input.nextLine().split(" ");

        String firstWord = twoWords[0];
        String secondWord = twoWords[1];

        int sum = CalculateCharsValue(firstWord,secondWord);
        System.out.println(sum);
    }

    public static int CalculateCharsValue(String firstWord, String secondWord) {
        int finalSum = 0;
        int longerLength = Math.max(firstWord.length(),secondWord.length());
        int smallerLength = Math.min(firstWord.length(),secondWord.length());

        String biggestWord = "";
        if (firstWord.length() > secondWord.length()){
            biggestWord = firstWord;
        }
        else{
            biggestWord = secondWord;
        }

        for (int i = 0; i < longerLength; i++) {

            if (smallerLength > i){
                finalSum += firstWord.charAt(i) * secondWord.charAt(i);
            }
            else{
                finalSum += biggestWord.charAt(i);
            }
        }

        return finalSum;
    }
}
