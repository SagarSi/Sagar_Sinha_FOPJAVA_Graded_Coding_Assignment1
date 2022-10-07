public class AdminDepartment extends SuperDepartment{
    public String departmentName() {
        String var = "Welcome to Admin Department";
        return var;
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
