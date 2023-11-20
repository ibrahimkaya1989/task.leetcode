package examples;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        int[] result = new int[2];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ( i == j ) break;
                else if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        System.out.println( Arrays.toString(twoSum(nums, 9)) );

        nums = new int[]{3,2,4};
        System.out.println( Arrays.toString(twoSum(nums, 6)) );

        nums = new int[]{3,3};
        System.out.println( Arrays.toString(twoSum(nums, 6)) );

        nums = new int[]{1,2,2,3,4,5,1,2,3,4,5,6,1};
        System.out.println( Arrays.toString(twoSum(nums, 11)) );
    }
}
