
package java3_asm;


import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    public LoginForm() {
        setTitle("Form Đăng Nhập");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Tạo các thành phần
        JLabel usernameLabel = new JLabel("Tên người dùng:");
        JTextField usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Mật khẩu:");
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Đăng nhập");
        JButton cancelButton = new JButton("Hủy");

        // Sử dụng GroupLayout làm trình quản lý bố cục cho JFrame
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // Tạo khoảng cách giữa các thành phần
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Định nghĩa nhóm ngang
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup()
                .addComponent(usernameLabel)
                .addComponent(passwordLabel));
        hGroup.addGroup(layout.createParallelGroup()
                .addComponent(usernameField)
                .addComponent(passwordField)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addComponent(cancelButton)));
        layout.setHorizontalGroup(hGroup);

        // Định nghĩa nhóm dọc
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(usernameLabel)
                .addComponent(usernameField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(passwordLabel)
                .addComponent(passwordField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(loginButton)
                .addComponent(cancelButton));
        layout.setVerticalGroup(vGroup);

        setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm login = new LoginForm();
    }
}
