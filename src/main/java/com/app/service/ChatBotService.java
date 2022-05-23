package com.app.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.pojo.QuestionBody;

@Service
public class ChatBotService {
	
	
	//For maintaining the questions' answers
	Map<Integer, QuestionBody> responseMap = new LinkedHashMap<>();


	//This method is containing all the questions and these questions can be fetched from db too using repository layer.
	public String getQuestion(int id){
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(0, "What is your name?");
		map.put(1, "What is your email id");
				
		return map.get(id);
		
	}

	//Will save the data thorugh repository layer
	//chatBotRepositry.save(request)
	public boolean saveResponse(QuestionBody request) throws Exception {
		
		responseMap.put(request.getQuestionId(), request);
		return true;
		
	}
	
	
	

}
