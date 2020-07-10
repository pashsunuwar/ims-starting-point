package com.qa.ims.utils;

import java.util.Scanner;

public class Utils {

<<<<<<< HEAD
//	public static final String MYSQL_URL = "34.89.21.38:3306";
	public static final String MYSQL_URL = "localhost:3306";
=======
	public static final String MYSQL_URL = "35.242.141.193:3306";
>>>>>>> 88c4c4411eff1ff5c1806b78bc3f4a8a054bdb06
	public static final Scanner SCANNER = new Scanner(System.in);

	private Utils() {

	}

	public static String getInput() {
		return SCANNER.nextLine();
	}

}
