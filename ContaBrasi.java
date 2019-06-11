package AdaptadorHibernetSql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unifacisa.bd.AgendaTelefonicaFachada;
import br.edu.unifacisa.bd.Contato;
import br.edu.unifacisa.bd.OperadoraENUM;
import br.edu.unifacisa.bd.Telefone;


public class ContaBrasi implements Conta {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo_persistencia");
	EntityManager manager = factory.createEntityManager();

	
	@Override
	public void addPessoa(Pessoa pessoa) {

		manager.getTransaction().begin();
		manager.persist(pessoa);
		manager.getTransaction().commit();
	}

	@Override
	public void removePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

}
