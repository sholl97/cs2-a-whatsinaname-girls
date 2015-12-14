import java.util.Scanner;

public class WhatsInAName {
	/**
	 * cs2
	 * a period
	 * girls
	 * 
	 * what's in a name
	 * @author sholl97
	 * @author c18ac1
	 * @author bludetiger
	 * @author c18ck
	 * @author c18jj
	 * @author c18rc
	 */


	public static void main(String[] args) {
		//call functions here
		Scanner scan = new Scanner(System.in);
		String string= scan.nextLine();
		System.out.println(middleName(string.toCharArray()));

	}

	/**
	 * reverse the name
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return user's name in reverse
	 */
	//static char reverse(char []name) {
		//char first; //make a thing of the return type
		//first=name[0];//fill that thing up
		//return first; //return
	//}

	/**
	 * count number of vowels
	 * assigned: bludetiger
	 * @param name the user's name
	 * @return number of vowels in user's name
	 */
	static int vowels (char [] name){
		return 0;
	}

	/**
	 * count number of consonants
	 * assigned: c18ck
	 * @param name the user's name
	 * @return number of consonants in user's name
	 */
	static int consonants (char [] name){
		return 0;
	}

	/**
	 * find first name
	 * assigned: c18jj
	 * @param name the user's name
	 * @return user's first name
	 */
	static char [] firstName(char []name) {
		return null;
	}

	/**
	 * find last name
	 * assigned: c18rc
	 * @param name the user's name
	 * @return user's last name
	 */
	static char [] lastName(char []name) {
		return null;
	}

	/**
	 * find middle name
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return user's middle name
	 */
	static char[] middleName(char []name) {
		char[] middle = null;
		int firstSpace = 0;
		int secondSpace = 0;
		for (int i = 0; i < name.length; i++) {
			if (name[i]== ' ') {
				firstSpace=i;
			}
			for (int j = 0; j < name.length; j++) {
				if (name[j]== ' ') {
					secondSpace=j;
				}
			}
		}
		for (int k=firstSpace; k<secondSpace; k++) {
			middle[k]=name[k];
		}
		return middle; 
	}

	/**
	 * check to see if name has a hyphen
	 * assigned: bludetiger
	 * @param name the user's name
	 * @return whether there is a hyphen or not
	 */
	static boolean hyphen(char [] name){
		return false;
	}

	/**
	 * convert to lowercase
	 * assigned: c18ck
	 * @param name the user's name
	 * @return user's name in lowercase
	 */
	static char [] lowerCase(char []name) {
		return null;
	}

	/**
	 * convert to uppercase
	 * assigned: c18jj
	 * @param name the user's name
	 * @return user's name in uppercase
	 */
	static char [] upperCase(char []name) {
		return null;
	}

	/**
	 * scramble the name
	 * assigned: c18rc
	 * @param name the user's name
	 * @return the scrambled version of the name
	 */
	static char [] mixUp(char []name) {
		return null;
	}

	/**
	 * check to see if name is a palindrome
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return
	 */
	static boolean palindrome (char [] name){
		return false;
	}

	/**
	 * sort the letters of the name alphabetically
	 * assigned: c18ck
	 * @param name the user's name
	 * @return the sorted name
	 */
	static char [] sortedName(char []name) {
		return null;
	}

	/** 
	 * find the name's initials
	 * assigned: c18jj
	 * @param name the user's name
	 * @return the initials of the user's name
	 */
	static char [] initials(char []name) {
		return null;
	}

	/**
	 * check to see if name has a title (e.g. Esq., PhD., etc.)
	 * assigned: c18rc
	 * @param name the user's name
	 * @return whether there is a title or not
	 */
	static boolean title (char [] name){
		return false;
	}
}