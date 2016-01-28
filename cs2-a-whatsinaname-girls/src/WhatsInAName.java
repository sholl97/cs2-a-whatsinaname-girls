import java.util.Random;
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

		//ALISON - middle name, reverse name, palindrome
		System.out.println("your middle name is" + middleName(name.toCharArray()));
		System.out.println(reverse(name.toCharArray()));
		if (palindrome(name.toCharArray()) == true){
			System.out.println("Your name is a palindrome.");
		}
		else {
			System.out.println("Your name is not a palindrome.");
		}
		//name definition
		System.out.println("the definition of your name is " + nameDefinition(name.toCharArray()) + ".");

		//JULIA - first name, uppercase, initials
		System.out.println(firstName(name.toCharArray()));
		System.out.println(upperCase(name.toCharArray()));
		System.out.println(initials(name.toCharArray()));

		//BLU 🐯 - vowels, hyphen, title
		System.out.println("You have " + vowels(name.toCharArray()) + " vowels in your name");

		if (hyphen(name.toCharArray()) == true) {
			System.out.println("You have a hyphen in your name.");
		}
		else {
			System.out.println("You do not have a hyphen in your name.");
		}

		if (title(name.toCharArray()) == true){
			System.out.println("You have a title in your name.");
		}
		else {
			System.out.println("You do not have a title in your name.");
		}

		//RAIN - last, scramble
		System.out.println(lastName(name.toCharArray())); //call last name function 
		System.out.println(mixUp(name.toCharArray())); //call mixup function

		//CLAIRE - consonant, lowercase, sort

		System.out.println("You have " + consonants(name.toCharArray()) + " consonants in your name.");

		System.out.print("Your name in lowercase letters: ");
		for (int i = 0; i < lowerCase(name.toCharArray()).length; i++) {
			System.out.print(lowerCase(name.toCharArray())[i]);
		}

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
		char[] reversename = new char[name.length];

		//iterate through name array
		for (int i = 0; i < name.length; i++) {
			reversename[i] = name [name.length-1-i];
		}
		return reversename;
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
			if (name[i] == 'a' || name[i] == 'e' || name[i] == 'i' || name[i] == 'o' || name[i] == 'u' || name[i] =='A' || name[i] == 'E' || name[i] == 'I' || name[i] == 'O' || name[i] == 'U')
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
		char []last = new char[name.length]; //create an array for the name
		int temp=0; 
		for (int i= 0; i < name.length; i++){
			if(name[i]==' '){ //if name is space
				temp=i; //set i to secondSpace				
			}
		}
		for (int j= temp +1; j < name.length; j++){
			last[j]=name[j]; //set name to last

		}

		return last;		//fill

	}

	/**
	 * find middle name
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return user's middle name
	 */
	static String middleName(char []name) {
		char[] middle = new char[name.length];
		int firstSpace = 0;
		int secondSpace = 0;
		for (int i = name.length-1; i > 0; i--) {
			if (name[i]==' ') {
				firstSpace=i;
			}
			for (int j = 0; j < name.length-1; j++) {
				if (name[j]==' ') {
					secondSpace=j;
				}
			}
		}
		for (int k=firstSpace; k<secondSpace; k++) {
			middle[k]=name[k];
		}

		//	convert to string
		String output = "";
		for (int i = 0; i < middle.length; i++) {
			output += middle[i];
		}

		return output; 
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
		char []mixUp = new char[name.length]; //create an array for the name
		Random gen=new Random(); //import random gen
		for (int i=0; i < name.length; i++){ //run through this until whole name is in mixup
			mixUp[i] = name[i]; //set name array to mixup arrary

		}
		for (int i=0; i < name.length; i++){  
			int rand = gen.nextInt(name.length); //random #'s as many as in name

			//three way switch:
			char temp = mixUp[rand]; //pick random spot and put char in temp
			mixUp[rand] = mixUp[i]; //put i into random spot
			mixUp[i] = temp; //put char in temp into spot i 
		}


		return mixUp; //print Mixupped name
	}

	/**
	 * check to see if name is a palindrome
	 * assigned: c18ac1
	 * @param name the user's name
	 * @return
	 */
	static boolean palindrome (char [] name){
		boolean true_false= false;
		for (int i = 0; i < name.length; i++) {
			for (int j = name.length-1; j > 0; j--) {
				if (name[i]==name[j]){
					true_false=true;
				}
				else {
					true_false=false;
				}
			}
		}
		return true_false;
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
	 * assigned: bludetiger
	 * @param name the user's name
	 * @return whether there is a title or not
	 */
	static boolean title (char [] name){
		boolean iftitle = false;			
		//title must have period at either 2nd, 3rd, or 4th char (ex: Dr. , Mrs. , Prof.)
		if(name[2]=='.' || name[3]=='.' || name[4]=='.') {
			iftitle = true;
		}
		//title could be "Miss"
		else if (name[0]=='M' && name[1]=='i' && name[2] == 's' && name[3] == 's') {
			iftitle = true;
		}
		//accounting for lowercase
		else if (name[0]=='m' && name[1]=='i' && name[2] == 's' && name[3] == 's') {
			iftitle = true;
		}
		//title could be "Prof"
		else if (name[0]=='P' && name[1]=='r' && name[2] == 'o' && name[3] == 'f') {
			iftitle = true;
		}
		//accounting for lowercase
		else if (name[0]=='p' && name[1]=='r' && name[2] == 'o' && name[3] == 'f') {
			iftitle = true;
		}
		//Esq. appears at end of a name
		else if (name[name.length-1]=='.') {
			iftitle = true;
		}

		return iftitle;
	}

	/**
	 * name definition
	 * assigned: c18ac1
	 * @param 
	 * @return
	 */
	//import dalton word
	
	/**
	 * random title
	 * assigned: bludetiger
	 * @param
	 * @return
	 */
	//list all possible titles
	//randomly generate one
	
	/**
	 * pig latin
	 * assigned: c18ck
	 * @param
	 * @return
	 */
	//see where first vowel is, pick all those letters then move it
	
	/** 
	 * consonant name (name in all consonants)
	 * assigned: c18ac1
	 * @param
	 * @return
	 */
	//find all consonants, just list those
	
	/**
	 * emoji per vowel
	 * assigned: c18rc
	 * @param
	 * @return
	 */
	//replace vowels with emojis
	//i's w/ hearts
	
	/**
	 * give people new middle name
	 * assigned: c18ac1
	 * @param
	 * @return
	 */
	//list of names in array then random gen to pick one
	
	/**
	 * combine names
	 * assigned: bludetiger
	 * @param
	 * @return
	 */
	//make combined name from 2 people
	
	/**
	 * password
	 * assigned: c18ck
	 * @param
	 * @return
	 */
	//generate password using initials and birth year
	
	/**
	 * username
	 * assigned: c18jj
	 * @param
	 * @return
	 */
	//generate username using something
	
	/**
	 * mash
	 * assigned: c18rc
	 * @param
	 * @return
	 */
	//make list of random baby names (approx 6) then choose one
	
	/**
	 * nickname generator
	 * assigned: c18ac1
	 * @param
	 * @return
	 */
	
	/**
	 * generate Dalton email
	 * assigned: bludetiger
	 * @param
	 * @return
	 */
	
	/**
	 * food name
	 * assigned: c18ck
	 * @param
	 * @return
	 */
	
	/**
	 * guess eye color
	 * assigned: c18jj
	 * @param
	 * @return
	 */
	
	/**
	 * vowel name (name in all vowels)
	 * assigned: c18rc
	 * @param
	 * @return
	 */
}