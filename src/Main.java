public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++) {
            accounts[i] = new Account();
        }
        System.out.println("Accounts: ");
        for(int i=0;i<5;i++)
            System.out.println(accounts[i]);

        try{
            accounts[0].linkToNationalId(933);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[0]);
        try{
            accounts[1].linkToNationalId(663);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[1]);
        try{
            accounts[2].linkToNationalId(87);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[2]);
        try{
            accounts[3].linkToNationalId(195);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[3]);
        try{
            accounts[4].linkToNationalId(1294);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            accounts[4].linkToNationalId(1293);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[4]);
        accounts[0].deposit(500);
        System.out.println(accounts[0]);
        accounts[1].deposit(100);
        System.out.println(accounts[1]);
        accounts[2].deposit(250);
        System.out.println(accounts[2]);
        accounts[3].deposit(900);
        System.out.println(accounts[3]);
        accounts[4].deposit(1000);
        System.out.println(accounts[4]);
        try {
            accounts[0].withdraw(250);
        }catch ( Exception e){
            System.out.println(e.getMessage());
        }

        try{
            accounts[0].withdraw(300);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}