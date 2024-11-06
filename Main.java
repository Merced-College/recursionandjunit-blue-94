// Jeremiah Tenn

public class Main {
    public static int count8(int n) {
        int count = 0;

        // If rightmost digit is 8, add 1
        if (n % 10 == 8) {
            count++;
            // If the secondmost to the right is 8 add 1
            if (n % 100 == 88) {
                count++;;
            }
        }
    
        // Base case: if there is 1 digit return
        if (n % 10 == n) {
            return count;
        }

        else {
            // Count amount of 8s in the numbers to the left of the rightmost number and add it to count
            count += count8(n / 10);
            // Return count 
            return count;
        }
    }

    public static int countHi(String str) {
        int count = 0; // Zero because with each new string there is zero "hi"s initially
        // If last two letters form "hi"
        if (str.substring(str.length()-2).equals("hi")) {
            // Increment count
            count++;
        }

        // If there is only two characters left stop recursion and return count
        if (str.length() == 2) {
            return count;
        }

        // Run countHi recursively using the current string without the last letter; 
        else {
            count += countHi(str.substring(0, str.length() - 1));
            return count;
        }
    }
}
