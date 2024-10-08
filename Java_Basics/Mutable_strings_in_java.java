package Java_Basics;

public class Mutable_strings_in_java {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ritik");
        System.out.println(sb.capacity());
//        sb.capacity() => gives you the string size + 16 (buffer size)
        System.out.println(sb.length());

        sb.append(" Arora");
        System.out.println(sb);

        String fullName = sb.toString();
        System.out.println("Full Name: "+ fullName);

        sb.deleteCharAt(2);
        System.out.println("After deleting index 2 : " + sb);

        sb.insert(0,"Java ");
        System.out.println("Appending Java in beginning : " + sb);

        System.out.println(sb.substring(3,9));  // both are indices (end is excluded)

        sb.setLength(50);
        System.out.println(sb);

//        sb.ensureCapacity(100);
//        System.out.println(sb);

//        StringBuffer is thread safe while StringBuilder is not
    }
}
