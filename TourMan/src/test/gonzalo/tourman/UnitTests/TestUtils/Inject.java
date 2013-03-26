package test.gonzalo.tourman.UnitTests.TestUtils;

import java.lang.reflect.*;

public class Inject<T> 
{
	public Inject()
	{
		//ParameterizedType parameterizedType =  (ParameterizedType) getClass().getTypeParameters()[0];
		//Class<T> cls = (Class) parameterizedType.getActualTypeArguments()[0];
		
	}
	public IInjector<T> value(T value, Type type) 
	{
		return new Injector<T>(value, type);
	}
}
