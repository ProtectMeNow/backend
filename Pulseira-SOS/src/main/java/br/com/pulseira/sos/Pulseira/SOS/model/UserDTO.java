package br.com.pulseira.sos.Pulseira.SOS.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String uuid;
    private String nomeCompleto;
    private String email;
    private String senha;
    private String telefone;
}
