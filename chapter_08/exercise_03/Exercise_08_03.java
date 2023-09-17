package chapter_08;

/*
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display 
 * students in decreasing order of the number of correct answers. 
 */

public class Exercise_08_03 {
	/** Main method. */
	public static void main(String[] args) {
		// Student's answers to the questions. 
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		// Key to the questions. 
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
        // Array to store correct counts for each student.
        int[] correctCounts = new int[answers.length];
		
		// Grade all answers. 
		for (int i = 0; i < answers.length; i++) {
			// Grade one student. 
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					correctCount++;
				}
			}
			
			 correctCounts[i] = correctCount;
		}
		
        // Sort the correct counts and corresponding student indices in descending order.
        for (int i = 0; i < correctCounts.length - 1; i++) {
            for (int j = i + 1; j < correctCounts.length; j++) {
                if (correctCounts[i] < correctCounts[j]) {
                    // Swap correct counts.
                    int tempCount = correctCounts[i];
                    correctCounts[i] = correctCounts[j];
                    correctCounts[j] = tempCount;
                    
                    // Swap student indices.
                    char[] tempAnswers = answers[i];
                    answers[i] = answers[j];
                    answers[j] = tempAnswers;
                }
            }
        }
        
        // Display students in descending order of correct answers.
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Student " + i + "'s correct count is " + correctCounts[i]);
        }
		
	}
	
}
