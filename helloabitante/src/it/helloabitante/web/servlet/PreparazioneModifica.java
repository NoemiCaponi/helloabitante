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
		Long idAbitanteDaModificare= Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		String destinazione=null;
		
		try {
			request.setAttribute("abitanteAttributeModifica", MyServiceFactory.getAbitanteServiceInstance().getId(idAbitanteDaModificare));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		destinazione="inserisciModifica.jsp";
		
		RequestDispatcher rd=request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
