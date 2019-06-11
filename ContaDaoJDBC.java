package AdaptadorHibernetSql;

public class ContaDaoJDBC implements ContaBrasilDAO {

	Connection conn;

	public PessoaDaoJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");// WALNEY

		String url = "jdbc:postgresql://localhost:5432/Pessoas"; // Nome da
																	// base de
		// dados
		String user = "postgres"; // nome do usuário do MySQL
		String password = "123"; // senha do MySQL

		conn = DriverManager.getConnection(url, user, password);
	}

	@Override
	public void addPessoa(Pessoa pessoa) {
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("INSERT INTO Pessoa"// WALNEY
					+ "(id_aluno,nome,matricula, valor )" + "VALUES " + "(?,?,?,?)");
			st.setLong(1, pessoa.getId());
			st.setString(2, pessoa.getNome());// WALNEY

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

	@Override
	public void removePessoa(Pessoa pessoa) {
		PreparedStatement st = null;
		try {// WALNEY
			st = conn.prepareStatement("DELETE FROM pessoas"// WALNEY
					+ "where = (?)");
			st.setLong(1, pessoa.getId());
			// WALNEY

			st.executeQuery();

		} catch (SQLException e) {

		}

	}

}
