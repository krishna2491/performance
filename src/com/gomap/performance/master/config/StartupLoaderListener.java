/**
 * 
 */
package com.gomap.performance.master.config;

import java.io.FileReader;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gomap.performance.master.util.StackTraceUtil;
import com.gomap.performance.organisastion.dao.CommonDao;
import com.gomap.performance.organisastion.dao.DepartmentAndDesignationDao;
import com.gomap.performance.organisastion.dto.DefaultDepartment;
import com.gomap.performance.organisastion.dto.DefaultDesignation;
import com.gomap.performance.organisastion.dto.DepartmentDto;
import com.gomap.performance.organisastion.dto.DesignationDto;
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.ElementMasterDtoList;
import com.gomap.performance.organisastion.dto.OperationMasterDto;
import com.gomap.performance.organisastion.dto.OperationMasterList;
import com.gomap.performance.organisastion.model.ElementMaster;
import com.gomap.performance.organisastion.model.EmDepartment;
import com.gomap.performance.organisastion.model.EmDesignation;
import com.gomap.performance.organisastion.model.OperationMaster;
import com.gomap.performance.organisastion.service.CommonService;
import com.gomap.performance.organisastion.service.DepartmentAndDesignationService;
import com.gomap.performance.organisastion.service.impl.CommonServiceImpl;
import com.gomap.performance.organisastion.service.impl.DepartmentAndDesignationServiceImpl;
import com.google.gson.Gson;




/**
 * @author 1056082 
 * This class used to call some service on application start-up
 */

@Component
public class StartupLoaderListener implements ApplicationListener<ContextRefreshedEvent> {
	
	private static final Logger logger = LoggerFactory.getLogger(StartupLoaderListener.class);
	private static final String ROOT_WEBAPPLICATION_CONTEXT = "Root WebApplicationContext"; 

	@Autowired
	public CommonDao cmnDao;
	@Autowired
	public CommonService cmnService;
	
	@Autowired
	private DepartmentAndDesignationService deptServc;
	@Autowired
	private DepartmentAndDesignationDao deptDao;
	
	
	/* This method will call on start-up
	 * fetch look up data from db
	 */
	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			if(event.getApplicationContext().getDisplayName().equals(ROOT_WEBAPPLICATION_CONTEXT)){
				//lookUpDataService.getAllParamConfigValus();
				List<OperationMaster> lt= cmnDao.getOperations();
				if(lt==null || lt.isEmpty())
				{
					for(OperationMasterDto oprDto:provideOperationObject())
					{
						cmnService.createOperation(oprDto);	
					}
					
				}
				List<ElementMaster> elementMasterList= cmnDao.getElements();
				if(elementMasterList==null || elementMasterList.isEmpty())
				{
					for(ElementMasterDto mst:provideElementObject())
					{
						cmnService.createElement(mst);
					}
					
				}
				
		List<EmDepartment> deptList=deptDao.checkDefaultDept();
		if(deptList==null || deptList.isEmpty())
		{
			for(DepartmentDto  deptDto:provideDeptObject())
			{
				System.out.println(deptDto.getDepartmentName());
				deptDto.setDefaultDept("Y");
				deptServc.createDepartment(deptDto);
			}
		}
		
		List<EmDesignation> designationList=deptDao.checkDefaultDesignation();
		if(designationList ==null || designationList.isEmpty())
		{
			for(DesignationDto  destDto:provideDesignationObject())
			{
				//System.out.println(deptDto.getDepartmentName());
				destDto.setDefaultDesignation("Y");
				deptServc.createDesignation(destDto);
			}
		}
				
				System.out.println("hello kk");
			}
		} catch (Exception e) {
			logger.error(StackTraceUtil.getStackTrace(e));
		}
	}
	public List<ElementMasterDto> provideElementObject()
	{
		Gson gson=new Gson();
		ElementMasterDtoList dataList=gson.fromJson(provideElementStr(), ElementMasterDtoList.class);
	return dataList.getDto();
	}
	public List<OperationMasterDto> provideOperationObject()
	{
		Gson gson=new Gson();
		OperationMasterList dataList=gson.fromJson(provideOperationStr(), OperationMasterList.class);
	return dataList.getOperation();
	}
	public List<DepartmentDto> provideDeptObject()
	{
		Gson gson=new Gson();
		DefaultDepartment dataList= gson.fromJson(provideDeptStr(),DefaultDepartment.class);
	return dataList.getDepartments();
	}
	
	public List<DesignationDto> provideDesignationObject()
	{
		Gson gson=new Gson();
		DefaultDesignation dataList= gson.fromJson(designationStr(),DefaultDesignation.class);
	return dataList.getRoles();
	}
	public String provideOperationStr() {
		String opStr="{\"operation\":[{ \"operationName\": \"VIEW\" },{\"operationName\": \"CREATE\" },{\"operationName\": \"EDIT\" },{\"operationName\": \"DELETE\" },{\"operationName\": \"PERFORM\" }]}";
		return opStr;
		
	}
	
	public String provideElementStr()
	{
		 String elementStr="{\"dto\":[\r\n" + 
         		"        {\r\n" + 
         		"            \r\n" + 
         		"            \"elementName\": \"Department\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Employee\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"          \r\n" + 
         		"            \"elementName\": \"Role\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Team\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Project\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Task\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"            \r\n" + 
         		"            \"elementName\": \"Goals\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Skills\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Feedback\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"          \r\n" + 
         		"            \"elementName\": \"Evaluate\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"          \r\n" + 
         		"            \"elementName\": \"Project Timeline Approval\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Exit Interview\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"          \r\n" + 
         		"            \"elementName\": \"Reports\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Audit Trails\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"           \r\n" + 
         		"            \"elementName\": \"Due Date Extension Request\"\r\n" + 
         		"           \r\n" + 
         		"        },\r\n" + 
         		"        {\r\n" + 
         		"            \r\n" + 
         		"            \"elementName\": \"Feedback Request\"        \r\n" + 
         		"            \r\n" + 
         		"           \r\n" + 
         		"        }\r\n" + 
         		"    ]\r\n" + 
         		"    }";
		 return elementStr;
	}
	public String provideDeptStr()
	{
		String deprStr="{\"departments\": [\r\n" + 
				"        {\r\n" + 
				"             \"departmentName\": \"Procurement\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"     \r\n" + 
				"            \"departmentName\": \"Human Resource\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"           \"departmentName\": \"Sales\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"        \"departmentName\": \"Accounting And Finance\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"      \r\n" + 
				"            \"departmentName\": \"Operations\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"         \"departmentName\": \"Business Development\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"departmentName\": \"Legal\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"      \r\n" + 
				"            \"departmentName\": \"Contracts\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"      \r\n" + 
				"            \"departmentName\": \"Engineering\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"\r\n" + 
				"            \"departmentName\": \"Marketing And Advertising\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"    \r\n" + 
				"            \"departmentName\": \"Company Administration (C-Level executives and VPs)\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				" \r\n" + 
				"            \"departmentName\": \"Research and Development\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				" \r\n" + 
				"            \"departmentName\": \"Information Technology\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"\r\n" + 
				"            \"departmentName\": \"Cyber Security\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"     \r\n" + 
				"            \"departmentName\": \"Facilities\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"         \"departmentName\": \"Professional Services\",\r\n" + 
				"              \"activateFlag\": 1\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		return deprStr;
	}
	public String designationStr()
	{
		String roleStr="{roles:[\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 1,\r\n" + 
				"            \"designationName\": \"CEO‚Chief Executive Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 2,\r\n" + 
				"            \"designationName\": \"COO‚Chief Operating Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 3,\r\n" + 
				"            \"designationName\": \"CFO‚Chief Financial Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 4,\r\n" + 
				"            \"designationName\": \"CIO‚Chief Information Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 5,\r\n" + 
				"            \"designationName\": \"CTO‚Chief Technology Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 6,\r\n" + 
				"            \"designationName\": \"CMO‚Chief Marketing Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 7,\r\n" + 
				"            \"designationName\": \"CHRO‚Chief Human Resources Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 8,\r\n" + 
				"            \"designationName\": \"CDO‚Chief Data Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 9,\r\n" + 
				"            \"designationName\": \"CPO‚Chief Product Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 10,\r\n" + 
				"            \"designationName\": \"CCO‚Chief Customer Officer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 11,\r\n" + 
				"            \"designationName\": \"Team Leader\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 12,\r\n" + 
				"            \"designationName\": \"Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 13,\r\n" + 
				"            \"designationName\": \"Assistant Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 14,\r\n" + 
				"            \"designationName\": \"Executive\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 15,\r\n" + 
				"            \"designationName\": \"Director\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 16,\r\n" + 
				"            \"designationName\": \"Sales Associate\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 17,\r\n" + 
				"            \"designationName\": \"Sales Representative\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 18,\r\n" + 
				"            \"designationName\": \"Sales Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 19,\r\n" + 
				"            \"designationName\": \"Account Executive\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 20,\r\n" + 
				"            \"designationName\": \"Account Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 21,\r\n" + 
				"            \"designationName\": \"Area Sales Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 22,\r\n" + 
				"            \"designationName\": \"Marketing Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 23,\r\n" + 
				"            \"designationName\": \"Marketing Director\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 24,\r\n" + 
				"            \"designationName\": \"Graphic Designer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 25,\r\n" + 
				"            \"designationName\": \"Product Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 26,\r\n" + 
				"            \"designationName\": \"Public Relations\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 27,\r\n" + 
				"            \"designationName\": \"Quality Control Coordinator\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 28,\r\n" + 
				"            \"designationName\": \"Business Analyst\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 29,\r\n" + 
				"            \"designationName\": \"Risk Manager\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 30,\r\n" + 
				"            \"designationName\": \"Human Resources\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 31,\r\n" + 
				"            \"designationName\": \"Computer Scientist\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 32,\r\n" + 
				"            \"designationName\": \"IT Professional\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 33,\r\n" + 
				"            \"designationName\": \"UX Designer & UI Developer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 34,\r\n" + 
				"            \"designationName\": \"SQL Developer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 35,\r\n" + 
				"            \"designationName\": \"Web Designer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"designationId\": 36,\r\n" + 
				"            \"designationName\": \"Web Developer\",\r\n" + 
				"            \"departmentId\": 0,\r\n" + 
				"            \"parentDesignationId\": 0,\r\n" + 
				"            \"designationLevelNo\": 0,\r\n" + 
				"           \r\n" + 
				"            \"activateFlag\": 1\r\n" + 
				"        }\r\n" + 
				"    ]}";
					return roleStr;
	}

}
