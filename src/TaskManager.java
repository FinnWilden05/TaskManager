import java.util.ArrayList;
import java.util.List;

public class TaskManager
{
    public List<Task> tasks=new ArrayList<>();

    public void addTask(String taskTitle)
    {
        Task task = new Task(taskTitle, tasks.size() + 1);
        tasks.add(task);
        System.out.println("Task added: " + task.id +": " + task.title + "\n");
    }

    public void deleteTask(String taskID)
    {
        Task taskToDelete = null;
        int parsedTaskID = Integer.parseInt(taskID);
        for (Task task: tasks)
        {
            if (task.id == parsedTaskID)
            {
                taskToDelete = task;
            }
        }
        if (taskToDelete != null)
        {
            tasks.remove(taskToDelete);
        }
        else
        {
            System.out.println("Die Task mit der Nummer " + taskID + " existiert nicht!");
        }
    }

}
