package tourman.UnitTests.TestUtils;

public interface IInjector<T> {

	<E> void to(E sut);
}
