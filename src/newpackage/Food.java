/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author PC
 */
public class Food {
    private final SimpleStringProperty item, quantity;
    public Food(){
        this(null, null);
    }
    public Food(String item, String quantity){
        this.quantity = new SimpleStringProperty(quantity) ;
        this.item = new SimpleStringProperty(item);
        
    }
    
}
