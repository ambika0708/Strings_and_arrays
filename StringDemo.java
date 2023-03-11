import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
       /* stringReverse("hello");
        stringAnagram("kit cat", "tik tac");*/
        //substring();
        //countCharacters("Ambika ambika   @123");
        //System.out.println(convertArray2String());
        // countSpecificCharacter();
        //replaceString();
        capitalizeWords();
    }

    static void stringReverse(String inp) {
       /*StringBuilder sb = new StringBuilder(inp);
        System.out.println(sb.reverse());*/
        String inp1 = "";
        for (int i = inp.length() - 1; i >= 0; i--) {
            inp1 = inp1 + inp.charAt(i);
        }
        System.out.println(inp1);
    }

    static void stringAnagram(String inp, String inp1) // get meaningfull words by shuffling them <---- anagram
    {
        inp = inp.toLowerCase();
        inp1 = inp1.toLowerCase();
        if (inp.length() != inp1.length()) {
            System.out.println("Not an anagram");
        } else {
            char ch[] = inp.toCharArray();
            char ch1[] = inp1.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if (Arrays.equals(ch, ch1)) {
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        }
    }

    static void substring() {
        String str = "ambika";
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 6));
       /* for (int i = 0; i < str.length(); i++) {
           // char ch = str.charAt(i);
            String r = str.substring(i + 1);
            System.out.println(r);
        }*/
    }

    static void countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Counting each characters: " + count);
    }

    static String convertArray2String() {
        String fruits[] = {"Apple", "Banana", "Mango"};
        String output = Arrays.toString(fruits);
        return output;
    }

    static void countSpecificCharacter() {
        String input = "ambika";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = in.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character " + ch + " is appeared " + count + " times for this String" + " \"" + input + "\" ");
    }

    static void replaceString() {
        String input = "Good Afternoon all, How are You";
        String op = input.replace('a', 'D');
        System.out.println(op);
        String o = input.replaceAll("e", "eee");//replaceFirst
        System.out.println(o);
        String o2 = input.replaceAll("[A-Z]", "");
        System.out.println(o2);
        String o3 = input.replaceAll("[a-z]", "");
        System.out.println(o3);
    }

    static void capitalizeWords() {
        String fruits = "Apple orange grapes Mango guava watermelon";
        String[] o = fruits.split("\\s");
        String capitalized = "";
        for (String x : o) {
            String first = x.substring(0, 1);
            String afterFirst = x.substring(1);
            capitalized = capitalized + first.toUpperCase() + afterFirst + " ";
        }
        // String result = capitalized.trim();
        System.out.println(capitalized);
    }
}