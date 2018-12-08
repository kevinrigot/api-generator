package com.qpact.generateapi.controller;

import com.qpact.api.PetApi;
import com.qpact.model.ModelApiResponse;
import com.qpact.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PetApiController implements PetApi {
    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Pet jojo = new Pet();
        jojo.setId(petId);
        jojo.setName("jojo");
        return new ResponseEntity<Pet>(jojo, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> addPet(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Valid List<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Valid List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePet(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, @Valid MultipartFile file) {
        return null;
    }
}
