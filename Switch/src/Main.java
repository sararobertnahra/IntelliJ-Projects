public class Main {
    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.printf("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        int outroValor = 3;
        switch (outroValor){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + outroValor);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // yield é uma palavra-chave introduzida para a expressão switch, para retornar um valor de volta.
            }
        };
    }
}