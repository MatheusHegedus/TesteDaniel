package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class criaUsuario {
	ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

	@SuppressWarnings("resource")
	public static void criando() {

		Scanner sc = new Scanner(System.in);
		criaUsuario as = new criaUsuario();

		System.out.println("Voce deseja criar um usuário S/N");
		String novouser = sc.nextLine();
		novouser = novouser.toUpperCase();
		if (novouser.equals("S")) {
			System.out.println("digite o nome do usuário. ");
			String nome = sc.nextLine();
			System.out.println("digite o sobrenome do usuário. ");
			String sobrenome = sc.nextLine();
			System.out.println("digite o CPF do usuário. ");
			String cpf = sc.nextLine();
			System.out.println("digite o perfil do usuário.( ADMINISTRADOR / DIRETOR / GERENTE / USUARIOFINAL/ COORDENADOR / ESTAGIARIO/"
					+ " PRESIDENTE/ SUPERVISOR/ VICE_PRESIDENTE/ TRAINEE)  ");
			String perfil = sc.next();

			if (perfil.equalsIgnoreCase("ADMINISTRADOR")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.ADMINISTRADOR);
			} else if (perfil.equalsIgnoreCase("DIRETOR")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.DIRETOR);
			} else if (perfil.equalsIgnoreCase("GERENTE")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.GERENTE);
			} else if (perfil.equalsIgnoreCase("COORDENADOR")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.COORDENADOR);
			} else if (perfil.equalsIgnoreCase("ESTAGIARIO")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.ESTAGIARIO);
			} else if (perfil.equalsIgnoreCase("PRESIDENTE")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.PRESIDENTE);
			} else if (perfil.equalsIgnoreCase("SUPERVISOR")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.SUPERVISOR);
			} else if (perfil.equalsIgnoreCase("VICE_PRESIDENTE")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.VICE_PRESIDENTE);
			} else if (perfil.equalsIgnoreCase("TRAINEE")) {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.TRAINEE);
			} else {
				as.novoUsuario(nome, sobrenome, cpf, Perfil.USUARIOFINAL);
			}
			
		} else if (novouser.equalsIgnoreCase("N")) {
			System.out.println("programa encerrado!");
		}
	}

	public void novoUsuario(String nome, String sobrenome, String cpf, Perfil perfil) {

		Usuario user = new Usuario();
		user.setNome(nome);
		user.setSobrenome(sobrenome);
		user.setCpf(cpf);
		user.setPerfil(perfil);
		listaDeUsuarios.add(user);
		Permissoes.permissoes(user);
		for (Usuario i : listaDeUsuarios) {
			// if (i.getPerfil() == Perfil.DIRETOR) {
			System.out.println("Nome Completo: " + i.getNome() + " " + i.getSobrenome() + " CPF:" + i.getCpf()
					+ " Perfil:" + i.getPerfil());
			// }
		}

	}
}
