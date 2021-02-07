package entrega5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class generadordcontraseñas extends JFrame implements ActionListener {

    private JButton boton1;
    private JButton boton2;
    private JTextField generado;
    private JSlider slider;
    private JLabel label;
    private int num1 = 100;
    private  int num2 = 122;
    int numAleatorio = (int) Math.floor(Math.random() * (num2 - num1) + num1);
    char letraaleatorio = (char) Math.floor(Math.random() * (num2 - num1) + num1);
    char simbolos = (char)  Math.floor(Math.random() *(100));
    JCheckBox checkboxl = new JCheckBox("Letras");
    JCheckBox checkBoxn = new JCheckBox("Numeros");
    JCheckBox checkBoxM = new JCheckBox("Mayusculas");
    JCheckBox checkBoxs = new JCheckBox("Simbolos");



    generadordcontraseñas (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JPanel p1= new JPanel();

        p1.setLayout(new GridLayout(4,4,4,4));
        JLabel contraseña= new JLabel("Contraseña generada: ");
        p1.add(contraseña);
        generado =new JTextField("");
        generado.setBounds(300,300,300,300);
        generado.setBackground(Color.ORANGE);
        p1.add(generado);


        slider=new JSlider(1,8,2);
        p1.add(slider);
        slider.setMinorTickSpacing(20);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);



        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(10,10,5,5));

        p2.add(checkboxl);
        p2.add(checkBoxn);
        p2.add(checkBoxM);
        p2.add(checkBoxs);
        p2.add(p1,BorderLayout.SOUTH);

        boton1 = new JButton("Generar contraseña");
        p1.add(boton1);

        boton1.addActionListener(this);


        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.WEST);
        setSize(600,600);
        setVisible(true);
    }




    public static void main(String[] args) {
        generadordcontraseñas generadordecontraseña = new generadordcontraseñas();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        int posicionslider = slider.getValue();
        System.out.println(posicionslider);


        if(checkBoxn.isSelected() && checkboxl.isSelected() && checkBoxs.isSelected() && checkBoxM.isSelected()) {
                generado.setText((String.valueOf(simbolos) + letraaleatorio + numAleatorio));
        }

        if(checkBoxn.isSelected()  && checkBoxs.isSelected()) {
            generado.setText(String.valueOf(simbolos)+ numAleatorio );
        }
        if (checkBoxn.isSelected() && checkboxl.isSelected()){
            generado.setText(String.valueOf(letraaleatorio)+ numAleatorio);

        }
        if (checkBoxn.isSelected() && checkBoxM.isSelected() ){
            generado.setText(String.valueOf(numAleatorio));
        }
        if(checkboxl.isSelected() && checkBoxs.isSelected()){
            generado.setText(String.valueOf(letraaleatorio)+ simbolos);
        }
        if (checkboxl.isSelected() && checkBoxM.isSelected()){
            generado.setText(String.valueOf(letraaleatorio));
        }
        if (checkBoxM.isSelected() && checkBoxs.isSelected()){
            generado.setText(String.valueOf(simbolos));
        }
        /*if(checkBoxs.isSelected()){
            generado.setText(String.valueOf(simbolos));
        }
        if(checkBoxn.isSelected()){
            generado.setText(String.valueOf(numAleatorio));
        }
        if(checkboxl.isSelected()){
            generado.setText(String.valueOf(letraaleatorio));
        }
        if (checkBoxM.isSelected()){
            generado.setText("hola");
        }*/
    }
}



