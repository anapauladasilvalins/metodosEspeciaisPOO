package aula04.caneta04;

public class ModeloCaneta04 {

	public String modelo;
	private float ponta;
	private String cor;
	boolean tampada;
	
	public ModeloCaneta04(String m, String c, float p) { // este é o método construtor, recebe o nome da classe e não recebe void
		
		this.modelo = m; // posso utilizar o get e set se preferir: this.getmModelo(m);
		this.cor = c;
		this.ponta = p;
		this.tampar();
		/*
		this.tampar();
		this.modelo = "Bic Cristal";
		this.cor = "Azul";
		this.ponta = 5.0f;
		this.tampar();
		*/
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.modelo); 
		System.out.println("Ponta: " + this.ponta); 
		System.out.println("Cor " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
