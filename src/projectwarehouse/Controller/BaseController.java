/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Controller;

//import com.sun.rowset.CachedRowSetImpl;
import javax.sql.rowset.*; 
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import projectwarehouse.Connection.DBConnection;

/**
 *
 * @author kiddy
 */
public class BaseController {
    DBConnection koneksi = new DBConnection();
    
    public boolean preparedStatement(Map<Integer, Object> map, String sql) {
        try {
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet()) {
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            int rows = ps.executeUpdate();
            con.close();
            
            return rows != 0;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet get(String sql) {
        try{
            Connection con = koneksi.open();
            
            Statement state = (Statement) con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            
            con.close();
            
            return crs;
        } catch (Exception e ){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet getWithParameter(Map<Integer, Object> map, String sql) {
        try{
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet()) {
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            ResultSet rs = ps.executeQuery();
            
             CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            
            con.close();
            return crs;
        } catch (Exception e ){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
