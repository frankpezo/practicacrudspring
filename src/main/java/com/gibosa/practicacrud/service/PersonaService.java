package com.gibosa.practicacrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gibosa.practicacrud.dto.PersonaDtoRequest;
import com.gibosa.practicacrud.dto.PersonaDtoResponse;
import com.gibosa.practicacrud.entity.PersonaEntity;
import com.gibosa.practicacrud.repository.PersonaRepository;

@Service
public class PersonaService implements PersonaServiceInterface{
	private final PersonaRepository personarepository;
	
	public PersonaService(PersonaRepository personarepository ) {
			this.personarepository = personarepository; 
	}

	//Listar
	@Override
	public List<PersonaDtoResponse> listar(){
		 return personarepository.findAll()
				 .stream()
				 .map(this::convertirAResponse)
				 .toList();
	}
	
	//Crear
	@Override
	public PersonaDtoResponse registrar(PersonaDtoRequest request) {
		if (personarepository.existsByDniPersona(request.getDniPersona())) {
            throw new RuntimeException("Ya existe una persona con ese DNI");
        }
		
		PersonaEntity persona = new PersonaEntity();
		persona.setNombrePersona(request.getNombrePersona());
		persona.setApellidoPaterno(request.getApellidoPaterno());
		persona.setDniPersona(request.getDniPersona());
		persona.setFotoPersonal(request.getFotoPersonal());
		
		PersonaEntity personaGuardada = personarepository.save(persona);
		return convertirAResponse(personaGuardada);
	}
	
	//Actualizar
	@Override
	public PersonaDtoResponse actualizar(int idPersona, PersonaDtoRequest request) {
		PersonaEntity persona = personarepository.findById(idPersona)
				.orElseThrow(() -> new RuntimeException("Persona no encontrada"));
		
		if(!persona.getDniPersona().equals(request.getDniPersona()) && personarepository.existsByDniPersona(request.getDniPersona())) {
			throw new RuntimeException("Ya existe otra persona con ese DNI");
		}
		
		persona.setNombrePersona(request.getNombrePersona());
		persona.setApellidoPaterno(request.getApellidoPaterno());
		persona.setDniPersona(request.getDniPersona());
		persona.setFotoPersonal(request.getFotoPersonal());
		
		PersonaEntity personaActualizada = personarepository.save(persona);
		return convertirAResponse(personaActualizada);
	}
	
	//Eliminar
	public void eliminar(int idPersona) {
		PersonaEntity persona = personarepository.findById(idPersona)
				.orElseThrow(() -> new RuntimeException("Persona no encontrada"));
	
		personarepository.delete(persona);
	}
	
	
	
	//
	private  PersonaDtoResponse convertirAResponse(PersonaEntity persona) {
		 return new PersonaDtoResponse(
				 persona.getIdPersona(), 
				 persona.getNombrePersona(), 
				 persona.getApellidoPaterno(), 
				 persona.getDniPersona(), 
				 persona.getFotoPersonal()
				 );
	}
	
	
}
