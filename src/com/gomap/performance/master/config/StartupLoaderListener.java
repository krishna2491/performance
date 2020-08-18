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
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.ElementMasterDtoList;
import com.gomap.performance.organisastion.dto.OperationMasterDto;
import com.gomap.performance.organisastion.dto.OperationMasterList;
import com.gomap.performance.organisastion.model.ElementMaster;
import com.gomap.performance.organisastion.model.OperationMaster;
import com.gomap.performance.organisastion.service.CommonService;
import com.gomap.performance.organisastion.service.impl.CommonServiceImpl;
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
					for(ElementMasterDto mst:providElementObject())
					{
						cmnService.createElement(mst);
					}
					
				}
				
				System.out.println("hello kk");
			}
		} catch (Exception e) {
			logger.error(StackTraceUtil.getStackTrace(e));
		}
	}
	public List<ElementMasterDto> providElementObject()
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

}
