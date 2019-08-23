package entities;

public class Usuario {

	private String nome;
	private String sobrenome;
	private String cpf;
	private Perfil perfil;
	private Endere�o endereco;
	
	

	public Endere�o getEndereco() {
		return endereco;
	}

	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
