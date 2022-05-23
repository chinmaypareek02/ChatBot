package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.QuestionBody;
import com.app.service.ChatBotService;

@RestController
@RequestMapping("chatBot")
public class ChatBotController {
	
	@Autowired
	ChatBotService chatBotService;
	
	
	//Assumption here is that the questionId will be sent from UI by incrementing the last question id by one.
	//QuestionBody will be maitaining the question id along with question and user's answer which will be stored into database.
	@PostMapping("/questions/{questionId}")
	public String askQuestions(@RequestBody QuestionBody request, @PathVariable int questionId) {
		
		
		if (request.getAnswer() == null) {
			try {
				chatBotService.saveResponse(request);
			} catch (Exception e) {
				// logger can be implemented
				// Giving here normal exception message now
				System.out.print("Exception while saving the question's response");

			}
		}
		return chatBotService.getQuestion(questionId);
		
	}
	
}
