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
		//declarations:
		Scanner scan = new Scanner(System.in);


		//take an input:
		String name = scan.nextLine();


		//julia's test area:
		System.out.println(firstName(name.toCharArray()));
		System.out.println(upperCase(name.toCharArray()));
		System.out.println(initials(name.toCharArray()));

		//BLU's TEST AREA 🐯

		//number of vowels
		System.out.println("You have " + vowels(name.toCharArray()) + " vowels in your name");

		//hyphen
		if (hyphen(name.toCharArray()) == true) {
			System.out.println("You have a hyphen in your name.");
		}
		else {
			System.out.println("You do not have a hyphen in your name.");
		}
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
		return 0;
	}

	/**
	 * find first name
	 * assigned: c18jj
	 * @param name the user's name
	 * @return user's first name
	 */
	static char [] firstName(char []name) {
		//creating the array
		char [] first = new char [name.length];
		int temp = 0; 
		for (int i = 0; i < name.length; i++) {
			if(name[i]==' ') { //if there is a space
				temp = i;	//set temp to i
			}
		}
		for (int j = 0; j < temp; j++) {
			first[j]=name[j]; //set name to first
		}
		return first;
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
		return null;
	}

	/**
	 * convert to uppercase
	 * assigned: c18jj
	 * @param name the user's name
	 * @return user's name in uppercase
	 */
	static char [] upperCase(char []name) {
		char [] uppercasename = new char[name.length];

		for (int i = 0; i < uppercasename.length; i++) {
			if(name[i] >= 97 & name[i]<= 122) {
				name[i] = (char) (name[i] - 32);
				uppercasename[i] = name[i];
			}
			else {
				uppercasename[i] = name[i];
			}
		}
		return uppercasename;
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
		char [] initial = new char[name.length];
		int temp = 0;
		initial[0]= name[0];
		for (int i = 0; i < name.length; i++) {
			if(name[i]==' ') { //if there is a space
				temp = (i+1);	//set temp to i+1
				
				initial[1] = name[temp];
			}
		}

		return initial;
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