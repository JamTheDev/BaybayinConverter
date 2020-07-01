package unirises;

import java.util.ArrayList;

public class BConv {
    String text;
    ArrayList<String> str = new ArrayList<>();

    public BConv(String s) {
        this.text = s;
    }

    public String convert() {
        char it = 0;
        char[] allChars = text.toCharArray();
        for (int i = 0; i < allChars.length - 1; i++) {
            char c = allChars[i];
            it = allChars[i + 1];

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                str.add( String.valueOf( c ) );
            } else {
                if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
                    str.add( c + "+" );
                } else {
                    str.add( String.valueOf( c ) );
                }
            }

        }

        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
            str.add( String.valueOf( it ) );
        } else {
            str.add( it + "+" );
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (String item : str) {
            stringBuilder.append( item );
        }
        return stringBuilder.toString();
    }


}
