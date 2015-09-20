/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.google.dao;

import br.com.google.modelo.Cliente;
import br.com.google.util.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    
    private Connection con;
    
    public ClienteDAO(){
        
        
        try {
            this.con = new ConexaoFactory().getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    
    public void insert (Cliente cliente){
        try {
            String sql = "insert into cliente(nome,email,cpf)values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(1, cliente.getRg());
            stmt.setString(1, cliente.getCpf());
            stmt.setString(1, cliente.getRua());
            stmt.setString(1, cliente.getBairro());
            stmt.setString(1, cliente.getEstado());
            stmt.setString(1, cliente.getCidade());
            stmt.setString(1, cliente.getCep());
            stmt.setString(1, cliente.getEmail());
            stmt.setString(1, cliente.getSenha());
               
    }     catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
