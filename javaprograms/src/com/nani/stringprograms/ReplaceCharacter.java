package com.nani.stringprograms;

public class ReplaceCharacter {
	
	public static void main(String[] args)
	{
		String n ="nanaji munasala";
		/* Replace Characters */
		System.out.println("Replace a with i "+ n.replace('a', 'i'));
		
		/* Contains method */
		
        System.out.println("Contains nanaji name in it "+ n.contains("nanaji"));
        
        /* replace old string with new String */
        
        System.out.println("Replacing the nanaji name with nani => "+n.replace("nanaji", "nani"));
        
        /*check name starts with nanaji or not */
        
        System.out.println("Check the name starts with => "+n.startsWith("Nanaji".toLowerCase()));
		
	}

}
