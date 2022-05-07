/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Controller;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import projectwarehouse.Helper.Helper;
import projectwarehouse.Model.UserModel;
import projectwarehouse.Query.UserQuery;

/**
 *
 * @author kiddy
 */
public class UserController extends BaseController {
    
    Helper helper = new Helper();
    UserQuery query = new UserQuery();
    
    public ResultSet login(UserModel model) {
        String sql = this.query.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
        map.put(2, model.getPassword());
        
        return this.getWithParameter(map, sql);
    }
}