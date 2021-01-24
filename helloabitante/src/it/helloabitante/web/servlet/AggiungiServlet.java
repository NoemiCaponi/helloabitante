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

/**
 * Servlet implementation class AggiungiServlet
 */
@WebServlet("/AggiungiServlet")
public class AggiungiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AggiungiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String idAbitanteDaAggiungere=request.getParameter("abitanteId");
		String nomeAbitanteDaAggiungere=request.getParameter("nomeInput");
		String cognomeAbitanteDaAggiungere=request.getParameter("cognomeInput");
		String etaAbitanteDaAggiungere=request.getParameter("etaInput");
		String codiceFiscaleAbitante=request.getParameter("codiceFiscaleInput");
		String mottoAbitanteDaAggiungere=request.getParameter("mottoInput");
		String destinazione=null;
		
		
		
		//Long idAbitanteConvertito=Long.parseLong(idAbitanteDaAggiungere);
		
		try {
			//Abitante abitanteDaAggiungere=MyServiceFactory.getAbitanteServiceInstance().;
			//abitanteDaAggiungere.setIdAbitante(idAbitanteConvertito);
			
			Abitante abitanteDaAggiungere=new Abitante();
			abitanteDaAggiungere.setNome(nomeAbitanteDaAggiungere);
			abitanteDaAggiungere.setCognome(cognomeAbitanteDaAggiungere);
			abitanteDaAggiungere.setCodiceFiscale(codiceFiscaleAbitante);
			if(etaAbitanteDaAggiungere!=null) {
				
				Integer etaAbitantePerModifica=Integer.parseInt(etaAbitanteDaAggiungere);
				abitanteDaAggiungere.setEta(etaAbitantePerModifica);
				}  else {
					abitanteDaAggiungere.setEta(0);
				}
			abitanteDaAggiungere.setMottoDiVita(mottoAbitanteDaAggiungere);
			
			MyServiceFactory.getAbitanteServiceInstance().insertAbitante(abitanteDaAggiungere);
			
			destinazione="searchForm.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
