package com.app.pojo;

public class QuestionBody {
	
	
	private int questionId;
	private String question;
	private String answer;
	private int userId;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "QuestionBody [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	

}
