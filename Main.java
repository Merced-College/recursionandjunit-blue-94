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
}
