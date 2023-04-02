import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dataInicio, Date dataTermino) {

		this.nome = nome;
		this.dt_Inicio = dataInicio;
		this.dt_Termino = dataTermino;
	}

	public boolean adicionarContratacao(Contratacao c) {
		if (!this.listaContratacao.contains(c)) {
			this.listaContratacao.add(c);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removerContratacao(Contratacao c) {
		if (this.listaContratacao.contains(c)) {
			this.listaContratacao.remove(c);
			return true;
		}else {
			return false;
		}
	}
	
	public void ListarContratacao() {
		if (this.listaContratacao.isEmpty()) {
			System.out.println("Sem contratações");
		}else {
			System.out.println("***Contratações***");
			System.out.println("Projeto: " + this.getNome());
			System.out.println("Funcionarios: \n" );
			for(Contratacao c: this.listaContratacao) {
				
				System.out.println(c.getFuncionario().getNome() + "[Status: "+c.getStatus()+"]");
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dataInicio) {
		this.dt_Inicio = dataInicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}

	public void setDt_Termino(Date dataTermino) {
		this.dt_Termino = dataTermino;
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino
				+ ", listaContratacao=" + listaContratacao + "]";
	}
	
	
	
	

}