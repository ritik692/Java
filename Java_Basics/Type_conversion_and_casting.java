package Java_Basics;

public class Type_conversion_and_casting {
    public static void main(String[] args) {
        int num = 255;
        byte by = (byte)num;   // explicit type casting
        System.out.println(by);

        int val = (int)5.6;
        System.out.println(val);

        byte a = 10;
        byte b = 20;
        int result = a*b;    // Type promotion
        System.out.println(result);
    }
}
