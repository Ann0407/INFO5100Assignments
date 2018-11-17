package Assignment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Operation{
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public class Calculator extends JFrame {

        private JTextField resultTextField;
        private JButton add, substract, multiply, divide, compute;

        private JButton numbers[];
        private Font font;

        int first = 500;
        int second = 100;

        Operation o = Operation.ADD;

        class OperationListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
               if (e.getSource() == add){
                   o = Operation.ADD;
               }
               if(e.getSource() == substract){
                   o = Operation.SUBTRACT;
               }
               if(e.getSource() == multiply){
                    o = Operation.MULTIPLY;
               }
               if(e.getSource() == divide){
                    o = Operation.DIVIDE;
               }

            }
        }

        class ComputeListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                if (o == Operation.ADD){
                    result = first + second;
                }
                if (o == Operation.SUBTRACT){
                    result = first - second;
                }
                if (o == Operation.DIVIDE){
                    result = first / second;
                }
                if (o == Operation.MULTIPLY){
                    result = first * second;
                }

                resultTextField.setText(result + "");
            }

        }

        public Calculator(){
            createComponents();
            setLayout();
            addComponents();
            addBehaviors();
            display();
        }

        private void addComponents() {
            Container c = getContentPane();
            c.add(resultTextField);

            JPanel panel = new JPanel();
            panel.add(add);
            panel.add(substract);
            panel.add(multiply);
            panel.add(divide);
            c.add(panel);

            panel = new JPanel();
            panel.add(compute);
            c.add(panel);

            JPanel p = new JPanel();
            p.add(numbers[1]);
            p.add(numbers[2]);
            p.add(numbers[3]);
            p.add(numbers[4]);

            c.add(p);

            p = new JPanel();
            p.add(numbers[5]);
            p.add(numbers[6]);
            p.add(numbers[7]);
            p.add(numbers[8]);

            c.add(p);

            p = new JPanel();
            p.add(numbers[9]);
            p.add(numbers[0]);

            c.add(p);

        }

        private void setLayout(){
            GridLayout gl = new GridLayout(6,1);
            Container c = this.getContentPane();
            c.setLayout(gl);
        }

        private void createComponents(){
            font = new Font("Helvetica", Font.PLAIN, 38);
            resultTextField = new JTextField(10);
            resultTextField.setFont(font);

            add = new JButton("+");
            add.setFont(font);
            substract = new JButton("-");
            substract.setFont(font);
            multiply = new JButton("*");
            multiply.setFont(font);
            divide = new JButton("%");
            divide.setFont(font);
            compute = new JButton("=");
            compute.setFont(font);

            numbers = new JButton[10];
            for (int i=0; i<10; i++){
                numbers[i] = new JButton(i + "");
                numbers[i].setFont(font);
            }
        }

        private void addBehaviors(){
            ComputeListener cl = new ComputeListener();
            compute.addActionListener(cl);

            OperationListener ol = new OperationListener();
            add.addActionListener(ol);
            substract.addActionListener(ol);
            multiply.addActionListener(ol);
            divide.addActionListener(ol);
        }

        private void display(){
            setSize(500,800);
            setVisible(true);
        }

        public static void main(String[] args){
            Calculator c = new Calculator();
        }


    }

