

public class StudentGradingSystem {
	
	public static String  getGrade(int marks) {
        return (marks >= 90) ? "A" : 
               (marks >= 75) ? "B" : 
               (marks >= 50) ? "C" : "Fail";
    }

	public static void main(String[] args) {
		
	System.out.print(StudentGradingSystem.getGrade(60));	

	}

}
