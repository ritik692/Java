package Java_Basics;

public class Updated_switch {
    public static void main(String[] args) {
        String day = "Sunday";
        switch(day) {
            case "Saturday", "Sunday" -> System.out.println("Alarm at 10am");
            case "Monday" -> System.out.println("Alarm at 6am");
            default -> System.out.println("Alarm at 8am");
        }

        int val = 9;
        int num = switch(val){
            case 1,2,3,4,5 ->  5;
            case 6,7,8,9,10 ->  10;
            default ->  100;
        };
        System.out.println("num: " +  num);

        // if using ':' instead of '->', use keyword 'yield'

        int again_val = 245;
        int again_num = switch(again_val){
            case 1,2,3,4,5 : yield 5;
            case 6,7,8,9,10 : yield  10;
            default : yield  100;
        };
        System.out.println("again_num: " +  again_num);
    }
}

