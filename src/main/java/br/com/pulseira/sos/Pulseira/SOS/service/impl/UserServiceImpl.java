package br.com.pulseira.sos.Pulseira.SOS.service.impl;

import br.com.pulseira.sos.Pulseira.SOS.model.*;
import br.com.pulseira.sos.Pulseira.SOS.persistence.entity.*;
import br.com.pulseira.sos.Pulseira.SOS.persistence.repository.*;
import br.com.pulseira.sos.Pulseira.SOS.service.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<UserEntity> getAll() {

        return repository.findAll();
    }
}
