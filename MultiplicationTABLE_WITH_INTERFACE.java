import javax.swing.*;
import java.awt.event.*;

public class MultiplicationTABLE_WITH_INTERFACE  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ÇOK EASY HESAP MAKİNESİ");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(30, 30, 200, 30);
        frame.add(label);

        JTextField numberField = new JTextField();
        numberField.setBounds(150, 30, 200, 30);
        frame.add(numberField);

        JButton multButton = new JButton("Multiplication Table");
        multButton.setBounds(30, 80, 160, 30);
        frame.add(multButton);

        JButton squareButton = new JButton("Take A Square");
        squareButton.setBounds(200, 80, 160, 30);
        frame.add(squareButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(30, 130, 330, 100);
        frame.add(resultArea);

        // Çarpım tablosu
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberField.getText());
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    sb.append(number + " x " + i + " = " + (number * i) + "\n");
                }
                resultArea.setText(sb.toString());
            }
        });

        // Kare alma
        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberField.getText());
                resultArea.setText(number + " ^ 2 = " + (number * number));
            }
        });

        frame.setVisible(true);
    }
}