package com.nestedifelsecondi;

public class NestedIfElse {
	
	    
	 //  static	int ScoredMarks=750;
	    
	   public static void main(String[] args) {
		
		//int TotalMarks=1000,ScoredMarks=750;
		   
		   IfElase nie=new IfElase();
		   
		if(nie.ScoredMarks>=800) {
			
			System.out.println("Grade A");
			
		}else if(nie.ScoredMarks <800 && nie.ScoredMarks >=700) {
			
			
			System.out.println("Grade B");
			
		}else if(nie.ScoredMarks <700 && nie.ScoredMarks >=600) {
			
			
			System.out.println("Grade c");
		}
		else {
		
		
			System.out.println("Grade D");
		}
		
	}
}
