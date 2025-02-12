package Interface;

import Entidades.Departamento;
import java.util.List;

public interface DepartamentoDAO {
    
    void insert (Departamento dp);
    void update (Departamento dp);
    void deleteId (Integer id);
    Departamento findId (Integer id);
    List<Departamento> findAll ();
    
    
}
