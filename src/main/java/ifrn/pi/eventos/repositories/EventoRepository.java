package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.models.Eventos;

public interface EventoRepository extends JpaRepository<Eventos, Long>{

}