package Java_Oops.static_in_oops;

class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "Smartphone";
        System.out.println("static block called only once");
    }

    Mobile() {
        this.brand = "";
        this.price = 0;
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Java_Oops.static_in_oops.Mobile parameterized constructor called");
    }

    // static variables can be accessed in non-static method
    // but non-static variable can't be accessed in a static method, if we don't have an object reference
    void show() {
        System.out.println("Brand : " + this.brand + " Price : " + this.price + " name : " + name);
    }

    public static void static_method() {
        System.out.println("In static method");
    }

    public static void static_method_show(Mobile mob) {
        System.out.println("Brand : " + mob.brand + " Price : " + mob.price + " name : " + name);
    }
}
