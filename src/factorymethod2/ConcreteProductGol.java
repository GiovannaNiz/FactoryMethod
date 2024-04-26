package factorymethod2;
/*Implementa um carro específico: Gol.
Quando um objeto ConcreteProductGol é criado, ele automaticamente configura suas informações 
como um carro Gol produzido pela Volkswagen e do tipo hatch e então exibe essas informações.
*/
public class ConcreteProductGol extends Car{
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volks");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
