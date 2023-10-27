package br.com.pulseira.sos.Pulseira.SOS.persistence.repository;

import br.com.pulseira.sos.Pulseira.SOS.persistence.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
