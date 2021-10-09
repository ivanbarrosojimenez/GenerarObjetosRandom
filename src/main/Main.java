package main;

import beans.Bean1;
import util.RandomObjectFiller;

public class Main {

	public static void main(String[] args) throws Exception {
		RandomObjectFiller objectFiller = new RandomObjectFiller();
		Bean1 bean1 = objectFiller.createAndFill(Bean1.class, 3);
		System.out.println(bean1.toString());
 
	}

}
