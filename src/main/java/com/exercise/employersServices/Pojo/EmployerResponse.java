package com.exercise.employersServices.Pojo;

import com.exercise.employersServices.Utils.DateUtils;

public class EmployerResponse extends EmployerRequest {

    String edad;
    String tiempoVinculacion;

    public EmployerResponse(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numDocumento, String fechaNacimiento, String fechaVinculacion, String cargo, Double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoDocumento, numDocumento, fechaNacimiento, fechaVinculacion, cargo, salario);
        edad = DateUtils.detalleFecha(fechaNacimiento);
        tiempoVinculacion = DateUtils.detalleFecha(fechaVinculacion);
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTiempoVinculacion() {
        return tiempoVinculacion;
    }

    public void setTiempoVinculacion(String tiempoVinculacion) {
        this.tiempoVinculacion = tiempoVinculacion;
    }
}
