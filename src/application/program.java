package application;

import java.util.Scanner;

import entities.Usuario;
import entities.criaUsuario;

public class program {	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voce deseja criar um usuário S/N");
		String novouser = sc.nextLine();
		if (novouser.equalsIgnoreCase("S")) {
			criaUsuario.criando();
		} else {
			System.out.println("Programa Encerrado");
		}
		sc.close();
		System.out.println(criaUsuario.listaDeUsuarios.size());
		
		for (Usuario i : criaUsuario.listaDeUsuarios) {
			
			System.out.println("Nome Completo: " + i.getNome() + " " + i.getSobrenome() + " CPF:" + i.getCpf()
					+ " Perfil:" + i.getPerfil());
			
		}
	}
}
