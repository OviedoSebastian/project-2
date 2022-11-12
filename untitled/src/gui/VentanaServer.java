package gui;
import game.Gamezone;
import javax.swing.*;
import java.awt.*;

public class VentanaServer extends JFrame {

    Container panel;
    public Gamezone game;
    public JButton inicar;
    public JComboBox niveles;

    public VentanaServer(){//creacion del contructor
        super("----MAZE----");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = getContentPane();//espacio que contiene los objetos que agreguemos a la ventana
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));

        JLabel txtp = new JLabel("---------SERVIDOR LABERINTO---------");
        panel.add(txtp);
        JLabel level = new JLabel("Ingresa el nivel que deseas escoger para tus jugadores");
        panel.add(level);
        niveles = new JComboBox();
        niveles.addItem(1);
        niveles.addItem(2);
        niveles.addItem(3);
        panel.add(niveles);

        inicar = new JButton("iniciar");
        panel.add(inicar);
        inicar.addActionListener(actionEvent -> {
            panel.removeAll();
            setSize(750,500);
            JLabel txt_level = new JLabel("---------SEGUIMIENTO DE JUGADORES---------");
            panel.add(txt_level);
            Gamezone allgame = new Gamezone();
            allgame.removeKeyListener(allgame);
            panel.add(allgame);
        });
    }
}
