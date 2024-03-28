package com.kirti.task_management_system.operation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.kirti.task_management_system.entity.Task;

public class TaskOperation {
   private List<Task> operation = new ArrayList<Task>();
   
   public void addTask() {
	   System.out.println("How many task details you want to add? ");
	   Scanner scanner  = new Scanner(System.in);
	   int choice = scanner.nextInt();
	   for (int i = 1; i <= choice; i++) {
		 Task tasks = new Task();
	     System.out.print("Enter task name: ");
	     tasks.setName(scanner.next());
         System.out.print("Enter task description: ");
         tasks.setDescription(scanner.next());
         System.out.print("Enter due date: ");
         tasks.setDueDate(scanner.next());
         operation.add(tasks);
         System.out.println("Task added  successfully.");
	   }
   }
   
   public void removeTask() {
	  if(operation.isEmpty()) {
		  System.out.println("No tasks to remove.");
		  return;
      }
		  System.out.print("\nEnter index of task to remove : ");
		  Scanner scanner = new Scanner(System.in);
		  int index = scanner.nextInt();
		  if(index < 0 || index >= operation.size()) {
			 System.out.println("Invalid choice."); 
			 return;
		  }
		  operation.remove(index);
		  System.out.println("Task Removed successfully.");
   }	  
		  
   
   public void listTasks() {
	   if(operation.isEmpty()) {
			  System.out.println("No tasks available.");
	   }
	   else {
	       for(int i = 0;i<operation.size();i++) {
		     System.out.println(operation.get(i));
	       }
	   }
   }
}
