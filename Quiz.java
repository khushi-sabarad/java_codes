/* This is a computer project.
 * Topic: A Quizing Program using Java
 * By:Khushi Sabarad
 * Class:10 
 * Hope you like it... */
 
 import java.util.*;
class Quiz
//the class is declared and named Quiz
{//opening of class
 public static void main(String args[])
 //main static method is declared
 {//opening of main method
  Scanner sc=new Scanner(System.in);
  //to take input from the user
  int i,k=0,a,continu=1;
  
  String MemList[][]=new String[10][4];
         //A double-dimensional array is used to store the members and their details at quiz masters' paradise.
  System.out.println("@@@@Welcome to the Quizz Masters' Paradise!!!@@@");
  System.out.println("*********************************************************************************");
   // the heading of the program.
   System.out.println("Enter 1 if you are an existing member and 2 if you want to be a member.");
         int mem=sc.nextInt();
         MemList[1][0]="Khushi";//registered name
         MemList[1][1]="01/09/2002";//dob
         MemList[1][2]="k@gmail.com";//email
         MemList[1][3]="***";//password
         
        /** MemList[2][0]=" ";
         MemList[2][1]="  ";
         MemList[2][2]=" ";
         MemList[2][3]=" ";
                  
         MemList[3][0]=" ";
         MemList[3][1]=" ";
         MemList[3][2]=" ";
         MemList[3][3]=" ";   
         
         MemList[4][0]= " ";
         MemList[4][1]=" ";
         MemList[4][2]=" ";
         MemList[4][3]=" ";
         
         MemList[5][0]=" ";
         MemList[5][1]=" ";
         MemList[5][2]=" ";
         MemList[5][3]=" "; */
        //details of various members are stored
        switch(mem)
         //switch-case is used to check if the member is existing or has to register.
         {
             case 1:
             //program if the user is already registered.
             {//case 1 block opens
                 System.out.println("Please enter your registered name");
                 String name=sc.next();
                 for(i=0;i<MemList.length;i++) 
                 //loop is used to check if the entered name exists in the list of registered members.
                 {//loop block opens
                   if(name.equalsIgnoreCase(MemList[i][0]))
                    {
                     k=1; 
                     //a variable is used to keep record of the answer produced by if-else so the answer isn't printed numerous times
                     break;
                    }
                     else
                     k=2;
                    }//end of for loop block
                    if(k==1)
                    {//the result from if-else is printed
                 System.out.println("Enter your password");
                 String password=sc.next();
                 if(password.equals(MemList[i][3]))
                  System.out.println("***********WELCOME***********");
                else
                 {
                 System.out.println("Your username password combination does not matched. Please enter your password again.");
                 System.out.println("Enter your password");
                 password=sc.next();
                }
                }//if-else closed
               if(k==2)
                {//if-else opened
                    System.out.println("You are not a member. Please register."); //registration begins
                     System.out.println("Please enter your name.");
                 name=sc.next();
                MemList[0][0]=name;
                System.out.println("Please enter your date of birth.[DD/MM/YYYY]");
                String dob=sc.next();
                MemList[0][1]=dob;
                System.out.println("Enter your email id so that we can send you information about recent updates at Quiz Masters' Paradise.");
                String email=sc.next();
                MemList[0][2]=email;
                System.out.println("Enter a password.");
                String pass=sc.next();
                System.out.println("Enter your password again.");
                String password=sc.next();
                if(!password.equals(pass))
                {//inner if opened
                    System.out.println("Your password combination did not match.Please retry.");
                    System.out.println("Enter a password.");
                 pass=sc.next();
                System.out.println("Enter your password again.");
                password=sc.next();
            }//inner if closed
            if(password.equals(pass))
             {
                MemList[0][3]=password;
                System.out.println("Congratulations! You are successfully registered.");
                
             }
            }
        }//case 1 block is closed
         break;
           case 2:
           //case to start registration
            {//case 2 block opens
                System.out.println('\f');
                //escape sequence to clear the screen for rest of the program
              System.out.println("@@@@Welcome to the Registration zone at Quizz Master's Paradise!!!@@@");
           System.out.println("*********************************************************************************");
         //registration begins here          
                System.out.println("Please enter your name.");
                String name=sc.next();
                MemList[1][0]=name;
                System.out.println("Please enter your date of birth.[DD/MM/YYYY]");
                String dob=sc.next();
                MemList[1][1]=dob;
                System.out.println("Enter your email id so that we can send you information about recent updates at Quiz Masters' Paradise.");
                String email=sc.next();
                MemList[1][2]=email;
                System.out.println("Enter a password.");
                String pass=sc.next();
                System.out.println("Enter your password again.");
                String password=sc.next();
                if(!password.equals(pass))
                {
                    System.out.println("Your password combination did not match.Please retry.");
                    System.out.println("Enter a password.");
                 pass=sc.next();
                System.out.println("Enter your password again.");
                password=sc.next();
            }
            if(password.equals(pass))
            {
                MemList[1][3]=password;
                System.out.println("Congratulations! You are successfully registered.");
                System.out.println("_______________________________________________________________________________________");
              }
        }//end of case 2 block
    } //end of switch block
    while(continu!=0)
    {
       System.out.println("Enter:\n 1 to through the instructions\n 2 to start quizzing\n 3 to quit.");
                 a=sc.nextInt();
                             
                switch (a)
                //switch-case to move according to the user's choice of quizzing or quiting
                {//switch-block opens
                    case 1:
                    //case to print the rules
                    {//case 1 opens
                        System.out.println("\f");
                        System.out.println("$$$$$Quizz Masters' Paradise$$$$$ \n            INSTRUCTIONS:");
                        System.out.println("1.Select the subject you want to be quizzed from.");
                        System.out.println("2.You will be asked 5 questions from the subject.");
                        System.out.println("3.Read the question and enter the right OPTION from the 3 choices given.");
                        System.out.println("4.Each correct answer gives you 1 point.");
                        System.out.println("  There is no negative marking for incorrect answer.");
                        System.out.println("         Hope you enjoy quizzing!!\n                All the best!!");
                        System.out.println();
                        System.out.println("Do you want to start quizzing? \n If yes enter 'Y' or enter 'N'");
                        String selection=sc.next();
                        if(selection.equalsIgnoreCase("n"))
                         break;
                        else
                        System.out.println("\f");
                    }//case 1 closes and the instructions are printed
                    case 2:
                    //case if the user wants to quiz
                  {              //case 1 block opens
                        System.out.println('\f');//to clear the screen
                         System.out.println("@@@@Welcome to the Quizz Master's Paradise!!!@@@ \n Let's check your Intelligence");
                  System.out.println("*********************************************************************************");
               System.out.println("Choose a Category");
                System.out.println("1.Science \n2.Sports \n3.Geography \n4.General Knowledge\n5.Novels");
               int category=sc.nextInt();
                 //choice of subject to be quizzed from is accepted
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 
               System.out.println('\f');
              System.out.println("$$$$$$Quizz Master's Paradise!!!$$$$$$\n IT\'S TIME TO QUIZ!!\n Let's check your Intelligence");
               System.out.println("*********************************************************************************"); 
                 switch(category)
                  //switch-case for the choice of subjects
                 {//switch block opens            
             case 1:
             //science category
             {//case block opens
                 int score=0;
                 System.out.println("CATEGORY:Science");
                 System.out.println("Q.1. Who was the first man to go to space?");
              System.out.println("A.Yuri Gagarin");
              System.out.println("B.Rakesh Sharma ");
              System.out.println("C.Neil Armstrong");                         
                String b=sc.next();
                if(b.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was A.Yuri Gagarin");                
                 System.out.println();
                 
                   System.out.println("Q.2.Where in your body is patella?");
              System.out.println("A.Elbow");
              System.out.println("B.Knee");
              System.out.println("C.Head");
               String c=sc.next();
               if(c.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers                   
                   System.out.println("Your answer is INCORRECT.The correct answer was B.Knee");                   
                 System.out.println();
                 
                 System.out.println("Q.3.Which is the largest lymphatic organ in the body?");
              System.out.println("A.Spleen");
              System.out.println("B.Gall Bladder");
              System.out.println("C.Liver");
              String d=sc.next();
                if(d.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                 }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was A.Spleen");               
                 System.out.println();
                 
                 System.out.println("Q.4.How many bones are present in human body?");
                System.out.println("A.180");
               System.out.println("B.206");
               System.out.println("C.212");
                String e=sc.next();
                if(e.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was B.206");                 
                 System.out.println();
                 
                 System.out.println("Q.5.Triton is the largest satellite of which planet??");
                 System.out.println("A.Jupiter");
                 System.out.println("B.Uranus");
                System.out.println("C.Neptune");
                String f=sc.next();
                if(f.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was C.Neptune");
                System.out.println("############################################################################");                    
                  System.out.println("You got "+score+" out of 5 answers correct");
                  if(score==0)
                System.out.println("Your knowledge in the subject is poor");
                else if(score==1)
                System.out.println("Your knowledge in the subject is average");
                else if(score==2)
                System.out.println("Your knowledge in the subject is fair");
                else if(score==3)
                System.out.println("Your knowledge in the subject is good");
                else if(score==4)
                System.out.println("Your knowledge in the subject is very good");
                else
                System.out.println("Your knowledge in the subject is excellent");                              
            }//case 1 is closed
            break;
            
            case 2:
             //sports category
             {//case block opens
                 int score=0;
                 System.out.println("CATEGORY:Sports");
                 System.out.println("Q.1.How many players play in a Basketball team?");
              System.out.println("A.9");
              System.out.println("B.11");
              System.out.println("C.5");           
                String h=sc.next();
                if(h.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was C.5");                
                 System.out.println();
                 
                   System.out.println("Q.2.Football was originated in which country?");
              System.out.println("A.China");
              System.out.println("B.India");
              System.out.println("C.Japan");
                String g=sc.next();
                if(g.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else
                  System.out.println("Your answer is INCORRECT.The correct answer was A.China");                            
                System.out.println();
                 
                 System.out.println("Q.3.Three events make this sport?");
              System.out.println("A.Decathlon");
              System.out.println("B.Triathlon");
              System.out.println("C.Marathon");
                String j=sc.next();
                if(j.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was B.Triathlon");                                  
                 System.out.println();
                 
                 System.out.println("Q.4. 2010 Commonwealth games was held at?");
              System.out.println("A.India");
              System.out.println("B.London");
              System.out.println("C.Canada");
                String m=sc.next();
                if(m.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers                   
                       System.out.println("Your answer is INCORRECT.The correct answer was A.India");                                       
                 System.out.println();
                 
                 System.out.println("Q.5.What is the minimum number of points needed to win a tie-break in tennis?");
              System.out.println("A.3");
              System.out.println("B.5");
              System.out.println("C.7");
                String l=sc.next();
                if(l.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                   System.out.println("Your answer is INCORRECT.The correct answer was C.7");                   
                 System.out.println("############################################################################");
                 System.out.println("You got "+score+" out of 5 answers correct");
                 if(score==0)
                System.out.println("Your knowledge in the subject is poor");
                else if(score==1)
                System.out.println("Your knowledge in the subject is average");
                else if(score==2)
                System.out.println("Your knowledge in the subject is fair");
                else if(score==3)
                System.out.println("Your knowledge in the subject is good");
                else if(score==4)
                System.out.println("Your knowledge in the subject is very good");
                else
                System.out.println("Your knowledge in the subject is excellent");                              
            }//case 2 is closed 
             break;
            case 3:
             //geography category
             {//case block opens
                 int score=0;
                 System.out.println("CATEGORY:Geography");
                 System.out.println("Q.1.In which state is Silent Valley?");
              System.out.println("A.Kerala");
              System.out.println("B.Kashmir");
              System.out.println("C.Himachal Pradesh");           
                String g=sc.next();
                if(g.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was A.Kerala");                
                 System.out.println();
                 
                   System.out.println("Q.2.Which Indian State has the longest canal in the world?");
              System.out.println("A.West Bengal");
              System.out.println("B.Assam");
              System.out.println("C.Rajasthan");
                String h=sc.next();
                if(h.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else
                  System.out.println("Your answer is INCORRECT.The correct answer was C.Rajasthan");                            
                System.out.println();
                 
                 System.out.println("Q.3.Giza is situated on the west bank of which river?");
              System.out.println("A.Nile");
              System.out.println("B.Amazon");
              System.out.println("C.Mississippi");
                String j=sc.next();
                if(j.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was A.Nile");                                  
                 System.out.println();
                 
                 System.out.println("Q.4.The largest freshwater lake in India?");
              System.out.println("A.Dal lake");
              System.out.println("B.Wular lake");
              System.out.println("C.Chilika lake");
                String m=sc.next();
                if(m.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers                   
                       System.out.println("Your answer is INCORRECT.The correct answer was B.Wular lake");                                       
                 System.out.println();
                 
                 System.out.println("Q.5.Shillong Peak is the highest point of which state?");
              System.out.println("A.Assam");
              System.out.println("B.Meghalaya");
              System.out.println("C.Sikkim");
                String l=sc.next();
                if(l.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                   System.out.println("Your answer is INCORRECT.The correct answer was B.Sikkim");                   
                 System.out.println("############################################################################");
                 System.out.println("You got "+score+" out of 5 answers correct");
                 if(score==0)
                System.out.println("Your knowledge in the subject is poor");
                else if(score==1)
                System.out.println("Your knowledge in the subject is average");
                else if(score==2)
                System.out.println("Your knowledge in the subject is fair");
                else if(score==3)
                System.out.println("Your knowledge in the subject is good");
                else if(score==4)
                System.out.println("Your knowledge in the subject is very good");
                else
                System.out.println("Your knowledge in the subject is excellent");                              
            }//case 3 is closed 
            break;
            
            case 4:
             //general knowledge category
             {//case block opens
                 int score=0;
                 System.out.println("CATEGORY:General Knowledge");
                 System.out.println("Q.1.Who is the CEO of Tesla?");
              System.out.println("A.Tim Cook");
              System.out.println("B.Elon Musk");
              System.out.println("C.Greg Brown");           
                String g=sc.next();
                if(g.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was B.Elon Musk");                
                 System.out.println();
                 
                   System.out.println("Q.2.The AIBO robotic pets are designed by which company?");
              System.out.println("A.Apple");
              System.out.println("B.Samsung");
              System.out.println("C.Sony");
                String h=sc.next();
                if(h.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else
                  System.out.println("Your answer is INCORRECT.The correct answer was C.Sony");                            
                System.out.println();
                 
                 System.out.println("Q.3.Entomology is the science that studies...");
              System.out.println("A.Insects");
              System.out.println("B.Formation of rocks");
              System.out.println("C.Human behaviour");
                String j=sc.next();
                if(j.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was A.Insects");                                  
                 System.out.println();
                 
                 System.out.println("Q.4. Which planet has approximately the same landmass as Earth?");
              System.out.println("A.Mercury");
              System.out.println("B.Venus");
              System.out.println("C.Mars");
                String m=sc.next();
                if(m.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers                   
                       System.out.println("Your answer is INCORRECT.The correct answer was C.Mars");                                       
                 System.out.println();
                 
                 System.out.println("Q.5.When is the World Population Day observed?");
              System.out.println("A.September 16");
              System.out.println("B.July 11");
              System.out.println("C.April 7");
                String l=sc.next();
                if(l.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                   System.out.println("Your answer is INCORRECT.The correct answer was B.July 11");                   
                 System.out.println("############################################################################");
                 System.out.println("You got "+score+" out of 5 answers correct");
                 if(score==0)
                System.out.println("Your knowledge in the subject is poor");
                else if(score==1)
                System.out.println("Your knowledge in the subject is average");
                else if(score==2)
                System.out.println("Your knowledge in the subject is fair");
                else if(score==3)
                System.out.println("Your knowledge in the subject is good");
                else if(score==4)
                System.out.println("Your knowledge in the subject is very good");
                else
                System.out.println("Your knowledge in the subject is excellent");                              
            }//case 4 is closed 
            break;
            case 5:
             //novels category
             {//case block opens
                 int score=0;
                 System.out.println("CATEGORY:Novels");
                 System.out.println("Q.1.What is the moto of Hogwarts School of Witchcraft and Wizardy?");
              System.out.println("A.Swish and Flick");
              System.out.println("B.Never Tickle A Sleeping Dragon");
              System.out.println("C.Never fear a boggart");           
                String g=sc.next();
                if(g.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                       System.out.println("Your answer is INCORRECT.The correct answer was B.Never Tickle A Sleeping Dragon");                
                 System.out.println();
                 
                   System.out.println("Q.2.Katniss Everdeen was from which district?");
              System.out.println("A.District 4");
              System.out.println("B.District 8");
              System.out.println("C.District 12");
                String h=sc.next();
                if(h.equalsIgnoreCase("C"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else
                  System.out.println("Your answer is INCORRECT.The correct answer was C.District 12");                            
                System.out.println();
                 
                 System.out.println("Q.3.Who is the Author of Percy Jackson novel series?");
              System.out.println("A.Rick Riordan");
              System.out.println("B.J.K.Rowling");
              System.out.println("C.Rick Yancey");
                String j=sc.next();
                if(j.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                  System.out.println("Your answer is INCORRECT.The correct answer was A.Rick Riordan");                                  
                 System.out.println();
                 
                 System.out.println("Q.4. Which TV Show is based on the book-The Mortal Instruments?");
              System.out.println("A.Riverdale");
              System.out.println("B.Shadowhunters");
              System.out.println("C.Stranger Things");
                String m=sc.next();
                if(m.equalsIgnoreCase("B"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers                   
                       System.out.println("Your answer is INCORRECT.The correct answer was B.Shadowhunters");                                       
                 System.out.println();
                 
                 System.out.println("Q.5.Who was the Cursed Child?");
              System.out.println("A.Albus Potter");
              System.out.println("B.Scorpius Malfoy");
              System.out.println("C.Delphini");
                String l=sc.next();
                if(l.equalsIgnoreCase("A"))//the right answer
                {
                 System.out.println("Your answer is CORRECT");
                 score++;
                }
                  else//for the wrong answers
                   System.out.println("Your answer is INCORRECT.The correct answer was A.Albus Potter");                   
                 System.out.println("############################################################################");
                 System.out.println("You got "+score+" out of 5 answers correct");
                 if(score==0)
                System.out.println("Your knowledge on novels is poor");
                else if(score==1)
                System.out.println("Your knowledge on novels is average");
                else if(score==2)
                System.out.println("Your knowledge on novels is fair");
                else if(score==3)
                System.out.println("Your knowledge on novels is good");
                else if(score==4)
                System.out.println("Your knowledge on novels is very good");
                else
                System.out.println("Your knowledge on novels is excellent");                              
            }//case 5 is closed 
            break;
            default:
            System.out.println("Please enter correct category.");            
        }               //switch for printing questions ends
        System.out.println("***********Thank You for quizzing with us!***********");
        System.out.println("Do you want to start quizzing again? \n If yes enter '1' or enter '0'");
        continu=sc.nextInt();
       if(continu==1)
        {
System.out.println("\f");//to clear the screen
      }
        else if(continu==0)
       {
        System.out.println("$$$$$$$Thank you for quizzing with us$$$$$$$");
        }

    }//quizzing ends
    break;
    case 3:
    System.out.println("**********THANK YOU************");
}//end of switch case
}//while loop closes
 }//method block closes
}//end of class
//program ends
