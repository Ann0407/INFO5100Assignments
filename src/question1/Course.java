package question1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static final int MAX_STUDENT_LIMIT = 10;
    private final String title;
    private int numbersOfStudent;
    private List<Student> currentStudentList = new ArrayList<>();

    public Course(String title) {
        this.title = title;
        this.numbersOfStudent = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getNumbersOfStudent() {
        return numbersOfStudent;
    }

    public String toString(){
        return "Course name and numbersOfStudent: " + title + ", " + numbersOfStudent;
    }

    //isFull method
    public boolean isFull(){
        return numbersOfStudent >= MAX_STUDENT_LIMIT;
    }

    //registerStudent method
    public void registerStudent(Student student){
        if(isFull()){
            System.out.println("Course is full and can not add currentStudentList any more!");
            return;
        }else {
            currentStudentList.add(student);
            numbersOfStudent ++;
        }
    }

    //getCurrentStudentList method
    public List<Student> getCurrentStudentList(){
       return currentStudentList;
    }

}
