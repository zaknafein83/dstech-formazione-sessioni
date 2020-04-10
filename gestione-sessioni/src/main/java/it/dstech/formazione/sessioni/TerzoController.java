package it.dstech.formazione.sessioni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/utente/terzaServlet"})
public class TerzoController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pulsante = req.getParameter("submit");
		HttpSession session = req.getSession();
		String nome = (String) session.getAttribute("nome");
		String cognome = (String) session.getAttribute("cognome");
		if("Nome+Cognome".equals(pulsante)) {
			System.out.println(nome + " " + cognome);
		} else {
			System.out.println(cognome + " " + nome);
			
		}
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);

	}
}
