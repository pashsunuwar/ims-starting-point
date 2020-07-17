package com.qa.ims.utils;

import java.util.Scanner;

public class Utils {

<<<<<<< HEAD
	public static final String MYSQL_URL = "localhost:3306";

//	public static final String MYSQL_URL = "35.242.141.193:3306";

=======
	public static final String MYSQL_URL = "35.242.141.193:3306";
//	public static final String MYSQL_URL = "localhost:3306";
>>>>>>> development
	public static final Scanner SCANNER = new Scanner(System.in);

	private Utils() {

	}

	public static String getInput() {
		return SCANNER.nextLine();
	}

}
