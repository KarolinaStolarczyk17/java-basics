package pl.coderslab.methods;

public class Main04 {
    public static void main(String[] args) {
        String createName1 = createName ("Karolina", "Stolarczyk", "Kajusia");
        System.out.println(createName1);

    }


        public static String createName (String name, String surname, String nickname) {

String createName = name + " " + nickname + " " + surname;
return createName;
        }
    }