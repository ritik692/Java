package Java_Oops;// Every base class in Java extends the Object Class

class A extends Object{
    int value;
    public A()
    {
        // super();  // You can't see me, but I exist
        System.out.println("In constructor of Java_Oops.A");
    }
    public A(int value)
    {
        // super();
        this.value = value;
        System.out.println("In parameterized constructor of Java_Oops.A");
    }
}

class B extends A{
    int age;

    public B(){
        // super();
        System.out.println("In constructor of Java_Oops.B");
//        super();   -> Error : call to super() must be the first statement in constructor
    }

    public B(int age){
        // super(); -> by default, it exists, unless overridden
//        super(age);
//        this();   -> call to this must be first statement in constructor
        this();
        this.age = age;
        System.out.println("In parameterized constructor of Java_Oops.B");
    }
}


public class this_and_super{
    public static void main(String[] args) {
//        Java_Oops.A obj = new Java_Oops.A();
//        Java_Oops.B obj1 = new Java_Oops.B();
        B obj2 = new B(10);
    }
}