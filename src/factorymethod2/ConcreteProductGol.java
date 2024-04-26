package factorymethod2;
/*Implementa um carro espec�fico: Gol.
Quando um objeto ConcreteProductGol � criado, ele automaticamente configura suas informa��es 
como um carro Gol produzido pela Volkswagen e do tipo hatch e ent�o exibe essas informa��es.
*/
public class ConcreteProductGol extends Car{
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volks");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
