package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	
	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "root1804";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println("Excessão gerada: " + e);
			return null;
		}
	}

	/**
	 * Teste de conexao.
	 */
	public void testeDeConexao() {
		try (Connection con = conectar()) {
			System.out.println("Status Conexão: [" + con + "]");
		} catch (Exception e) {
			System.out.println("Excessão gerada: " + e);
		}
	}

	/**
	 * Inserir contato.
	 *
	 * @param contato the contato
	 */
	public void inserirContato(JavaBeans contato) {
		String create = "insert into contatos (nome, phone, email) values(?,?,?)";
		try (Connection con = conectar()) {
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getTelefone());
			pst.setString(3, contato.getEmail());
			pst.executeUpdate();
		} catch (SQLException sql) {
			System.out.println("Exceção gerada [" + sql + "]");
		} catch (Exception ex) {
			System.out.println("Exceção gerada [" + ex + "]");
		}
	}

	/**
	 * Listar contatos.
	 *
	 * @return the array list
	 */
	public ArrayList<JavaBeans> listarContatos() {
		ArrayList<JavaBeans> contatos = new ArrayList<JavaBeans>();
		String read = "Select * from contatos order by nome";
		try (Connection con = conectar()) {
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String idcon = rs.getString(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				contatos.add(new JavaBeans(idcon, nome, telefone, email));
			}
			return contatos;
		} catch (SQLException sql) {
			System.out.println("Exceção gerada [" + sql + "]");
			return null;
		} catch (Exception ex) {
			System.out.println("Exceção gerada [" + ex + "]");
			return null;
		}

	}

	/**
	 * Selecionar contato.
	 *
	 * @param contato the contato
	 */
	public void selecionarContato(JavaBeans contato) {
		String read2 = "select * from contatos where idcon = ?";
		try (Connection con = conectar()) {
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, contato.getIdcon());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				contato.setIdcon(rs.getString(1));
				contato.setNome(rs.getString(2));
				contato.setTelefone(rs.getString(3));
				contato.setEmail(rs.getString(4));
			}
		} catch (SQLException sql) {
			System.out.println("Exceção gerada [" + sql + "]");
		} catch (Exception e) {
			System.out.println("Exceção gerada [" + e + "]");
		}
	}

	/**
	 * Alterar contato.
	 *
	 * @param contato the contato
	 */
	public void alterarContato(JavaBeans contato) {
		String update = "update contatos set nome=?,phone=?, email=? where idcon = ?";
		try (Connection con = conectar()) {
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getTelefone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdcon());
			pst.executeUpdate();
		} catch (SQLException sql) {
			System.out.println("Exceção gerada [" + sql + "]");
		} catch (Exception e) {
			System.out.println("Exceção gerada [" + e + "]");
		}
	}

	/**
	 * Deletar contato.
	 *
	 * @param contato the contato
	 */
	public void deletarContato(JavaBeans contato) {
		String delete = "delete from contatos where idcon = ?";
		try (Connection con = conectar()) {
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, contato.getIdcon());
			pst.executeUpdate();
		} catch (SQLException sql) {
			System.out.println("Exceção gerada: [" + sql + "]");
		} catch (Exception e) {
			System.out.println("Exceção gerada: [" + e + "]");
		}
	}

}
