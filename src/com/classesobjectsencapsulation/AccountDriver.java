package com.classesobjectsencapsulation;
class Account{
	private String id;
	private String name;
	private int balance=0;
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		return balance=balance+amount;
	}
	public int debit(int amount) {
		if(amount>balance) {
			System.out.println("Amount is Exceeded");
			return balance;
		}
		else 
			balance=balance-amount;
			return amount;
	}
	public int trancefer(Account account,int amount) {
		if(balance<amount)
			System.out.println("Insuficient Balence");
		else{
			account.balance=account.balance+amount;
			balance=balance-amount;
			}
		return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
public class AccountDriver {

	public static void main(String[] args) {
		Account acc1=new Account("SBIN0008796","SaiKumar");
		System.out.println(acc1);
		Account acc2=new Account("SBIN0008796","SaiKumar",88000);
		System.out.println(acc2);
		acc2.credit(25000);
		System.out.println(acc2);
		acc2.debit(55000);
		System.out.println(acc2);
		Account acc3=new Account("SBIN0008974","Sharathkumar");
		System.out.println(acc2.trancefer(acc3, 20000));
		System.out.println(acc3);
		System.out.println(acc2);
		
	}

}
