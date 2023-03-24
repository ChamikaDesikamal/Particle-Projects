public class Language {
    String languages;
    Language( String a ){
        languages= a;
        System.out.println(languages + " is Language.");
    }

    public static void main(String[] args) {
        Language l = new Language("sinhala");
        Language l1 = new Language("sinhala_1");
        Language l2 = new Language("sinhala_2");



    }


}
