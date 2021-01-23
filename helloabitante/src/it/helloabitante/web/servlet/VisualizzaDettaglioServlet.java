package it.helloabitante.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.helloabitante.service.MyServiceFactory;

@WebServlet("/VisualizzaDettaglioServlet")
public class VisualizzaDettaglioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public VisualizzaDettaglioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long parametroIdDellAbitanteDiCuiVoglioIlDettaglio = Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		String destinazione=null;
		
//		AbitanteService abitanteServiceInstance = MyService.... 
//		
//		Abitante result = abitanteServiceInstance.caricaSingolo(Integer.parseInt(parametroIdDellAbitanteDiCuiVoglioIlDettaglio);
//		
//		request.setAttribute("abitanteDaInviareAPaginaDettalio", result);
		
		
		//response.getWriter().append("Volevi visualizzare abitante con id: "+parametroIdDellAbitanteDiCuiVoglioIlDettaglio).append(request.getContextPath());
		
		try {
			request.setAttribute("abitanteDettaglioAttributeName", MyServiceFactory.getAbitanteServiceInstance().getId(parametroIdDellAbitanteDiCuiVoglioIlDettaglio));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		destinazione="dettaglio.jsp";
		RequestDispatcher rd= request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
