import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookManagementWindow extends JFrame {
    public BookManagementWindow() {
        setTitle("Manage Books");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // إعداد الحقول والنماذج
        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField(20);

        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField(20);

        JLabel categoryLabel = new JLabel("Category:");
        String[] categories = {"Software Engineering", "Management", "Artificial Intelligence"};
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String author = authorField.getText();
            String category = (String) categoryComboBox.getSelectedItem();
            // هنا يمكنك إضافة الكود لحفظ الكتاب في قاعدة البيانات
            JOptionPane.showMessageDialog(this, "Book added successfully!");
        });

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(categoryLabel);
        panel.add(categoryComboBox);
        panel.add(new JLabel());
        panel.add(addButton);

        add(panel);
        setVisible(true);
    }
}
