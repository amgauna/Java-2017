@ManagedBean(name="UsuarioJDCBDAO")
(...)
public void inserir(Usuario usuario) {
	try {
		Connection conexao = getConexao();
		String value = null;
		Statement stmt = null;
		conexao.createStatement().execute("SET IDENTITY_INSERT "+"tbplan"+" ON");
		stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery("select MAX(id) + 1 from tbplan");

		while (rs.next())
			value = rs.getString(1).toString();
		System.out.println(value);

		PreparedStatement pstm = conexao.prepareStatement("Insert into tbplan (data, nome, frase, id) values (?,?,?,?)");
		//String name = new Usuario().getNome();
		//pstm.setDate(1, new java.sql.Date(usuario.getDataCadastro().getTime()));
		pstm.setString(1, "26 Jun 2017 14:28:00:00");
		pstm.setString(2, usuario.getNome());
		// pstm.setString(2, n1.getNome());
		pstm.setString(3, usuario.getFrase());
		pstm.setString(4, value);
		pstm.execute();
		conexao.createStatement().execute("SET IDENTITY_INSERT "+"tbplan"+" OFF");
		pstm.close();
		conexao.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}