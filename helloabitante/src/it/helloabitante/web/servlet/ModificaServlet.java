package it.helloabitante.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.helloabitante.model.Abitante;
import it.helloabitante.service.MyServiceFactory;


@WebServlet("/ModificaServlet")
public class ModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idAbitanteDaModificare=request.getParameter("abitanteId");
		String nomeAbitanteDaModificare=request.getParameter("nomeInput");
		String cognomeAbitanteDaModificare=request.getParameter("cognomeInput");
		String etaAbitanteDaModificare=request.getParameter("etaInput");
		String codiceFiscaleAbitante=request.getParameter("codiceFiscaleInput");
		String mottoAbitanteDaModificare=request.getParameter("mottoInput");
		String destinazione=null;
		
		
		
		Long idAbitanteConvertito=Long.parseLong(idAbitanteDaModificare);
		
		try {
			Abitante abitanteModificato=MyServiceFactory.getAbitanteServiceInstance().getId(idAbitanteConvertito);
			//abitanteModificato.setIdAbitante(idAbitanteConvertito);
			abitanteModificato.setNome(nomeAbitanteDaModificare);
			abitanteModificato.setCognome(cognomeAbitanteDaModificare);
			abitanteModificato.setCodiceFiscale(codiceFiscaleAbitante);
			if(etaAbitanteDaModificare!=null) {
				
				Integer etaAbitantePerModifica=Integer.parseInt(etaAbitanteDaModificare);
				abitanteModificato.setEta(etaAbitantePerModifica);
				}  else {
					abitanteModificato.setEta(1);
				}
			abitanteModificato.setMottoDiVita(mottoAbitanteDaModificare);
			
			MyServiceFactory.getAbitanteServiceInstance().updateAbitante(abitanteModificato);
			
			//request.setAttribute("abitanteDettaglioAttributeName", MyServiceFactory.getAbitanteServiceInstance().updateAbitante(abitanteModificato) );
			destinazione="searchForm.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
