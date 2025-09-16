package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            
            JButton botaoMudarCor = new JButton ("Mudar Cor");
            DrawingPanel panel = new DrawingPanel();
            
            botaoMudarCor.addActionListener(e -> {
            	panel.changeColor(Color.RED);
            });
            

            

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);
            frame.add(botaoMudarCor, BorderLayout.NORTH);
            botaoMudarCor.setPreferredSize(new Dimension (60,40));
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
