import javax.swing.*;
import java.awt.*;

public class TransactionWindow extends JFrame {
    public TransactionWindow() {
        setTitle("View Transactions");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // إعداد الجدول لعرض البيانات
        String[] columns = {"Transaction ID", "User ID", "Book ID", "Action", "Date"};
        String[][] data = {
                {"1", "101", "501", "Borrow", "2024-12-01"},
                {"2", "102", "502", "Return", "2024-12-05"},
        }; // بيانات مؤقتة (يمكن استبدالها ببيانات من قاعدة البيانات)

        JTable transactionTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(transactionTable);

        add(scrollPane);
        setVisible(true);
    }
}
