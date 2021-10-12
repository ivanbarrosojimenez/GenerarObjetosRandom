package beans;

import java.util.List;

/**
 * The class UpdateMemberRequest.
 * 
 * @author ibarrosj
 */

public class UpdateMemberOrganizationRequest {
	
	/**
	 * Instantiates a new update member organization request.
	 *
	 * @param roleName the role name
	 * @param ownerInternalId the owner internal id
	 * @param tools the tools
	 */
	public UpdateMemberOrganizationRequest(String roleName, String ownerInternalId, List<String> tools) {
		super();
		this.roleName = roleName;
		this.ownerInternalId = ownerInternalId;
		this.tools = tools;
	}
	
	/**
	 * Instantiates a new update member organization request.
	 */
	public UpdateMemberOrganizationRequest() {
		
	}

	/**
	 * Gets the role name.
	 *
	 * @return the role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 *
	 * @param roleName the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Gets the owner internal id.
	 *
	 * @return the owner internal id
	 */
	public String getOwnerInternalId() {
		return ownerInternalId;
	}

	/**
	 * Sets the owner internal id.
	 *
	 * @param ownerInternalId the new owner internal id
	 */
	public void setOwnerInternalId(String ownerInternalId) {
		this.ownerInternalId = ownerInternalId;
	}

	/**
	 * Gets the tools.
	 *
	 * @return the tools
	 */
	public List<String> getTools() {
		return tools;
	}

	/**
	 * Sets the tools.
	 *
	 * @param tools the new tools
	 */
	public void setTools(List<String> tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "UpdateMemberOrganizationRequest [roleName=" + roleName + ", ownerInternalId=" + ownerInternalId
				+ ", tools=" + tools + "]";
	}

	/** The role name. */
	private String roleName;

	/** The parent id. */
	private String ownerInternalId;
	
	/** The tools. */
	private List<String> tools;
}
