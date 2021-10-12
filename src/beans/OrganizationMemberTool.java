/*
 * @author ibarrosj
 */
package beans;


/**
 * The Class OrganizationMemberTool.
 */
public class OrganizationMemberTool {
	
	/**
	 * Instantiates a new organization member tool.
	 */
	public OrganizationMemberTool() {
	}

	@Override
	public String toString() {
		return "OrganizationMemberTool [organizationMemberToolId=" + organizationMemberToolId + ", toolName=" + toolName
				+ ", toolId=" + toolId + ", toolStatus=" + toolStatus + "]";
	}

	/**
	 * Gets the organization member tool id.
	 *
	 * @return the organization member tool id
	 */
	public String getOrganizationMemberToolId() {
		return organizationMemberToolId;
	}

	/**
	 * Sets the organization member tool id.
	 *
	 * @param organizationMemberToolId the new organization member tool id
	 */
	public void setOrganizationMemberToolId(String organizationMemberToolId) {
		this.organizationMemberToolId = organizationMemberToolId;
	}

	/**
	 * Gets the tool name.
	 *
	 * @return the tool name
	 */
	public String getToolName() {
		return toolName;
	}

	/**
	 * Sets the tool name.
	 *
	 * @param toolName the new tool name
	 */
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	/**
	 * Gets the tool id.
	 *
	 * @return the tool id
	 */
	public String getToolId() {
		return toolId;
	}

	/**
	 * Sets the tool id.
	 *
	 * @param toolId the new tool id
	 */
	public void setToolId(String toolId) {
		this.toolId = toolId;
	}

	/**
	 * Gets the tool status.
	 *
	 * @return the tool status
	 */
	public String getToolStatus() {
		return toolStatus;
	}

	/**
	 * Sets the tool status.
	 *
	 * @param toolStatus the new tool status
	 */
	public void setToolStatus(String toolStatus) {
		this.toolStatus = toolStatus;
	}

	/** The organization member tool id. */
	private String organizationMemberToolId;

	/** The tool name. */
	private String toolName;
	
	/** The tool id. */
	private String toolId;
	
	/** The tool status. */
	private String toolStatus;
	
}
