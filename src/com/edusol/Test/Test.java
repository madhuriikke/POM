package com.edusol.Test;

public class Test {

	public static void main(String[] args) {

		TestTitle t = new TestTitle();
		FacebookRegistration fb = t.checkTitle("Facebook – log in or sign up");
		if (fb != null) {
			LoginTest lt = fb.doRegistration();
			lt.doLogin("abc", "pqr");
		}

	}

}
