/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3_asm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My MSI
 */
public class QuanLiDiemSinhVien {

    private JFrame jf;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
    private JLabel jblqldsv, jbltimkiem, jblmasv, jblhoten, jblmasinhvien, jbltienganh, jbltinhoc, jblgiaoduc, jbldiemtb, jblsodiem, jblbasv;
    private JTextField txtmasv, txthoten, txtmasinhvien, txttienganh, txttinhoc, txtgiaoduc;
    private JButton btntimkiem, btnnew, btnsave, btndelete, btnupdate, btntrai, btnphai, btntrai2, btnphai2;


    public QuanLiDiemSinhVien() {
        jf = new JFrame("Quản lý điểm sinh viên");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        //panel 1
        panel1 = new JPanel();
        panel1.setBorder(new TitledBorder("Tìm kiếm"));
        jblmasv = new JLabel("Mã SV: ");
        txtmasv = new JTextField(10);
        btntimkiem = new JButton("Search", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\search.png"){});

        GroupLayout layout1 = new GroupLayout(panel1);
        panel1.setLayout(layout1);
        layout1.setAutoCreateContainerGaps(true);
        layout1.setAutoCreateGaps(true);
        // HorizontalGroup
        layout1.setHorizontalGroup(layout1.createSequentialGroup()
                .addComponent(jblmasv)
                .addComponent(txtmasv)
                .addComponent(btntimkiem));

        //VerticalGroup
        layout1.setVerticalGroup(layout1.createParallelGroup()
                .addComponent(jblmasv)
                .addComponent(txtmasv)
                .addComponent(btntimkiem));

        // panel2
        panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(""));
        jblhoten = new JLabel("Họ và Tên: ");
        jblmasinhvien = new JLabel("Mã SV: ");
        jbltienganh = new JLabel("Tiếng Anh: ");
        jbltinhoc = new JLabel("Tin Học: ");
        jblgiaoduc = new JLabel("Giáo dục TC: ");
        jbldiemtb = new JLabel("Điểm TB: ");
        jblsodiem = new JLabel("9.0");
        txthoten = new JTextField(10);
        txtmasinhvien = new JTextField(10);
        txttienganh = new JTextField(10);
        txttinhoc = new JTextField(10);
        txtgiaoduc = new JTextField(10);

        GroupLayout layout2 = new GroupLayout(panel2);
        panel2.setLayout(layout2);
        layout2.setAutoCreateContainerGaps(true);
        layout2.setAutoCreateGaps(true);

        // HorizontalGroup
        layout2.setHorizontalGroup(layout2.createSequentialGroup()
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jblhoten)
                        .addComponent(jblmasinhvien)
                        .addComponent(jbltienganh)
                        .addComponent(jbltinhoc)
                        .addComponent(jblgiaoduc))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(txthoten)
                        .addComponent(txtmasinhvien)
                        .addComponent(txttienganh)
                        .addComponent(txttinhoc)
                        .addComponent(txtgiaoduc))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jbldiemtb)
                        .addComponent(jblsodiem)));
        //VerticalGroup
        layout2.setVerticalGroup(layout2.createSequentialGroup()
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jblhoten)
                        .addComponent(txthoten))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jblmasinhvien)
                        .addComponent(txtmasinhvien))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jbltienganh)
                        .addComponent(txttienganh)
                        .addComponent(jbldiemtb))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jbltinhoc)
                        .addComponent(txttinhoc)
                        .addComponent(jblsodiem))
                .addGroup(layout2.createParallelGroup()
                        .addComponent(jblgiaoduc)
                        .addComponent(txtgiaoduc)));
        //panel4
        panel4 = new JPanel(new GridLayout(4, 1, 5, 5));
        btnnew = new JButton("New", new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\plus.png"){});
        btnsave = new JButton("Save",new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\save.png"){});
        btndelete = new JButton("Delete",new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\remove.png"){});
        btnupdate = new JButton("Update",new ImageIcon("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons\\loop-arrow.png"){});

        panel4.add(btnnew);
        panel4.add(btnsave);
        panel4.add(btndelete);
        panel4.add(btnupdate);

        // panel5
        panel5 = new JPanel(new GridLayout(1, 4, 5, 5));
        btntrai = new JButton("|<");
        btnphai2 = new JButton(">>");
        btntrai2 = new JButton("<<");
        btnphai = new JButton(">|");

        panel5.add(btntrai);
        panel5.add(btnphai2);
        panel5.add(btntrai2);
        panel5.add(btnphai);

        // panel6 
            panel6 = new JPanel();
            jblqldsv = new JLabel("Quản lý điểm sinh viên");

            Font font = jblqldsv.getFont();
            float fontSize = font.getSize() + 10.0f;
            Font biggerFont = font.deriveFont(fontSize);
            jblqldsv.setFont(biggerFont);
            jblqldsv.setForeground(Color.blue);

        GroupLayout layout6 = new GroupLayout(panel6);
        layout6.setAutoCreateContainerGaps(true);
        layout6.setAutoCreateGaps(true);

        // HorizontalGroup
        layout6.setHorizontalGroup(layout6
                .createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(jblqldsv));
        // VerticalGroup
        layout6.setVerticalGroup(layout6
                .createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(jblqldsv));

        // panel7
        panel7 = new JPanel();
        jblbasv = new JLabel("3 Sinh viên có điểm cao nhất:");
        GroupLayout layout7 = new GroupLayout(panel7);
        panel7.setLayout(layout7);

        // HorizontalGroup
        layout7.setHorizontalGroup(layout7
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jblbasv));
        // VerticalGroup
        layout7.setVerticalGroup(layout7
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jblbasv));
        
        // Bảng table

        String[] tencot = {"Ma SV", "Họ và Tên", "Tiếng Anh","Tin học","GDTC","Điểm TB"};

        //  Data
        Object[][] data = {
            {"PS001", "Nguyễn Tấn Lộc", "10","10","10","10"},
            {"PS002", "Phùng Châu Phát", "9","9","9","9"},
            {"PS003", "Nguễn Vũ Hùng", "8","8","8","8"}};

        JTable tblbang = new JTable();
        tblbang.setRowHeight(30);

        DefaultTableModel model = (DefaultTableModel) tblbang.getModel();


        //Add row
        for (String cot : tencot) {
            model.addColumn(cot);
        }

        //Thêm dữ liệu
        for (Object[] dulieu : data) {
            model.addRow(dulieu);
        }
        JScrollPane jsp = new JScrollPane(tblbang);
        jsp.setPreferredSize(new Dimension(150,130));

        
        // Container
        panel3 = new JPanel();

        GroupLayout layout3 = new GroupLayout(panel3);
        panel3.setLayout(layout3);
        layout3.setAutoCreateContainerGaps(true);
        layout3.setAutoCreateGaps(true);

        // HorizontalGroup
        layout3.setHorizontalGroup(layout3.createParallelGroup()
                .addComponent(panel6)
                .addComponent(panel1)
                .addGroup(layout3.createSequentialGroup()
                        .addGroup(layout3.createParallelGroup()
                                .addComponent(panel2)
                                .addComponent(panel5))
                        .addComponent(panel4))
                .addComponent(panel7)
        );

        // VerticalGroup
        layout3.setVerticalGroup(layout3.createSequentialGroup()
                .addComponent(panel6)
                .addComponent(panel1)
                .addGroup(layout3.createParallelGroup()
                        .addGroup(layout3.createSequentialGroup()
                                .addComponent(panel2)
                                .addComponent(panel5))
                        .addComponent(panel4))
                .addComponent(panel7)
        );

        jf.getContentPane().add(panel3);       
        jf.add(jsp,BorderLayout.SOUTH);     
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        QuanLiDiemSinhVien qldsv = new QuanLiDiemSinhVien();
    }
}
