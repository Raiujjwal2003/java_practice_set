public class Access_modifiers{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username="ujjwal rai";
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.username);

    }

  
}
  class BankAccount{
        public String username;
        private String password;

        public void setPassword(String pass){
            password=pass;
        }

    }
