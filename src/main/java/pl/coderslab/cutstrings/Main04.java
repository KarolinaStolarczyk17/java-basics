package pl.coderslab.cutstrings;

public class Main04 {

    public static void main(String[] args) {

        String str = "Java-zadania-podzial-napisow";
        System.out.println(onlyTwoElements(str,'-'));

    }
        public static String[] onlyTwoElements (String str,char separator){
            String cos = "-";
            cos+=separator;
            String[] parts = str.split(cos, 1);

        }
    }

