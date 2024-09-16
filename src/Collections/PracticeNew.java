package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeNew {
//    2,7,11,15 -> 9 = 1,2
    public static int[] twoSum(int[] num, int target){
        for (int i = 0; i< num.length; i++){

            for(int j = i+1; j<num.length; j++){
               if(num[i] + num[j] == target){
                   return new int[]{i,j};
               }
            }
        }
        return null;
    }
//      0,1,2,2,3,0,4,2 -> 0,1,3,0,4
    public static ArrayList<Integer> removeElement(ArrayList<Integer> num , int element){

      for(int i = 0; i< num.size(); i++){
          if(num.get(i) == element){
              num.remove(i);
              i--;
          }
      }
        return num;
    }
//    1,2,3 -> 1,2,4    9999 -> 10000
    public static int[] ArrPlusOne(int[] num){
        int n = num.length;
       for(int i = num.length-1; i>=0;i--){
           if(num[i] < 9){
               num[i]++;
               return num;
           }
           num[i] = 0;
       }
       num = new int[n+1];
       num[0] = 1;
       return num;
    }
//    1,3,5,6 -> 7 = 4

    public static int searchInsert(int[] nums, int target) {
//      Its also binary search
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // to avoid overflow

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If not found, low will be the correct insert position
        return low;
    }

    public static void mergeSort(int[] arr1, int[] arr2,int m,int n){
        int last = m+n-1;
         while(m > 0 && n > 0){
            if(arr1[m-1] > arr2[n-1]){
                arr1[last] = arr1[m-1];
                m--;
            }else{
                arr1[last] = arr2[n-1];
                n--;
            }
            last--;
         }
//
//         while(n>0){
//             arr1[last] = arr2[n-1];
//             n--;
//             last--;
//         }
    }

    public static List<List<Integer>> pascalsTriangle(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j = 1; j < i;j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }

    public static List<Integer> PascalsTriangle2(int rowIndex){
        List<Integer> list = new ArrayList<>();
        if(rowIndex < 0){
            return list;
        }
        list.add(1);
        for(int i = 1; i< rowIndex; i++){
            list.add(list.get(i-1) + (rowIndex-1));
            if(i >= 2){
                list.add(list.get(i-1) + (rowIndex-1) - i);
            }
        }
        list.add(1);
        return list;
    }
}
