import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame {
    private JTextField txtName, txtRollNo;
    private JPasswordField txtPassword;
    private JRadioButton rdoYear1, rdoYear2, rdoYear3, rdoYear4, rdoYear5;
    private JRadioButton rdoMale, rdoFemale;
    private JComboBox<String> cmbCourse, cmbSemester;
    private JButton btnSubmit;
    private DefaultTableModel tableModel;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu
        JMenu menu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(exitMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Form components
        JLabel lblName = new JLabel("Name:");
        txtName = new JTextField(20);

        JLabel lblRollNo = new JLabel("Roll No:");
        txtRollNo = new JTextField(10);

        JLabel lblGender = new JLabel("Gender:");
        rdoMale = new JRadioButton("Male");
        rdoFemale = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdoMale);
        genderGroup.add(rdoFemale);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(rdoMale);
        genderPanel.add(rdoFemale);

        JLabel lblCourse = new JLabel("Course:");
        String[] courses = {"Computer Science", "Mathematics", "Physics", "Chemistry"};
        cmbCourse = new JComboBox<>(courses);
        JPanel coursePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        coursePanel.add(cmbCourse);

        JLabel lblYear = new JLabel("Year:");
        rdoYear1 = new JRadioButton("1st");
        rdoYear2 = new JRadioButton("2nd");
        rdoYear3 = new JRadioButton("3rd");
        rdoYear4 = new JRadioButton("4th");
        ButtonGroup yearGroup = new ButtonGroup();
        yearGroup.add(rdoYear1);
        yearGroup.add(rdoYear2);
        yearGroup.add(rdoYear3);
        yearGroup.add(rdoYear4);
        JPanel yearPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        yearPanel.add(rdoYear1);
        yearPanel.add(rdoYear2);
        yearPanel.add(rdoYear3);
        yearPanel.add(rdoYear4);

        JLabel lblSemester = new JLabel("Semester:");
        String[] semesters = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        cmbSemester = new JComboBox<>(semesters);
        JPanel semesterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        semesterPanel.add(cmbSemester);

        JLabel lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField(20);

        btnSubmit = new JButton("Submit");

        // Table
        tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("Name");
        tableModel.addColumn("Roll No");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Course");
        tableModel.addColumn("Year");
        tableModel.addColumn("Semester");
        JScrollPane scrollPane = new JScrollPane(table);

        // Add components to the frame
        JPanel panel = new JPanel(new GridLayout(8, 2, 5, 5));
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblRollNo);
        panel.add(txtRollNo);
        panel.add(lblGender);
        panel.add(genderPanel);
        panel.add(lblCourse);
        panel.add(coursePanel);
        panel.add(lblYear);
        panel.add(yearPanel);
        panel.add(lblSemester);
        panel.add(semesterPanel);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(new JLabel());
        panel.add(btnSubmit);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.CENTER);

        // Submit button action
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String rollNo = txtRollNo.getText();
                String gender = rdoMale.isSelected() ? "Male" : "Female";
                String course = (String) cmbCourse.getSelectedItem();
                String year = "";
                if (rdoYear1.isSelected()) {
                    year = "1st";
                } else if (rdoYear2.isSelected()) {
                    year = "2nd";
                } else if (rdoYear3.isSelected()) {
                    year = "3rd";
                } else if (rdoYear4.isSelected()) {
                    year = "4th";
                }
                String semester = (String) cmbSemester.getSelectedItem();
                String password = new String(txtPassword.getPassword());

                // Add data to table
                tableModel.addRow(new Object[]{name, rollNo, gender, course, year, semester});

                // Clear form fields
                txtName.setText("");
                txtRollNo.setText("");
                genderGroup.clearSelection();
                cmbCourse.setSelectedIndex(0);
                yearGroup.clearSelection();
                cmbSemester.setSelectedIndex(0);
                txtPassword.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }
}
