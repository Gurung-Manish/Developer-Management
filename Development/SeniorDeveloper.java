/*
 * This class is the sub-class of Developer
 * This class has its own private attributes with accessor methods.
 *
 *
 * Class name SeniorDeveloper
 * Author name Manish Gurung
 * Development date 17 Jan 2019
 * Version 1
 */
public class SeniorDeveloper extends Developer
{
    private double salary; //variable salary is declared as an instance variable which will store integer value.
    private String joiningDate;//variable joiningDate is declared as an instance variable which will hold string value.
    private String staffRoomNumber;//variable staffRoomNumber is declared as an instance variable which will hold string value.
    private int contractPeriod;//variable contractPeriod is declared as an instance variable which will hold integer value.
    private double advanceSalary;//variable advanceSalary is declared as an instance variable which can store float value.
    private boolean appointed;//variable appointed is declared as an instance varibale which can store boolean value.
    private boolean terminated;//variable terminated is declared as an instance varibale which can store boolean value.

    //construtor of SeniorDeveloper
    public SeniorDeveloper(String platform,String interviewerName, int workingHour, double salary, int contractPeriod )
    {
        super(platform,interviewerName,workingHour);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0;
        appointed=false;
        terminated=false;
    }

    //methods for getting salary.
    public double getSalary()
    {
        return salary;
    }

    //methods for getting joining date.
    public String getJoiningDate()
    {
        return joiningDate;
    }

    //methods for getting staff room number.
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }

    //methods for getting contact period.
    public int getContractPeriod()
    {
        return contractPeriod;
    }

    //methods for getting advance salary.
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }

    //methods for getting appointed.
    public boolean getAppointed()
    {
        return appointed;
    }

    //methods for getting terminated.
    public boolean getTerminated()
    {
        return terminated;
    }

    //method to set new salary
    public void newSalary(double newSalary)
    {
        salary=newSalary;
    }

    //method to set the contract period
    public void newContractPeriod(int newContractPeriod)
    {
        contractPeriod=newContractPeriod;
    }

    //method to hire developer for a particular platform
    public void hireDeveloper(String developerName, String joiningDate,double advanceSalary,String staffRoomNumber)
    {
        if (appointed==true)
        {
            System.out.println(getDeveloperName()+" is already appointed.");
            System.out.println("Developer Name              : "+getDeveloperName());
            System.out.println("Staff room number           : "+getStaffRoomNumber());
        }
        else
        {
            super.setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
        }
    }

    //method to check contract termination
    public void contractTermination()
    {
        if (terminated==true)
        {
            System.out.println("You are terminated.");
        }
        else
        {
            super.setDeveloperName("");
            joiningDate="";
            advanceSalary=0.0;
            appointed=false;
            terminated=true;
        }
    }

    //method to print platform, interviewer name and salary
    public void display()
    {
        System.out.println("Platform                    : "+ getPlatform());
        System.out.println("Interviewer name            : "+ getInterviewerName());
        System.out.println("Developer salary            : "+ getSalary());
    }

    //method to display details of the developer.
    public void displayDetails()
    {
        super.display();
        if (appointed==true)
        {
            System.out.println("Termination status          : "+ getTerminated());
            System.out.println("Joining date                : "+ getJoiningDate());
            System.out.println("Advance salary              : "+ getAdvanceSalary());
            System.out.println("Developer name              : "+ getDeveloperName());
        }
    }
}
