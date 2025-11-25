package com.spring.jwt.FamilyBackground;

import com.spring.jwt.ContactDetails.ContactDTO;
import com.spring.jwt.utils.BaseResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/family")
public class FamilyBackgroundController {

    @Autowired
    private FamilyBackgroundService service;

    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> createBackground(@RequestBody FamilyBackgroundDTO dto) {

        BaseResponseDTO response = service.create(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

}
