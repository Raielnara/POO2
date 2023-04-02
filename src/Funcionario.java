public class Funcionario {
    private String nome;
    private String numeroDoDocumento;
    private TipoDeDocumento tipoDeDocumento;
	
    public Funcionario(String nome, String numeroDoDocumento, TipoDeDocumento tipoDeDocumento) {
		this.nome = nome;
		this.numeroDoDocumento = numeroDoDocumento;
		this.tipoDeDocumento = tipoDeDocumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDoDocumento() {
		return numeroDoDocumento;
	}

	public void setNumeroDoDocumento(String numeroDoDocumento) {
		this.numeroDoDocumento = numeroDoDocumento;
	}

	public TipoDeDocumento getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroDoDocumento=" + numeroDoDocumento + ", tipoDeDocumento="
				+ tipoDeDocumento + "]";
	}
    
   
}