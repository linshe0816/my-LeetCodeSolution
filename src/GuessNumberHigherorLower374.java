/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n == 1) return 1;
        if(guess(n) == 0) return n;
        int right = n , left = 1;
        while(right>left){
            int mid = left + (right - left)/2;
            int temp = guess(mid);
            if(temp == 0) return mid;
            else if(temp == -1) right = mid;
            else left = mid;
        }
        return 0;
    }
}