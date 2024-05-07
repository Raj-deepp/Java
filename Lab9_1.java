import javax.swing.*;
import java.awt.event.*;

public class Lab9_1 extends JFrame implements ActionListener {
    JTextField nameTextField = new JTextField();
    JPasswordField passwordTextArea = new JPasswordField();

    public Lab9_1() {
        setTitle("Registration Form");
        setSize(400, 400);
        setLayout(null);

        JLabel nameLabel = new JLabel("Username:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);

        JLabel passowrdLabel = new JLabel("Password:");
        passowrdLabel.setBounds(20, 50, 80, 25);
        add(passowrdLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 80, 80, 25);
        add(genderLabel);

        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(20, 110, 80, 25);
        add(hobbiesLabel);

        nameTextField.setBounds(100, 20, 200, 25);
        add(nameTextField);

        passwordTextArea.setBounds(100, 50, 200, 25);
        add(passwordTextArea);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(100, 80, 80, 25);
        add(maleRadio);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(180, 80, 80, 25);
        add(femaleRadio);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        readingCheckBox.setBounds(100, 110, 80, 25);
        add(readingCheckBox);

        JCheckBox sportCheckBox = new JCheckBox("Sports");
        sportCheckBox.setBounds(180, 110, 80, 25);
        add(sportCheckBox);

        JCheckBox musiCheckBox = new JCheckBox("Music");
        musiCheckBox.setBounds(260, 110, 80, 25);
        add(musiCheckBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 160, 100, 25);
        add(submitButton);
        submitButton.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = nameTextField.getText();
        String password = new String(passwordTextArea.getPassword());

        JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password,
                "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Lab9_1();
    }
}