package question1;

public class Test {

    public static void main(String[] args) {

        //test for student constructor and tostring()

        Student stu1 = new Student("Jenny", 1);
        System.out.println(stu1);

        //test for student getter and setter

        stu1.setId(3);
        stu1.setName("Abby");
        System.out.println(stu1);
        System.out.println("name ->" + stu1.getName());
        System.out.println("ID ->" + stu1.getId());

        //test for course constructor and tostring()
        Course course1 = new Course("DatabaseManagement");
        Course course2 = new Course("Java");
        Course course3 = new Course("Information System");
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

        //test for course getter and setter
        System.out.println("Course1's numbersOfStudents is:" + course1.getNumbersOfStudent());
        System.out.println("Course2's name is:" +  course2.getTitle());

        //test for course isFull()
        System.out.println(course1.isFull());
        System.out.println(course2.isFull());

        //test for the registerStudent and getStudent method
        course1.registerStudent(stu1);
        course1.getCurrentStudentList();
        System.out.println("Current Student List is " + course1.getCurrentStudentList());

        //test for the getnumbersofStudents method
        course1.getNumbersOfStudent();
        System.out.println("Current numbers of students of course1 is " + course1.getNumbersOfStudent());

    }
}
