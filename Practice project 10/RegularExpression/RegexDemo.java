import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
public static void main(String[] args) {
	String regex="[a-z]+";
	String input="tat";
	Pattern pattern=Pattern.compile(regex);
	Matcher match =pattern.matcher(input);
	if(match.matches()) {
		System.out.println("Pattern Matched");
	}
	else
		System.out.println("Invalid Pattern");
}
}
