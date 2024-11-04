// Jeremiah Tenn

public class Main {
    public static int count8(int n) {
        int count = 0;

        if (n % 10 == 8) {
            count++;
        }

        if (n % 100 == 88) {
            count++;;
        }
    
        // Base case: if there is 1 digit return
        if (n % 10 == n) {
            return count;
        }

        else {
            count += count8(n / 10);
            return count;
        }
    }

    public static void main(String[] args) {
    }
}
