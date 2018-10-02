package question1;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Student name and Id: " + name + ", " + id;
    }

}
