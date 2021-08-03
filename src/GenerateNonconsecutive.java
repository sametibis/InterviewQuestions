import java.util.ArrayList;

public class GenerateNonconsecutive {
    /*  Create a function to generate all non consecutive binary strings where non consecutive
        is defined as a string where no consecutive ones are present,
        and where n governs the length of each binary string.

        generateNonconsecutive(1) ==> 0 1
        generateNonconsecutive(2) ==> 00 01 10
        generateNonconsecutive(3) ==> 000 001 010 100 101
        generateNonconsecutive(4) ==> 0000 0001 0010 0100 0101 1000 1001 1010
    */


    public static void main(String[] args) {
        //System.out.println(toBinary(12));

        /*
        System.out.println(Integer.toBinaryString(5)); // 101
        // toUnsignedString(i, radix) ==> i = rakam, radix = kaçlık tabanda olacağı
        System.out.println(Integer.toUnsignedString(5,3)); // 12
        */

        System.out.println(generateNonconsecutive(1)); // [0, 1]
        System.out.println(generateNonconsecutive(2)); // [00, 01, 10]
        System.out.println(generateNonconsecutive(3)); // [000, 001, 010, 100, 101]
        System.out.println(generateNonconsecutive(4)); // [0000, 0001, 0010, 0100, 0101, 1000, 1001, 1010]
        System.out.println(generateNonconsecutive(5)); // [00000, 00001, 00010, 00100, 00101, 01000, 01001, 01010, 10000, 10001, 10010, 10100, 10101]
    }

    public static ArrayList<String> generateNonconsecutive(int num) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < Math.pow(2, num); i++) {
            String element = toBinary(i);

            // To make elements with "num" digits, added zeros.
            if (element.length() != num) {
                String zeros = "";
                for (int j = 0; j < num - element.length(); j++) {
                    zeros += "0";
                }
                element = zeros.concat(element);
            }

            list.add(element);

            // To delete elements containing consecutive 1s
            for (int k = 0; k < num - 1; k++) {
                if (element.charAt(k) == '1' && element.charAt(k + 1) == '1') {
                    list.remove(element);
                }
            }
        }
        return list;
    }


    public static String toBinary(int number) {
        String binary = "";
        if (number == 0) {
            return "0";
        }
        while (number != 0) {
            int remaind = number % 2;
            binary += String.valueOf(remaind);
            number /= 2;
        }
        StringBuilder sb = new StringBuilder(binary);
        return sb.reverse().toString();
    }
}
