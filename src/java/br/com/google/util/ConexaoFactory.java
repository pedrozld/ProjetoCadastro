/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class ConexaoFactory {
        public Connection getConnection() {
     try {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
         return DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
