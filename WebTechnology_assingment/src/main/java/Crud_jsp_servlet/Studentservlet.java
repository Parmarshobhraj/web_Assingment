package Crud_jsp_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class Studentservlet
 */
@WebServlet("/Studentservlet")
public class Studentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			Student s = new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("Password"));
			System.out.println(s);
			StudentDao.addStudent(s);
			response.sendRedirect("slogin.jsp");
	}
		else if(action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			boolean flag = StudentDao.checkEmail(email);
			if(flag == true) {
				Student s = StudentDao.studentLogin(email, password);
				if(s == null) {
					request.setAttribute("msg", "Incorrect Password !");
					request.getRequestDispatcher("slogin.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("student", s);
					request.getRequestDispatcher("shome.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Account not registered");
				request.getRequestDispatcher("slogin.jsp").forward(request, response);

			}
		}

	}
}
