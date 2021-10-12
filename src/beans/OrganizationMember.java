package beans;



/**
 * The class OrganizationMember.
 * 
 * @author lcruzrod
 */

public class OrganizationMember {
	
	@Override
	public String toString() {
		return "OrganizationMember [organizationMemberId=" + organizationMemberId + ", organizationMemberStatus="
				+ organizationMemberStatus + ", userId=" + userId + ", internalId=" + internalId + ", roleName="
				+ roleName + ", parentId=" + parentId + "]";
	}

	public OrganizationMember() {
		super();
	}

	public String getOrganizationMemberId() {
		return organizationMemberId;
	}

	public void setOrganizationMemberId(String organizationMemberId) {
		this.organizationMemberId = organizationMemberId;
	}

	public String getOrganizationMemberStatus() {
		return organizationMemberStatus;
	}

	public void setOrganizationMemberStatus(String organizationMemberStatus) {
		this.organizationMemberStatus = organizationMemberStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInternalId() {
		return internalId;
	}

	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/** The organization member id. */
	private String organizationMemberId;
	
	/** The organization name. */
	private String organizationMemberStatus;

	/** The user id. */
	private String userId;
	
	/** The internal id. */
	private String internalId;
	
	/** The role name. */
	private String roleName;
	
	/** The parent id. */
	private String parentId;
	
}
