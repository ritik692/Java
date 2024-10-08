package Java_Basics;

public class Immutable_string_in_java {
    public static void main(String[] args) {
        // Strings in Java are Immutable (can't be changed/altered, just we can change
        // the reference in String Constant pool)

        // String name = new String("Ritik");
        String name = "Ritik";
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(2));

        System.out.println(name.concat(" Arora"));
        System.out.println(name);

        String s1="Navin";
        String s2="Navin";

        // There is a "String Constant Pool" in "JVM"
        System.out.println(s1==s2);
    }
}
