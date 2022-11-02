/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.model.Item;

/**
 *
 * @author vinic
 */
public class ItemController {
    
    public boolean cadastrarItem(Integer codFilme, String tipo, double preco) {
        
        if(codFilme > 0 && tipo != null && preco > 0) {
            Item item = new Item (codFilme, tipo, preco);
            item.cadastrarItem(item);
            return true;
        } else {
            return false;
        }
    }
    
}
