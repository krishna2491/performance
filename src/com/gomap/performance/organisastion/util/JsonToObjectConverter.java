/**
 * 
 */
package com.gomap.performance.organisastion.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 1056082
 *
 */
public final class JsonToObjectConverter {
	
	public static Object convertToObject(String jsonString, String className) throws Exception{
		 ObjectMapper mapper = new ObjectMapper();
		 Object obj = mapper.readValue(jsonString, Class.forName(className));
		 return obj;
	}
	
	public static String convertToString(Object obj) throws Exception{
		 ObjectMapper mapper = new ObjectMapper();
		 return mapper.writeValueAsString(obj);
	}

}
