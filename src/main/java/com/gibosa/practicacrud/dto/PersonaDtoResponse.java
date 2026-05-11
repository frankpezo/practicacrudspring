package com.gibosa.practicacrud.dto;

//PARA LA SALIDA DE LOS DATOS
public class PersonaDtoResponse {
	 private int idPersona;
	 private String nombrePersona;
	 private String apellidoPaterno;
	 private String dniPersona;
	 private String fotoPersonal;
	 
	 public PersonaDtoResponse() {}
	 public PersonaDtoResponse(int idPersona, String nombrePersona, String apellidoPaterno, String dniPersona, String fotoPersonal) {
		 	this.idPersona = idPersona;
		 	this.nombrePersona = nombrePersona;
		 	this.apellidoPaterno = apellidoPaterno;
		 	this.dniPersona = dniPersona;
		 	this.fotoPersonal = fotoPersonal;
	 }
	 
	//Getters y setters
	    public int getIdPersona() {return idPersona; }
	    public void setIdPersona(int idPersona) {this.idPersona = idPersona; }
	    
	    public String getNombrePersona() {return nombrePersona; }
	    public void setNombrePersona(String nombrePersona) {this.nombrePersona = nombrePersona; }
	    
	    public String getApellidoPaterno() {return apellidoPaterno; }
	    public void setApellidoPaterno(String apellidoPaterno) {this.apellidoPaterno = apellidoPaterno; }
	    
	    public String getDniPersona() {return dniPersona; }
	    public void setDniPersona(String dniPersona) {this.dniPersona = dniPersona; }
	    
	    public String getFotoPersonal() {return fotoPersonal; }
	    public void setFotoPersonal(String fotoPersonal) {this.fotoPersonal = fotoPersonal; }
}
