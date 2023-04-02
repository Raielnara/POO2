import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Funcionario f1 = new Funcionario("Nara","1", TipoDeDocumento.CPF);
		Funcionario f2 = new Funcionario("Henrique","2", TipoDeDocumento.CPF);

		Contratacao c1 = new Contratacao(Cargo.ADMINISTRADOR, f1);
		Contratacao c2 = new Contratacao(Cargo.TECNICO, f2);

		Projeto p1 = new Projeto("Inovar", df.parse("29/03/2023"), df.parse("30/07/2023"));
		c1.setFuncionario(f1);
		c2.setFuncionario(f2);
		p1.adicionarContratacao(c1);
		p1.adicionarContratacao(c2);
		p1.ListarContratacao();
	}

}
