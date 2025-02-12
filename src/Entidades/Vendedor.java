package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private Date birth;
    private Double salario;
    
    private Departamento depart;

    public Vendedor() {
    }

    public Vendedor(Integer id, String nome, String email, Date birth, Double salario, Departamento depart) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.birth = birth;
        this.salario = salario;
        this.depart = depart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepart() {
        return depart;
    }

    public void setDepart(Departamento depart) {
        this.depart = depart;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", birth=" + birth + ", salario=" + salario + ", depart=" + depart + '}';
    }
    
    
    
    
}
