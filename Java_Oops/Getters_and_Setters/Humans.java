package Java_Oops.Getters_and_Setters;

class Humans {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public void setName(String name, Humans obj)
    {
        Humans obj1 = obj;
        obj1.name = "Navin";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(int age, Humans obj)
    {
        Humans obj1 = obj;
        obj1.age  = age;
    }
}
