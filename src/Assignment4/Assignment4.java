package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class Assignment4 {

        /**
         * The deadline of assignment4 is 10/12/2018 23:59 PST.
         * Please feel free to contact Zane and Amanda for any questions.
         */

        /*
         * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
         * s = "leetcode" return 0.
         * s = "loveleetcode" return 2.
         */
        public int firstUniqChar(String s) {
            //TODO
                Map<Character,Integer> map = new HashMap<>();
                for(int i=0; i< s.length();i++){
                        char c = s.charAt(i);
                        if(map.containsKey(c)){
                                map.put(c,map.getOrDefault(c,0)+1);
                        }else{
                                map.put(c,1);
                        }
                }
                for(int i=0; i<s.length();i++){
                        char c = s.charAt(i);
                        if(map.containsKey(c) && map.get(c)==1){
                                return i;
                        }
                }
                return -1;
        }

        /*
         *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
         * Input: 38 Output: 2
         * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
         */
        public int addDigits(int n) {
            //TODO
                // initialize current, sum and boolean oneDigit
                int current = n;
                int sum = 0;
                boolean oneDigit = false;

                while(!oneDigit){
                        // dealling with every digit
                        while(current/10 != 0){
                              sum = sum + current%10;
                              current = current/10;
                        }
                        sum = sum + current;
                        //if sum/10 ==0 means onedigit
                        if(sum/10 == 0){
                                oneDigit = true;
                        }else{
                                current = sum;
                                sum =0;
                        }
                }
                return sum;

        }

        /*
         *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
         *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
         */
        public void moveZeroes(int[] nums) {
            //TODO
                int j=0;
                for(int i=0; i<nums.length;i++){

                        if(nums[i] != 0){
                                nums[j] = nums[i];
                                j++;
                        }
                }
                for(int i=j; i < nums.length; i++){
                        nums[i] = 0;
                }
        }

        /*
         * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
         * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
         */
        public String longestPalindrome(String s) {
            //TODO
                if(s == null || s.length() <1) return "";

                int start =0;
                int end=0;

                for(int i=0;i<s.length();i++) {
                        int len1 = extendLongestPalindrome(s, i, i);
                        int len2 = extendLongestPalindrome(s, i, i + 1);
                        int len = Math.max(len1, len2);

                        if (len > end - start) {
                                start = i - (len - 1) / 2;
                                end = i + len / 2;
                        }
                }
                return s.substring(start,end+1);
        }

        private int extendLongestPalindrome(String s, int i, int j ){
                while(i>=0 && j<= s.length() && s.charAt(i) == s.charAt(j)){
                        i ++;
                        j --;
                }
                return j-i-1;
        }

        /*
         * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
         * Given input matrix = [ [1,2,3],
                        [4,5,6],
                        [7,8,9] ],
         * rotate the input matrix in-place such that it becomes: [  [7,4,1],
                                       [8,5,2],
                                        [9,6,3] ],
         */
        public int[][] rotate(int[][] matrix) {
            //TODO
                //swap matrix[i][j], matrix[j][i]

                for(int i=0; i<matrix.length; i++){
                        for(int j =0; j<matrix[0].length; j++){
                                int temp = 0;
                                temp = matrix[i][j];
                                matrix[i][j] = matrix[j][i];
                                matrix[j][i] = temp;
                        }
                }

                //reverse matrix[i][j], matrix[i][len-1-j]
                for(int i=0; i<matrix.length; i++){
                        for(int j=0; j< matrix.length/2;j++){
                                int temp = 0;
                                temp = matrix[i][j];
                                matrix[i][j] = matrix[i][matrix.length-1-j];
                                matrix[i][matrix.length-1-j] = temp;
                        }
                }
                return matrix;
        }
}
