package factorymethod2;
/*Implementa um carro espec�fico: Palio.
Quando um objeto ConcreteProductPalio � criado, ele automaticamente configura suas 
informa��es como um carro Palio produzido pela Fiat e do tipo hatch e ent�o exibe 
essas informa��es.
*/
public class ConcreteProductPalio extends Car{
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}

}
