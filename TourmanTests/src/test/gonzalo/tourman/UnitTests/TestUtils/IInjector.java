package test.gonzalo.tourman.UnitTests.TestUtils;

public interface IInjector<T> {

	<E> void to(E sut);
}
