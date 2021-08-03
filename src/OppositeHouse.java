import java.util.ArrayList;

public class OppositeHouse {
    /*
        Tesha was walking through a straight street with exactly n identical houses on both sides.
        House numbers in the street look like this:

        1  |      |  6
        3  |      |  4
        5  |      |  2

        She notices that even numbered houses increases on the right while odd numbered houses decreases on the left.
        Create a function that takes a house number "house" and length of the street "n" and returns
        the house number on the opposite side.

        Examples:

        oppositeHouse(1, 3) ==> 6
        oppositeHouse(2, 3) ==> 5
        oppositeHouse(3, 5) ==> 8
        oppositeHouse(5, 46) ==> 88


     */

    public static void main(String[] args) {
        System.out.println(oppositeHouse(4, 46)); // 88
    }

    static int oppositeHouse(int house, int n) {

        ArrayList<Integer> leftSide = new ArrayList<>();
        ArrayList<Integer> rightSide = new ArrayList<>();

        int countOfHouses = n * 2;


        for (int i = 1, j = countOfHouses; i <= countOfHouses; i += 2, j -= 2) {
            leftSide.add(i);
            rightSide.add(j);
        }

        /*
            for(int i = 0, j = 0; i<n; i++, j++) {
                System.out.print(leftSide.get(i) + "   | =========== |   " + rightSide.get(j));
                System.out.println();
            }
        */

        return (countOfHouses + 1) - house;

    }

}
