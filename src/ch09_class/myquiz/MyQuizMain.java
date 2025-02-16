package ch09_class.myquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ch09_class.quiz.MovieDB;

public class MyQuizMain {
	public static void main(String[] args) {
		// 퀴즈 설명
		// 퀴즈 출력후 맞추면 score +5
		// 틀리면 힌트1 제공       +3
		// 틀리면 힌트2 제공       +2
		// 틀리면 초성 제공        +1
		System.out.println("~~~~~~~~~~~ MJ Quiz ~~~~~~~~~~~");
		System.out.println(" - 당신은 미정이를 얼마나 잘 아나요? - ");
		System.out.println("설명 : MJ Quiz 게임은 미정이와 관련된 7개의 문제들로 이루어져 있습니다.");
		System.out.println("     문제를 바로 맞추면 5점이지만 힌트를 받고 풀면 획득 점수는 줄어듭니다...");
		System.out.println("     (힌트는 문제별로 3개씩 주어집니다.)");
		System.out.println("     출제자와 관련된 퀴즈를 풀고 선물 받자! 화이팅~!");
		System.out.println("     (출제자의 친구들 중 가장 높은 점수를 받은 단 한 사람에게 소정의 선물을 드립니다.)");
		System.out.println("     (점수 주작을 하는 사람은 제 주변에 없을 것이라고 믿습니다.)");
		
		
		MyQuizDB db1 = MyQuizDB.getInstance();
		ArrayList<MyQuiz> quizList = db1.getMyQuizList();
		Collections.shuffle(quizList);
		int score = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<quizList.size();i++) {
			System.out.println(quizList.get(i).getQuiz());
			System.out.print("답을 적어 주세요>>>");
			String input = scan.nextLine();
			if(input.equals(quizList.get(i).getAnswer())){
				System.out.println("정답~! 당신은 날 넘 잘 알아*^~^*");
				score += 5;
				continue;
			}
			System.out.println(quizList.get(i).getHint1());
			System.out.print("힌트보고 답을 적어주세용>>>");
			input = scan.nextLine();
			if(input.equals(quizList.get(i).getAnswer())){
				System.out.println("정답! 믿고 있었다구~!~!");
				score += 3;
				continue;
			}
			
			System.out.println(quizList.get(i).getHint2());
			System.out.print("헛,,힌트를 보고 무엇인지 이제는 알겠지?>>>");
			input = scan.nextLine();
			if(input.equals(quizList.get(i).getAnswer())){
				System.out.println("휴~ 정답이야~ 잠깐 헷갈렸던거지?");
				score += 2;
				continue;
			}
			System.out.println(quizList.get(i).getHint3());
			System.out.print("마지막 초성 힌트까지 받다니... 이제는 맞춰주셈>>>");
			input = scan.nextLine();
			if(input.equals(quizList.get(i).getAnswer())){
				System.out.println("그래도 답을 알았군요...네....");
				score += 1;
				continue;
			}
			System.out.println("땡!! 틀렸습니다. 저에 대해 모르시네요..누구냐 너");
			
		}
		System.out.println("\n당신의 점수는: "+score+"입니다. 결과를 저에게 알려주세요.\n!주작X!(주작 시 우정 박살)");
		
		
				
	}
	
	
}
