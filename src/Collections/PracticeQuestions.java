package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeQuestions {
    private static int number;

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
//    2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
//    2,3,5,7,11,13,17,19,23,29

    public static int[] findIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int secNum = numbers[j];
                if (num + secNum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] toSum(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        return new int[]{numbers[len - 1] * numbers[len - 2]};
    }

    public static String intersection(String list1, String list2) {
        for (int i = 0; i < list2.length(); i++) {
            String word1 = String.valueOf(list1.charAt(i));
            String word2 = String.valueOf(list2.charAt(i));
            if (list1.contains(word2)) {
                return word2;
            }
        }

        return list1;
    }

    public static int checkFactorial(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult *= i;
        }
        return mult;

    }

    //    0,1,1
//    2,3,5,
//    8,13,21,34
    public static int ficobulliSequence(int number) {
        if (number <= 1) return number;

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= number; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static boolean checkPalidrom(String name) {
        int firstLetter = 0;
        int lastLetter = name.length() - 1;

        while (firstLetter < lastLetter) {
            firstLetter++;
            lastLetter--;
            if (name.charAt(firstLetter) != name.charAt(lastLetter)) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int GCD(int num1, int num2) {
        if (num2 == 0) return num1;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] merge = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }
        while (j < arr1.length) {
            merge[k++] = arr2[j++];
        }
        return merge;
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k is greater than the array length
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    public static  void rotateLeft(int[] arr, int k){
        int n = arr.length;
        k = k % n;  // In case k is greater than the array length
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static boolean checkIfTwoStringsAnagram(String first,String second){
        char[] tempArr1 = first.toCharArray();
        char[] tempArr2 = second.toCharArray();

        Arrays.sort(tempArr1);
        Arrays.sort(tempArr2);

        int fLength = tempArr1.length;
        int sLength = tempArr2.length;

        for(int i=0; i< tempArr1.length;i++){
            if( fLength == sLength && tempArr1[i] == tempArr2[i] ){
                return true;
            }
        }

       return false;
    }
//    book,eel, "ee,k,ii,g,h,oo,l" -> eegghiikloo , eghejidik
    public static StringBuilder removeDuplicates(String str){
        StringBuilder newStr = new StringBuilder();
       for(int i = 0; i<str.length();i++){
           char characters = str.charAt(i);
           if(newStr.indexOf(String.valueOf(characters)) == -1){
               newStr.append(characters);
           }
       }
           return newStr;
     }

//    aaeeggiihh eegghiikloo eghejidik

     public static char firstCharOfNonRepeatingString(StringBuilder str){
        for(int i = 0; i< str.length();i++){
            int length = str.length();
            for( int j = i+1; j< str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    str.deleteCharAt(j);
                }
            }
            if(str.length() < length ){
                str.deleteCharAt(i);
                i--;
            }
        }
      return str.charAt(0);
     }

//     abcabcbb -> abc ,3
//       pwwkew -> wke, 3
//    freecodecamp

     public static char firstNonRepeatingCharWithMap(String str){
         Map<Character,Integer> countMap = new LinkedHashMap<>();
         for(char c: str.toCharArray()){
             countMap.put(c,countMap.getOrDefault(c,0)+1);
         }
         for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
             if(entry.getValue() == 1){
                 return entry.getKey();
             }
         }
         return '\0';
     }
//    abcabcbb
     public static int lengthOfLongestSubStringWithSet(String s){
         java.util.Set<Character> set  = new HashSet<>();
         int maxLength = 0, i = 0, j = 0;

         while(i < s.length() && j < s.length()){
             if(!set.contains(s.charAt(j))){
                 set.add(s.charAt(j++));
                 maxLength = Math.max(maxLength, j-i);
             }else{
                 set.remove(s.charAt(i++));
             }
         }
         return maxLength;
     }

}


