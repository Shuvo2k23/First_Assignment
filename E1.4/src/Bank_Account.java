public class Bank_Account {
     int balance = 1000;
     double interest = 0.05;
     double present;
     public void checkBalance(double last){
         for(double year =1;year<=last;year++){
             present = year*interest*(double)balance;
             System.out.println((int)year+ " th year balance= "+((int)present+ balance));
         }

     }
}
