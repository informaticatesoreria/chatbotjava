package gob.edomex.tesoreria.chatbot.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Setter
@Getter
@Entity
@Table(name="auditoriainventario", schema = "inventario" )
public class Auditoriainventario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="auditoria_id")
	private Integer auditoriaId;

	private Integer concepto;

	@Column(name="creado_en")
	private LocalDateTime creadoEn;

	@Column(name="creado_por")
	private String creadoPor;

	private Integer id;

	private String ip;

	private Integer tabla;


}