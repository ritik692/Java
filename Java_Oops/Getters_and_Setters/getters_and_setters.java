package Java_Oops.Getters_and_Setters;

public class getters_and_setters {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(11);
        human.setName("Reddy");


        System.out.println(human.getName() + " : " + human.getAge());
    }
}
