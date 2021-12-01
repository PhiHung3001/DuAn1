/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HoaDon;
import Helper.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDon_DAO extends Dao<HoaDon, String>{
      
    String insertHD ="INSERT INTO HOADON VALUES (?,?,?,?,?,?,?,?,?)";
    String updateHD ="UPDATE HOADON SET MAKH=?, HINHTHUCTHANHTOAN=?, HINHTHUCMUA=?, TRANGTHAIHD=? WHERE MAHD=?";
    String selectAll="SELECT * FROM HOADON";
    String selectById="SELECT * FROM HOADON WHERE MAHD=?";
    
    @Override
    public void insert(HoaDon entity) {
        jdbcHelper.Update(insertHD, entity.getMaHD(),entity.getMaNV(),entity.getMaKH(),entity.getNgayGD(),
                entity.isHinhThucThanhToan(),entity.isHinhthucmua(),entity.getKhachTra(),entity.getTongTien(),
                entity.getTrangThaiHD());
    }

    @Override
    public void update(HoaDon entity) {
        jdbcHelper.Update(updateHD,entity.getMaKH(),entity.isHinhThucThanhToan(),
                entity.isHinhthucmua(), entity.getTrangThaiHD(), entity.getMaHD());
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        List<HoaDon> list= this.selectBySql(selectAll);
        return list;
    }

    @Override
    public HoaDon selectById(String key) {
        List<HoaDon> list= this.selectBySql(selectAll);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public String maSP_TuSinh() throws SQLException {
        String ma = null;
        String sql = "{CALL SP_MAHD}";
        ResultSet rs = jdbcHelper.query(sql);
        while (rs.next()) {
             ma =rs.getString(1);
        }
        return ma;
    } 

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        try {
            List<HoaDon> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayGD(rs.getDate(4));
                hd.setHinhThucThanhToan(rs.getBoolean(5));
                hd.setHinhthucmua(rs.getBoolean(6));
                hd.setKhachTra(rs.getDouble(7));
                hd.setTongTien(rs.getDouble(8));
                hd.setTrangThaiHD(rs.getString(9));
                list.add(hd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
