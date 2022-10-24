package p02.aufg1;

public class Testklasse {
	public static void main(String[] args) {
		testCreate(new MyGenericClass<Object>());
		testCreate(new MyGenericClass<A>());
		//testCreate(new MyGenericClass<B>()); //Kompilierfehler
		testCreate(new MyGenericClass<C>());
		//testCreate(new MyGenericClass<D>()); //Kompilierfehler
		//testCreate(new MyGenericClass<E>()); //Kompilierfehler
		//testCreate(new MyGenericClass<F>()); //Kompilierfehler
	}
	
	public static void testCreate(MyGenericClass<? super C> o) {
		
	}
}
