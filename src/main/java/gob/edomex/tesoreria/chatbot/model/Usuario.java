package gob.edomex.tesoreria.chatbot.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@Entity
@Table(name="usuarios", schema = "inventario" )
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private Integer usuarioId;

	private LocalDate alta;

	@Column(name="ap_mat")
	private String apMat;

	@Column(name="ap_pat")
	private String apPat;

	private LocalDate baja;

	private String cifrado;

	private String claveservidor;

	private String comentarios;

	@Column(name="creado_en")
	private LocalDateTime creadoEn;

	@Column(name="creado_por")
	private String creadoPor;

	private String curp;

	private String dispositivo;

	@Column(name="fecha_nacimiento")
	private LocalDate fechaNacimiento;

	@Column(name="modificado_en")
	private LocalDateTime modificadoEn;

	@Column(name="modificado_por")
	private String modificadoPor;

	private String nombre;

	private Integer status;

	private Integer titulo;

	//bi-directional many-to-one association to UsuariosTelefono
	/*@OneToMany(mappedBy="usuario")
	private List<UsuariosTelefono> usuariosTelefonos;*/

	public Usuario() {
	}

	

}