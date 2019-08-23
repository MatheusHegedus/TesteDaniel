package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class criaUsuario {
	public static ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	
	public static Perfil criaCodigo(int codigo) {
	    for (Perfil g : Perfil.values()) {
	        if (g.decisao == codigo) {
	        	return g;
	        }
	    }
	    return null; //ou lança uma exceção
	}
	
	public static void criando() {

		Scanner sc = new Scanner(System.in);
		criaUsuario as = new criaUsuario();

			System.out.println("digite o nome do usuário. ");
			String nome = sc.nextLine();
			System.out.println("digite o sobrenome do usuário. ");
			String sobrenome = sc.nextLine();
			System.out.println("digite o CPF do usuário. ");
			String cpf = sc.nextLine();
			System.out.println("digite o perfil do usuário.( PRESIDENTE(1),\r\n" + 
					"	VICE_PRESIDENTE(2),\r\n" + 
					"	DIRETOR(3),\r\n" + 
					"	GERENTE(4),\r\n" + 
					"	COORDENADOR(5),\r\n" + 
					"	SUPERVISOR(6),\r\n" + 
					"	ADMINISTRADOR(7),\r\n" + 
					"	USUARIOFINAL(8),\r\n" + 
					"	ESTAGIARIO(9),\r\n" + 
					"	TRAINEE(10);)  ");
			int codigo = sc.nextInt();
			Perfil perfil = criaCodigo(codigo);
			
				as.novoUsuario(nome, sobrenome, cpf, perfil);
		
		sc.close();
	}

	public void novoUsuario(String nome, String sobrenome, String cpf, Perfil perfil) {

		Usuario user = new Usuario();
		user.setNome(nome);
		user.setSobrenome(sobrenome);
		user.setCpf(cpf);
		user.setPerfil(perfil);
		listaDeUsuarios.add(user);
		Permissoes.permissoes(user);
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Deseja Cadastras novo Usuário? S/N");
		String novoUsuario = sc.nextLine();
		if(novoUsuario.equalsIgnoreCase("S")) {
			criando();
		}
		sc.close();
		
	}
}
