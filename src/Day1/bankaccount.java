package Day1;

import java.security.PublicKey;
import java.util.List;

public class BankAccount {

    //states (YOU CAN CHANGE THE STATES AND CREATE MULTIPLE OBJECTS)

    //account number
    String accountNumber;
    //account type
    //account status
    //Transactions
     List<Transaction> transactions
    //routingNumber
    //state
    //city
    //country
    //zipcode
    //street address
    //user id
    //password
    // account holder name
    //DOB
    //beneficiaries
    //social security number
    //Relationship status




    //Behavior
//deposit
    public void deposit(BankAccount toWhichAccount, double amount){

    };


    public boolean deposit(BankAccount toWhichAccount, double amount){
        return true;
    }

    //WITHDRAW => PARAMETERS -> from which account and how much
 public boolean withdraw(BankAccount fromWhichAccount, double amount){
    return true;
    }

//transfers
 public boolean transfers(BankAccount toWhichAccount,BankAccount fromWhichAccount, double amount ){
    return true;
 }
//UPDATE KYC
//update kyc => PARAMETERS -> KYC HELPER CLASS OBJECT ( WE CRETED A WHOLE NEW CLASS BECAUSE WE HAD TOO MANY PARAMETERS]
public void updateKYC(KYCHelper, KYCHelper){

}
//CHECK BALANCE
 public double checkBalance (BankAccount account){
    return 0.0}
}
    //card request
    //card request => PARAMETERS -> account what type of card
    public void  cardRequest(BankAccount account,String cardType )
g