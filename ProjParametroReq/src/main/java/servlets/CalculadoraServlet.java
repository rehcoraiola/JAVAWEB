package servlets;

import java.io.IOException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		double resultado=0,op1,op2;
		String op;
		
		op1= Double.parseDouble(req.getParameter("operando1"));
		op2= Double.parseDouble(req.getParameter("operando2"));
		op=req.getParameter("operacoo");
		
		switch (op) {
		case "+": resultado=op1+op2;break;
		case "-": resultado=op1+op2;break;
		case "x": resultado=op1+op2;break;
		case "/": resultado=op1+op2;break;
		default:
			res.getWriter().write("Op Invalida");
			//throw new IllegalArgumentException("Unexpected value: " + op);
		}
		res.getWriter().write("Resultado "+resultado);

	}
}
