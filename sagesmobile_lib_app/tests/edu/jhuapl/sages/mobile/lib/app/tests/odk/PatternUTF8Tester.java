/********************************************************************************
* Copyright (c) 2013 The Johns Hopkins University/Applied Physics Laboratory
*                              All rights reserved.
*                    
* This material may be used, modified, or reproduced by or for the U.S. 
* Government pursuant to the rights granted under the clauses at             
* DFARS 252.227-7013/7014 or FAR 52.227-14.
*                     
* Licensed under the Apache License, Version 2.0 (the "License");            
* you may not use this file except in compliance with the License.           
* You may obtain a copy of the License at                                    
*                                                                            
*     http://www.apache.org/licenses/LICENSE-2.0                             
*                                                                            
* NO WARRANTY.   THIS MATERIAL IS PROVIDED "AS IS."  JHU/APL DISCLAIMS ALL
* WARRANTIES IN THE MATERIAL, WHETHER EXPRESS OR IMPLIED, INCLUDING (BUT NOT
* LIMITED TO) ANY AND ALL IMPLIED WARRANTIES OF PERFORMANCE,
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NON-INFRINGEMENT OF
* INTELLECTUAL PROPERTY RIGHTS. ANY USER OF THE MATERIAL ASSUMES THE ENTIRE
* RISK AND LIABILITY FOR USING THE MATERIAL.  IN NO EVENT SHALL JHU/APL BE
* LIABLE TO ANY USER OF THE MATERIAL FOR ANY ACTUAL, INDIRECT,     
* CONSEQUENTIAL, SPECIAL OR OTHER DAMAGES ARISING FROM THE USE OF, OR    
* INABILITY TO USE, THE MATERIAL, INCLUDING, BUT NOT LIMITED TO, ANY DAMAGES
* FOR LOST PROFITS.
********************************************************************************/
package edu.jhuapl.sages.mobile.lib.app.tests.odk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sages
 * @created Jun 3, 2012
 */
public class PatternUTF8Tester {

	public static void main(String[] args){
		System.out.println("The Pattern: ([\\\\P{InBasic Latin}]+)");
		
      	Pattern pattern = Pattern.compile("([\\P{InBasic Latin}]+)");
    	Matcher matcher = pattern.matcher("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    	System.out.println("did it match? " + matcher.find());
    	Matcher matcher2 = pattern.matcher("alexrñnñ© ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    	System.out.println("did it (alexrñnñ© ABCDEFGHIJKLMNOPQRSTUVWXYZ) match? " + matcher2.find());
    	Matcher matcher3 = pattern.matcher("alexㅇㄱㄷ  ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    	System.out.println("did it(alexㅇㄱㄷ  ABCDEFGHIJKLMNOPQRSTUVWXYZ) match? " + matcher3.find());
    	Matcher matcher4 = pattern.matcher("ㅇㄱㄷ  ㅇㄱㄷ  ㅇㄱㄷ  ㅇㄱㄷ  ABCDEFGHIJKLMNOPQRSTUVWXYZ");    	
    	System.out.println("did it(ㅇㄱㄷ  ㅇㄱㄷ  ㅇㄱㄷ  ㅇㄱㄷ  ABCDEFGHIJKLMNOPQRSTUVWXYZ) match? " + matcher4.find());
    	
	}
}
