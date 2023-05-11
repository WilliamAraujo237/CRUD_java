package br.com.comida.dao;

import java.sql.Connection;
import java.sql.Date;
import com.mysql.jdbc.PreparedStatement;
import br.com.comidas.comidas;
import br.com.comidas.factory.ConnectionFactory;

public class comidaDAO {
/*
 * CRUD
 * c: CREAT
 * r: READ
 * u: UPDATE
 * d: DELET
 * */
	
	public void SAVE(comidas Conection) {
		String sql = "INSERT INTO COMIDA (NOME,VALOR,CRIADOR,DATA) VALUE (?,?,?,?)";
		
		Connection comm = null;
		PreparedStatement pstm = null;
		
		try {
			//Cria uma conexão com o banco de dados
			comm = ConnectionFactory.CreateConnectionToMYSQL();
			
			//Criamos uma PreparedStatement para executar uma Query
			pstm = (PreparedStatement) comm.prepareStatement(sql);
			
			//Valores esperados pela Query
			pstm.setString(1, Conection.getNome());
			pstm.setDouble(2, Conection.getValor());
			pstm.setString(3, Conection.getCriador());
			pstm.setDate(4, new Date(Conection.getData().getTime()));
			
			//Executar a Query
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Fechar conecxões
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (comm != null) {
					comm.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
