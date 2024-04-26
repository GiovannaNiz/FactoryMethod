package factorymethod2;
/*Declara a classe CarCreator como abstrata, que fornece uma estrutura básica para criar 
 carros usando o padrão Factory Method.*/
public abstract class CarCreator {
	
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();

}
