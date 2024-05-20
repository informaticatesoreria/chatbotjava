package gob.edomex.tesoreria.chatbot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gob.edomex.tesoreria.chatbot.model.UsuarioTelefono;


public interface UsuarioTelefonoRepository extends JpaRepository<UsuarioTelefono, Integer> {
	
	@Query("SELECT ut FROM UsuarioTelefono ut WHERE ut.numero = :numero AND ut.status = 1")
    Optional<UsuarioTelefono> findByNumeroAndStatus(Long numero);

}
