package leetCode;

/**
 * Author : Salman Khan
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */


public class TwoSum {


    public int[] findIndices(int[] input, int target) {
        int[] indices = {};
        if (input.length > 1) {
            int indice1, indice2;
            for (int i=0; i<input.length; i++) {
                indice1 = i;
                for (int j=0; j<input.length; j++) {
                    indice2 = j;
                    if ((input[indice1] + input[indice2]) == target) {
                        indices = new int[]{indice1, indice2};
                        return indices;
                    }
                }
            }
        } else {
            return input;
        }
        return indices;
    }

}
