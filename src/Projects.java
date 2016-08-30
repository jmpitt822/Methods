/**
 * Created by jeremypitt on 8/30/16.
 * Contains the name, due date and completion status of a particular project
 */
public class Projects {
    private String projName;
    private String dueDate;
    private boolean isFinished;
    private boolean validDate;

    public Projects(String projName, String dueDate, boolean isFinished){
        this.projName = projName;
        this.dueDate = dueDate;
        this.isFinished = isFinished;
    }

    public void setDueDate(String dueDate){
        if (dueDate.contains("/")) {
            this.dueDate = dueDate; //contains slashes
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
            this.projName = projName; //contains "Project"
        }
    }

    public String getProjName(){
        return projName;
    }

}
