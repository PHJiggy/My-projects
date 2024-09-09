//ALBEOS
import java.util.Scanner;
import java.util.Random;

public class tictactoe{

   static void COMPUTER(char computer, char blank[]){
 Random rand = new Random();
        int number;
        
        do {
            number = rand.nextInt(9);
        } while (blank[number] != ' ');

        blank[number] = computer;
    }

static void TABLE(char blank[]){
        System.out.print("===============\n");
        System.out.print(" " + blank[0] + "  | "  + blank[1] + "  | "  + blank[2] + "  |\n" );
        System.out.print("===============\n");
        System.out.print(" " + blank[3] + "  | "  + blank[4] + "  | "  + blank[5] + "  |\n" );
        System.out.print("===============\n");
        System.out.print(" " + blank[6] + "  | "  + blank[7] + "  | "  + blank[8] + "  |\n" );
        System.out.print("===============\n");
    }

static Boolean isComputer(char blank[], char computer)
{
    if(blank[0] == computer && blank[1] == computer && blank[2] == computer|| blank[3] == computer && blank[4] == computer && blank[5] == computer || blank[6] == computer && blank[7] == computer && blank[8] == computer || blank[0] == computer && blank[3] == computer && blank[6] == computer || blank[1] == computer && blank[4] == computer && blank[7] == computer || blank[2] == computer && blank[5] == computer && blank[8] == computer || blank[0] == computer && blank[4] == computer && blank[8] == computer|| blank[2] == computer && blank[4] == computer && blank[6] == computer){
        return true;
    }else{
        return false;
    }
}

static Boolean isPlayer(char blank[], char user){
        if(blank[0] == user && blank[1] == user && blank[2] == user|| blank[3] == user && blank[4] == user && blank[5] == user || blank[6] == user && blank[7] == user && blank[8] == user || blank[0] == user && blank[3] == user && blank[6] == user || blank[1] == user && blank[4] == user && blank[7] == user || blank[2] == user && blank[5] == user && blank[8] == user || blank[0] == user && blank[4] == user && blank[8] == user|| blank[2] == user && blank[4] == user && blank[6] == user){
                return true;
               }else{
                return false;
               }
    }

public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        //Variables
        char[] blank = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char user = 'X';
        int number;
        char computer = 'O';
        Boolean playing = true;

        //functions
        while(playing){
        if(blank[0] != ' '&& blank[1] != ' '&& blank[2] != ' '&& blank[3] != ' '&& blank[4] != ' '&&blank[5] != ' '&& blank[6] != ' '&& blank[7] != ' '&&blank[8] != ' ' ){
        System.out.print("\033[H\033[2J");
        TABLE(blank);
        System.out.print("DRAW!");
        playing = false;
        }else
        if(blank[0] == ' '|| blank[1] == ' '|| blank[2] == ' '|| blank[3] == ' '|| blank[4] == ' '|| blank[5] == ' '|| blank[6] == ' '|| blank[7] == ' '||blank[8] == ' '){
        System.out.print("\033[H\033[2J"); 
        TABLE(blank);
        System.out.print("Put a numnber (1-9): ");
        number = scan.nextInt();
        while(blank[number-1] != ' ' || blank[number-1] == 'O' || blank[number-1] == 'X')
        {
        System.out.print("Already input");
        System.out.print("\nPut a numnber (1-9): ");
        number = scan.nextInt();
        }

        blank[number-1] = user;
        COMPUTER(computer,blank);

        if(isPlayer(blank,user))
        {
            
            System.out.print("\033[H\033[2J");
            TABLE(blank);
            System.out.print("\n===============");
            System.out.print("\nYOU WIN!");
            System.out.print("\n===============\n");
            System.out.print("===============\n");
            playing = false;
        }else if(isComputer(blank, computer)){
            System.out.print("\033[H\033[2J");
            TABLE(blank);
            System.out.print("\n===============");
            System.out.print("COMPUTER WIN");
            System.out.print("\n===============\n");
            System.out.print("===============\n");
            playing = false;
        }
        }
        
    
    }
        
}
}
