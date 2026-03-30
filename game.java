import java.util.Scanner;
import java.util.Random;
public class game {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int userScore=0,compScore=0;

        Random rand=new Random();
        String choices[]={"rock" , "paper" , "scissor"};

        
        while (true){
            System.out.println("Enter your choice from rock,paper and scissor : ");
            String user=sc.nextLine().toLowerCase();
            String computer=choices[rand.nextInt(3)];

            System.out.println("computer : "+computer);

            if(user.equals(computer)){
                System.out.println("Tiee");
            }else if((user.equals("rock") && computer.equals("paper")) ||(user.equals("paper") && computer.equals("scissor")) || (user.equals("scissor") && computer.equals("rock"))){
                System.out.println("Computer wins ");
                compScore++;
            }else if(((user.equals("scissor") && computer.equals("paper")) || (user.equals("rock") && computer.equals("scissor")) ||(user.equals("paper") && computer.equals("rock"))  )){
                System.out.println("User wins ");
                userScore++;
            }else{
                System.out.println("Invalid choicee!");
            }
            System.out.println("Score -> User "+userScore+" | computer : "+compScore);
            System.out.println("Enter you want to play again or not (yes/no) ");
            String want=sc.nextLine().toLowerCase();
            if(!want.equals("yes")){
                break;
            }
        }
        System.out.println("Overall result \nUser Score : "+userScore+"\tComputer Score : "+compScore);
        if(userScore>compScore){
            System.out.println("User wins ");
        }else if(userScore<compScore){
            System.out.println("Computer wins");
        }else{
            System.out.println("Its a tie game");
        }
        
        
       
    }
}