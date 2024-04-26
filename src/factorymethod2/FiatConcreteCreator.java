package factorymethod2;
/*Define FiatConcreteCreator como subclasse de CarCreator.
Quando um objeto FiatConcreteCreator for usado para construir um carro, 
ele chamará o método factoryMethod(), que vai criar e retornar
um objeto do tipo ConcreteProductPalio.
*/
public class FiatConcreteCreator extends CarCreator{
	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
