package Lab7;

public class StudentApp {
    public static void  main (String[] args){

        //create object of Student class
        Student std1 = new Student();
        std1.setName("Phloiphailin Khaokaeo");
        std1.setPerson_id("1111111111111");
        std1.setAge(20);

        displayDataodject(std1);
        Student std2 = new Student();
        std2.setName("miw supapun");
        std2.setPerson_id("2222222222222");
        std2.setAge(20);

        Student std3 = new Student("Nattapong Kaewboonma","33333333333333",40);

        displayDataodject(std3);






    }//main

    private static void displayDataodject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}//class
