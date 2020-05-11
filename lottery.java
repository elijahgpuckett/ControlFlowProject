import java.util.*;

public class lottery {
    public static void questions () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and Welcome. We are going to generate some Lottery numbers for you. May I have your name");
        String userName = scan.nextLine();
        String name = userName.substring(0, 1).toUpperCase() + userName.substring(1);
        System.out.println("Hello " + name + "!! Lets get those lottery numbers. Would you like to begin: yes or no? ");
        String userAnswer = scan.nextLine();

        if(userAnswer.equalsIgnoreCase("y") || (userAnswer.equalsIgnoreCase(("yes")))){
            System.out.println("Great to hear. Please answer the following questions so we can give you your lottery numbers: ");
        } else {
            System.out.println("Sorry to here that " + name + " Please return later to complete the the questions.");
            System.exit(0);
        }
        
        String continueLottery;
        String getNumbers;
        
        do{
            String redCar;
            String favoritePet;
            int petAge;
            int luckyNumber;
            int carYear;
            int randomUserNumber;
            String favoriteActor;
            
            do{
                System.out.print("Do you have a red car: yes or no ");
                redCar = scan.next();
                
                System.out.print("What is the name of your favorite pet: ");
                favoritePet = scan.next();
                
                System.out.print("How old is this pet: ");
                petAge = scan.nextInt();
                
                System.out.print("What is your lucky number: ");
                luckyNumber = scan.nextInt();
                
                System.out.print("Do you have a favorite sport star: yes or no? ");
                String userSportsStar = scan.next();
                
                
                int jerseyNumber;
                int jersey;
                if((userSportsStar.equalsIgnoreCase("y")) || (userSportsStar.equalsIgnoreCase("yes"))) {
                    System.out.println("What is their jersey number?");
                    jerseyNumber = scan.nextInt();
                    jersey = jerseyNumber;
                } 

                System.out.print("What is the two-digit model year of your car? ");
                carYear = scan.nextInt();

                System.out.print("Now choose a number between 1 - 50? ");
                randomUserNumber = scan.nextInt();

                System.out.println("What is the first name of the your favorite actor or actress? ");
                favoriteActor = scan.next();

                System.out.println("Would you like different answers to your questions: yes or no? ");
                getNumbers = scan.next();


             } while ((getNumbers.equals("yes")) || (getNumbers.equals("y")));

            Random random = new Random();
            int rand1 = random.nextInt(20);
            int rand2 = random.nextInt(20);

            int magicNumber = luckyNumber * rand2;

            while(magicNumber > 75){
                magicNumber = magicNumber - 75;
            }

            int lotteryNumber1 = 42;

            int lotteryNumber2 = rand1 + luckyNumber;
            while(lotteryNumber2 > 65){
                lotteryNumber2 = lotteryNumber2 - 65;
            }

            int lotteryNumber3 = petAge + carYear;
            while(lotteryNumber3 > 65){
                lotteryNumber3 = lotteryNumber2 - 65;
            }
            // System.out.println("Value of lottery Number 3 is:" + lotteryNumber3);

            int lotteryNumber4 = favoritePet.charAt(2);
            while(lotteryNumber4 > 65){
                lotteryNumber4 = lotteryNumber4 - 65;
            }
           
            int lotteryNumber5 = favoriteActor.charAt(0);
            while(lotteryNumber5 > 65){
                lotteryNumber5= lotteryNumber5 - 65;
            }

            // int lotteryNumber7 = jersey + rand1;

            List<Integer> lotteryNumbers = new ArrayList<Integer>();

            lotteryNumbers.add(lotteryNumber1);
            lotteryNumbers.add(lotteryNumber2);
            lotteryNumbers.add(lotteryNumber3);
            lotteryNumbers.add(lotteryNumber4);
            lotteryNumbers.add(lotteryNumber5);

            Collections.sort(lotteryNumbers);
            String formattedString = lotteryNumbers.toString()
            .replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "")  //remove the left bracket
            .trim(); 
            

            System.out.println();
            System.out.println("Your Winning Lottery Numbers are!!!");

            // System.out.println(formattedString);
            System.out.println("Lottery Numbers: " + formattedString + " Magic Number: " +  magicNumber);


            System.out.println("Would you like to play again: yes or no?");
            continueLottery = scan.next();

        }while((continueLottery.equalsIgnoreCase("y")) || (continueLottery.equalsIgnoreCase("yes")));
            System.out.println("Thank you goodbye " + name + " Hope you have great luck with these lottery numbers");
            System.exit(0);


        scan.close();

        while(true){
            
            {
              
                do {
                    
                    System.out.println("Do you have a red car: yes or no");
                    
                    
                    
                    System.out.println("Do you have a favorite sport star and what is there jersey number?");
                    
                   
                    String redCar = scan.nextLine();
                    String favoritePet = scan.nextLine();
                    int petAge = scan.nextInt();
                    int luckyNumber = scan.nextInt();
                    int jerseyNumber = scan.nextInt();
                    int carYear = scan.nextInt();
                    int randomUserNumber = scan.nextInt();
                    String favoriteActor = scan.next();
                    int maxRandomNumber = 65;
                    int maxMagicNumber = 75;

                    Random random = new Random();
                    int rand1 = random.nextInt(75);
                    int rand2 = random.nextInt(10);
                    int rand3 = random.nextInt(10);
                    

                    
                    int magicNumber1 = jerseyNumber * rand3;

                    int lotteryNumber1 = rand1 + luckyNumber;
                    
                    //find 3rd letter of favorite pet, convert letter to value
                    
                    //System.out.println("Value of this is: " + thirdLetterInPetName);
                    //int lotteryNumber4 = Character.getNumericValue(thirdLetterInPetName);
                    //System.out.println("This is the value: " + lotteryNumber4);
                    // char firstLetterOfFavoriteActor = favoritePet.charAt(0);
                    // int lotteryNumber5 = Character.getNumericValue(firstLetterOfFavoriteActor);
                    
                    // System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d Magic: %d", lotteryNumber1, lotteryNumber2, lotteryNumber3, lotteryNumber4, lotteryNumber5, magicNumber);

                    System.out.println();
                    System.out.println("Would you like to have another set of Numbers be Shown: y or n");
                    continueLottery = scan.nextLine();



                
                } while((continueLottery.equalsIgnoreCase("no")) || (continueLottery.equalsIgnoreCase("n")));
                System.out.print("Thank you and have a good day!");
                System.exit(0);
                
                
                
                scan.close();
            }

        }
        


     }
}
    
