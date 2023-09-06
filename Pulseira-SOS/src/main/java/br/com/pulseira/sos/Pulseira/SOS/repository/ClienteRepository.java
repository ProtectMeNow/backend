package br.com.pulseira.sos.Pulseira.SOS.repository;

import br.com.pulseira.sos.Pulseira.SOS.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
