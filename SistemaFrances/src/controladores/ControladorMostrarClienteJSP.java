package controladores;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import datos.Cliente;
import negocio.ClienteABM;

public class ControladorMostrarClienteJSP extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		procesarPeticion(request,response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		procesarPeticion(request,response);
	}
	
	private void procesarPeticion(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		try {
			int dni = Integer.parseInt(request.getParameter("dni"));
			ClienteABM cabm = ClienteABM.getInstancia();
			Cliente c = cabm.traerCliente(dni);
			request.setAttribute("cliente", c);
			request.getRequestDispatcher("/vistacliente.jsp").forward(request, response);
		}
		catch(Exception e) {
			response.sendError(500, "El DNI ingresado no existe en la base de datos");
		}
	}

}
