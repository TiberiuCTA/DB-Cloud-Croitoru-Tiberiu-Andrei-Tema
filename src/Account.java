public class Account {
   private int accountNO;
    private int amount;
    private int nationalID;
    private static int currentNo=0;

    public Account() {
        int amount = 0;
        accountNO= currentNo;
        currentNo++;
    }
    public void deposit(int amount)
    {
        this.amount += amount;
    }
    public void withdraw(int amount) {
        if (this.amount < amount)
            throw new NotEnoughMoneyException("Not enough money");
        this.amount -=amount;
    }
    public int noOfDigits(int no)
    {
        int sum =0;
        while(no>0){
            sum+=no%10;
            no/=10;
        }
        return sum;
    }
    public void linkToNationalId(int nationalID)
    {
        if(noOfDigits(nationalID)!= 15)
            throw new InvalidNationalIdException("Invalid National ID");
        this.nationalID= nationalID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNO=" + accountNO +
                ", amount=" + amount +
                ", nationalID=" + nationalID +
                '}';

    }
}
