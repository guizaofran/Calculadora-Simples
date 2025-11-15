package UI;

import javax.swing.*;
import java.awt.*;

public class UI {
    public UI() {
        JFrame janela = new JFrame("Calculadora");
        JTextField display = new JTextField();

        String[] valores = {
                "%", "CE", "C", "<<",
                "1/x", "x²", "²/x", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ",", "="
        };

        JButton[] buttons = new JButton[valores.length];

        int xInicial = 10;
        int yInicial = 170;
        int w = 75;
        int h = 48;
        int espaco = 5;

        int col = 0;
        int lin = 0;

        for (int i = 0; i < valores.length; i++) {
            buttons[i] = new JButton(valores[i]);
            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttons[i].setBounds(xInicial + col * (w + espaco), yInicial + lin * (h + espaco), w, h);
            janela.add(buttons[i]);

            col++;
            if (col == 4) {
                col = 0;
                lin++;
            }
        }

        for (int i = 0; i < 8; i++) {
            buttons[i].setBackground(new Color(38, 38, 38));
        }
        buttons[23].setBackground(new Color(0, 119, 255));
        for (int i = 11; i < 20; i += 4) {
            buttons[i].setBackground(new Color(38, 38, 38));
        }

        janela.setLayout(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        janela.setBounds(0, 500, 350, 530);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(new Color(28, 28, 28));

        display.setEditable(false);
        display.setBounds(-1, -1, 350, 90);
        display.setBackground(new Color(28, 28, 28));
        display.setForeground(Color.WHITE);
        display.setBorder(null);


        janela.add(display);

    }

}
