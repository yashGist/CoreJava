package exercise4_14;

public class CommandLineArgs {

	public static void commLineArgsPickUp(String[] args) {
		
		int key= args.length;

		switch (key) {
		case 0:
			System.out.println("case 0");
			break;
		case 1:

			System.out.println("case 1");
			break;

		case 2:

			System.out.println("case 2");
			break;

		default:
			for (int i = 0; i <args.length; i++) {
				System.out.println(args[i]);
			}
			break;
		}

	}

	public static void main(String[] args) {
		CommandLineArgs.commLineArgsPickUp(args);
	}

}
