public class Main {
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

    public class Solution{
        public int guessNumber(int n) {
            int low = 1;
            int high = n;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int res = 5;
                if (res == 0)
                    return mid;
                else if (res < 0)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}