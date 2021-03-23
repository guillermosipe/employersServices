//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.13 at 02:21:41 PM CST
//


package com.exercise.employersServices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployerDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EmployerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerDetails", propOrder = {
        "nombre",
        "apellidoPaterno",
        "apellidoMaterno",
        "tipoDocumento",
        "numDocumento",
        "fechaNacimiento",
        "fechaVinculacion",
        "cargo",
        "salario"
})
public class EmployerDetails {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apellidoPaterno;
    @XmlElement(required = true)
    protected String apellidoMaterno;
    @XmlElement(required = true)
    protected String tipoDocumento;
    @XmlElement(required = true)
    protected String numDocumento;
    @XmlElement(required = true)
    protected String fechaNacimiento;
    @XmlElement(required = true)
    protected String fechaVinculacion;
    @XmlElement(required = true)
    protected String cargo;
    protected double salario;

    public EmployerDetails(){

    }

    public EmployerDetails(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numDocumento, String fechaNacimiento, String fechaVinculacion, String cargo, double salario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacion = fechaVinculacion;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apellidoPaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Sets the value of the apellidoPaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Gets the value of the apellidoMaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Sets the value of the apellidoMaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numDocumento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumDocumento() {
        return numDocumento;
    }

    /**
     * Sets the value of the numDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumDocumento(String value) {
        this.numDocumento = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the fechaVinculacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Sets the value of the fechaVinculacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaVinculacion(String value) {
        this.fechaVinculacion = value;
    }

    /**
     * Gets the value of the cargo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the salario property.
     *
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Sets the value of the salario property.
     *
     */
    public void setSalario(double value) {
        this.salario = value;
    }

}
