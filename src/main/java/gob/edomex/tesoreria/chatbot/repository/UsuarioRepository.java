package gob.edomex.tesoreria.chatbot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gob.edomex.tesoreria.chatbot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Query(value = "SELECT * FROM inventario.usuarios u " +
            "WHERE sinacentos(UPPER(u.nombre)) LIKE UPPER(concat('%', :nombre, '%')) " +
            "AND sinacentos(UPPER(u.ap_pat)) LIKE UPPER(concat('%', :apellidoPaterno, '%')) " +
            "AND sinacentos(UPPER(u.ap_mat)) LIKE UPPER(concat('%', :apellidoMaterno, '%')) " +
            "AND u.status = 1", nativeQuery = true)
	Optional<Usuario> findByNombre(String nombre, String apellidoPaterno, String apellidoMaterno);

}
