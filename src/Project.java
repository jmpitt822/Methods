/**
 * Created by jeremypitt on 8/30/16.
 * Contains the name, due date and completion status of a particular project
 */
public class Project {
    private String projName;
    private String dueDate;
    private boolean isFinished;
    private boolean validDate;

    public Project(String projName, String dueDate, boolean isFinished){
        this.projName = projName;
        this.dueDate = dueDate;
        this.isFinished = isFinished;
    }

    public void setDueDate(String dueDate){
        if (dueDate.contains("/")) {
            this.dueDate = dueDate;
        }
    }

    public String getDueDate(){
        return dueDate;
    }

    public void dateIsValid(String dueDate){
        if(dueDate.contains("2016")){
            this.validDate = true;
        }
    }

    public void setIsFinished(boolean isFinished){
        if (validDate = true){
            this.isFinished = isFinished;
        }
    }

    public boolean getIsFinished(){
        return isFinished;
    }

    public void setProjName(String projName){
        if(projName.contains("Project")) {
            this.projName = projName;
        }
    }

    public String getProjName(){
        return projName;
    }

}
