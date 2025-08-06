package com.tnsif.daynineteen;

public class LambdaWithoutParamete {
public static void main(String[] args) {
		
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}
