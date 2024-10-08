package Java_Oops;// Naming convention in Java
// variables - array, result
// method - show(), getDetails()
// class - Human , Java_Oops.Teacher
// constructor - Java_Basics.arrays.Java_Basics.Student() , Animal()
// constants - PIE, MY_DATA


class Teacher{
    private int age;
    private String name;

    // In constructor overloading, you can't pass default argument values
    public Teacher()
    {
        age = 1;
        name = "Infant";
        System.out.println("In default constructor");
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("In parameterized constructor");
    }
    void show(){
        System.out.println(this.name + " : " + this.age);
    }
}

public class Constructors {
    public static void main(String[] args) throws ClassNotFoundException {
        Teacher teacher = new Teacher(18,"Ritik");
        teacher.show();
        Teacher new_teacher  = new Teacher();
        new_teacher.show();

        // new Java_Oops.Teacher().show()  -> anonymous object, doesn't have a reference
        // can't be reused

    }
}
