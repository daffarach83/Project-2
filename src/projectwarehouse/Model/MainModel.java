/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectwarehouse.Model;

import java.util.Date;

/**
 *
 * @author kiddy
 */
public class MainModel {
    
    private String name;
    private String type;
    private String stock;
    private Date inputdate;
    private Date outputdate;
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public void setOutputdate(Date outputdate) {
        this.outputdate = outputdate;
    }

    public Date getOutputdate() {
        return outputdate;
    }
    
}
