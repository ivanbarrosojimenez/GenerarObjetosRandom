/*
 * @author ibarrosj
 */
package util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * The Class RandomObjectFiller.
 */
public class RandomObjectFiller {

	/** The random. */
	private Random random = new Random();

	/** The is string random. */
	private boolean isValueRandom = true;

	/** The size of list. */
	private int sizeOfList = 0;

	/**
	 * Creates the and fill.
	 *
	 * @param <T>           the generic type
	 * @param clazz         the clazz
	 * @param sizeOfList    the size of list
	 * @param isValueRandom the is string random
	 * @return the t
	 * @throws Exception the exception
	 */
	public <T> T createAndFill(Class<T> clazz, int sizeOfList, boolean isValueRandom) throws Exception {
		this.isValueRandom = isValueRandom;
		this.sizeOfList = sizeOfList;
		T instance = clazz.getDeclaredConstructor().newInstance();
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			Object value = getRandomValueForField(field);
			field.set(instance, value);
			field.setAccessible(false);
		}
		return instance;
	}


	/**
	 * Gets the random value for field.
	 *
	 * @param field the field
	 * @return the random value for field
	 * @throws Exception the exception
	 */
	private Object getRandomValueForField(Field field) throws Exception {
		Class<?> type = field.getType();
		Object result = getGenericType(type, field.getName());
		if (result != null) {
			return result;
		}
		// Collections
		if (type.equals(List.class)) {
			ParameterizedType listType = (ParameterizedType) field.getGenericType();
			Class<?> listType0 = (Class<?>) listType.getActualTypeArguments()[0];
			return getListGeneric(listType0, sizeOfList);
		} else if (type.equals(Set.class)) {
			ParameterizedType listType = (ParameterizedType) field.getGenericType();
			Class<?> listType0 = (Class<?>) listType.getActualTypeArguments()[0];
			return getSetGeneric(listType0, sizeOfList);
		} else if (type.equals(Map.class)) {
			ParameterizedType mapType = (ParameterizedType) field.getGenericType();
			Class<?> mapType0 = (Class<?>) mapType.getActualTypeArguments()[0];
			Class<?> mapType1 = (Class<?>) mapType.getActualTypeArguments()[1];
			return getMapGeneric(mapType0, mapType1);
		}
		return createAndFill(type, sizeOfList, isValueRandom);
	}

	private Object getGenericType(Class<?> type, String name) {
		if (type.isEnum()) {
			return getEnumValue(type);
		} else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			return getIntegerValue();
		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
			return getLongValue();
		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
			return getDoubleValue();
		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
			return getFloatValue();
		} else if (type.equals(String.class)) {
			return getStringValue(name);
		} else if (type.equals(BigInteger.class)) {
			return getBigIntegerValue();
		} else if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
			return getBooleanValue();
		}
		return null;
	}


	/**
	 * Gets the map generic.
	 *
	 * @param k the k
	 * @param v the v
	 * @return the map generic
	 * @throws Exception the exception
	 */
	private Object getMapGeneric(Class<?> k, Class<?> v) throws Exception {
		Map<Object, Object> result = new HashMap<>();
		for (int i = 0; i < sizeOfList; i++) {
			result.put(getRandomValueForType(k), getRandomValueForType(v));
		}
		return result;
	}

	/**
	 * Gets the random value for type.
	 *
	 * @param type the type
	 * @return the random value for type
	 * @throws Exception the exception
	 */
	private Object getRandomValueForType(Class<?> type) throws Exception {

		if (type.isEnum()) {
			return getEnumValue(type);
		} else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			return getIntegerValue();
		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
			return getLongValue();
		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
			return getDoubleValue();
		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
			return getFloatValue();
		} else if (type.equals(String.class)) {
			return getStringValue("stringValue");
		} else if (type.equals(BigInteger.class)) {
			return getBigIntegerValue();
		} else if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
			return getBooleanValue();
		}
		return createAndFill(type, sizeOfList, isValueRandom);
	}

	/**
	 * Gets the list generic.
	 * 
	 * @param <T>
	 *
	 * @param <T>        the generic type
	 * @param type       the type
	 * @param sizeOfList the size of list
	 * @return the list generic
	 * @throws Exception the exception
	 */
	private List<Object> getListGeneric(Class<?> type, int sizeOfList) {
		List<Object> result = new ArrayList<>();
		for (int i = 0; i < sizeOfList; i++) {
			result.add(getGenericType(type, ""));
		}
		return result;
	}

	private Set<Object> getSetGeneric(Class<?> type, int sizeOfList) throws Exception {
		Set<Object> result = new HashSet<>();
		for (int i = 0; i < sizeOfList; i++) {
			result.add(getRandomValueForType(type));
		}
		return result;
	}

	/**
	 * Gets the enum value.
	 *
	 * @param type the type
	 * @return the enum value
	 */
	Object getEnumValue(Class<?> type) {
		Object[] enumValues = type.getEnumConstants();
		return enumValues[random.nextInt(enumValues.length)];
	}

	/**
	 * Gets the integer value.
	 *
	 * @return the integer value
	 */
	Object getIntegerValue() {
		return random.nextInt();
	}

	/**
	 * Gets the long value.
	 *
	 * @return the long value
	 */
	Object getLongValue() {
		return random.nextLong();
	}

	/**
	 * Gets the double value.
	 *
	 * @return the double value
	 */
	Object getDoubleValue() {
		return random.nextDouble();
	}

	/**
	 * Gets the float value.
	 *
	 * @return the float value
	 */
	Object getFloatValue() {
		return random.nextFloat();
	}

	/**
	 * Gets the string value.
	 *
	 * @param name the name
	 * @return the string value
	 */
	Object getStringValue(String name) {
		return isValueRandom ? UUID.randomUUID().toString() : name;
	}

	/**
	 * Gets the big integer value.
	 *
	 * @return the big integer value
	 */
	Object getBigIntegerValue() {
		return BigInteger.valueOf(random.nextInt());
	}

	/**
	 * Gets the boolean value.
	 *
	 * @return the boolean value
	 */
	Object getBooleanValue() {
		return random.nextBoolean();
	}

}