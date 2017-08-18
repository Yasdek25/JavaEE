package controladores;

import entidades.Employees;
import entidades.EmployeesAudit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.EmployeesAuditFacadeLocal;
import modelo.EmployeesFacadeLocal;

/**
 *
 * @author jonat
 */
public class Prueba2 extends HttpServlet {
    @EJB
    private EmployeesFacadeLocal employeesFacade;
    @EJB
    private EmployeesAuditFacadeLocal employeesAuditFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Employees</title>");
            out.println("<link href=\'css/bootstrap.min.css\' rel=\'stylesheet\'>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Employees " + request.getContextPath() + "</h1>");
            
            out.println("<table class='table table-bordered'>");
            List<Employees> prueba = employeesFacade.findAll();
            for (int i = 0; i < prueba.size(); i++) {
                out.println("<tr>");
                out.println("<td>");
                out.println(prueba.get(i).getEmployeeNumber());
                out.println("<td>");                
                
                out.println("<td>");
                out.println(prueba.get(i).getLastName());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getFirstName());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getExtension());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getEmail());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getOfficeCode());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getReportsTo());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getJobTitle());
                out.println("<td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("<script src='js/jquery.min.js'></script>");
            out.println("<script src='js/bootstrap.min.js'></script>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
