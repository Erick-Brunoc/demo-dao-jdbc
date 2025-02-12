package demo.dao.jdbc1;

import Entidades.DAOfactory;
import Entidades.Departamento;
import Entidades.Vendedor;
import Interface.VendedorDAO;
import java.util.Date;

public class DemoDaoJdbc1 {
    public static void main(String[] args) {
        
        Departamento dp = new Departamento (1,"book");
        System.out.println(dp);
        
        Vendedor vend = new Vendedor (20, "Erick", "Erick@gmail.com", new Date(),2000.0, dp);
        System.out.println(vend);
        
        VendedorDAO  vendedorDAO = DAOfactory.criaVendedorDAO();
        
        
    }
    
}
