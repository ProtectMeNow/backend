package br.com.pulseira.sos.Pulseira.SOS.service;

import br.com.pulseira.sos.Pulseira.SOS.model.*;
import br.com.pulseira.sos.Pulseira.SOS.persistence.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface UserService {

    List<UserEntity> getAll();
}
