package chapter_08;

/*
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display 
 * students in decreasing order of the number of correct answers. 
 */

public class Exercise_08_03 {
    final static int STUDENT = 0;
    final static int SCORE = 1;
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
		
		int[][] studentGrades = new int[answers.length][2];
		
		// Grade all answers. 
		for (int i = 0; i < answers.length; i++) {
			// Grade one student. 
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					correctCount++;
				}
			}
			
			studentGrades[i][STUDENT] = i;
			studentGrades[i][SCORE] = correctCount;
			
		}
		
		sort(studentGrades);
        
        // Display students in descending order of correct answers.
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println("Student " + studentGrades[i][STUDENT] + "'s correct count is " + studentGrades[i][SCORE]);
        }
	}
	
	/** A method for sorting a 2D array. */
	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i][SCORE] < m[j][SCORE]) {
					// Swap scores. 
					int tempScore = m[i][SCORE];
					m[i][SCORE] = m[j][SCORE];
					m[j][SCORE] = tempScore;
					
					// Swap students. 
					int tempStudent = m[i][STUDENT];
					m[i][STUDENT] = m[j][STUDENT];
					m[j][STUDENT] = tempStudent;
				}
			}
		}
	}
}
