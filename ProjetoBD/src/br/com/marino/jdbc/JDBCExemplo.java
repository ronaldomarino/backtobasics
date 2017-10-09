/**
 * 
 */
package br.com.marino.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Marino
 *
 */
public class JDBCExemplo {
	public static void main(String[] args) throws SQLException{
		Connection conexao = new ConnectionFactory().getConnection();
		System.out.println("Conectado");
		
		conexao.close();
	}

}
