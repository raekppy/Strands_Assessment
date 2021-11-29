package com.strands.interviews.eventsystem.events;

class Task4 implements Runnable {
	String name;
	Thread t;
	Task4 (String thread){
	    name = thread; 
	    t = new Thread(this, name);
	    System.out.println("New thread: " + t);
	    t.start();
}
 
 
public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}
 
class MultiThread {
public static void main(String args[]) {
     new Task4("One");
     new Task4("Two");
     new Task4("Three");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}
