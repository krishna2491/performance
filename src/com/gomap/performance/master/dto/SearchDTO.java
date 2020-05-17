/**
 * 
 */
package com.gomap.performance.master.dto;

/**
 * @author 883526
 *
 */
public class SearchDTO {
	String filterType;
	String searchTerm;
	String currentPage;
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	public String getSearchTerm() {
		return searchTerm;
	}
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
}
