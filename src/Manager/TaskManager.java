package Manager;

import java.util.ArrayList;
import java.util.List;

import Interface.ITask;

public class TaskManager {

    private List<ITask> Task = new ArrayList<ITask>();

    public void addTask(ITask task) {
        Task.add(task);
    }
    
    public void removeTask(ITask task) {
        Task.remove(task);
    }

    public void markAsCompleted(ITask task) {
        task.markAsComplete();
    }
}
