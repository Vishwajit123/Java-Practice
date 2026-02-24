import java.util.Scanner;

class Vote
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int bjp = 0, ncp = 0, mns = 0, ss = 0, nota = 0;

        System.out.println("Enter number of population:");
        int pop = sc.nextInt();

        for(int i = 1; i <= pop; i++)
        {
            System.out.println("Welcome to change the world");
            System.out.println("Enter your response (BJP, NCP, MNS, SS, NOTA)");

            String resp = sc.next().toUpperCase();

            switch(resp)
            {
                case "BJP":
                    System.out.println("You have voted for BJP");
                    bjp++;
                    break;

                case "NCP":
                    System.out.println("You have voted for NCP");
                    ncp++;
                    break;

                case "MNS":
                    System.out.println("You have voted for MNS");
                    mns++;
                    break;

                case "SS":
                    System.out.println("You have voted for SS");
                    ss++;
                    break;

                case "NOTA":
                    System.out.println("You have voted for NOTA");
                    nota++;
                    break;

                default:
                    System.out.println("INVALID RESPONSE");
            }
        }

        System.out.println("BJP votes = " + bjp);
        System.out.println("NCP votes = " + ncp);
        System.out.println("MNS votes = " + mns);
        System.out.println("SS votes = " + ss);
        System.out.println("NOTA votes = " + nota);

        if(bjp > ncp && bjp > mns && bjp > ss && bjp > nota)
        {
            System.out.println("BJP HAS WON THE ELECTION BY " + bjp + " votes");
        }
        else if(ncp > bjp && ncp > mns && ncp > ss && ncp > nota)
        {
            System.out.println("NCP HAS WON THE ELECTION BY " + ncp + " votes");
        }
        else if(mns > bjp && mns > ncp && mns > ss && mns > nota)
        {
            System.out.println("MNS HAS WON THE ELECTION BY " + mns + " votes");
        }
        else if(ss > bjp && ss > ncp && ss > mns && ss > nota)
        {
            System.out.println("SS HAS WON THE ELECTION BY " + ss + " votes");
        }
        else if(nota > bjp && nota > ncp && nota > mns && nota > ss)
        {
            System.out.println("NOTA HAS WON THE ELECTION BY " + nota + " votes");
        }
        else
        {
            System.out.println("NONE OF THEM WON");
        }

        sc.close();
    }
}