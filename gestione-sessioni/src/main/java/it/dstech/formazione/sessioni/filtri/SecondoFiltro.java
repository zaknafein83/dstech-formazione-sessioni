package it.dstech.formazione.sessioni.filtri;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "anotherFilter", urlPatterns = "/utente/*")
public class SecondoFiltro implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Siamo nel Secondo Filtro");
		// if utente non loggato{
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.sendRedirect("/error.jsp");
//	}
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
	}

}
