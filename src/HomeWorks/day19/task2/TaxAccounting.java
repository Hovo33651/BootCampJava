package HomeWorks.day19.task2;

import HomeWorks.day19.task3.Accounting;

public class TaxAccounting extends Accounting {
    private int countOfEmployers;
    private String departmentName;

    public TaxAccounting() {
    }

    @Override
    public void account() {

        System.out.println("taxOfCompany");
    }


}
