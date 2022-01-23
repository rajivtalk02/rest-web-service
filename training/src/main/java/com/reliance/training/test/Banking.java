package com.reliance.training.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Banking {

	@Autowired
	private Transaction transaction;

	public void makeTransaction() {
	}

	public static void main(String[] args) {
		Banking obj = new Banking();
		obj.makeTransaction();
	}
}

class Transaction {

	public void doTransaction() {

		System.out.println("Transaction compeleted.....");
	}
}
