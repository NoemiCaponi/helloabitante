package it.helloabitante.service.abitante;

import java.util.List;

import it.helloabitante.dao.abitante.AbitanteDAO;
import it.helloabitante.model.Abitante;

public interface AbitanteService {
	public void setAbitanteDAO(AbitanteDAO abitanteDAO);

	public List<Abitante> cercaPerNomeECognome(String nome, String cognome);
	
	public List<Abitante> getList() throws Exception;

	public Abitante getId(Long id) throws Exception;

	public int updateAbitante(Abitante input) throws Exception;

	public int insertAbitante(Abitante input) throws Exception;

	public int deleteAbitante(Abitante input) throws Exception;
}
