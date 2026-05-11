package com.gibosa.practicacrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class PersonaEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona")
	private int idPersona;
	
	@Column(name="nombre_persona", nullable=false, length=20)
	private String nombrePersona;
	
	@Column(name="apellido_paterno", nullable=false, length=20)
	private String apellidoPaterno;
	
	@Column(name="dni_persona",nullable=false, length=20)
	private String dniPersona;
	
	@Column(name="foto_personal",length=100)
	private String fotoPersonal; 
	
	
    public PersonaEntity() {}
    public PersonaEntity(int idPersona, String nombrePersona, String apellidoPaterno, String dniPersona, String fotoPersonal) {
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








