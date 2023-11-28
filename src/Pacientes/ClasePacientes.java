/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacientes;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class ClasePacientes {
 private int id; 
 private String nombre; 
 private LocalDate fecha;
 private int horallegada; 
 private int horasalida; 
 private String clasificacion; 

    public ClasePacientes(int id, String nombre, LocalDate fecha, int horallegada, int horasalida, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.horallegada = horallegada;
        this.horasalida = horasalida;
        this.clasificacion = clasificacion;
    }

    public int getId() {
        return id;
    }

   
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "ClasePacientes " + "id: " + id + ", nombre: " + nombre + ", fecha: " + fecha + ", horallegada: " + horallegada + ", horasalida: " + horasalida + ", clasificacion: " + clasificacion;
    }
 
 
 
    
}
