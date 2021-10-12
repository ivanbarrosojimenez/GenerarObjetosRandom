/*
 * @author ibarrosj
 */
package beans;

import java.util.ArrayList;
import java.util.List;


/**
 * Instantiates a new organization member tools response.
 *
 * @param organizationMember the organization member
 * @param tools the tools
 */
public class OrganizationMemberToolsResponse {
	
	/**
	 * Instantiates a new organization member tools response.
	 */
	public OrganizationMemberToolsResponse() {
	}

	@Override
	public String toString() {
		return "OrganizationMemberToolsResponse [organizationMember=" + organizationMember + ", tools=" + tools + "]";
	}

	public OrganizationMemberToolsResponse(OrganizationMemberResponse organizationMember,
			List<OrganizationMemberToolResponse> tools) {
		super();
		this.organizationMember = organizationMember;
		this.tools = tools;
	}

	/**
	 * Adds the organization member response.
	 *
	 * @param organizationMember the organization member
	 */
	public void mapOrganizationMemberResponse(OrganizationMember organizationMember) {
		OrganizationMemberResponse organizationMemberResponse = new OrganizationMemberResponse();
		organizationMemberResponse.setInternalId(organizationMember.getInternalId());
		organizationMemberResponse.setOrganizationMemberStatus(organizationMember.getOrganizationMemberStatus());
		organizationMemberResponse.setRoleName(organizationMember.getRoleName());
		this.organizationMember = organizationMemberResponse;
	}
	
	public OrganizationMemberResponse getOrganizationMember() {
		return organizationMember;
	}

	public void setOrganizationMember(OrganizationMemberResponse organizationMember) {
		this.organizationMember = organizationMember;
	}

	public List<OrganizationMemberToolResponse> getTools() {
		return tools;
	}

	public void setTools(List<OrganizationMemberToolResponse> tools) {
		this.tools = tools;
	}

	/**
	 * Map organization member tool response.
	 *
	 * @param listTools the list tools
	 */
	public void mapOrganizationMemberToolResponse(List<OrganizationMemberTool> listTools ) {
		List<OrganizationMemberToolResponse> tools = new ArrayList<>();
		for (OrganizationMemberTool tool : listTools) {
			OrganizationMemberToolResponse organizationMemberToolResponse = new OrganizationMemberToolResponse();
			organizationMemberToolResponse.setToolName(tool.getToolName());
			organizationMemberToolResponse.setToolStatus(tool.getToolStatus());
			tools.add(organizationMemberToolResponse);
		}
		this.tools = tools;
		

	}
	/** The organization member. */
	private OrganizationMemberResponse organizationMember;
	
	/** The tools. */
	private List<OrganizationMemberToolResponse> tools;

	
}
