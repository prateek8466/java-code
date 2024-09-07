class Account
{
String acc_no,name,acc_name;
int balance,withdraw,deposit;
public Account(String acc_no, String name, String acc_name, int balance)
{
this.acc_no = acc_no;
this.name = name;
this.acc_name = acc_name;
this.balance = balance;
}
public int withdrawal() {
System.out.println("\nAMOUNT DEBITED: "+withdraw+"\n");
return balance=balance-withdraw;
}
public int deposited() {
System.out.println("\n AMOUNT CREDITED: "+deposit+"\n");
return balance=balance+deposit;
}
public void display() {
System.out.println("ACCOUNT NUMBER: "+acc_no+"\nBANK NAME: "+name+"\nACCOUNT NAME:"+acc_name+"\nBALANCE: "+balance);
}
public static void main(String[] args) {
Account obj=new Account("789524661","SBI","Parteek singhal",5000000);
obj.display();
obj.deposit=30000;
obj.deposited();
obj.display();
obj.withdraw=32000;
obj.withdrawal();
obj.display();
}
}