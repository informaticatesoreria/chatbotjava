package gob.edomex.tesoreria.chatbot.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="usuarios_telefono", schema = "inventario")
public class UsuarioTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="telefono_id")
	private Integer telefonoId;

	private String comentarios;

	@Column(name="creado_en")
	private LocalDateTime creadoEn;

	@Column(name="creado_por")
	private String creadoPor;

	@Column(name="modificado_en")
	private LocalDateTime modificadoEn;

	@Column(name="modificado_por")
	private String modificadoPor;

	private Long numero;

	private Integer status;

	@Column(name="usuarios_asig_nodos_asign_nodo_id")
	private Integer usuariosAsigNodosAsignNodoId;

	@Column(name="usuarios_c_tipos_telefono_tipo_telefono_id")
	private Integer usuariosCTiposTelefonoTipoTelefonoId;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuarios_usuario_id")
	private Usuario usuario;

	public UsuarioTelefono() {
	}

	

}