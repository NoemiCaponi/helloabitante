package it.helloabitante.service.abitante;

import java.util.List;

import it.helloabitante.dao.abitante.AbitanteDAO;
import it.helloabitante.model.Abitante;

public class AbitanteServiceImpl implements AbitanteService {

	private AbitanteDAO abitanteDAO;

	public void setAbitanteDAO(AbitanteDAO abitanteDAO) {
		this.abitanteDAO = abitanteDAO;
	}

	@Override
	public List<Abitante> cercaPerNomeECognome(String nome, String cognome) {
		// abitanteDAO.setConnection(MyConnection.getConnection());
		return abitanteDAO.findByNomeAndCognome(nome, cognome);
	}

	@Override
	public List<Abitante> getList() throws Exception {
		
		return abitanteDAO.list();
	}

	@Override
	public Abitante getId(Long id) throws Exception {
		if(id==null)
			throw new Exception("input non ammesso");
		return abitanteDAO.get(id);
	}

	@Override
	public int updateAbitante(Abitante input) throws Exception {
		if (input == null || input.getIdAbitante() == null || input.getIdAbitante() <1)
			throw new Exception("input non ammesso");
		return abitanteDAO.update(input);
	}

	@Override
	public int insertAbitante(Abitante input) throws Exception {
		if(input==null)
			throw new Exception("input non ammesso");
		return abitanteDAO.insert(input);
	}

	@Override
	public int deleteAbitante(Abitante input) throws Exception {
		if (input == null || input.getIdAbitante() == null || input.getIdAbitante() <1)
			throw new Exception("input non ammesso");
		return abitanteDAO.delete(input);
	}

}
