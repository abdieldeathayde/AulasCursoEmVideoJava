package aula3ATeoria;

import java.util.Scanner;

public class Caneta {
	String modelo;
	String cor;
	private double ponta;
	protected int carga;
	protected Boolean tampada;
	
	public Caneta(String modelo, String cor, double ponta, int carga, Boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	public void escrever() {
		System.out.println("A Caneta está escrevendo!");
		
	}
	
	public void rabiscar() {
		System.out.println("A caneta está rabicando!");
	}
	
	public void pintar() {
		System.out.println("A caneta está pintando!");
	}
	
	private void tampar() {
		if (tampada == true) {
			System.out.println("Erro! A caneta já está tampada!");
		} else {
			System.out.println("A caneta está tampada!");
			tampada = true;
		} 
	}
	
	private void destampar() {
		if (tampada == false) {
			System.out.println("Erro a caneta já está destampada!");
		} else {
			System.out.println("A caneta está destampada!");
			tampada = false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caneta caneta = new Caneta("Bic", "Azul", 0.5, 90, false);
		
		System.out.println("Escolha uma opção: \n0- Sair \n1- Escrever \n2- Rabiscar \n3- Pintar \n4- Tampar \n5- Destampar");
		int opcao = sc.nextInt();
		
		
		switch(opcao) {
			case 0:
				break;
			case 1:
				caneta.escrever();
			case 2:
				caneta.rabiscar();
			case 3:
				caneta.pintar();
			case 4:
				caneta.tampar();
			case 5:
				caneta.destampar();
			default:
				System.out.println("Erro! operação inválida tente novamente!");
				System.out.println("Escolha uma opção: \n0- Sair \n1- Escrever \n2- Rabiscar \n3- Pintar \n4- Tampar \n5- Destampar");
				opcao = sc.nextInt();
				
		
		}
		System.out.println("Obrigado por utilizar esse sistema!");
		
		
	}

}
