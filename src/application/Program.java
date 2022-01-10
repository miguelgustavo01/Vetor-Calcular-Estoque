package application; //Programa para calcular um estoque, quantos itens o usuario pedir, e no final apresenta a media dos itens.

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o numero de itens a ser calculado");
		
		int n= sc.nextInt();
		Product[] vect = new Product[n];
		
		for( int i=0; i<vect.length; i++) {
			System.out.println("Digite o nome do item "+i);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o valor do item "+i);
			double price= sc.nextDouble();
			vect[i]= new Product(name, price);
		}
		
		double sum=0.0;
		for( int i=0; i<vect.length; i++){
			sum += vect[i].getPrice();
		}
		double avg= sum /vect.length;
		
		System.out.printf("Average price= %.2f%n",avg);
		
		
		sc.close();
	}

}
