/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.google.controle;

import br.com.google.dao.ClienteDAO;
import br.com.google.modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Controlador extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            
            
            String operacao = request.getParameter("operacao");
            String pagina = null;
            
            
            if(operacao.equals("insert")){
                
                Cliente cliente = new Cliente();
                cliente.setNome(request.getParameter("nome"));
                cliente.setRg(request.getParameter("rg"));
                cliente.setCpf(request.getParameter("cpf"));
                cliente.setRua(request.getParameter("rua"));
                cliente.setBairro(request.getParameter("bairro"));
                cliente.setEstado(request.getParameter("estado"));
                cliente.setCidade(request.getParameter("cidade"));
                cliente.setEmail(request.getParameter("email"));
                cliente.setSenha(request.getParameter("senha"));
               
                
                ClienteDAO dao = new ClienteDAO();
                dao.insert(cliente);
                
                pagina = "index.jsp";
                
            }
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
        }
    }

    