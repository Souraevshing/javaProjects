/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evote.Controller;

import Evote.Dao.CandidateDao;
import Evote.Dto.CandidateDetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author RC
 */
public class ShowCandidateServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String cid=request.getParameter("id");
           RequestDispatcher rd=null;
        if(cid.equalsIgnoreCase("cid")&&cid!=null){
               try{
               ArrayList<String>list=CandidateDao.getAllCandidateID();
               JSONObject json=new JSONObject();
               StringBuffer sb=new StringBuffer();
                sb.append("<option values='candidate'>select value</option>");
               for(String c:list){
                   sb.append("<option values='"+c+"'>"+c+"</option>");
               }
               json.put("cid",sb.toString());
               out.println(json);
               }
               catch(SQLException ex){
                   out.println(ex);
               }
           }
        else if(cid!=null ){
            try{
              out.println("candidate id is "+cid);
              CandidateDetails candidate=CandidateDao.getCandidateDetails(cid);
              rd=request.getRequestDispatcher("ShowCandidate.jsp");
              request.setAttribute("candidate",candidate);
              rd.forward(request, response);
               }
            catch(NullPointerException ex){
                   out.println(ex);
                   ex.printStackTrace();
                   
               }
            catch(Exception ex){
                 rd=request.getRequestDispatcher("Error.jsp");
               request.setAttribute("exception", ex);
               rd.forward(request, response);
               }
        }
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
