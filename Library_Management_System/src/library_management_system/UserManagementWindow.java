import javax.swing.*;
import java.awt.*;

public class UserManagementWindow extends JFrame {
    public UserManagementWindow() {
        setTitle("Manage Users");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // إعداد الحقول والنماذج
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);

        JLabel roleLabel = new JLabel("Role:");
        String[] roles = {"Admin", "Regular"};
        JComboBox<String> roleComboBox = new JComboBox<>(roles);

        JButton addButton = new JButton("Add User");
        addButton.addActionListener(e -> {
            String username = usernameField.getText();
            String role = (String) roleComboBox.getSelectedItem();
            // هنا يمكنك إضافة الكود لحفظ المستخدم في قاعدة البيانات
            JOptionPane.showMessageDialog(this, "User added successfully!");
        });

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(roleLabel);
        panel.add(roleComboBox);
        panel.add(new JLabel());
        panel.add(addButton);

        add(panel);
        setVisible(true);
    }
}
