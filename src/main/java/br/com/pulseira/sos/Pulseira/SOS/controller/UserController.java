package br.com.pulseira.sos.Pulseira.SOS.controller;


import br.com.pulseira.sos.Pulseira.SOS.persistence.entity.*;
import br.com.pulseira.sos.Pulseira.SOS.service.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(path = "/get-all")
    @Operation(description = "Buscar todos os usuários", tags = "Usuário", summary = "Buscar todos os usuários")
    public ResponseEntity<List<UserEntity>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}
