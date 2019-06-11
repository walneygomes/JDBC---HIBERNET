package AdaptadorHibernetSql;

public class AdaptadorJDBC implements Conta {

	ContaBrasilDAO conta;

	public AdaptadorJDBC() {
		this.conta = new ContaDaoJDBC();
	}

	@Override
	public void addPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		conta.addPessoa(pessoa);
	}

	@Override
	public void removePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		conta.removePessoa(pessoa);
	}

}
