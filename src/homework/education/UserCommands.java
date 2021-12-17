package homework.education;

    public interface UserCommands {


    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";
    String PRINT_USER = "3";


    static void printCommands1() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + LOGIN + " for user's login");
        System.out.println("Please input " + REGISTER + " for register");
        System.out.println("Please input " + PRINT_USER + " for print user");
    }

}
