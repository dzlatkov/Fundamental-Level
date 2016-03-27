import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new LinkedList<>(Arrays.asList(scanner.nextLine().split(" ")));
        findingLongestSequence(strings);
    }
    private static void findingLongestSequence(List<String> strings) {
        String stringWithMostOccurrences = " ";
        int longestCount = 0;

        while (strings.size() > 0){
            String word = strings.get(0);
            long countOccurrences = strings.stream()
                    .filter(s-> s.equals(word))
                    .count();
            if(countOccurrences > longestCount){
                longestCount = ((int) countOccurrences);
                stringWithMostOccurrences = word;
            }
            strings.removeAll(Collections.singleton(word));
        }
        output(stringWithMostOccurrences, longestCount);
    }

    private static void output(String stringWithMostOccurrences, int longestCount) {
        for (int i = 0; i <longestCount ; i++) {
            System.out.print(stringWithMostOccurrences + " ");
        }
    }
}
