package com.tbh.universidadproyect.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona{
    private BigDecimal sueldo;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "profesor_carrera",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "carrera_id")
    )
    private Set<Carrera> carreras;
    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dni, LocalDate fechaAlta,
                    LocalDate fechaModificacion, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
        this.sueldo = sueldo;
    }

    public Profesor(Object o, String horacio, String laurin, String number, Direccion direccion, BigDecimal bigDecimal) {
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(Set<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "\tProfesor{" +
                "sueldo=" + sueldo +
                '}';
    }
}
