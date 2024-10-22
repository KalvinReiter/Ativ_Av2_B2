package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import fag.objetos.Quarto;
import fag.objetos.Reserva;

public class Hotel {
	
	//Descrição: Criar um sistema para um hotel, possuindo diversas funções, assim como orientado no enunciado;
	//Autor: Kalvin Reiter;
	//Data de criação: 18/10/2024;
	

	
	public static Scanner scanner = new Scanner(System.in);
	
	public static int opcao;
	
	public static int contaQuar = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <Quarto> listaDeQuartos = new ArrayList<Quarto>();
		List <Reserva> listaDeReservas = new ArrayList<Reserva>();
		

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-----------------------Bem vindo ao Issler's Hotel-----------------------"); //Apresentação do Hotel
		
		for (int opcaoCargo = 1 ; opcaoCargo > 0 ; ) { // For para se manter no Sistema
			
			System.out.println("Você deseja acessar como:\n 1- Funcionário\n 2- Hospede\n 0- Sair "); //Pergunta se o usuário é funcionario ou hospede
			opcaoCargo = scanner.nextInt();
			
			while (opcaoCargo > 2 || opcaoCargo < 0) { //While caso a opção digitada esteja errada
				
				System.out.println("Opção Inválida, tente novamente:");
				opcaoCargo = scanner.nextInt();
				
			}
			
			if (opcaoCargo == 1) { //Se o usuário é funcionario
				
				System.out.println("\nOpção selecionada foi: 1- Funcionário");
				
				for (opcao = 1 ; opcao > 0 ;) {//For para o sistema de funcionario
					
					System.out.println("Escolha qual das opções deseja:\n 1- Cadastrar novos quartos\n 2- Vizualizar histórico de reservas\n 3- Gerar relatório de ocupação\n 0- Sair do acesso como Funcionário");
					opcao = scanner.nextInt();
					opcaoErrada();
					
					if (opcao == 1) { //Cadastrar um quarto novo
						
						System.out.println("\nOpção selecionada foi: 1- Cadastrar novos quartos.");
						System.out.println("Digite as seguintes informações: ");
						
						System.out.println("Número do novo quarto:");
						int numQuar = scanner.nextInt();
						
						while(numQuar < 0) { //Caso o numero do quarto seja negativo
							
							System.out.println("O número do quarto deve ser positivo");
							numQuar = scanner.nextInt();
							
						}
						
						System.out.println("Tipo do novo quarto (Solteiro; Casal; Suíte):");
						String tipoQuar = scanner.next();
						
						while (!tipoQuar.equalsIgnoreCase("Solteiro") && !tipoQuar.equalsIgnoreCase("Casal") && !tipoQuar.equalsIgnoreCase("Suite") && !tipoQuar.equalsIgnoreCase("Suíte")) {//Caso o tipo seja digitado errado
							
							System.out.println("O tipo do quarto novo é inválido, tente novamento:");
							tipoQuar = scanner.next();
							
						}
						
						System.out.println("Preço diario do novo quarto:");
						Double precoDiario = scanner.nextDouble();
						
						while (precoDiario < 0) {//Caso o preço seja negativo
							
							System.out.println("O preço digitado precisa ser um valor positivo");
							precoDiario = scanner.nextDouble();
							
						}
						
						String dispQuar = "Disponível\n";
						
						Quarto quarto = new Quarto(numQuar, tipoQuar, precoDiario, dispQuar);
						listaDeQuartos.add(quarto);
						
						System.out.println("\n"+quarto);
						
					} else if (opcao == 2) { //Ver histórico de reserva
						
						System.out.println("\nOpção selecionada foi: 2- Vizualizar histórico de reservas.");
						
						if( listaDeReservas.isEmpty()) {
							
							System.out.println("Nenhuma reserva foi encontrada.\n");
							
						} else {
							
							System.out.println("Reservas cadastradas:");
							int cont = 1;
							
							for (Reserva reservaPercorreFor : listaDeReservas) {
								
								System.out.println("\n" +cont + "- " +reservaPercorreFor);
								cont++;
								
							}
							
						}
						
					} else if (opcao == 3) { //Fazer relatório de ocupação
						
						System.out.println("\nOpção selecionada foi: 3- Gerar relatório de ocupação.");
						
						if (contaQuar<=0) {
							
							System.out.println("Não há nenhum quarto ocupado.");
							
						} else {
							
							System.out.println("Existem " +contaQuar+" quartos ocupados.");
							int cont = 1;
							
							for (Reserva reservaPercorreFor : listaDeReservas) {
								
								System.out.println("\n" +cont + "- " +reservaPercorreFor);
								cont++;
							
							}
							
						}
					}
					
				} //Saiu como funcionario
				
				System.out.println("Opção selecionada foi: 0- Sair do acesso como Funcionário.");
				
			} else if (opcaoCargo == 2) { //Se o usuário é hospede
				
				System.out.println("\nOpção selecionada foi: 2- Hospede");
				
				for (opcao = 1 ; opcao > 0 ;) {//For para o sistema de hospede
				
					System.out.println("Escolha qual das opções deseja:\n 1- Cadastrar nova reserva\n 2- Realizar Check-In\n 3- Realizar Check-Out\n 0- Sair do acesso como Hospede");
					opcao = scanner.nextInt();
					opcaoErrada();
					
					if (opcao == 1) { //Cadastrar nova reserva
						
						System.out.println("\nOpção selecionada foi: 1- Cadastrar nova reserva.");
						System.out.println("Digite as seguintes informações:");
						
						System.out.println("Qual é o primeiro nome do hospede?");
						String nomeHospede = scanner.next();
						
						System.out.println("Qual é a data de check-in?(DD/MM/AAAA)");
						String checkIn = scanner.next();
						
						String data = "\\d{2}/\\d{2}/\\d{4}";
						
						while(!checkIn.matches(data)) {
							
							System.out.println("Data incorreta, o formato certo é DD/MM/AAAA, tente novamente:");
							checkIn = scanner.next();
							
						}
						
						System.out.println("Qual é a data de check-out?(DD/MM/AAAA)");
						String checkOut = scanner.next();
						
						while(!checkOut.matches(data)) {
							
							System.out.println("Data incorreta, o formato certo é DD/MM/AAAA, tente novamente:");
							checkOut = scanner.next();
							
						}
						
						System.out.println("Quantos quartos serão reservados?");
						int numReservados = scanner.nextInt();
						
						while(numReservados<0) {
							
							System.out.println("Número incorreto, a quantidade de quartos deve ser positiva, tente novamente:");
							numReservados = scanner.nextInt();
							
						}
						
						System.out.println("Qual é o tipo do quarto que deseja reservar? (Solteiro, Casal, Suíte)");
						String tipoReservado = scanner.next();
						
						while (!tipoReservado.equalsIgnoreCase("Solteiro") && !tipoReservado.equalsIgnoreCase("Casal") && !tipoReservado.equalsIgnoreCase("Suite") && !tipoReservado.equalsIgnoreCase("Suíte")) {//Caso o tipo seja digitado errado
							
							System.out.println("O tipo do quarto novo é inválido, tente novamento:");
							tipoReservado = scanner.next();
							
						}
						
						Reserva reserva = new Reserva(nomeHospede, checkIn, checkOut,numReservados, tipoReservado);
						listaDeReservas.add(reserva);
						
						System.out.println(reserva);
						
					} else if (opcao == 2) { //Fazer check-in
						
						System.out.println("\nOpção selecionada foi: 2- Realizar Check-In.");
						System.out.println("Digite o primeiro nome da reserva que deseja fazer check-in:");
						String nomeHospede = scanner.next();
						
						Reserva reserva = Check(nomeHospede, listaDeReservas);
						
						if (reserva!=null) {
							
							System.out.println("Seja bem vindo, aproveite a estadia");
							contaQuar = contaQuar + reserva.getNumReservados();
							
						} else {
							
							System.out.println("Reserva não encontrada!");
							
						}
						
					} else if (opcao == 3) { //Fazer check-out
						
						System.out.println("\nOpção selecionada foi: 3- Realizar Check-Out.");
						System.out.println("Digite o primeiro nome da reserva que deseja fazer check-out:");
						String nomeHospede = scanner.next();
						
						Reserva reserva = Check(nomeHospede, listaDeReservas);
						
						if (reserva!=null) {
							
							System.out.println("Pagamento sendo processado...\nCheck-out feito com sucesso, volta sempre!");
							contaQuar = contaQuar - reserva.getNumReservados();
							listaDeReservas.remove(reserva);
							
						} else {
							
							System.out.println("Reserva não encontrada!");
							
						}
						
					}
					
				} //Saiu como hospede
				
				System.out.println("Opção selecionada foi: 0- Sair do acesso como Hospede.");
				
			}
			
		} //Saiu do sistema
		
		System.out.println("Opção selecionada foi: 3- Sair");
		System.out.println("--------------------------Obrigado por usar!-----------------------------");
		System.out.println("------------------A Issler's agradece a preferência!---------------------");
		System.out.println("-------------------------------------------------------------------------");
		
	}
	
	public static void opcaoErrada() {
		
		while(opcao > 3 || opcao < 0) {
			
			System.out.println("A opção escolhida é inválida, tente novamente:");
			opcao = scanner.nextInt();
			
		}
		
	}
	
	private static Reserva Check (String nomeHospede, List<Reserva> listaDeReservas) {
		
		for (Reserva reserva : listaDeReservas) {
			
			if (reserva.getNomeHospede().equalsIgnoreCase(nomeHospede)) {
				
				return reserva;
				
			}
			
		}
		
		return null;
		
	}


}
