/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author NIRVA
 */
public class testingAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialisation of the variables
       String input,input2,output="";
       int options,Race1,Race2,Race3,Race4,horsewon;
       int betplaced,betwon;
       String bet;
       String Racebet;
       int continuebet;
       int Totalbet=0;
       
       
       //Welcoming screen
       
       JOptionPane.showMessageDialog(null,"Welcome to Horse Betting 365 \nWish you good luck!!!");
       
       //option for player to enter or leave the bet    
           input = JOptionPane.showInputDialog("Do you want to play ?\n Enter 1 to play or -1 to exit!");
           options = Integer.parseInt(input);
           if (options==-1){
               JOptionPane.showMessageDialog(null,"Goodbye!!!");
               System.exit(0);
           }else{
              JOptionPane.showMessageDialog(null,"welcome to the game ");
              JOptionPane.showMessageDialog(null,"Now your turn to bet on 4 races");
           } 
           
              //now selection for the races
              input=JOptionPane.showInputDialog(null,"Enter 0 t finish betting \nEnter 1 to bet on Race 1 \nEnter 2 to bet on Race 2 \nEnter 3 to bet on Race 3 \nEnter 4 to bet on race 4");
              options=Integer.parseInt(input);
              
              
              switch(options){
                  case 0: output="Exit";break;
                  case 1: output="Race 1";break;
                  case 2: output="Race 2";break;
                  case 3: output="Race 3";break;
                  case 4: output="Race 4";break;
                  default: output ="Invalid key pressed... \nEnter again 0 - 4";
              }
                   if (options==0){
                  System.exit(0);
              } 
                   //Race 1
                      input2=JOptionPane.showInputDialog("Race 1 \n 1: Noble Salute \n 2: Sea Worrior \n 3: Lines of Power \n 4: Shamooka");
                      Race1=Integer.parseInt(input2);
                      //ramdomization for the races
                      horsewon = (int)(Math.random()*4)+1;
                      
                      //code for bet
                      bet=JOptionPane.showInputDialog("Enter the amount you want to bet");
                      betplaced = Integer.parseInt(bet);
                      
                      if(horsewon == Race1){
                          output = (output + "\nCongrats!!you win" + "\n");
                          output = (output + "\nhorsewon is: " + horsewon + "\n");
                          output = (output + "\nyou bet: " + betplaced + " on horse " + Race1  );
                          betwon = betplaced * 2;
                          Totalbet = Totalbet + betwon;
                          output = (output + "\nYou won "+ betwon);
                          output = output+"\n";
                          output = output+"\n--------------------------------------------------------------------------------------";
                      }else{
                          output+= "\n You lost first race";
                          output= output+ "\n horse won is: " + horsewon;
                          output = output+"\n you lost " + betplaced + "\n You could have won " + (betplaced * 2);
                          output = output+"\n";
                          output = output+"\n--------------------------------------------------------------------------------------";
                      }
                      Racebet=JOptionPane.showInputDialog("Do you want to continue betting on Race 2? \n if yes press 1 else press 0 to exit or press 3 to skip");
                      continuebet = Integer.parseInt(Racebet);
                      if(continuebet==0){
                          JOptionPane.showMessageDialog(null,"Total money won: " + Totalbet);
                          System.exit(0);
                      }else{
                          if(continuebet==1){
                              output = (output) + "\nRace 2";
                          
                          //Race 2 
                          input2=JOptionPane.showInputDialog("Race 2 \n 1: Le Turbo \n 2: Copa Moorgen \n 3: Gaetan Duval \n 4: Robbie Beckham");
                          
                          Race2 = Integer.parseInt(input2);
                          horsewon = (int)(Math.random()*4)+1;
                          
                          bet=JOptionPane.showInputDialog("Enter the amount you want to bet");
                          betplaced = Integer.parseInt(bet);
                          
                          if(horsewon == Race2){
                              output = (output) + "\nCongrats you won 2nd race";
                              output = (output) + "\nhorse won is: " + horsewon;
                              output = (output + "\nyou bet: " + betplaced + " on horse " + Race2  );
                              betwon = betplaced * 3;
                              Totalbet = Totalbet + betwon;
                              output = (output + "\nYou won "+ betwon + "\nTotal bet won: " + Totalbet);
                              output = output+"\n";
                              output = output+"\n--------------------------------------------------------------------------------------";
                              
                          }else{
                              output+="\n You lost second race";
                              output= output + "\n horse that won is: " + horsewon;
                              output = output+"\n you lost " + betplaced + "\n You could have won " + (betplaced * 3);
                              output = output+"\n";
                              output = output+"\n--------------------------------------------------------------------------------------";
                          }
                        }else{
                              if(continuebet==3){
                                 Racebet=JOptionPane.showInputDialog("Do you want to skip to race 3? \n if yes press 3 else press 0 to exit"); 
                                 continuebet = Integer.parseInt(Racebet);
                              }
                          }
                      }
                      
                      //Race 3
                      Racebet=JOptionPane.showInputDialog("Do you want to continue race 3? \n if yes press 1 else press 0 to exit");
                      continuebet = Integer.parseInt(Racebet);
                      if(continuebet==0){
                          System.exit(0);
                      }else{
                      if (continuebet==1){
                      output = (output) + "\nRace 3";
                      input2=JOptionPane.showInputDialog("Race 3 \n 1: Pamella Fookyune \n 2: Tania Diolle \n 3: Stanley Ramgoolam \n 4: Veroni Leclezio");
                          
                          Race3 = Integer.parseInt(input2);
                          horsewon = (int)(Math.random()*4)+1;
                          
                          bet=JOptionPane.showInputDialog("Enter the amount you want to bet");
                          betplaced = Integer.parseInt(bet);
                          
                          if(horsewon == Race3){
                              
                              output = (output) + "\nCongrats you won 3rd race";
                              output = (output) + "\nhorse won is: " + horsewon;
                              output = (output + "\nyou bet: " + betplaced + " on horse " + Race3  );
                              betwon = betplaced * 4;
                              Totalbet = Totalbet + betwon;
                              output = (output + "\nYou won "+ betwon + "\nTotal bet won: " + Totalbet);
                              output = output+"\n";
                              output = output+"\n--------------------------------------------------------------------------------------";
                              
                          }else{
                              
                              output+="\nyou lost third race";
                              output= output + "\n horse that won is: " + horsewon;
                              output = output+"\n you lost " + betplaced + "\n You could have won " + (betplaced * 4);
                              output = output+"\n";
                              output = output+"\n--------------------------------------------------------------------------------------";
                          }
                      }else{
                          if(continuebet==4){
                                 Racebet=JOptionPane.showInputDialog("Do you want to skip to race 4? \n if yes press 4 else press 0 to exit"); 
                                 continuebet = Integer.parseInt(Racebet);
                              }
                      }
                          
                          
                          //Race 4
                      Racebet=JOptionPane.showInputDialog("Do you want to continue to race 4? \n if yes press 1 else press 0 to exit");
                      continuebet = Integer.parseInt(Racebet);
                      if(continuebet==0){
                          System.exit(0);
                      }else{
                      if (continuebet==1);
                      output = (output) + "\nRace 4";
                        input2=JOptionPane.showInputDialog("Race 4 \n 1: Yasine Emamdee  \n 2: Arnaud Lemalin \n 3: Sanjay Peroumal \n 4: David Brazzers");
                        
                          Race4 = Integer.parseInt(input2);
                          horsewon = (int)(Math.random()*4)+1;
                          
                          bet=JOptionPane.showInputDialog("Enter the amount you want to bet");
                          betplaced = Integer.parseInt(bet);
                          
                          if(horsewon == Race4){
                              
                              output = (output) + "\nCongrats you won 4th race";
                              output = (output) + "\nhorse won is: " + horsewon;
                              output = (output + "\nyou bet: " + betplaced + " on horse " + Race4  );
                              betwon = betplaced * 5;
                              Totalbet = Totalbet + betwon;
                              output = (output + "\nYou won "+ betwon + "\nTotal bet won: " + Totalbet);
                              
                          }else{
                              
                              output+="\n you lost fourth race";
                              output= output + "\n horse that won is: " + horsewon;
                              output = output+"\n you lost " + betplaced + "\n You could have won " + (betplaced * 5);
                              
                            }
                        }
                      
                      
                      
                      
           JOptionPane.showMessageDialog(null,output);
              System.exit(0);

    

}
    }   
}

