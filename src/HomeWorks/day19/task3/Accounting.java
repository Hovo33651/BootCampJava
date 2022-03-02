package HomeWorks.day19.task3;

import HomeWorks.day19.task3.ItCompany;

public class Accounting extends ItCompany {
 protected String departmentName;
    
    public Accounting() {

    }

    public Accounting(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
