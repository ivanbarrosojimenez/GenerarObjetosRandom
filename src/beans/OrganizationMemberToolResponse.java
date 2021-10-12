/*
 * @author ibarrosj
 */
package beans;


/**
 * Instantiates a new organization member tool response.
 */
public class OrganizationMemberToolResponse {
	
	/**
	 * Instantiates a new organization member tool response.
	 */
	public OrganizationMemberToolResponse() {
	}

	@Override
	public String toString() {
		return "OrganizationMemberToolResponse [toolName=" + toolName + ", toolStatus=" + toolStatus + "]";
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

	/** The tool name. */
	private String toolName;
	
	/** The tool status. */
	private String toolStatus;
	
}
