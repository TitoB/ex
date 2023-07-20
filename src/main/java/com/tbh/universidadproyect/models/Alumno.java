package com.tbh.universidadproyect.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona{
    @ManyToOne(
            optional = true,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;
    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String dni,
                  LocalDate fechaAlta, LocalDate fechaModificacion,
                  Direccion direccion) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
    }

    public Alumno(Object o, String lautaro, String gimenez, String number, Direccion direccion) {
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+
            "Alumno{}";

    }
}
