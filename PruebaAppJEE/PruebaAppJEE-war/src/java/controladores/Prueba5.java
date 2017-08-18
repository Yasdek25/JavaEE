package controladores;

import entidades.Orderdetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.OrderdetailsFacadeLocal;

/**
 *
 * @author jonat
 */
public class Prueba5 extends HttpServlet {
    @EJB
    private OrderdetailsFacadeLocal orderdetailsFacade;
    
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
            out.println("<title>Servlet Prueba5</title>");
            out.println("<link href=\'css/bootstrap.min.css\' rel=\'stylesheet\'>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Prueba5 at " + request.getContextPath() + "</h1>");
            
            out.println("<table class='table table-bordered'>");
            //List<entidades.Orderdetails> prueba5 = orderdetailsFacade.findAll();
            List<Orderdetails> prueba5 = orderdetailsFacade.findAll();
            for (int i = 0; i < prueba5.size(); i++) {
                out.println("<tr>");
                out.println("<td>");
                out.println(prueba5.get(i));
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba5.get(i));
                out.println("<td");
                
                out.println("<td>");
                out.println(prueba5.get(i).getQuantityOrdered());
                out.println("<td");
                
                out.println("<td>");
                out.println(prueba5.get(i).getPriceEach());
                out.println("<td>");
                
                out.println("<td>");
                out.println(prueba5.get(i).getOrderLineNumber());
                out.println("<td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
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
