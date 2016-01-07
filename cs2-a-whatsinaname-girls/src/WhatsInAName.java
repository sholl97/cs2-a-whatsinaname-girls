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



		//BLU's TEST AREA 🐯
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();

		//number of vowels
		System.out.println("You have " + vowels(name.toCharArray()) + " vowels in your name");

		//hyphen
		if (hyphen(name.toCharArray()) == true) {
			System.out.println("You have a hyphen in your name.");
		}
		else {
			System.out.println("You do not have a hyphen in your name.");
		}


		//Claire's test area!
		// consonants
		System.out.println("You have " + consonants(name.toCharArray()) + " consonants in your name.");
		//lowercase
		System.out.print("Your name in lowercase letters: ");
		for (int i = 0; i < lowerCase(name.toCharArray()).length; i++) {
			System.out.print(lowerCase(name.toCharArray())[i]);
		}
		//sorted alphabet
		System.out.println();
		System.out.print("Your name with the letters in order: ");
		System.out.println(sortedName(name.toCharArray()));

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
		int numbervowels = 0; //make thing of return type
		//fill
		for (int i = 0; i < name.length; i++) {
			if (name[i] == 'a' || name[i] == 'e' || name[i] == 'i' || name[i] == 'o' || name[i] == 'u')
			{
				numbervowels++;
			}
		}
		//System.out.println(numbervowels);
		// return
		return numbervowels;
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
		//make thing of return type
		boolean hyph = false;
		//fill
		for (int i = 0; i < name.length; i++) {
			if (name[i] == '-'){
				hyph = true;
			}
		}

		return hyph;
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
		char [] sortedname = new char[name.length];
		for (int i = 0; i < sortedname.length; i++) {
			sortedname[i] = name[i];
		}

		//fill
		boolean swapped = true;
		char temp;
		while(swapped){
			swapped = false;
			for (int i = 0; i < ((sortedname.length)-1); i++) {
				//	System.out.println(sortedname);
				if(sortedname[i] > sortedname[i+1]){
					temp = sortedname[i];
					sortedname[i] = sortedname[i+1];
					sortedname[i+1] = temp;
					swapped = true;
				}
			}
		}
		return sortedname;
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