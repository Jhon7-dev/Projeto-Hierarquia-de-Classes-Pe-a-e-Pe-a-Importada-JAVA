package application;
import java.util.Scanner;

import entities.Peca;
import entities.PecaImportada;
public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("");
		Peca pc = new Peca();
		pc.setCusto(90.0);
		pc.setLucro(100.0);
		//pc.calcularPreco(90,100);
		pc.setNome("mouse");
		pc.exibir();
		
		Peca pc1 = new Peca();
		pc1.setCusto(100.0);
		pc1.setLucro(30.0);
		pc1.setNome("Tela");
		pc1.exibir();
		
		PecaImportada pi = new PecaImportada();
		pi.setCusto(100.0);
		pi.setLucro(110.0);
		pi.setNome("Teclado");
		pi.exibir();
		
		PecaImportada pi1 = new PecaImportada();
		pi1.setCusto(120.0);
		pi1.setLucro(50.0);
		pi1.setNome("Monitor");
		pi1.exibir();
	}

}
