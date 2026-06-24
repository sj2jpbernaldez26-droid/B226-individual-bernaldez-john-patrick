
package day6.activity;


public class Activity3_Bernaldez {
    public static void main(String[] args) {
        
        int age = 20;
        boolean hasValidId = true;
        boolean allowedToEnter = (age >=18 && hasValidId);
    
    String resultallowedToEnter = (true || false) ? "Access Grandted" : "Access Denied";
        System.out.println(resultallowedToEnter);
        
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        String classStatus  = (isWeekend || isHoliday) ? "No Classes Today" : "There is Classes Today";
        System.out.println(classStatus);
        
        int score = 85;
        
        boolean passed = (score >=75);
        boolean failed = (score <= 74);
        
        String result = (score >= 75) ? "Passed" : "Failed";
            System.out.println(result);
        
        int num1 = 10;
        int num2 = 25;
        
        int largerNumber = (num1 > num2) ? num1 : num2;
        
        System.out.println("The Larger Number is: " + largerNumber);
        
        
        
    }
}
