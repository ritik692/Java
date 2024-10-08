package Java_Basics;

public class Datatypes_and_literals {
    public static void main(String[] args) {

        // Integer -> byte(1), short(2), int(4), long(8) -> 24545l
        // float -> double(8), float(4) -> 35.4f
        // char -> char(2)
        // boolean -> boolean(1) -> true/false (0/1 doesn't work)


        // literals
        int binary_num = 0b1100;
        System.out.println(binary_num);

        int hexadecimal_num = 0x7F;
        System.out.println(hexadecimal_num);

        int easy_count_zero = 10_00_000;
        System.out.println(easy_count_zero);

        double type_cast = 56;
        System.out.println(type_cast);

        double power_10 = 12e10;
        System.out.println(power_10);
    }
}
