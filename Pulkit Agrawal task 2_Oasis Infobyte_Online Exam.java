import java.util.*;
public class OnlineExam
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.nextLine();
        System.out.println("Set the password: ");
        String password = sc.nextLine();
        System.out.println("ONLINE EXAMINATION SYSTEM");
        System.out.println("Enter username: ");
        String u = sc.nextLine();
        System.out.println("Enter password: ");
        String p = sc.nextLine();
        if(u.equals(username) && p.equals(password))
        {
            System.out.println("Login successful");
            int choice = 0;
            while(choice != 4)
            {
                System.out.println("MENU");
                System.out.println("1. Start Exam");
                System.out.println("2. Update Password");
                System.out.println("3. Logout");
                System.out.println("4. Exit");
                System.out.println("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice)
                {
                    case 1:
                    int score = 0;
                    int ans;
                    System.out.println("Exam started! You have limited time.");
                    System.out.println("Q1. Which language is used for Android development?");
                    System.out.println("1. Python  2. Java  3. C++  4. HTML");
                    System.out.println("Enter answer: ");
                    ans = sc.nextInt();
                    if(ans == 2) 
                    {
                        score++;
                    }
                    System.out.println("Q2. Which keyword is used to inherit a class in Java?");
                    System.out.println("1. this  2. super  3. extends  4. implements");
                    System.out.println("Enter answer: ");
                    ans = sc.nextInt();
                    if(ans == 3) 
                    {
                        score++;
                    }
                    System.out.println("\nQ3. JVM stands for?");
                    System.out.println("1. Java Virtual Machine  2. Java Variable Method  3. Joint Virtual Machine  4. None");
                    System.out.println("Enter answer: ");
                    ans = sc.nextInt();
                    if(ans == 1)
                    {
                        score++;
                    }
                    System.out.println("Q4. Which company developed Java?");
                    System.out.println("1. Microsoft  2. Sun Microsystems  3. Google  4. Apple");
                    System.out.println("Enter answer: ");
                    ans = sc.nextInt();
                    if(ans == 2)
                    {
                        score++;
                    }
                    System.out.println("Q5. Which symbol is used to end a statement in Java?");
                    System.out.println("1. :  2. ;  3. .  4. ,");
                    System.out.println("Enter answer: ");
                    ans = sc.nextInt();
                    if(ans == 2)
                    {
                        score++;
                    }
                    System.out.println("Exam submitted successfully!");
                    System.out.println("Your Score: " + score + " out of 5");
                    if (score >= 3)
                    {
                        System.out.println("Result: PASS");
                    }
                    else
                    {
                        System.out.println("Result: FAIL");
                    }
                    break;
                    case 2:
                    System.out.println("Enter new password: ");
                    password = sc.nextLine();
                    System.out.println("Password updated successfully!");
                    break;
                    case 3:
                    System.out.println("Logged out successfully!");
                    break;
                    case 4:
                    System.out.println("Thank you for using Online Exam System!");
                    break;
                    default:
                    System.out.println("Invalid choice!");
                }
            }
        }
        else
        {
            System.out.println("Invalid login credentials!");
        }
        sc.close();
    }
}