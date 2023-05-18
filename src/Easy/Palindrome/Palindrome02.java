package Easy.Palindrome;

public class Palindrome02
{
    public boolean isPalindrome(int x) {

        if (x < 0)
        {
            return false;
        }

        int reverse = 0;
        int num = x;

        while(x > 0)
        {
            //calculate the remainder until x = 0
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        return reverse == num;
    }
}
