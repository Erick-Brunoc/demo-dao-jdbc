package Interface;

import Entidades.Vendedor;
import java.util.List;

public interface VendedorDAO {
    
    
    void insert (Vendedor dp);
    void update (Vendedor dp);
    void deleteId (Integer id);
    Vendedor findId (Integer id);
    List<Vendedor> findAll ();
    
}
