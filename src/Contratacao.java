import java.util.Date;

public class Contratacao {
    private Date data;
    private Cargo cargo;
    private Status status;
	private Funcionario funcionario;
	
    public Contratacao(Cargo cargo, Funcionario funcionario ) {
		this.data = new Date();
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.funcionario = funcionario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Contratacao [data=" + data + ", cargo=" + cargo + ", status=" + status + ", funcionario=" + funcionario
				+ "]";
	}

	
    
}