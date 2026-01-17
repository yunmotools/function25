// **Is Pangram**
// Write a function that checks if a string is a pangram
// (contains every letter a–z).


//my code

/*
public class Main {
    public static boolean isPan(String s){
        String alpha = "abcdefghijklmnopqrstuvwxyz" ;
        boolean pan = false ;
        for(int i = 0 ; i < alpha.length() ; i++){
            char c = alpha.charAt(i) ;
            boolean check = s.contains(c) ;
            if(check == false){
                pan = false ;
            } else{
                pan = true;
            }
        }
        return pan ;

    }
}
*/

// ai solution

public class Main {
    public static boolean isPan(String s) {
        // Normalize case so 'A' and 'a' are treated the same
        s = s.toLowerCase();

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alpha.length(); i++) {
            char c = alpha.charAt(i);

            // contains needs a String, so convert the char to a one-character String
            if (!s.contains(String.valueOf(c))) {
                // As soon as we find a missing letter, it's not a pangram
                return false;
            }
        }

        // If we never found a missing letter, it's a pangram
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPan("The quick brown fox jumps over the lazy dog")); // true
        System.out.println(isPan("Hello world")); // false
    }
}