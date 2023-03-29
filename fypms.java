package assignment_2002;

import java.util.Scanner;

    public class fypms{
        public static void main (String[] args){
            int choice;
            String userID;
            String userPassword = password;
            Scanner sc = new Scanner(System.in);
            
            
            
            do{
                System.out.println("(1) Login");
                System.out.println("(2) Change Password");
                System.out.println("(3) Exit");
                choice = sc.nextInt();
                
                switch(choice){
                    case 1: 
                        login();
                        break;
                    case 2:
                        changePassword();
                        break;
                        
                       
                        
                                
                          
                            
                        
                            
                            
                        
      
            } while (choice != 3);
          
       public login(){                                      
           System.out.println("Enter your ID: ");
                        userID = sc.nextStr();
                        System.out.println("Enter password: ");
                        inputPassword = sc.nextStr();
                        if (inputPassword != userPassword){
                            break;
                        }
                        else {
                            FYP_Queries;
                        }
         }
                                              
         public changePassword(){
             passwordMatching;
                    System.out.println("Enter current password: ");
                    oldPassword = sc.nextStr();
                    if (oldPassword == userPassword){
                        System.out.println("Enter new password: ");
                        newPassword1 = sc.nextStr();
                        System.out.println("Confirm your new password: ");
                        newPassword2 = sc.nextStr();
                        if (newPassword1 == newPassword2){
                            userPassword = newPassword1;
                        }
                        else{
                            System.out.println("The passwords do not match. Please try again.");
                            continue passwordMatching;
                        }
                    }
                    else{
                        System.out.println("
            
         
   
        }
    }

