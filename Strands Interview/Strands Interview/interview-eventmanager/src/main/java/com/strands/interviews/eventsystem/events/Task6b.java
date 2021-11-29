package com.strands.interviews.eventsystem.events;

import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Task6b {
	public Task6b() {
		
		/*
		 * ArrayList<String> inputs = new ArrayList<String>();
		 * inputs.add("ELCORTEINGLES28/5/13"); inputs.add("CARREFOUR2/10/13");
		 */
		
		String str1 = "ELCORTEINGLES28/5/13";
		String str2 = "CARREFOUR2/10/13";
		
		Matcher m = Pattern.compile("(\\d{1,2}/\\d{1,2}/\\d{2})", Pattern.CASE_INSENSITIVE).matcher(str1);
		Matcher m2 = Pattern.compile("(\\d{1,2}/\\d{1,2}/\\d{2})", Pattern.CASE_INSENSITIVE).matcher(str2);
        while (m.find()) {
            System.out.println(m.group(1));
        }
        
        while (m2.find()) {
            System.out.println(m2.group(1));
        }
    }
}
