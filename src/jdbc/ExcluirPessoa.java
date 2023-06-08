package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args)throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o codigo");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("pessoa excuida com sucesso!");
		}else {
			System.out.println("nada foi feito");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}

}
