/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba01.demo.productoDAO;
import Prueba01.demo.entity.Producto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yorman
 */
public interface IProductodao {
    List<Map<String,Object>> readALL();
    int create(Producto tu);
    int update(Producto tu);
    int delete(int id);
    Producto read(int id);
   Producto searchUser(String user);
    
}
