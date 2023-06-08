package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class AlterarNomePessoa {
	
	public static void main(String[] args)throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o codigo da pessoa: ");
		int codigo = entrada.nextInt();
		
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ? ";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("o nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.println("informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();//fechando o stmt anterior
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("pessoa alterada com sucesso!");
		}else {
			System.out.println("pessoa não encontrada");
		}
		
		
		conexao.close();
		entrada.close();
		
	}

}
