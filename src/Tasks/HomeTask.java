package Tasks;

import Interface.ITask;

public class HomeTask implements ITask {
    
    private String Descripition;
    private Boolean Completed;


    public HomeTask(String descripition, Boolean completed) {
        Descripition = descripition;
        Completed = completed;
    }

    public String getDescripition() {
        return Descripition;
    }

    public void setDescripition(String descripition) {
        Descripition = descripition;
    }

    public Boolean getCompeted() {
        return Completed;
    }

    public void setCompeted(Boolean competed) {
        Completed = competed;
    }

    @Override
    public String getDescription() {
       return Descripition;
    }

    @Override
    public Boolean isCompletede() {
        return Completed;
    }

    @Override
    public void markAsComplete() {
       Completed = true;
    }
    
}

