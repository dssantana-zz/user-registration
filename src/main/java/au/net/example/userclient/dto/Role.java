package au.net.example.userclient.dto;

public class Role {
	
	private String roleCode;
	private String roleLabel;
	
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleLabel() {
		return roleLabel;
	}
	public void setRoleLabel(String roleLabel) {
		this.roleLabel = roleLabel;
	}
	
	public Role() {		
	}	
	
	public Role(String roleCode, String roleLabel) {		
		this.roleCode = roleCode;
		this.roleLabel = roleLabel;
	}
	
	@Override
	public String toString() {
		return "Role [roleCode=" + roleCode + ", roleLabel=" + roleLabel + "]";
	}
}
