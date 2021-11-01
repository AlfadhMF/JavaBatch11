package com.syntax.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*rules:
		 * 1.Values in case MUTS be same datatype as a VARIABLE in switch
		 * 2. We can not have Duplicate cases
		 * 
		 */
		
		
		char gender='f';
		String description;
		
		switch(gender) {
		
		case 'm':
		description="Male";	
		case 'M':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
		case 'F':
			description="Female";
			break;
			default:
				description="Unknown";
		}
		System.out.println(gender+" means "+description);
		
		/*
		 * limitation of operator:
		 * 1. we can't use logical Operators
		 * 2. we can't use relational Operators
		 * 
		 * limitation of data types:
		 * 1. cannot use boolean
		 * 2. cannot be used with double/float
		 * 3. cannot be used with long
		 */
		
	

}
