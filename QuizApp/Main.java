package QuizApp;

public class Main {
  public static void main(String[] args) {
    QuestionService s = new QuestionService();
    s.playQuiz();
    s.printScore();
  }
}
