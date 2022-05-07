/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Query;


public class MainQuery {
    
    public String create = "INSERT INTO barang_masuk (name, product_type, " + 
            "stock, input_date) VALUES (?, ?, ?, ?)";
    
    public String get = "SELECT * FROM barang_masuk";
    public String showById = "SELECT * FROM barang_masuk where id = ?";
    public String showByName = "SELECT * FROM barang_masuk where name LIKE ?";
    
//    public String stockmin= "UPDATE barang_masuk set stock = stock - ? " +
//            "WHERE id = ?" +
//            "INSERT INTO barang_keluar (name, product_type, " + 
//            "stock_out, output_date) VALUES (?, ?, ?, ?)";
    
    public String cobacoba = "INSERT INTO `barang_keluar` SET `name` = ?, `product_type` = ?, `stock_out` = ?, `output_date` = ?"; 
    
    public String insertbarangkeluar= "INSERT INTO barang_keluar (name, product_type, " + 
            "stock_out, output_date) VALUES (?, ?, ?, ?)";
            
    public String updatestock= "UPDATE barang_masuk set stock = stock - ? " +
                            "WHERE id = ?";
    
    public String update = "UPDATE barang_masuk SET name = ?, product_type = ?, "
            + "stock = ?, input_date = ? WHERE id = ?";
    public String delete = "DELETE FROM barang_masuk WHERE id = ?";
}
