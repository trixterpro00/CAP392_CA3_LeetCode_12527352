class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int palindrome = 0;
        int i = x;
        while (i != 0) {

            int digit = i % 10;
            i = i / 10;

            palindrome = palindrome * 10 + digit;
        }

        if (palindrome == x){
            return true;
        }
        else{
            return false;
        }
    }
}

