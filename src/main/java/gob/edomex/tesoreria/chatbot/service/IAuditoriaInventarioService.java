package gob.edomex.tesoreria.chatbot.service;

import java.util.List;


import gob.edomex.tesoreria.chatbot.model.Auditoriainventario;

public interface IAuditoriaInventarioService {
	
	public List<Auditoriainventario> getAll();
	
	public Auditoriainventario save(Auditoriainventario auditoriainventario);

}
