public class MissingNumber {

    /*
        Create a method that takes an array of integers between 1 and 10
        (excluding one number) and returns the missing number.

        Examples:
            missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10])    ==> 5
            missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8])     ==> 10

        Notes:
            The array of numbers will be unsorted(not in order).
            Only one number will be missing.
     */

    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));  // 5
        System.out.println(missingNum(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}));   // 10
        System.out.println(missingNum(new int[]{3, 6, 2, 5, 1, 4, 9, 7, 10}));  // 8
    }

    static int missingNum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return 55 - sum;
    }
}
