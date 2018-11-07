package com.ls.vo;

public class Menu {
	
	private Integer menuId;
	
	private Integer prentMenuId;
	
	private String menuName;
	
	private String prentName;
	
	private String menuUrl;

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getPrentMenuId() {
		return prentMenuId;
	}

	public void setPrentMenuId(Integer prentMenuId) {
		this.prentMenuId = prentMenuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getPrentName() {
		return prentName;
	}

	public void setPrentName(String prentName) {
		this.prentName = prentName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", prentMenuId=" + prentMenuId + ", menuName=" + menuName + ", prentName="
				+ prentName + ", menuUrl=" + menuUrl + "]";
	}

	
	
}
