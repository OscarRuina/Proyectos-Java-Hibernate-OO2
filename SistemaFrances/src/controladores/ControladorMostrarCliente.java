package controladores;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import org.hibernate.HibernateException;
import datos.Cliente;
import negocio.ClienteABM;

import javax.servlet.http.HttpServlet;

public class ControladorMostrarCliente extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		procesarPeticion(request,response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		procesarPeticion(request,response);
	}
	
	private void procesarPeticion(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			int dni = Integer.parseInt(request.getParameter("dni"));
			ClienteABM cabm = ClienteABM.getInstancia();
			Cliente c = cabm.traerCliente(dni);
			
			response.setStatus(200);
			PrintWriter salida = response.getWriter();
			salida.println("");
			salida.println("<!DOCTYPE 4.01 Transitional//EN\">");
			salida.println("<html>");
			salida.println(" <head>");
			salida.println(" <title>SistemaFrances</title>");
			salida.println(" </head>");
			salida.println(" <body>");
			salida.println(" apellido: " + c.getApellido() + "<br>");
			salida.println(" nombre: " + c.getNombre() + "<br>");
			salida.println(" DNI: " + c.getDni() + "<br>");
			salida.println(" ID: " + c.getIdCliente() + "<br>");
			salida.println("<A href=\"/SistemaFrances/cliente.html\">Volver...</A>");
			salida.println(" </body>");
			salida.println(" </html>");
		}
		catch(Exception e) {
			response.sendError(500, "El DNI ingresado no existe en la base de datos");
		}
		
	}

}
