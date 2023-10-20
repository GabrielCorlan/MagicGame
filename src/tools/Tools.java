package tools;

public class Tools {

    public static void colorfulPrint(String message, String color) {
        System.out.println(color + message + Colors.RESET);
    }

    public static void typeSpecificColorfulPrint(String message, String type) {
        String color;

        switch (type) {
            case "class characters.goodGuys.Elf":
                color = Colors.GREEN;
                break;
            case "class characters.goodGuys.Wizard":
                color = Colors.BLUE;
                break;
            case "class characters.goodGuys.Knight":
                color = Colors.BLACK_BOLD;
                break;
            case "class characters.badGuys.Goblin":
                color = Colors.GREEN_BRIGHT;
                break;
            case "class characters.badGuys.Orc":
                color = Colors.YELLOW_BOLD;
                break;
            case "class characters.badGuys.Troll":
                color = Colors.CYAN;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        System.out.println(color + message + Colors.RESET);
    }
}
