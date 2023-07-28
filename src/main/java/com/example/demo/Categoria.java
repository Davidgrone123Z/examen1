package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;

    @OneToMany(targetEntity = Instrumento.class, mappedBy = "categoria")
    @OrderBy("nombre ASC")
    private Set<Instrumento> instrumentos = new HashSet<Instrumento>();

    public Set<Instrumento> getCategoria() {
        return instrumentos;
    }

    public void setCategoria(Set<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public Integer getid() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}
