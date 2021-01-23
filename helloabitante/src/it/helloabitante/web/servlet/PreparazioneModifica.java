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


@WebServlet("/PreparazioneModifica")
public class PreparazioneModifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PreparazioneModifica() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idAbitanteDaModificare=request.getParameter("idAbitante");
		String nomeAbitanteDaModificare=request.getParameter("nomeInput");
		String cognomeAbitanteDaModificare=request.getParameter("cognomeInput");
		String etaAbitanteDaModificare=request.getParameter("etaInput");
		String codiceFiscaleAbitante=request.getParameter("codiceFiscaleInput");
		String mottoAbitanteDaModificare=request.getParameter("mottoInput");
		String destinazione=null;
		
		Long idAbitanteConvertito=(Long.parseLong(idAbitanteDaModificare));
		Integer etaAbitantePerModifica=Integer.parseInt(etaAbitanteDaModificare);
		
		try {
			Abitante abitanteModificato=MyServiceFactory.getAbitanteServiceInstance().getId(idAbitanteConvertito);
			abitanteModificato.setNome(nomeAbitanteDaModificare);
			abitanteModificato.setCognome(cognomeAbitanteDaModificare);
			abitanteModificato.setCodiceFiscale(codiceFiscaleAbitante);
			abitanteModificato.setEta(etaAbitantePerModifica);
			abitanteModificato.setMottoDiVita(mottoAbitanteDaModificare);
			
			request.setAttribute("abitanteModificato", MyServiceFactory.getAbitanteServiceInstance().updateAbitante(abitanteModificato) );
			destinazione="results.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
