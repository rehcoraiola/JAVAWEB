package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/principal")  //mapeando a rota
@WebServlet(name ="Principal", urlPatterns= {"/principal","/main"}, initParams = {@WebInitParam(name="servidor", value="Apache Tomcat")})
public class MainServlets extends HttpServlet{
		
	public void init( ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();  //getWrite cria um obj para enviar
		pw.append("Vai acrescentando e manda tudo junto");
		
		ServletConfig config = this.getServletConfig();
		System.out.println(config.getInitParameter("servidor"));
	}

	@Override
	public void destroy() {
		super.destroy();
	}
	
}
