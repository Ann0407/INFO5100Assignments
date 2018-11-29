package FinalProject;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehiclesSystem extends JFrame {

    private JTable vehicleTable;
    private JButton vehicleDetails, add, view, modify;
    // private JTextPane detail;
    private Font font;

    public VehiclesSystem(Vehicles vehicles){
        VTableModel model = new VTableModel(vehicles);
        vehicleTable = new JTable(model);


        font = new Font("Helvetica", Font.PLAIN, 20);
        // detail = new JTextPane("details");

        vehicleDetails = new JButton("vehicleDetails");
        vehicleDetails.setFont(font);

        add = new JButton("add");
        add.setFont(font);

        view = new JButton("view");
        view.setFont(font);

        modify = new JButton("modify");
        modify.setFont(font);

        Container con = getContentPane();
        con.add(vehicleDetails);

        JPanel panel = new JPanel();
        panel.add(vehicleDetails);
        con.add(panel);

        JScrollPane jsp = new JScrollPane(vehicleTable);
        con.add(jsp);

        JPanel p = new JPanel();
        p.add(add);
        p.add(view);
        p.add(modify);
        con.add(p);

        GridLayout gl = new GridLayout(6,6);
        con.setLayout(gl);
        setSize(600,700);
        setVisible(true);
    }

    public static void main(String[] args) {
        Vehicles v = new Vehicles();
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));
        v.addVehicle(new Vehicle(002, "AE", "VM", false));
        v.addVehicle(new Vehicle(003, "GE", "TOYOTA", true));
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));
        v.addVehicle(new Vehicle(001, "KE", "BMW", true));


        new VehiclesSystem(v);


    }
}

class Vehicles{
    private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();
    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    public int getNumberOfVehicles() {
        return getVehicles().size();
    }
}

class Vehicle{
    int id;
    String name;
    String type;
    boolean available = false;

    public Vehicle(int id, String name, String type, boolean available){
        this.id = id;
        this.name = name;
        this.type = type;
        this.available = available;
    }
}

class VTableModel implements TableModel {

    private Vehicles vehicles;

    public VTableModel(Vehicles vehicles){
        this.vehicles = vehicles;
    }

    @Override
    public int getRowCount() {
        return vehicles.getNumberOfVehicles();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "ID";
        }
        if(columnIndex == 1){
            return "NAME";
        }
        if(columnIndex == 2){
            return "TYPE";
        }
        if(columnIndex == 3){
            return "available";
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
        Collection<Vehicle> v = vehicles.getVehicles();
        int row = -1;
        for(Vehicle vehicle: v){

            row ++;
            if(row == rowIndex){
                if(columnIndex == 0){
                    return vehicle.id + "";
                }
                if (columnIndex == 1) {
                    return vehicle.name;
                }
                if (columnIndex == 2) {
                    return vehicle.type;
                }
                if (columnIndex == 3) {
                    return vehicle.available;
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