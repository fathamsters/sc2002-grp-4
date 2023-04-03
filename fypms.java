import java.util.ArrayList;
import java.util.Scanner;

public class fypms{
    public String userID;
    public String inputPassword;
    public String userPassword = "password";
    public Scanner sc = new Scanner(System.in);

    public boolean login(){    
        ArrayList<String[]> studentInfo = new ArrayList<>();
        studentInfo.add(new String[]{"YCHERN", "password"});
        studentInfo.add(new String[]{"KOH1", "password"});
        studentInfo.add(new String[]{"BR015", "password"});
        studentInfo.add(new String[]{"CT113", "password"});
        studentInfo.add(new String[]{"YCN019", "password"});
        studentInfo.add(new String[]{"DL007", "password"});
        studentInfo.add(new String[]{"DON84", "password"});
        studentInfo.add(new String[]{"ELI34", "password"});
        studentInfo.add(new String[]{"LE51", "password"});
        studentInfo.add(new String[]{"SL22", "password"});
        studentInfo.add(new String[]{"AKY013", "password"});  
        System.out.println("Enter your ID: ");
                    userID = sc.nextLine();
                    System.out.println("Enter password: ");
                    inputPassword = sc.nextLine();
                    boolean foundStudent = false;
                    for (String[] student : studentInfo) {
                        if (student[0].equals(userID)) {
                            if (!inputPassword.equals(student[1])) {
                                System.out.println("Wrong password!");
                                break;
                            } else {
                                foundStudent = true;
                                
                                break;
                            }
                        }
                    }
                    return foundStudent;
    }
                                          
    public void changePassword(){
        fypms obj = new fypms();
        boolean foundStudent = obj.login();
        int x = 0;
        String oldPassword, newPassword;
        if (foundStudent == true){
            do{
                    System.out.println("Enter current password: ");
                    oldPassword = sc.nextLine();
                    if (oldPassword == userPassword){
                        System.out.println("Enter new password: ");
                        newPassword = sc.nextLine();
                        userPassword = newPassword;
                        break;
                    }
                    else{
                        System.out.println("Wrong password. Try again.");
                        x++;
                    }
                } while (x <= 3 && oldPassword != userPassword);
            }

    }
    public static void main(String[] args) {
        int choice;
        
        do{
            System.out.println("(1) Login");
            System.out.println("(2) Change Password");
            System.out.println("(3) Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            fypms obj = new fypms();
            switch(choice){
                case 1: 
                    obj.login();
                    break;
                case 2:
                    obj.changePassword();
                    break;
            }
                    
        } while (choice != 3);
    }
}

