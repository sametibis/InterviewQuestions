public class FindSeat {
    /*
        A train has a maximum capacity of n passengers overall, which means each carriage's
        capacity will share an equal proportion of the maximum capacity.

        Create a function which returns the index of the first carriage which holds
        50% or less of its maximum capacity. If no such carriage exists, return -1.

        Worked Examples:
            findSeat(200, [35, 23, 18, 10, 40]) -> 2
            // There are 5 carriages which each have a maximum capacity of 40 (200 / 5)
            // Index 0's carriage is too full (35 is 87.5% of the maximum)
            // Index 1's carriage is too full (23 is 57.5% of the maximum)
            // Index 2's carriage is good enough (18 is 45% of the maximum)

        Examples:
            findSeat(20, [3, 5, 4, 2]); => 3
            findSeat(1000, [50, 20, 80, 90, 100, 60, 30, 50, 80, 60]); => 0
            findSeat(200, [35, 23, 40, 21, 38]); => -1
     */

    public static void main(String[] args) {
        System.out.println(findSeat(200, new int[]{35, 23, 18, 10, 40})); // 2
        System.out.println(findSeat(20, new int[]{3, 5, 4, 2})); // 3
        System.out.println(findSeat(200, new int[]{35, 23, 40, 21, 38})); // -1
        System.out.println(findSeat(500, new int[]{35, 28, 40, 29, 38, 35, 26, 40, 21, 38})); // 8
    }


    static int findSeat(int n, int[] arr) {

        int eachCarriagesMax = (n / arr.length) / 2;
        int result = -1;
        boolean isFined = false;
        int i = 0;
        while (i < arr.length && isFined == false) { // isFined = false olduğu sürece devam et, true olunca çık.
            if (arr[i] > eachCarriagesMax) {
                i++;
            } else {
                result = i;
                isFined = true;
            }
        }

        return result;
    }

}
