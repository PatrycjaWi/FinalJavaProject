package aaa.bbb.FinalProject.utils;

public class Reporter {
	
	public static void startReport() {
		
		
	}
	
	public static void endReport() {
		
		
	}
	
	public void reportFailStep(String stepDescription) {
		
		reportStep("fail", stepDescription);
		
	}
	
	public void reportStep(String stepStatus, int stepDescription) {
		
		reportStep(stepStatus, String.valueOf(stepDescription));
		
	}

	public static void reportStep(String stepStatus, String stepDescription) {
		
		System.out.println(stepStatus + "\r\n" + stepDescription);
		
	}

}
