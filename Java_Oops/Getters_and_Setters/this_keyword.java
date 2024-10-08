package Java_Oops.Getters_and_Setters;

public class this_keyword {

    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setName("Navin", obj);
        System.out.println(obj.getName());
        obj.setAge(30,obj);
        System.out.println(obj.getAge());
    }
}
