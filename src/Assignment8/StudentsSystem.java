package Assignment8;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentsSystem extends JFrame {

    private JTable studentsTable;

    public StudentsSystem(Students students){
        StudentsTableModel model = new StudentsTableModel(students);
        studentsTable = new JTable(model);
        JScrollPane jsp = new JScrollPane(studentsTable);

        Container con = getContentPane();
        con.add(jsp);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.addStudent(new Student(001, "Jenny", "Chou", true));
        s.addStudent(new Student(002, "Tom", "Chou", false));
        s.addStudent(new Student(003, "Sally", "Chou", true));

        new StudentsSystem(s);


    }
}

class Students{
    private Collection<Student> students = new ArrayList<Student>();
    public Collection<Student> getStudents() {
        return students;
    }
    public void addStudent(Student s) {
        students.add(s);
    }
    public int getNumberOfStudents() {
        return getStudents().size();
    }
}

class Student{
    int roll;
    String first;
    String last;
    boolean gender = false;

    public Student(int roll, String first, String last, boolean gender){
        this.roll = roll;
        this.first = first;
        this.last = last;
        this.gender = gender;
    }
}

class StudentsTableModel implements TableModel {

    private Students students;

    public StudentsTableModel(Students students){
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.getNumberOfStudents();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "ROLL";
        }
        if(columnIndex == 1){
            return "First";
        }
        if(columnIndex == 2){
            return "Last";
        }
        if(columnIndex == 3){
            return "Gender";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 3){
            return Boolean.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Collection<Student> s = students.getStudents();
        int row = -1;
        for(Student student: s){

            row ++;
            if(row == rowIndex){
                if(columnIndex == 0){
                    return student.roll + "";
                }
                if (columnIndex == 1) {
                    return student.first;
                }
                if (columnIndex == 2) {
                    return student.last;
                }
                if (columnIndex == 3) {
                    return student.gender;
                }
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }



    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}