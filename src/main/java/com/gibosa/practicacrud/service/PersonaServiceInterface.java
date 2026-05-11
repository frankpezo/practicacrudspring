package com.gibosa.practicacrud.service;

import java.util.List;

import com.gibosa.practicacrud.dto.PersonaDtoRequest;
import com.gibosa.practicacrud.dto.PersonaDtoResponse;

public interface PersonaServiceInterface {
	//Listar personas
		List<PersonaDtoResponse> listar();
		
		//crear personas
		PersonaDtoResponse registrar(PersonaDtoRequest request);
		
		//actualizar
		PersonaDtoResponse actualizar(int idPersona, PersonaDtoRequest request);
		
		//eliminar
		abstract void eliminar(int idPersona); 
}
