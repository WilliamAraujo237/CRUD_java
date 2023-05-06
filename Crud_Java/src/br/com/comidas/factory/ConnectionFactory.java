package br.com.comidas.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//login de conexão do banco de dados.
	private static final String Username = "root";
	
	//senha de conexão do banco de dados.
	private static final String Senha = "";
	
	//Caminho banco de dados, porta, nome do banco de dados. 
	private static final String DataBase_URL = "jdbc:mysql://localhost:3306/comida";
	
	/*
	 * conexão com o banco de dados 
	 * */
	private static Connection CreateConnectionToMYSQL() throws Exception {
		//faz com que a class seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		//cria a conexão com o banco de dados
		Connection conection = DriverManager.getConnection(DataBase_URL,Username,Senha);
		return conection;
	}
	
	public static void main(String[] args) throws Exception {
		// Recuperar uma conexão do banco de dados 
		Connection con = CreateConnectionToMYSQL();
		
		//testar se a conexão é nula 
		if (con != null) {
			System.out.println("Acesso efetuado com sucesso");
			con.close();
		}
	}
}
