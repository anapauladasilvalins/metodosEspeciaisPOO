package aula04.caneta04;

public class Caneta04 {
	public static void main(String[] args) {
		
		ModeloCaneta04 c1 = new ModeloCaneta04("Nic ", "Amarela ", 0.4f );
		c1.status();
		ModeloCaneta04 c2 = new ModeloCaneta04("Compactor ", "Preta ", 0.7f);
		System.out.println("========================================================");
		c2.status();
	
	}
	

}


