/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Query;


public class MainQuery {
    
    public String create = "INSERT INTO barang_masuk (name, product_type, " + 
            "stock, input_date) VALUES (?, ?, ?, ?)";
    
    public String getIn = "SELECT * FROM barang_masuk";
    public String getOut = "SELECT name, product_type, stock_out, output_date FROM barang_keluar";
    
    public String showById = "SELECT * FROM barang_masuk where id = ?";
    public String showByName = "SELECT * FROM barang_masuk where name LIKE ?";
    
    public String barangkeluarinsert = "INSERT INTO `barang_keluar` SET `name` = ?, `product_type` = ?, `stock_out` = ?, `output_date` = ?"; 

            
    public String updatestock= "UPDATE barang_masuk set stock = stock - ? " +
                            "WHERE id = ?";
    
    public String update = "UPDATE barang_masuk SET name = ?, product_type = ?, "
            + "stock = ?, input_date = ? WHERE id = ?";
    public String delete = "DELETE FROM barang_masuk WHERE id = ?";
}
