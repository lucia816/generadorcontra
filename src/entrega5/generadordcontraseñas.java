package entrega5;


import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import static entrega5.Mayusculaminnun.getPasswordMmnum;
import static entrega5.Mayusculas.getPasswordmay;
import static entrega5.contraseñaMys.getPasswordMs;
import static entrega5.contraseñamM.getPasswordmM;
import static entrega5.contraseñaminysimb.getPasswordsm;
import static entrega5.contraseñanumeroymayusculas.getPasswordnM;
import static entrega5.contraseñanym.getPasswordnl;
import static entrega5.contraseñanys.getPasswordm;
import static entrega5.mayusculaminsimbolo.getPasswordMms;
import static entrega5.minisculas.getPasswordmin;
import static entrega5.minsimbolonum.getPasswordmns;
import static entrega5.numero.getPasswordnun;
import static entrega5.numeromayussimbolo.getPasswordnummaysim;
import static entrega5.simbolos.getPasswords;


public class generadordcontraseñas extends JFrame implements ActionListener {
    private int salir = 1;
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;
    private Random random = new Random();
    private JButton boton1;
    public JButton boton2;
    public JButton boton3;
    private JTextField generado;
    JCheckBox checkboxl = new JCheckBox("Minisculas");
    JCheckBox checkBoxn = new JCheckBox("Numeros");
    JCheckBox checkBoxM = new JCheckBox("Mayusculas");
    JCheckBox checkBoxs = new JCheckBox("Simbolos");
    public static String numeros = "0123456789";
    public static String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String minisculas = "abcdefghijklmnopqrstuvwxyz";
    public static String simbolo = "!·$%&/()=?¿@#*]}[{";
    public static JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 4);
    private JLabel label;
    private URL url = getClass().getResource("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fferrelaeconomica.com.mx%2Fwp-content%2Fuploads%2F2019%2F12%2FCH-20P.jpg&f=1&nofb=1");

    generadordcontraseñas() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        label = new JLabel("Generador de contraseñas");


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(25, 208, 210));
        add(p1);
        JPanel p5 = new JPanel();
        p5.add(label, BorderLayout.NORTH);
        p1.add(p5);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4, 5, 4, 4));
        JLabel contraseña = new JLabel("Contraseña generada: ");
        p3.add(contraseña);
        generado = new JTextField("");
        generado.setBounds(300, 300, 300, 300);
        generado.setBackground(new Color(11, 88, 226));
        p3.add(generado, BorderLayout.CENTER);


        boton1 = new JButton("Generar contraseña");
        boton1.setBackground(Color.MAGENTA);
        p3.add(boton1);

        boton2 = new JButton("Salir");
        boton2.addActionListener(new saliendo());
        p3.add(boton2);

        boton3 = new JButton("copiar");
        boton3.addActionListener(new copiar());
        p3.add(boton3);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6, 3, 2, 2));
        label = new JLabel("Seleccione que caracteres desea");
        p2.add(label, BorderLayout.NORTH);
        p2.add(checkboxl, true);
        p2.add(checkBoxn);
        p2.add(checkBoxM);
        p2.add(checkBoxs);
        p2.add(p1, BorderLayout.SOUTH);


        JPanel p4 = new JPanel();
        slider = new JSlider(2, 20, 2);
        label = new JLabel("Seleccione la cantidad de caracteres");
        p4.add(label);
        p4.add(slider);
        slider.setMinorTickSpacing(20);
        slider.setMajorTickSpacing(2);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        int posicionslider = slider.getValue();

        p2.add(p4, BorderLayout.EAST);
        add(p1, BorderLayout.NORTH);
        add(p3, BorderLayout.SOUTH);
        p1.add(p2, BorderLayout.CENTER);

        boton1.addActionListener(this);

       

        setSize(700, 500);
        setVisible(true);
    }

    private Object imageUpdate(String s) {

        Image imagen = new ImageIcon(url).getImage();
        return imagen;
    }


    public static void main(String[] args) {
        generadordcontraseñas generadordecontraseña = new generadordcontraseñas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (checkBoxs.isSelected()) {
            generado.setText(getPasswords());
        }
        if (checkboxl.isSelected()) {
            generado.setText(getPasswordmin());
        }
        if (checkBoxM.isSelected()) {
            generado.setText(getPasswordmay());
        }
        if (checkBoxn.isSelected()) {
            generado.setText(getPasswordnun());
        }

        if (checkBoxn.isSelected() && checkboxl.isSelected() && checkBoxs.isSelected() && checkBoxM.isSelected()) {
            generado.setText(getPassword());
        }

        if (checkBoxn.isSelected() && checkBoxs.isSelected()) {
            generado.setText(getPasswordm());
        }
        if (checkBoxn.isSelected() && checkboxl.isSelected()) {
            generado.setText(getPasswordnl());

        }
        if (checkBoxn.isSelected() && checkBoxM.isSelected()) {
            generado.setText(getPasswordnM());
        }
        if (checkboxl.isSelected() && checkBoxs.isSelected()) {
            generado.setText(getPasswordsm());
        }
        if (checkboxl.isSelected() && checkBoxM.isSelected()) {
            generado.setText(getPasswordmM());
        }
        if (checkBoxM.isSelected() && checkBoxs.isSelected()) {
            generado.setText(getPasswordMs());
        }
        if (checkBoxM.isSelected() && checkBoxs.isSelected() && checkboxl.isSelected()) {
            generado.setText(getPasswordMms());
        }
        if (checkBoxM.isSelected() && checkBoxs.isSelected() && checkBoxn.isSelected()) {
            generado.setText(getPasswordmns());
        }
        if (checkBoxM.isSelected() && checkBoxn.isSelected() && checkboxl.isSelected()) {
            generado.setText(getPasswordMmnum());
        }
        if (checkBoxM.isSelected() && checkBoxn.isSelected() && checkBoxs.isSelected()) {
            generado.setText(getPasswordnummaysim());
        }

    }

    public static String getPassword() {
        return getPassword(8);
    }

    public static String getPassword(int length) {
        return getPassword(numeros + mayusculas + simbolo, slider.getValue());
    }

    public static String getPassword(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña += (key.charAt((int) (Math.random() * key.length())));
        }

        return contraseña;
    }

    private class saliendo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }


    }


    private class copiar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            StringSelection stringSelection = new StringSelection(generado.getText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    }




