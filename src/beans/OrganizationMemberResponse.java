/*
 * @author ibarrosj
 */
package beans;



/**
 * Instantiates a new organization member response.
 */
public class OrganizationMemberResponse {
		
	@Override
	public String toString() {
		return "OrganizationMemberResponse [organizationMemberStatus=" + organizationMemberStatus + ", internalId="
				+ internalId + ", roleName=" + roleName + "]";
	}


	/**
	 * Gets the organization member status.
	 *
	 * @return the organization member status
	 */
	public String getOrganizationMemberStatus() {
		return organizationMemberStatus;
	}

	/**
	 * Sets the organization member status.
	 *
	 * @param organizationMemberStatus the new organization member status
	 */
	public void setOrganizationMemberStatus(String organizationMemberStatus) {
		this.organizationMemberStatus = organizationMemberStatus;
	}

	/**
	 * Gets the internal id.
	 *
	 * @return the internal id
	 */
	public String getInternalId() {
		return internalId;
	}

	/**
	 * Sets the internal id.
	 *
	 * @param internalId the new internal id
	 */
	public void setInternalId(String internalId) {
		this.internalId = internalId;
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

	/** The organization name. */
	private String organizationMemberStatus;

	/** The internal id. */
	private String internalId;
	
	/** The role name. */
	private String roleName;
	
	
}
