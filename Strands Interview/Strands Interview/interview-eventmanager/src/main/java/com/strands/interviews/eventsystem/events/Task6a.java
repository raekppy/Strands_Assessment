package com.strands.interviews.eventsystem.events;

import java.util.regex.*;
import java.util.*;

public class Task6a {
	public Task6a() {
		
		String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regx);
		
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("f.soler@strands.com");
        emails.add("i.tarradellas@strands.com");
        emails.add("a.dereina@strands.com");
        
        for(String tempEmail : emails){
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(tempEmail);
            System.out.println(tempEmail +" : "+ matcher.matches()+"\n");
        }
    }
}
