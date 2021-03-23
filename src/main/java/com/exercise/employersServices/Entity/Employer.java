package com.exercise.employersServices.Entity;

import com.exercise.employersServices.Utils.DateUtils;

import javax.persistence.*;
import java.util.Date;
import java.util.stream.Stream;

@Entity
@Table(name="Employer")
public class Employer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellidoPaterno;
    @Column
    private String apellidoMaterno;
    @Column
    private String tipoDocumento;
    @Column
    private String numDocumento;
    @Column
    private Date fechaNacimiento;
    @Column
    private Date fechaVinculacion;
    @Column
    private String cargo;
    @Column
    private Double salario;

    public Employer(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numDocumento, String fechaNacimiento, String fechaVinculacion, String cargo, Double salario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.fechaNacimiento = DateUtils.StringToDate(fechaNacimiento);
        this.fechaVinculacion = DateUtils.StringToDate(fechaVinculacion);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public StringBuilder attrEmpty(){
        StringBuilder isEmpty = new StringBuilder("");
        Stream.of(this.getClass().getDeclaredFields()).forEach(f ->{
            try {
                if(f.get(this)==null){
                    isEmpty.append(f.getName()+",");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        return isEmpty;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numDocumento='" + numDocumento + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaVinculacion=" + fechaVinculacion +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

}
