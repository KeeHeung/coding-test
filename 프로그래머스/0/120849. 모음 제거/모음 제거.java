class Solution {
    public String solution(String my_string) {
		if(my_string.contains("a") || my_string.contains("e") || my_string.contains("i") || my_string.contains("o") || my_string.contains("u")) {
			my_string = my_string.replace("a","");
			my_string = my_string.replace("e","");
			my_string = my_string.replace("i","");
			my_string = my_string.replace("o","");
			my_string = my_string.replace("u","");
		}        
        return my_string;
    }
}