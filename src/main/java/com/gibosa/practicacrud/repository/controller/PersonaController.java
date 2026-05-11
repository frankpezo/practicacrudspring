package com.gibosa.practicacrud.repository.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gibosa.practicacrud.dto.PersonaDtoRequest;
import com.gibosa.practicacrud.dto.PersonaDtoResponse;
import com.gibosa.practicacrud.response.ApiResponse;
import com.gibosa.practicacrud.service.PersonaServiceInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
	private final PersonaServiceInterface service; 
	
	public PersonaController(PersonaServiceInterface service) {
		this.service = service; 
	}
	
	
	 @GetMapping
	    public ResponseEntity<ApiResponse<List<PersonaDtoResponse>>> listar() {
	        List<PersonaDtoResponse> personas = service.listar();

	        return ResponseEntity.ok(
	                ApiResponse.successData(personas)
	        );
	    }
	
    @PostMapping
    public ResponseEntity<ApiResponse<PersonaDtoResponse>> registrar(@Valid @RequestBody PersonaDtoRequest request) {
        PersonaDtoResponse persona = service.registrar(request);

        return ResponseEntity.ok(
                ApiResponse.successData(persona)
        );
    }
}
