package factorymethod2;
/*Define VolksConcreteCreator como subclasse de CarCreator.
Quando um objeto VolksConcreteCreator for usado para construir um carro, 
ele chamará o método factoryMethod(), que vai criar e retornar
um objeto do tipo ConcreteProductGol.
*/
public class VolksConcreteCreator extends CarCreator{
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}
}
