package entities;

public enum Perfil {
	PRESIDENTE(1),
	VICE_PRESIDENTE(2),
	DIRETOR(3),
	GERENTE(4),
	COORDENADOR(5),
	SUPERVISOR(6),
	ADMINISTRADOR(7),
	USUARIOFINAL(8),
	ESTAGIARIO(9),
	TRAINEE(10);
	
	public int decisao;
	
	Perfil(int decisao){
		this.decisao = decisao;
	}
	
}
