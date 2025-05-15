package Servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOEmployee.EmployeeDAO;
import PojoEmployee.EmployeePojo;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getServletPath();
		
		try {
		switch(user) {
		case "/insert":
			insertUser(request, response);
			break;
		case "/selectPartData":
			seletePartUser(request, response);
			break;
		case "/update":
			updateUser(request, response);
			break;
		case "/delete":
			deleteUser(request, response);
			break;
		default:
			seleteAllUser(request, response);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name1=request.getParameter("name");
		String age1=request.getParameter("age");
		String email1=request.getParameter("email");
		String address1=request.getParameter("address");
		
		EmployeePojo emp=new EmployeePojo(name1, age1, email1, address1);
		emp.setName(name1);
		emp.setAge(age1);
		emp.setEmail(email1);
		emp.setAddress(address1);
		
		try {
		EmployeeDAO.insert(emp);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void seleteAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<EmployeePojo> listUser=EmployeeDAO.selectAllData();
		request.setAttribute("listUser",listUser);
		RequestDispatcher dis=request.getRequestDispatcher("select-table.jsp");
		dis.forward(request, response);
	}
	
	public void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id2=request.getParameter("id");
		String name2=request.getParameter("name");
		String age2=request.getParameter("age");
		String email2=request.getParameter("email");
		String address2=request.getParameter("address");
		
		EmployeePojo emp1=new EmployeePojo(id2,name2,age2,email2,address2);
		try {
			EmployeeDAO.update(emp1);
			response.sendRedirect("seleteAllUser");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	
	public void seletePartUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		List<EmployeePojo> listUser=EmployeeDAO.selectParticularData(id);
		request.setAttribute("listUser",listUser);
		RequestDispatcher dis=request.getRequestDispatcher("update.jsp");
		dis.forward(request, response);
	}
	
	public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		try {
		EmployeeDAO.delete(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("selectAll");
        dispatcher.forward(request, response);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
