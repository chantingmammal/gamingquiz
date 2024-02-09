import java.util.Scanner;
import java.util.ArrayList;

public class GamingQuiz {
    static String Score;
    static int UserCount = 0;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> ResultName = new ArrayList<>();
    static ArrayList<String> ResultScore = new ArrayList<>();
    static boolean RunQuiz = true;
    static String Input;

    public static void main(String[] args) {
    
        while (RunQuiz == true) {
            System.out.println("Are you a developer or a user?");
            String Role = scanner.nextLine();
            switch (Role) {
                case "Developer":
                    System.out.println("Here are the results so far:");
                    for (int i = 0; i < UserCount; i++) {
                        System.out.println("Name: " + ResultName.get(i));
                        System.out.print("Score: " + ResultScore.get(i));
                    }
                    break;
                case "User":
                    UserCount = UserCount + 1;
                    System.out.println("What's your name?");
                    String Name = scanner.nextLine();
                    int QuestionsRight = 0;
                    String Input;
                    String Question1 = "Who created Sonic the Hedgehog?";
                    String Question2 = "What is the best-selling console?";
                    String Question3 = "What year was Nintendo founded?";
                    String Question4 = "What Game did Mario first appear in?";
                    String Question5 = "What is the main protagonist of the Legend of Zelda?";
                    String Question6 = "What is Mario's favourite food?";
                    String Question7 = "What is Sonic's favourite food?";
                    String Question8 = "When was Crash Bandicoot first created?";
                    String Question9 = "What is the name of a Game that features Master Chief?";
                    String Question10 = "Who is Mario's current voice actor?";
                    String Question11 = "What punk bands appear in Sega's Crazy Taxi?";
                    String Question12 = "Who is Sonic's current voice actor";
                    String Question13 = "WWhat was the first game featuring sonic?";
                    String Question14 = "What is the best selling handheld?";
                    String Answer1 = "Yuji Naka";
                    String Answer2 = "PS2";
                    String Answer3 = "1889";
                    String Answer4 = "Donkey Kong";
                    String Answer5 = "Link";
                    String Answer6 = "Spaghetti (or Mushrooms)";
                    String Answer7 = "Chili Dogs";
                    String Answer8 = "1995";
                    String Answer9 = "Halo";
                    String Answer10 = "Kevin Afghani (he replaced Martinet)";
                    String Answer11 = "The Offspring, and Bad Religion";
                    String Answer12 = "Roger Craig Smith";
                    String Answer13 = "Rad Mobile";
                    String Answer14 = "Nintendo DS or Nintendo Switch";
                    String[] QuizQuestions = { Question1, Question2, Question3, Question4, Question5, Question6,
                            Question7,
                            Question8, Question9, Question10, Question11, Question12, Question13, Question14 };
                    String[] QuizAnswers = { Answer1, Answer2, Answer3, Answer4, Answer5, Answer6, Answer7, Answer8,
                            Answer9,
                            Answer10, Answer11, Answer12, Answer13, Answer14 };
                    int QuestionAmount = QuizAnswers.length;
                    for (int i = 0; i < QuestionAmount; i++) {
                        System.out.println(QuizQuestions[i]);
                        Input = scanner.nextLine();
                        if (Input.equals(QuizAnswers[i])) {
                            System.out.println("Correct");
                            QuestionsRight = QuestionsRight + 1;
                        } else {
                            System.out.println("Incorrect, the correct answer was: " + QuizAnswers[i]);
                        }
                    }
                                            Score = QuestionsRight + "/" + QuestionAmount;
                    System.out.println("Score: " + Score);
                    ResultName.add(Name);
                    ResultScore.add(Score);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
