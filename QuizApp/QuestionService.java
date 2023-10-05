package QuizApp;
import java.util.Scanner;

public class QuestionService{
  Scanner sc = new Scanner(System.in);
  Question[] questions = new Question[5];
  String[] selection = new String[5];

  public QuestionService(){
    questions[0] = new Question(0, "Are you allowed to log in?", "Yes", "No", "depends", "Maybe", "depends");
    questions[1] = new Question(1, "What is the age limit of drinking in US?", "21", "13", "22", "18", "21");
    questions[2] = new Question(2, "Who is the founder of Pakistan?", "Liaquat Ali", "Iqbal", "Jinnah", "Gandhi", "Jinnah");
    questions[3] = new Question(3, "What year was Java released?", "1955", "1975", "1992", "1995", "1995");
    questions[4] = new Question(4, "Whats your is not a programming langauge?", "Java", "Python", "C++", "HTML", "HTML");
  }

  public void playQuiz(){
    int i = 0;
    for(Question q : questions){
      System.out.println("Q#" + i + " : " + q.getQuestion());
      System.out.println(q.getOpt1() + " - " + q.getOpt2() + " - " + q.getOpt3() + " - " + q.getOpt4());
      selection[i++] = sc.nextLine();
    }

    for(String s : selection){
      System.out.println(s);
    }
  }

  public void printScore(){
    int score = 0;

    for(int i = 0; i < questions.length; i++){
      Question que = questions[i];
      String actualAnswer = que.getAnswer();

      String userAnswer = selection[i];

      if(actualAnswer.equals(userAnswer)){
        score++;
      }
    }

    System.out.println("Your score: " + score);

  }
} 