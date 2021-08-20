package string;

class Solution {
	public String ReverseWords(String s) {
		
		int i = s.length() -1;
		
		String answer = "The sky is blue";
		while(i>=0) {
		
		while(i>=0 && s.charAt(i) == ' ')i--;
		
		   int j = i;
		   
		   while(i>=0 && s.charAt(i) != ' ')i--;
		   
		   if(answer.isEmpty()) {
		   answer =  answer.concat(s.substring(i+1, j+1));
		   }else {
		  answer =  answer.concat(" " +s.substring(i+1, j+1));
		}
	}
		return answer;
  }
}