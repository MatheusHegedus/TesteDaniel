package entities;

public class Permissoes {
	
	public static void permissoes(Usuario user) {

		if (user.getPerfil().equals(Perfil.ADMINISTRADOR)) {
			System.out.println(user.getNome() + " tem perfil de administrador");
			
		} else if (user.getPerfil().equals(Perfil.DIRETOR)) {
			System.out.println(user.getNome() + " tem perfil de Diretor");
			
		} else if (user.getPerfil().equals(Perfil.GERENTE)) {
			System.out.println(user.getNome() + " tem perfil de Gerente");
			
		} else if (user.getPerfil().equals(Perfil.USUARIOFINAL)) {
			System.out.println(user.getNome() + " tem perfil de Usuário final");
		}
	}

}
