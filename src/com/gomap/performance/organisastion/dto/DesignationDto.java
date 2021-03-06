/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author krishnakant.bairagi
 *
 */
public class DesignationDto implements Serializable {
	    private Integer designationId;
	    private String designationName;
	    private Integer departmentId;
	    private Integer parentDesignationId;
	    private Integer designationLevelNo;
	    private String defaultDesignation;
	
	    private Date designationCreatedDate;
	    private Date designationUpdatedDate;
	    private List<DesignationElementMapingDto> designationElementMappingList;
		/**
		 * @return the designationElementMappingList
		 */
		public List<DesignationElementMapingDto> getDesignationElementMappingList() {
			return designationElementMappingList;
		}
		/**
		 * @param designationElementMappingList the designationElementMappingList to set
		 */
		public void setDesignationElementMappingList(List<DesignationElementMapingDto> designationElementMappingList) {
			this.designationElementMappingList = designationElementMappingList;
		}
		/**
		 * @return the designationId
		 */
		public Integer getDesignationId() {
			return designationId;
		}
		/**
		 * @param designationId the designationId to set
		 */
		public void setDesignationId(Integer designationId) {
			this.designationId = designationId;
		}
		/**
		 * @return the designationName
		 */
		public String getDesignationName() {
			return designationName;
		}
		/**
		 * @param designationName the designationName to set
		 */
		public void setDesignationName(String designationName) {
			this.designationName = designationName;
		}
		/**
		 * @return the departmentId
		 */
		public Integer getDepartmentId() {
			return departmentId;
		}
		/**
		 * @param departmentId the departmentId to set
		 */
		public void setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
		}
		/**
		 * @return the parentDesignationId
		 */
		public Integer getParentDesignationId() {
			return parentDesignationId;
		}
		/**
		 * @param parentDesignationId the parentDesignationId to set
		 */
		public void setParentDesignationId(Integer parentDesignationId) {
			this.parentDesignationId = parentDesignationId;
		}
		/**
		 * @return the designationLevelNo
		 */
		public Integer getDesignationLevelNo() {
			return designationLevelNo;
		}
		/**
		 * @param designationLevelNo the designationLevelNo to set
		 */
		public void setDesignationLevelNo(Integer designationLevelNo) {
			this.designationLevelNo = designationLevelNo;
		}
		/**
		 * @return the designationCreatedDate
		 */
		public Date getDesignationCreatedDate() {
			return designationCreatedDate;
		}
		/**
		 * @param designationCreatedDate the designationCreatedDate to set
		 */
		public void setDesignationCreatedDate(Date designationCreatedDate) {
			this.designationCreatedDate = designationCreatedDate;
		}
		/**
		 * @return the designationUpdatedDate
		 */
		public Date getDesignationUpdatedDate() {
			return designationUpdatedDate;
		}
		/**
		 * @param designationUpdatedDate the designationUpdatedDate to set
		 */
		public void setDesignationUpdatedDate(Date designationUpdatedDate) {
			this.designationUpdatedDate = designationUpdatedDate;
		}
		/**
		 * @return the designationElementMapingDtoList
		 */
		/**
		 * @return the defaultDesignation
		 */
		public String getDefaultDesignation() {
			return defaultDesignation;
		}
		/**
		 * @param defaultDesignation the defaultDesignation to set
		 */
		public void setDefaultDesignation(String defaultDesignation) {
			this.defaultDesignation = defaultDesignation;
		}
		
	
		
		
}
