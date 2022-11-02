/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Item;

/**
 *
 * @author vinic
 */
public class ItemController {
    
    public boolean cadastrarItem(Integer codFilme, String tipo, double preco) throws ExceptionDAO {
        
        if(codFilme > 0 && tipo != null && preco > 0) {
            Item item = new Item (codFilme, tipo, preco);
            item.cadastrarItem(item);
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Item> listarItens(String titulo) throws ExceptionDAO {
        return new Item().listarItens(titulo);
    }
    
    public boolean alterarItem(Integer codItem, Integer codFilme,  String tipo, double preco) throws ExceptionDAO {
        
        if(codFilme > 0 && tipo != null && preco > 0) {
            Item item = new Item (codFilme, tipo, preco);
            item.setCodItem(codItem);
            item.alterarItem(item);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean apagarItem(int codItem) throws ExceptionDAO {
          if (codItem == 0){
              return false;
          } else {
              Item item = new Item();
              item.setCodItem(codItem);
              item.apagarItem(item);
              return true;
          }
      }
    
    
   
  
}
