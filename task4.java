class studentname
{
	public static void main(String[] args)
	{
		String[] position = {
			 "First", "Second", "Third", "Fourth", "Fifth",
            "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"
		};
		
		System.out.println("Number of arguments = " + args.length);
		
		for(int i=0; i < args.length; i++)
		{
			System.out.println((i + 1) + ".:" + position[i] + "Student Name is = " + args[i]);
		}
	}
}
