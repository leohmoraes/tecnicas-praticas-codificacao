public class StringUtil {


    public static String padleft(String s, int largura, char pad) {
    	
        char[] chars = s.toCharArray();

        int faltam = largura - chars.length;

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < faltam) stringComPad[i] = pad;
            else stringComPad[i] = chars[i - faltam];
        }

        return new String(stringComPad);
    }

    public static String padright(String s, int largura, char pad) {
    	
        char[] chars = s.toCharArray();

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < chars.length) stringComPad[i] = chars[i];
            else stringComPad[i] = pad;
        }

        return new String(stringComPad);
    }

    public static String padcenter(String s, int largura, char pad) {

        char[] chars = s.toCharArray();

        int pads = largura - chars.length; // 10 - 5 = 5

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < pads / 2) stringComPad[i] = pad;
            else if (i >= pads / 2 + chars.length) stringComPad[i] = pad;
            else stringComPad[i] = chars[i - pads / 2]; 
        }

        return new String(stringComPad);
    }

}
