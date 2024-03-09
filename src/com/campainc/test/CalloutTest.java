package com.campainc.test;

import com.campainc.model.db.callout.CalloutCreator;

import domain.assets.Callout;

public class CalloutTest {

	public static void main(String[] args) {
		Callout callout = new Callout();
		CalloutCreator.addCallOut(callout.getCallOuts(), 4, 0);
		callout.getCallOuts().forEach(System.out::println);
	}
	
}
