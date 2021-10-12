package main;

import beans.Bean1;
import beans.Bean3;
import beans.OrganizationMemberToolsResponse;
import beans.UpdateMemberOrganizationRequest;
import util.RandomObjectFiller;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		RandomObjectFiller objectFiller = new RandomObjectFiller();
		Bean1 bean1 = objectFiller.createAndFill(Bean1.class, 3, true);
		System.out.println(bean1.toString());
		
		Bean1 bean2 = objectFiller.createAndFill(Bean1.class, 10, false);
		System.out.println("\n\n"+bean2.toString());
		
		UpdateMemberOrganizationRequest bean3 = objectFiller.createAndFill(UpdateMemberOrganizationRequest.class, 10, false);
		System.out.println("\n\n"+bean3.toString());
		
		OrganizationMemberToolsResponse bean4 = objectFiller.createAndFill(OrganizationMemberToolsResponse.class, 10, false);
		System.out.println("\n\n"+bean4.toString());
		
		OrganizationMemberToolsResponse bean5 = objectFiller.createAndFill(OrganizationMemberToolsResponse.class, 100, true);
		System.out.println("\n\n"+bean5.toString());
		
		//Bean3 bean6 = objectFiller.createAndFill(Bean3.class, 5, true);
		//System.out.println("\n\n"+bean6.toString());

		

 
	}

}
