package Java_Oops.static_in_oops;

public class Static_keyword {
    public static void main(String[] args) throws ClassNotFoundException {

        // class loader to execute the code in  static {} block, without instantiating the class Java_Oops.static_in_oops.Mobile
        Class.forName("Java_Oops.static_in_oops.Mobile");

//        Java_Oops.static_in_oops.Mobile mob1 = new Java_Oops.static_in_oops.Mobile();
//        mob1.brand = "Apple";
//        mob1.price = 1500;
//
//        Java_Oops.static_in_oops.Mobile.name = "Smartphone";
//
//        Java_Oops.static_in_oops.Mobile mob2 = new Java_Oops.static_in_oops.Mobile();
//        mob2.brand = "Samsung";
//        mob2.price = 1300;
//
//        Java_Oops.static_in_oops.Mobile.name = "Phone";
//
////        mob1.show();
////        mob2.show();
//
////        Java_Oops.static_in_oops.Mobile.static_method();
////        Java_Oops.static_in_oops.Mobile.static_method_show(mob1);
//
//        Java_Oops.static_in_oops.Mobile mob3 = new Java_Oops.static_in_oops.Mobile("Oppo", 700);
//        Java_Oops.static_in_oops.Mobile mob4 = new Java_Oops.static_in_oops.Mobile("Vivo", 800);

    }
}
