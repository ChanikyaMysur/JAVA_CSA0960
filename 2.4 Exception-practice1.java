import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaBank {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaBank");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Account Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(160, 50, 150, 30);
        frame.add(nameField);

        JLabel numberLabel = new JLabel("Account Number:");
        numberLabel.setBounds(50, 100, 100, 30);
        frame.add(numberLabel);

        JTextField numberField = new JTextField();
        numberField.setBounds(160, 100, 150, 30);
        frame.add(numberField);

        JLabel balanceLabel = new JLabel("Initial Balance:");
        balanceLabel.setBounds(50, 150, 100, 30);
        frame.add(balanceLabel);

        JTextField balanceField = new JTextField();
        balanceField.setBounds(160, 150, 150, 30);
        frame.add(balanceField);

        JButton createButton = new JButton("Create");
        createButton.setBounds(160, 200, 100, 30);
        frame.add(createButton);

        // Action listener for the Create button
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String accountName = nameField.getText();
                    String accountNumber = numberField.getText();
                    String balanceText = balanceField.getText();

                    // Attempt to parse the balance as a double
                    double initialBalance = Double.parseDouble(balanceText);

                    // If successful, you can proceed with account creation
                    System.out.println("Account created successfully!");
                    System.out.println("Name: " + accountName);
                    System.out.println("Number: " + accountNumber);
                    System.out.println("Balance: " + initialBalance);

                } catch (NumberFormatException ex) {
                    // Handle the exception by showing an error message
                    JOptionPane.showMessageDialog(frame, "Invalid balance value. Please enter a numeric value.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
