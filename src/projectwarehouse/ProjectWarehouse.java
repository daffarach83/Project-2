/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectwarehouse;

import projectwarehouse.Connection.DBConnection;
import projectwarehouse.Frame.LoginFrame;
import projectwarehouse.Frame.MainFrame;

/**
 *
 * @author Office
 */
public class ProjectWarehouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection con=new DBConnection();
        System.out.println(con.open());
        
//        MainFrame frame=new MainFrame();
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(frame);
        
        
        LoginFrame login=new LoginFrame();
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    
}
