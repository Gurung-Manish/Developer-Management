/*
 * This class is the sub-class of Developer
 *
 *
 * Class name SeniorDeveloper
 * Author name Manish Gurung
 * Development date 17 Jan 2019
 * Version 1
 */
public class JuniorDeveloper extends Developer
{
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    //constructor of JuniorDeveloper class
    public JuniorDeveloper(String platform,String interviewerName,int workingHour,double salary,String appointedBy, String terminationDate)
    {
        super(platform, interviewerName,workingHour);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined=false;
    }

    // method to return salary
    public double getSalary()
    {
        return salary;
    }

    // method to return appointedDate
    public String getAppointedDate()
    {
        return appointedDate;
    }

    // method to return evaluationPeriod
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }

    // method to return terminationDate
    public String getTerminationDate()
    {
        return terminationDate;
    }

    // method to return specialization
    public String getSpecialization()
    {
        return specialization;
    }

    // method to return appointedBy
    public String getAppointedBy()
    {
        return appointedBy;
    }

    //method to return joined
    public boolean joined()
    {
        return joined;
    }

    //method to set new salary
    public void setSalary(double salary)
    {
        if (joined==false)
        {
            this.salary=salary;
        }
        else
        {
            System.out.println("The developer has already joined and the salary is already negotiated. So, the salary cannot be changed");
        }
    }

    //method to appoint developer
    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
    {
        if (joined==false)
        {
            setDeveloperName(developerName);
            joined=true;
        }
        else
        {
            System.out.println("The developer was already appointed at "+getAppointedDate());
        }
        this.appointedDate=appointedDate;
        this.terminationDate=terminationDate;
        this.specialization=specialization;
    }

    //method to display details of developer
    public void display()
    {
        super.display();
        if (joined==true)
        {
            System.out.println("Appointed date             : "+getAppointedDate());
            System.out.println("Developer name             : "+getDeveloperName());
            System.out.println("Evaluation Period          : "+getEvaluationPeriod());
            System.out.println("Termination Date           : "+getTerminationDate());
            System.out.println("Developer Salary           : "+getSalary());
            System.out.println("Developer Specialization   : "+getSpecialization());
            System.out.println("Developer is appointed");
        }
    }
}
