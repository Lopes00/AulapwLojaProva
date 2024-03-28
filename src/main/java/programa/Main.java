package programa;

//import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import provaloja.Produto;


public class Main {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		Produto p1 = new Produto (12345, "carne", "seara", 50, "20/20/2020");
		
		//System.out.println("Informe o número do código de barras");
	    //p1.codBarras = input.nextBigInteger();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		Produto busca1 = em.find(Produto.class, 12345);
		
		
		System.out.println(busca1);
		
		em.close();
		emf.close();

	}

}