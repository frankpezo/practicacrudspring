package com.gibosa.practicacrud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//PARA ENTRADA DE DATOS
public class PersonaDtoRequest {
	@NotBlank(message = "El nombre es obligatorio")
	@Size(max = 20, message = "El nombre no debe superar los 20 caracteres")
	 private String nombrePersona;
	
	@NotBlank(message = "El apellido paterno es obligatorio")
	@Size(max = 20, message = "El apellido no debe superar los 20 caracteres")
	 private String apellidoPaterno;
	
	@NotBlank(message = "El dni es obligatorio")
	@Size(max = 20, message = "El dni no debe superar los 20 caracteres")
	 private String dniPersona;
	

	@Size(max = 20, message = "La foto no debe superar los 100 caracteres")
	 private String fotoPersonal;
	 
	 public PersonaDtoRequest() {}
	 public PersonaDtoRequest(String nombrePersona, String apellidoPaterno, String dniPersona, String fotoPersonal) {
		 	this.nombrePersona = nombrePersona;
		 	this.apellidoPaterno = apellidoPaterno;
		 	this.dniPersona = dniPersona;
		 	this.fotoPersonal = fotoPersonal;
	 }
	 
	//Getters y setters
	    public String getNombrePersona() {return nombrePersona; }
	    public void setNombrePersona(String nombrePersona) {this.nombrePersona = nombrePersona; }
	    
	    public String getApellidoPaterno() {return apellidoPaterno; }
	    public void setApellidoPaterno(String apellidoPaterno) {this.apellidoPaterno = apellidoPaterno; }
	    
	    public String getDniPersona() {return dniPersona; }
	    public void setDniPersona(String dniPersona) {this.dniPersona = dniPersona; }
	    
	    public String getFotoPersonal() {return fotoPersonal; }
	    public void setFotoPersonal(String fotoPersonal) {this.fotoPersonal = fotoPersonal; }
}

