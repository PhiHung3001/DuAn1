/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhanVien_DAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.Msgbox;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiến Mạnh
 */
public class pannelQLNV extends javax.swing.JPanel {

    private NhanVien_DAO dao = new NhanVien_DAO();
    private List<NhanVien> list = new ArrayList();

    public pannelQLNV() {
        initComponents();
        fillTable();
        if (Auth.isManager() != true) {
            btnKhoa.setEnabled(false);
            btnInsert.setEnabled(false);
        } else {
            btnKhoa.setEnabled(true);
            btnInsert.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rdoNhanVien = new javax.swing.JRadioButton();
        RdoChuCH = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnKhoa = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        btnDoiiMk = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoNhanVien.setText("Nhân viên");
        add(rdoNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 194, 93, -1));

        buttonGroup2.add(RdoChuCH);
        RdoChuCH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RdoChuCH.setText("Chủ cửa hàng");
        add(RdoChuCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 194, 114, -1));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MANV", "Họ tên", "Ngày sinh", "CCCD", "SDT", "Giới tính", "UserName", "Password", "Role", "Trạng thái", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 459, 858, 235));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_Logo/users.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_Logo/add.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 104, -1));

        btnKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_Logo/private-account.png"))); // NOI18N
        btnKhoa.setText("Khóa");
        btnKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaActionPerformed(evt);
            }
        });
        add(btnKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 104, -1));
        add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 232, 137, -1));
        add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 340, 137, -1));
        add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 156, 137, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("User name ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 116, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Password ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 156, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Role ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 194, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Manv ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 242, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 116, 137, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 156, 137, -1));
        add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 242, 137, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Họ tên ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 116, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Ngày sinh ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 156, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("CCCD");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 194, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("SĐT ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 232, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Giới tính ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 279, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Mô Tả ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 340, -1, -1));
        add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 116, 137, -1));
        add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 194, 137, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 277, 93, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoNu.setText("Nữ");
        add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 277, 93, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Quản lý nhân viên");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        btnDoiiMk.setText("Đổi mật khẩu");
        btnDoiiMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiiMkActionPerformed(evt);
            }
        });
        add(btnDoiiMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = tblNhanVien.getSelectedRow();
        NhanVien nv = list.get(row);
        setForm(nv);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            insert();
        } catch (ParseException ex) {
            Logger.getLogger(QuanLiTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaActionPerformed
        int row = tblNhanVien.getSelectedRow();

        NhanVien nv = list.get(row);
        if (nv.isTrangThai() == true) {
            nv.setTrangThai(false);

        } else {
            nv.setTrangThai(true);
        }
        dao.khoaTk(nv);
        if (nv.isTrangThai() == true) {
            Msgbox.alert(this, "Khóa nhân viên thành công");
        } else {
            Msgbox.alert(this, "Mở khóa nhân viên thành công");
        }
        fillTable();
    }//GEN-LAST:event_btnKhoaActionPerformed

    private void btnDoiiMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiiMkActionPerformed
        DoiMatKhau dmk = new DoiMatKhau();
        dmk.setVisible(true);
    }//GEN-LAST:event_btnDoiiMkActionPerformed

    public void insert() throws ParseException {
        if (txtTen.getText().isEmpty() || txtTen.getText().length() > 10) {
            Msgbox.alert(this, "Mã không được để trống và tối đa 50 kí tự");
            return;
        }

        if (txtCCCD.getText().isEmpty()) {
            Msgbox.alert(this, "Mã không được để trống CCCD");
            return;
        }
        String cc = "[0-9]{12}";
        if (!txtCCCD.getText().matches(cc)) {
            Msgbox.alert(this, "sai định dạng CCCD");
            return;
        }
        if (txtSDT.getText().isEmpty()) {
            Msgbox.alert(this, "Mã không được để trống SĐT");
            return;
        }
        String sdt = "0[0-9]{9}";
        if (!txtSDT.getText().matches(sdt)) {
            Msgbox.alert(this, "sai định dạng SĐT");
            return;
        }
        if (txtMoTa.getText().isEmpty() || txtMoTa.getText().length() > 100) {
            Msgbox.alert(this, "Mã không được để trống và tối đa 100 kí tự");
            return;
        }
        if (txtUserName.getText().isEmpty() || txtUserName.getText().length() > 100) {
            Msgbox.alert(this, "UserName không được để trống và tối đa 30 kí tự");
            return;
        }
        if (txtPassword.getText().isEmpty() || txtPassword.getText().length() > 100) {
            Msgbox.alert(this, "txtPassword không được để trống và tối đa 30 kí tự");
            return;
        }
        if (txtMaNV.getText().isEmpty() || txtMaNV.getText().length() > 10) {
            Msgbox.alert(this, "Mã không được để trống và tối đa 10 kí tự");
            return;
        }
        for (NhanVien nhanVien : list) {
            if (nhanVien.getUserName().equals(txtUserName.getText())) {
                Msgbox.alert(this, "UserName đã tồn tại");
                return;
            }
        }
        NhanVien nv = getForm();
        dao.insert(nv);
        fillTable();
        Msgbox.alert(this, "Thêm nhân viên thành công");
    }

    public void update() {
        if (txtTen.getText().isEmpty() || txtTen.getText().length() > 10) {
            Msgbox.alert(this, "Mã không được để trống và tối đa 50 kí tự");
            return;
        }

        if (txtCCCD.getText().isEmpty()) {
            Msgbox.alert(this, "Mã không được để trống CCCD");
            return;
        }
        String cc = "[0-9]{12}";
        if (!txtCCCD.getText().matches(cc)) {
            Msgbox.alert(this, "sai định dạng CCCD");
            return;
        }
        if (txtSDT.getText().isEmpty()) {
            Msgbox.alert(this, "Mã không được để trống SĐT");
            return;
        }
        String sdt = "0[0-9]{9}";
        if (!txtSDT.getText().matches(sdt)) {
            Msgbox.alert(this, "sai định dạng SĐT");
            return;
        }
        NhanVien nv = getForm();
        dao.update(nv);
        fillTable();
        Msgbox.alert(this, "Cập nhật nhân viên thành công");
    }

    public void fillTable() {
        list = dao.selectAll();
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        for (NhanVien nhanVien : list) {
            Object[] row = new Object[]{
                nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getNgaySinh(), nhanVien.getCCCD(), nhanVien.getSDT(),
                nhanVien.getGioiTinh() == false ? "Nữ" : "Nam", nhanVien.getUserName(), "***", nhanVien.isRole() == true ? "Chủ" : "Nhân Viên", nhanVien.isTrangThai() == false ? "Khóa" : "Mở",
                nhanVien.getGhiChu()
            };
            model.addRow(row);
        }
    }

    public NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setHoTen(txtTen.getText());
        try {
            SimpleDateFormat formater = new SimpleDateFormat();
            formater.applyPattern("yyyy-MM-dd");
            Date date = formater.parse(txtNgaySinh.getText());
            nv.setNgaySinh(date);
        } catch (Exception e) {
            Msgbox.alert(this, "Ngày sinh");
        }

        nv.setCCCD(txtCCCD.getText());
        nv.setSDT(txtSDT.getText());
        if (rdoNam.isSelected()) {
            nv.setGioiTinh(true);
        } else {
            nv.setGioiTinh(false);
        }
        nv.setGhiChu(txtMoTa.getText());
        nv.setUserName(txtUserName.getText());
        nv.setPassWord(txtPassword.getText());
        if (RdoChuCH.isSelected()) {
            nv.setRole(true);
        } else {
            nv.setRole(false);
        }
        nv.setMaNV(txtMaNV.getText());
        return nv;
    }

    public void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtCCCD.setText(nv.getCCCD());
        txtMoTa.setText(nv.getGhiChu());
        txtNgaySinh.setText(nv.getNgaySinh() + "");
        txtPassword.setText("**");
        txtSDT.setText(nv.getSDT());
        txtTen.setText(nv.getHoTen());
        txtUserName.setText(nv.getUserName());
        if (nv.getGioiTinh() == false) {
            rdoNu.setSelected(true);
        } else {
            rdoNam.setSelected(true);
        }
        if (nv.isRole() == false) {
            rdoNhanVien.setSelected(true);
        } else {
            RdoChuCH.setSelected(true);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdoChuCH;
    private javax.swing.JButton btnDoiiMk;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
