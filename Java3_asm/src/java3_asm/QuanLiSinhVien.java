/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3_asm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My MSI
 */
public class QuanLiSinhVien {

    private JFrame jf;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    private JLabel jblqldsv, jblmasv, jblhoten, jblEmail, jblSDT, jblGioitinh, jblDiaChi, jblAnh;
    private JTextField txtmasv, txthoten, txtEmail, txtSDT;
    private JButton btnnew, btnsave, btndelete, btnupdate;
    private JRadioButton rdoNam, rdoNu;
    private ButtonGroup Group1;
    private JTextArea txadiachi;
    private JTable tblSinhvien;

    public QuanLiSinhVien() {
        jf = new JFrame("Quản lý sinh viên");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        //panel 1
        panel1 = new JPanel();
        jblmasv = new JLabel("Mã SV: ");
        jblhoten = new JLabel("Họ Tên: ");
        jblEmail = new JLabel("Email: ");
        jblSDT = new JLabel("SDT: ");
        jblGioitinh = new JLabel("Giới Tính: ");
        jblDiaChi = new JLabel("Địa Chỉ: ");
        txtmasv = new JTextField();
        txthoten = new JTextField();
        txtEmail = new JTextField();
        txtSDT = new JTextField();
        rdoNam = new JRadioButton("Nam");
        rdoNu = new JRadioButton("Nữ");
        Group1 = new ButtonGroup();
        Group1.add(rdoNam);
        Group1.add(rdoNu);
        txadiachi = new JTextArea();

        GroupLayout layout1 = new GroupLayout(panel1);
        panel1.setLayout(layout1);
        layout1.setAutoCreateContainerGaps(true);
        layout1.setAutoCreateGaps(true);
        // HorizontalGroup
        layout1.setHorizontalGroup(layout1.createSequentialGroup()
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblmasv)
                        .addComponent(jblhoten)
                        .addComponent(jblEmail)
                        .addComponent(jblSDT)
                        .addComponent(jblGioitinh)
                        .addComponent(jblDiaChi)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(txtmasv)
                        .addComponent(txthoten)
                        .addComponent(txtEmail)
                        .addComponent(txtSDT)
                        .addGroup(layout1.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addComponent(rdoNu)
                        )
                        .addComponent(txadiachi)
                )
        );

        //VerticalGroup
        layout1.setVerticalGroup(layout1.createSequentialGroup()
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblmasv)
                        .addComponent(txtmasv)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblhoten)
                        .addComponent(txthoten)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblEmail)
                        .addComponent(txtEmail)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblSDT)
                        .addComponent(txtSDT)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblGioitinh)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu)
                )
                .addGroup(layout1.createParallelGroup()
                        .addComponent(jblDiaChi)
                        .addComponent(txadiachi)
                )
        );

        // panel2
        panel2 = new JPanel();

        btnnew = new JButton("New", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\plus.png") {
        });
        btnsave = new JButton("Save", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\save.png") {
        });
        btndelete = new JButton("Delete", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\remove.png") {
        });
        btnupdate = new JButton("Update", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\loop-arrow.png") {
        });

        GroupLayout layout2 = new GroupLayout(panel2);
        panel2.setLayout(layout2);
        layout2.setAutoCreateContainerGaps(true);
        layout2.setAutoCreateGaps(true);

        // HorizontalGroup
        layout2.setHorizontalGroup(layout2.createSequentialGroup()
                .addGroup(layout2.createParallelGroup()
                        .addComponent(btnnew)
                        .addComponent(btndelete)
                )
                .addGroup(layout2.createParallelGroup()
                        .addComponent(btnsave)
                        .addComponent(btnupdate)
                )
        );

        //VerticalGroup
        layout2.setVerticalGroup(layout2.createSequentialGroup()
                .addGroup(layout2.createParallelGroup()
                        .addComponent(btnnew)
                        .addComponent(btnsave))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(btndelete)
                        .addComponent(btnupdate))
        );
        //panel4
        panel3 = new JPanel();
        jblAnh = new JLabel(new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\plus.png"));
        panel3.add(jblAnh);

        // panel5
        panel4 = new JPanel();
        jblqldsv = new JLabel("Quản lý sinh viên");

        Font font = jblqldsv.getFont();
        float fontSize = font.getSize() + 10.0f;
        Font biggerFont = font.deriveFont(fontSize);
        jblqldsv.setFont(biggerFont);
        jblqldsv.setForeground(Color.blue);

        panel4.add(jblqldsv);

        // panel5
        panel5 = new JPanel();

        String[] tencot = {"Mã Sv", "Họ Tên", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ", "Hình"};

        Object[][] data = {
            {"PS001", "Nguyễn Tấn Lộc", "NguyenTanLoc@gmail.com", "0234543545", "Nam", "quan 12", "loc.png"},
            {"PS001", "Phùng Châu Phát", "NguyenTanLoc@gmail.com", "0234543545", "Nam", "quan 12", "loc.png"},
            {"PS001", "Nguyễn Vũ Hùng", "NguyenTanLoc@gmail.com", "0234543545", "Nam", "quan 12", "loc.png"}
        };

        tblSinhvien = new JTable();
        tblSinhvien.setRowHeight(30);

        //ép kiểu tblsinhvien
        DefaultTableModel model = (DefaultTableModel) tblSinhvien.getModel();

        //add row
        for (String cot : tencot) {
            model.addColumn(cot);
        }

        // Them Data
        for (Object[] dulieu : data) {
            model.addRow(dulieu);
        }
        JScrollPane jsp = new JScrollPane(tblSinhvien);
        jsp.setPreferredSize(new Dimension(400, 130));

        panel5.add(jsp);

//         Container
        panel6 = new JPanel();
        GroupLayout layout6 = new GroupLayout(panel6);
        panel6.setLayout(layout6);
        layout6.setAutoCreateContainerGaps(true);
        layout6.setAutoCreateGaps(true);

        // HorizontalGroup
        layout6.setHorizontalGroup(layout6.createParallelGroup()
                .addComponent(panel4)
                .addGroup(layout6.createSequentialGroup()
                        .addComponent(panel1)
                        .addGroup(layout6.createParallelGroup()
                                .addComponent(panel2)
                                .addComponent(panel3))
                )
                .addComponent(panel5)
        );

        // VerticalGroup
        layout6.setVerticalGroup(layout6.createSequentialGroup()
                .addGroup(layout6.createSequentialGroup()
                        .addComponent(panel4)
                )
                .addGroup(layout6.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel1)
                        .addGroup(layout6.createSequentialGroup()
                                .addComponent(panel3)
                                .addComponent(panel2))
                )
                .addGroup(layout6.createSequentialGroup()
                        .addComponent(panel5)
                )
        );

        jf.getContentPane().add(panel6);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        QuanLiSinhVien qlsv = new QuanLiSinhVien();
    }
}
