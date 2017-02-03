package org.samovich.cop2800.chapter4;

public class UseEmployeeConstructor {
    public static void main(String [] args) {
                //create employees to pay
        EmployeeConstructor worker =
            new EmployeeConstructor("Joe Worker", 12345, 1970001);
        EmployeeConstructor contractor = new EmployeeConstructor();
        EmployeeConstructor supervisor =
            new EmployeeConstructor("Sam Supervisor", 34567, 1965101);
                //calc and print pay for worker
        System.out.println("The pay for " + worker.getName() +
                " with employee number " +  worker.getEmpID() +
                " and date of birth of " + worker.getDateOfBirth() +
                " has hours of " + worker.getHrs() +
                " and a rate of $" + worker.getRate() + " per hour");
                //calc and print pay for supervisor
        System.out.println("The pay for " + contractor.getName() +
                " with employee number " +  contractor.getEmpID() +
                " and date of birth of " + contractor.getDateOfBirth() +
                " has hours of " + contractor.getHrs() +
                " and a rate of $" + contractor.getRate() + " per hour");

                //calc and print pay for contractor
        System.out.println("The pay for " + supervisor.getName() +
                " with employee number " +  supervisor.getEmpID() +
                " and date of birth of " + supervisor.getDateOfBirth() +
                " has hours of " + supervisor.getHrs() +
                " and a rate of $" + supervisor.getRate() + " per hour");
    }
}