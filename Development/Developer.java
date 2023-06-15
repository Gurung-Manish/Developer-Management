/*
 * This class is super-class.
 * This class has attributes with its accessor method that lets it have access to its sub-classess.
 * This class contains method to display all the attributes.
 *
 * Class name Developer
 * Author name Manish Gurung
 * Development date 15 Jan 2019
 * Version 1
 */
public class Developer
{
    private String platform; //variable platform has been declared as an instance variable of datatype String.
    private String interviewerName; //variable interviewerName has been declared as an instance variable of data type String.
    private String developerName; //variable developerName has been declared as an instance variable of data type String.
    private int workingHour; //variable workingHour has been declared as an instance variable of data type integer.

    //following method is a costructor of class Developer having three parameters with their individual data type
    public Developer(String platform, String interviewerName, int workingHour)
    {
        this.platform=platform; //this.platform is varibale of Developer class and platform at the right of equal to sign is the value of the paramter passed.
        this.interviewerName=interviewerName; //this.interviewerName is varibale of Developer class and interviewername at the right of equal to sign is the value of the parameter passed.
        developerName=""; //developerName is variable of the Developer class and is initialized with double quotes.
        this.workingHour=workingHour; //this.workingHour is variable of Developer class and workingHour at the right of equal to sign is the value of the parameter passed.
    }


    //method to get platform.
    public String getPlatform()
    {
        return platform; //return statement returns value wherever the method is called.
        //this statement returns platform.
    }


    //method to get interviewer name.
    public String getInterviewerName()
    {
        return interviewerName;
        //returns value of interviewerName where the method is called.
    }


    //setting and getting developer name.
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
        //here the value of developerName passed as parameter and is saved in instance value represented  by this.developerName.
    }

    public String getDeveloperName()
    {
        return developerName;
    }


    //method to get working hour
    public int getWorkingHour()
    {
        return workingHour;
    }

    //method to display all the attributes of Developer class with exception to developer it will be displayed if developer name is not empty string.
    public void display()
    {
        System.out.println("Platform of the developer   : "+ getPlatform());
        System.out.println("Interviewer Name          : "+ getInterviewerName());
        if(developerName!=("")){
            System.out.println("Name of the developer     : "+ getDeveloperName());
        }
        System.out.println("Working Hours             : "+getWorkingHour());
    }
}
