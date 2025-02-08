package ch09_class.myquiz;

public class MyQuiz {
	private String answer;	//답
	private String quiz;	//문제
	private String hint1;	//힌트1
	private String hint2;	//힌트2
	private String hint3;	//초성힌트
	
	
	
	
	//기본 생성자
	public MyQuiz() {
	}
	public MyQuiz(String answer, String quiz, String hint1, String hint2, String hint3) {
		super();
		this.answer = answer;
		this.quiz = quiz;
		this.hint1 = hint1;
		this.hint2 = hint2;
		this.hint3 = hint3;
	}
	
	
	//setter,getter
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuiz() {
		return quiz;
	}
	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}
	public String getHint1() {
		return hint1;
	}
	public void setHint1(String hint1) {
		this.hint1 = hint1;
	}
	public String getHint2() {
		return hint2;
	}
	public void setHint2(String hint2) {
		this.hint2 = hint2;
	}
	public String getHint3() {
		return hint3;
	}
	public void setHint3(String hint3) {
		this.hint3 = hint3;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "MyQuiz [answer=" + answer + ", quiz=" + quiz + ", hint1=" + hint1 + ", hint2=" + hint2 + ", hint3="
				+ hint3 + "]";
	}
	

	
	
	
	
	
	
}
