package Java_Basics;

class Student {
    String name;
    int age;
    String gender;
    int roll_no;

    Student(String name, int age, String gender, int roll_no) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.roll_no = roll_no;
    }

    public void display_details() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Gender : " + this.gender);
        System.out.println("Roll number : " + this.roll_no);
        System.out.println();
    }
}

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // By default all the values inside arr is 0

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Value at index " +  i + " : " + arr[i]);
        }

        int grid[][] = new int[3][4];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                grid[i][j]= (int)(Math.random()*10);
            }
        }

        for(int i[]:grid)
        {
            for(int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        int nums[][] = new int[3][];   // jagged array (column size not fixed)
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() *11);
            }
        }
        System.out.println();
        for(int i[]:nums)
        {
            for(int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Student students[] = new Student[3];
        students[0] = new Student("Ritik", 20, "Male", 145);
        students[1] = new Student("Sachin", 21, "Male", 262);
        students[2] = new Student("Rugung", 22, "Male", 151);

        System.out.println();
        for(int i=0;i<students.length;i++)
        {
            students[i].display_details();
        }

        // Enhanced for loop
        int arr1[] = {1,5,7,2};
        for(int n : arr1)
        {
            n*=10;
        }


    }


}
