package edu.utez.p1.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")

public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idPersona;
private String nombre;
private String primerApellido;
private String segundoApellido;
private String RFC;
private String CURP;
private String claveElector;
private String entidadFederativa;
private String municipio;
private String colonia;
private String calle;
private int numeroExterior;
private int numeroInterior;
private String correo;
private Date fechaRegistro;



public long getIdPersona() {
	return idPersona;
}
public void setIdPersona(long idPersona) {
	this.idPersona = idPersona;
}
public String getPrimerApellido() {
	return primerApellido;
}
public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
}
public String getSegundoApellido() {
	return segundoApellido;
}
public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
}
public String getRFC() {
	return RFC;
}
public void setRFC(String rFC) {
	RFC = rFC;
}
public String getCURP() {
	return CURP;
}
public void setCURP(String cURP) {
	CURP = cURP;
}
public String getClaveElector() {
	return claveElector;
}
public void setClaveElector(String claveElector) {
	this.claveElector = claveElector;
}
public String getEntidadFederativa() {
	return entidadFederativa;
}
public void setEntidadFederativa(String entidadFederativa) {
	this.entidadFederativa = entidadFederativa;
}
public String getMunicipio() {
	return municipio;
}
public void setMunicipio(String municipio) {
	this.municipio = municipio;
}
public String getColonia() {
	return colonia;
}
public void setColonia(String colonia) {
	this.colonia = colonia;
}
public String getCalle() {
	return calle;
}
public void setCalle(String calle) {
	this.calle = calle;
}
public int getNumeroExterior() {
	return numeroExterior;
}
public void setNumeroExterior(int numeroExterior) {
	this.numeroExterior = numeroExterior;
}
public int getNumeroInterior() {
	return numeroInterior;
}
public void setNumeroInterior(int numeroInterior) {
	this.numeroInterior = numeroInterior;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public Date getFechaRegistro() {
	return fechaRegistro;
}
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", primerApellido=" + primerApellido
			+ ", segundoApellido=" + segundoApellido + ", RFC=" + RFC + ", CURP=" + CURP + ", claveElector="
			+ claveElector + ", entidadFederativa=" + entidadFederativa + ", municipio=" + municipio + ", colonia="
			+ colonia + ", calle=" + calle + ", numeroExterior=" + numeroExterior + ", numeroInterior=" + numeroInterior
			+ ", correo=" + correo + ", fechaRegistro=" + fechaRegistro + "]";
}





}
