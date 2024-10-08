package Java_Oops;

class Utensil{
    public void show()
    {
        System.out.println("show Utensils");
    }
}
class Bottle extends Utensil{
    public void show()
    {
        System.out.println("show bottles");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        Utensil u1 = new Utensil();
        u1.show();

        Bottle b1 = new Bottle();
        b1.show();

        // method overriding -> show
        Utensil u2 = new Bottle();
        u2.show();
    }
}
