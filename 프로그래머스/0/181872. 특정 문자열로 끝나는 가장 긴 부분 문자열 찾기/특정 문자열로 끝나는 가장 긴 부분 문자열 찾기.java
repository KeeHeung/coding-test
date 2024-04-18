class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String result = "";
		for ( int i = 0; i < myString.length( ); i++ ) {
			result = myString.substring( 0, i + 1 );
			if(result.endsWith(pat)) answer = result;
		}
        return answer;
    }
}