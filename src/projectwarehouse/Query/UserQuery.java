/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Query;



public class UserQuery {
    public String login = "SELECT * FROM users WHERE "
            + "username = ? AND password = ?";
}
