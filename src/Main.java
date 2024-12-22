import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
         TaskManager taskManager = new TaskManager();
         Scanner scanner = new Scanner(System.in);

         while(true)
         {
             System.out.println(" ");
             System.out.println("Was möchten Sie tun?");
             System.out.println("1: Alle Tasks ausgeben");
             System.out.println("2: Task hinzufügen");
             System.out.println("3: Task löschen");
             String choice = scanner.nextLine().trim();

             if (choice.equals("1"))
             {
                 System.out.println("\nToDo-Liste:");
                 list(taskManager);
                 System.out.println("\n");
             }

             if (choice.equals("2"))
             {
                 System.out.println("Welche Task wollen Sie hinzufügen?");
                 String task = scanner.nextLine();
                 taskManager.addTask(task);
             }
             if (choice.equals("3"))
             {
                 System.out.println("Welche Task wollen Sie löschen?");
                 System.out.println("\nToDo-Liste:");
                 list(taskManager);
                 System.out.println("\n");
                 String taskidToDelete = scanner.nextLine();
                 taskManager.deleteTask(taskidToDelete);
                 System.out.println("ToDo-Liste:");
                 list(taskManager);
                 System.out.println("\n");
             }

         }
    }

    public static void list(TaskManager taskManager2)
    {
        for(Task task: taskManager2.tasks)
        {
            System.out.println(task.id +": " + task.title);
        }
    }
}