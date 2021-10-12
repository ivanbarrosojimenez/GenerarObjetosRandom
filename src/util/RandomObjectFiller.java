/*
 * @author ibarrosj
 */
package util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
	 * @param <T>   the generic type
	 * @param clazz the clazz
	 * @param sizeOfList the size of list
	 * @param isValueRandom the is string random
	 * @return the t
	 * @throws Exception the exception
	 */
	public <T> T createAndFill(Class<T> clazz, int sizeOfList, boolean isValueRandom) throws Exception {
		this.isValueRandom = isValueRandom;
		this.sizeOfList = sizeOfList;
		T instance = clazz.newInstance();
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			Object value = getRandomValueForField(field);
			field.set(instance, value);
		}
		return instance;
	}

	/**
	 * Gets the random value for field.
	 *
	 * @param field       the field
	 * @return the random value for field
	 * @throws Exception the exception
	 */
	private Object getRandomValueForField(Field field) throws Exception {
		Class<?> type = field.getType();

		if (type.isEnum()) {
			Object[] enumValues = type.getEnumConstants();
			return enumValues[random.nextInt(enumValues.length)];
		} else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			return random.nextInt();
		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
			return random.nextLong();
		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
			return random.nextDouble();
		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
			return random.nextFloat();
		} else if (type.equals(String.class)) {
			return isValueRandom ? UUID.randomUUID().toString() : field.getName();
		} else if (type.equals(BigInteger.class)) {
			return BigInteger.valueOf(random.nextInt());
		} else if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
			return random.nextBoolean();
		} else if (type.equals(List.class)) {
			ParameterizedType listType = (ParameterizedType) field.getGenericType();
			Class<?> listType0 = (Class<?>) listType.getActualTypeArguments()[0];
			return getListGeneric(listType0, sizeOfList);
		} else if (type.equals(Map.class)) {
			ParameterizedType mapType = (ParameterizedType) field.getGenericType();
			Class<?> mapType0 = (Class<?>) mapType.getActualTypeArguments()[0];
			Class<?> mapType1 = (Class<?>) mapType.getActualTypeArguments()[1];
			System.out.println("           map[" + mapType0 + "][" + mapType1 + "]");
			//return getMapGeneric(mapType0, mapType1, sizeOfList);
		}
		return createAndFill(type, sizeOfList, isValueRandom);
	}

	/**
	 * Gets the list generic.
	 *
	 * @param <T> the generic type
	 * @param type the type
	 * @param sizeOfList the size of list
	 * @return the list generic
	 * @throws Exception the exception
	 */
	private <T> Object getListGeneric(Class<?> type, int sizeOfList) throws Exception {

		if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			List<Integer> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? random.nextInt() : i);
			}
			return result;
		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
			List<Long> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? random.nextLong() : i);
			}
			return result;
		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
			List<Double> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? random.nextDouble() : i);			}
			return result;
		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
			List<Float> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? random.nextFloat() : i);			}
			return result;
		} else if (type.equals(String.class)) {
			List<String> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? UUID.randomUUID().toString() : "element_" + i);
			}
			return result;
		} else if (type.equals(BigInteger.class)) {
			List<BigInteger> result = new ArrayList<>();
			for (int i = 0; i < sizeOfList; i++) {
				result.add(isValueRandom ? BigInteger.valueOf(random.nextInt()) : BigInteger.valueOf(i));
			}
		} 
		List<T> result = new ArrayList<>();

		for (int i = 0; i < sizeOfList; i++) {
			result.add((T) (createAndFill(type, sizeOfList, isValueRandom)));
		}
		return result;
	}
	
	/**
	 * Gets the list generic.
	 *
	 * @param <T> the generic type
	 * @param type the type
	 * @param sizeOfList the size of list
	 * @return the list generic
	 * @throws Exception the exception
	 */
	@SuppressWarnings("unchecked")
	private <T> Object getMapGeneric(Class<?> typeK, Class<?> typeV, int sizeOfList) throws Exception {
//		if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
//			Map<Integer> result = new HashMap<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? random.nextInt() : i);
//			}
//			return result;
//		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
//			List<Long> result = new ArrayList<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? random.nextLong() : i);
//			}
//			return result;
//		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
//			List<Double> result = new ArrayList<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? random.nextDouble() : i);			}
//			return result;
//		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
//			List<Float> result = new ArrayList<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? random.nextFloat() : i);			}
//			return result;
//		} else if (type.equals(String.class)) {
//			List<String> result = new ArrayList<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? UUID.randomUUID().toString() : "element_" + i);
//			}
//			return result;
//		} else if (type.equals(BigInteger.class)) {
//			List<BigInteger> result = new ArrayList<>();
//			for (int i = 0; i < sizeOfList; i++) {
//				result.add(isValueRandom ? BigInteger.valueOf(random.nextInt()) : BigInteger.valueOf(i));
//			}
//		} 
		Map<T,T> result = new HashMap<>();

		for (int i = 0; i < sizeOfList; i++) {
			
			T instance = (T) typeK.newInstance();
			for (Field field : typeK.getDeclaredFields()) {
				field.setAccessible(true);
				Object value = getRandomValueForField(field);
				field.set(instance, value);
			}
			result.put((T) getRandomValueForField(typeK.getDeclaredFields()[0]), (T) getRandomValueForField(typeV.getDeclaredFields()[0]));
		}
		return result;
	}
	
	
}