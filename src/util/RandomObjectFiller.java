package util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

 
/**
 * The Class RandomObjectFiller.
 */
public class RandomObjectFiller {
 
    /** The random. */
    private Random random = new Random();
 
    /**
     * Creates the and fill.
     *
     * @param <T> the generic type
     * @param clazz the clazz
     * @return the t
     * @throws Exception the exception
     */
    public <T> T createAndFill(Class<T> clazz, int sizeOfList) throws Exception {
        T instance = clazz.newInstance();
        for(Field field: clazz.getDeclaredFields()) {
            field.setAccessible(true);
            Object value = getRandomValueForField(field, sizeOfList);
            field.set(instance, value);
        }
        return instance;
    }
 
    /**
     * Gets the random value for field.
     *
     * @param field the field
     * @param valueString the value string
     * @return the random value for field
     * @throws Exception the exception
     */
    private Object getRandomValueForField(Field field, int sizeOfList) throws Exception {
        Class<?> type = field.getType();

        if(type.isEnum()) {
            Object[] enumValues = type.getEnumConstants();
            return enumValues[random.nextInt(enumValues.length)];
        } else if(type.equals(Integer.TYPE) || type.equals(Integer.class)) {
            return random.nextInt();
        } else if(type.equals(Long.TYPE) || type.equals(Long.class)) {
            return random.nextLong();
        } else if(type.equals(Double.TYPE) || type.equals(Double.class)) {
            return random.nextDouble();
        } else if(type.equals(Float.TYPE) || type.equals(Float.class)) {
            return random.nextFloat();
        } else if(type.equals(String.class)) {
            return field.getName();
        } else if(type.equals(BigInteger.class)){
            return BigInteger.valueOf(random.nextInt());
        } else if(type.equals(List.class)){
        	ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
            Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];         
            return getListGeneric(stringListClass, sizeOfList);
        } 
        return createAndFill(type, sizeOfList);
    }

	/**
	 * Gets the list generic.
	 * @param <T>
	 *
	 * @param type the type
	 * @return the list generic
	 * @throws Exception the exception
	 */
	private <T> Object getListGeneric(Class<?> type, int sizeOfList) throws Exception {
				
		if(type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			List<Integer> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add(i);
			}
        	return result;
        } else if(type.equals(Long.TYPE) || type.equals(Long.class)) {
        	List<Long> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add(Long.valueOf(i));
			}
        	return result;
        } else if(type.equals(Double.TYPE) || type.equals(Double.class)) {
        	List<Double> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add(Double.valueOf(i));
			}
        	return result;
        } else if(type.equals(Float.TYPE) || type.equals(Float.class)) {
            List<Float> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add(Float.valueOf(i));
			}
        	return result;
        } else if(type.equals(String.class)) {
        	List<String> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add("element_"+i);
			}
        	return result;
        } else if(type.equals(BigInteger.class)){
        	List<BigInteger> result = new ArrayList<>();
        	for (int i = 0; i < sizeOfList; i++) {
        		result.add(BigInteger.valueOf(i));
			}
        } 
		List<T> result = new ArrayList<>();
		for (int i = 0; i < sizeOfList; i++) {
			result.add((T) Arrays.asList(createAndFill(type, sizeOfList)));
		}
		return result;
	}
}