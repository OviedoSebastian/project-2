package gui;
import game.Gamezone;
import javax.swing.*;
import java.awt.*;

public class VentanaLaberinto extends JFrame {
    Container panel;
    public Gamezone game;

    public VentanaLaberinto(){//creacion del contructor
        super("----MAZE----");//creacion del objeto mediante super que es la clase padre
        setSize(370,200);//manipulacion del tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = getContentPane();//espacio que contiene los objetos que agreguemos a la ventana
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
        JLabel textp = new JLabel("---------Bienvenido al desafio de laberintos---------");
        panel.add(textp);
        JLabel txtname = new JLabel("Ingresa tu nombre -> ");
        panel.add(txtname);
        JTextArea name_pj =  new JTextArea(1,15);
        panel.add(name_pj);
        JLabel level = new JLabel("Ingresa el nivel que deseas jugar");
        panel.add(level);
        JComboBox niveles = new JComboBox();
        niveles.addItem("level 1");
        niveles.addItem("level 2");
        niveles.addItem("level 3");
        panel.add(niveles);

        JButton start = new JButton("iniciar");
        panel.add(start);
        start.addActionListener(ActionEvent -> {
            panel.removeAll();
            setSize(750,500);
            JLabel txt_level = new JLabel("---------LEVEL 1---------");
            panel.add(txt_level);
            Gamezone game = new Gamezone();
            panel.add(game);

        });



    }

}
