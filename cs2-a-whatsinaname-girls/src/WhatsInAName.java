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

		
		
		//Claire's test area!
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
				
		consonants(name.toCharArray());
		lowerCase(name.toCharArray());

	}
	
	/**
	 * reverse the name
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return user's name in reverse
	 */
	static char [] reverse(char []name) {
		return null;
	}
	
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
		int numberconsonants = 0; //create int
		for (int i = 0; i < name.length; i++) { //fill int
			if (name[i] != 'a'& name[i] != 'e'& name[i] != 'i'& name[i] != 'o'& name[i] != 'u' & name[i] != ' ' & name[i] != '-'){
				numberconsonants++;
			}
		} 
		System.out.println(numberconsonants);
		return numberconsonants; //return int
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
	static char [] middleName(char []name) {
		return null;
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
		char [] lowercasename = new char[name.length];
		
		for (int i = 0; i < name.length; i++) {
					
			if(name[i] > 64 & name[i] < 97){
				name [i] = (char) (name[i] + 32);
				lowercasename[i] = name[i];
			}
			else {
				lowercasename[i] = name[i];
			}
		}
		
		for (int i = 0; i < lowercasename.length; i++) {
			System.out.print(lowercasename[i]);
		}

		return lowercasename;
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