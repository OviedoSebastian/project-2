package gui;
import game.Gamezone;

import javax.swing.*;
import java.awt.*;

public class VentanaServer extends JFrame {

    Container panel;
    public Gamezone game;
    public JButton start;

    public VentanaServer(){//creacion del contructor
        super("----MAZE----");//creacion del objeto mediante super que es la clase padre
        setSize(370,200);//manipulacion del tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = getContentPane();//espacio que contiene los objetos que agreguemos a la ventana
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
        JLabel txtp = new JLabel("---------SERVIDOR LABERINTO---------");
        panel.add(txtp);
        JLabel level = new JLabel("Ingresa el nivel que deseas escoger para tus jugadores");
        panel.add(level);
        JComboBox niveles = new JComboBox();
        niveles.addItem("level 1");
        niveles.addItem("level 2");
        niveles.addItem("level 3");
        panel.add(niveles);

        start = new JButton("iniciar");
        panel.add(start);
        start.addActionListener(ActionEvent -> {

        });



    }
}
