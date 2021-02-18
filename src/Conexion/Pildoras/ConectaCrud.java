package Conexion.Pildoras;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConectaCrud
 */
@WebServlet("/ConectaCrud")
public class ConectaCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.  
     */
    public ConectaCrud() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//CREAMOS USUARIO, CONTRASEÑA, URL PARA ACCEDER A LA BBDD, Y CREACIÓN DE VARIABLE DRIVER.
		String jdbcUrl = "jdbc:mysql://localhost:3306/gestionpedidoscrud?useSSL=false";
		String usuario = "root";
		String contra = "";
					  //"com.mysql.cj.jdbc.Driver"
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			//out: OBJ PARA IMPRIMIR EN EL NAVEGADOR
			PrintWriter out = response.getWriter();
			out.print("NOMBRE DE LA BASE DE DATOS " + jdbcUrl + "<br>");
			//CARGAMOS EL DRIVER
			Class.forName(driver);
			//CONECTAMOS
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, contra);
			//IMPRIMIMOS
			out.print("CONECTADO");
			//CERRAMOS CONEXIÓN
			miConexion.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
