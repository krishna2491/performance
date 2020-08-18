/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.aop.logging;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.gomap.performance.master.dto.EmployeeMasterDto;
import com.gomap.performance.organisastion.dto.ElementMasterDto;
import com.gomap.performance.organisastion.dto.ElementMasterDtoList;
import com.gomap.performance.organisastion.dto.OperationMasterList;
import com.gomap.performance.organisastion.model.ElementMaster;
import com.google.gson.Gson;



/**
 * @author Fujitsu
 *
 */
public class JsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JSONParser jsonParser = new JSONParser();
		 FileReader reader;
		try {
			reader = new FileReader("/element.json");
			 //Read JSON file
            Object obj = jsonParser.parse(reader);
            String kk="{\"dto\":[\r\n" + 
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

 //List<ElementMasterDto> lt=(List<ElementMasterDto>) jsonParser.parse(kk);

           Gson gg=new Gson();
           ElementMasterDtoList lt=gg.fromJson(kk, ElementMasterDtoList.class);
           OperationMasterList mt=gg.fromJson(provideOperationStr(), OperationMasterList.class);
            System.out.println("here------"+lt.getDto().get(0).getElementName()+" "+mt.getOperation().get(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	           
	}
	
	public static String provideOperationStr() {
		String opStr="{\"operation\":[{ \"operationName\": \"VIEW\" },{\"operationName\": \"CREATE\" },{\"operationName\": \"EDIT\" },{\"operationName\": \"DELETE\" },{\"operationName\": \"PERFORM\" }]}";
		return opStr;
		
	}

}
