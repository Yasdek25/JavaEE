package controladores;

import entidades.Customers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.CustomersFacadeLocal;

/**
 *
 * @author jonat
 */
public class Prueba extends HttpServlet {
    @EJB
    private CustomersFacadeLocal customersFacade;   

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
            out.println("<title>Customers</title>"); 
            out.println("<link href=\'css/bootstrap.min.css\' rel=\'stylesheet\'>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<ul class='nav nav-pills'>");
            out.println("<li role=''presentation class='active'><a href='Prueba'>Employees</a></li>");
            out.println("</ul>");
            
            out.println("<h1>Customers " + request.getContextPath() + "</h1>");
            
            out.println("<table class='table table-bordered'>");
            List<entidades.Customers> prueba = customersFacade.findAll();
            for (int i = 0; i < prueba.size(); i++) {
                out.println("<tr>");
                out.println("<td>");
                out.println(prueba.get(i).getCustomerNumber());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getCustomerName());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getContactLastName());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getContactFirstName());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getPhone()); 
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getAddressLine1());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getAddressLine2());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getCity());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getState());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getPostalCode());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getCountry());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getSalesRepEmployeeNumber());
                out.println("</td>");
                
                out.println("<td>");
                out.println(prueba.get(i).getCreditLimit());
                out.println("</td>");
                out.println("<td>");
                out.println("<form action=\"editOrder.jsp\">\n" +
                        "<input type=\"hidden\" name=\"a\" value=\""+prueba.get(i).getCustomerNumber()+"\" />\n" +
                        "<input type=\"hidden\" name=\"b\" value=\""+prueba.get(i).getCustomerName()+"\" />\n" +
                        "<input type=\"hidden\" name=\"c\" value=\""+prueba.get(i).getContactLastName()+"\" />\n" +
                        "<input type=\"hidden\" name=\"d\" value=\""+prueba.get(i).getContactFirstName()+"\" />\n" +
                        "<input type=\"hidden\" name=\"e\" value=\""+prueba.get(i).getPhone()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getAddressLine1()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getAddressLine2()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getCity()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getState()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getPostalCode()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getCountry()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getSalesRepEmployeeNumber()+"\" />\n" +
                        "<input type=\"hidden\" name=\"f\" value=\""+prueba.get(i).getCreditLimit()+"\" />\n" +
                        //"<input type=\"hidden\" name=\"g\" value=\"editar\" />\n" +
                        "<input type=\"submit\" value=\"editar\" />\n" + "</form>");  
                out.println("</td>");
                
                out.println("<td>");
                out.println("<a href='#' class=\"btn btn-info\">Editar</a>");
                out.println("</td>");
                
                out.println("<td>");
                out.println("<a href='#' class=\"btn btn-danger\">Eliminar</a>");
                out.println("</td>");
                
                
                
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
