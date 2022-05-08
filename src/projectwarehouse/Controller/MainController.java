/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import projectwarehouse.Helper.Helper;
import projectwarehouse.Model.MainModel;
import projectwarehouse.Query.MainQuery;

/**
 *
 * @author kiddy
 */
public class MainController extends BaseController {
    
    Helper helper = new Helper();
    MainQuery query = new MainQuery();
    
    public boolean create(MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getInputdate());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean update(String id, MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getInputdate());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, date);
        map.put(5, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    public boolean stockdecreasebarangmasuk(String id, MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getInputdate());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getStock());
        map.put(2, id);

        String sql = this.query.updatestock;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean stockinsertbarangkeluar(String id, MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getInputdate());
        
        Map<Integer, Object> map = new HashMap<>();

        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, date);

        String sql = this.query.barangkeluarinsert;
        
        return this.preparedStatement(map, sql);
    }
    
    
    
    
    public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
    
    public ResultSet getIn() {
        String sql = this.query.getIn;
        return (ResultSet) this.get(sql);
    }
    
    public ResultSet getOut() {
        String sql = this.query.getOut;
        return (ResultSet) this.get(sql);
    }
    
    public ResultSet showById(String id) {
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return (ResultSet) this.getWithParameter(map, sql);
    }
    
    public ResultSet showByName(String name) {
        String sql = this.query.showByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return (ResultSet) this.getWithParameter(map, sql);
    }
}
