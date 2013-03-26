package test.gonzalo.tourman.UnitTests.TestUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

import static org.junit.Assert.*;

public class Injector<T> implements IInjector<T> {

	private T value;
	private Type type;

	public Injector(T value, Type type) {
		this.value = value;
		this.type = type;
	}

	public <E> void to(E target)
	{
		boolean found = false;
		Field[] fields = null;
		try{
			fields  = target.getClass().getDeclaredFields();
			for(Field field:fields)
			{
				if(field.getType() == type)
				{
					field.setAccessible(true);
					field.set(target, value);
					found = true;
				}	
			}
			if(!found) 
			{
				fail(getErrorMessage(target));
			}
		}catch (Exception e)
		{
			fail(getErrorMessage(target));
		}
	}

	private <E> String getErrorMessage(E target) {
		return "Unable to inject: not found type " + type.toString() + " in class " + target.toString();
	}
	
}
