package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainServlets extends HttpServlet{
	private String servidor, administrador;
	
	public void init( ServletConfig config) throws ServletException{
		super.init(config);
		this.servidor=config.getInitParameter(servidor);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();  //getWrite cria um obj para enviar
		pw.write("Enviando uma unica vez");
		pw.append("Vai acrescentando e manda tudo junto");
		
		pw.append(this.servidor + this.administrador);
	}

	@Override
	public void destroy() {
		super.destroy();
	}
	
}
