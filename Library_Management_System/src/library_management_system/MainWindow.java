import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        // إعداد النافذة الرئيسية
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // شريط القوائم
        JMenuBar menuBar = new JMenuBar();

        // قائمة الكتب
        JMenu bookMenu = new JMenu("Books");
        JMenuItem manageBooks = new JMenuItem("Manage Books");
        manageBooks.addActionListener(e -> new BookManagementWindow());
        bookMenu.add(manageBooks);

        // قائمة المستخدمين
        JMenu userMenu = new JMenu("Users");
        JMenuItem manageUsers = new JMenuItem("Manage Users");
        manageUsers.addActionListener(e -> new UserManagementWindow());
        userMenu.add(manageUsers);

        // قائمة العمليات
        JMenu transactionMenu = new JMenu("Transactions");
        JMenuItem viewTransactions = new JMenuItem("View Transactions");
        viewTransactions.addActionListener(e -> new TransactionWindow());
        transactionMenu.add(viewTransactions);

        // إضافة القوائم إلى شريط القوائم
        menuBar.add(bookMenu);
        menuBar.add(userMenu);
        menuBar.add(transactionMenu);

        setJMenuBar(menuBar);

        // إعداد اللوحة الرئيسية
        JLabel welcomeLabel = new JLabel("Welcome to Library Management System", JLabel.CENTER);
        add(welcomeLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
