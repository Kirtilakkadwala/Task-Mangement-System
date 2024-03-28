package com.kirti.task_management_system.main;

import java.util.Scanner;

import com.kirti.task_management_system.operation.TaskOperation;

public class TaskManagementSystem {
   private static TaskOperation task = new TaskOperation();
   private static boolean exit = true;
   
   public static void main(String[] args) {
	   while(exit) {
		   taskStart();
	   }
   }
   
   public static void taskStart() {
	    System.out.println("\n================== Task =======================");
		System.out.println("1.Add Task");
		System.out.println("2.Remove Task");
		System.out.println("3.Task List");
		System.out.println("4.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter your choice: ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: 
			  task.addTask();
			  break;
		case 2:
			   task.removeTask();
			   break;
		case 3:
			   task.listTasks();
			   break;
		case 4:
			   System.out.println("Exiting...");
			   System.out.println("Thank you..!!");
			   exit = false;
			   break;
		default:
			   System.out.println("Invalid choice. Try again..!!");
			   break;
		}
   }
}
