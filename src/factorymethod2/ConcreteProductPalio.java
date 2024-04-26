package factorymethod2;
/*Implementa um carro específico: Palio.
Quando um objeto ConcreteProductPalio é criado, ele automaticamente configura suas 
informações como um carro Palio produzido pela Fiat e do tipo hatch e então exibe 
essas informações.
*/
public class ConcreteProductPalio extends Car{
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}

}
