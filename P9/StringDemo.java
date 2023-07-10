public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello World");
        int ln=sb.length();
        char ch, c;
        for (int i=0; i<ln; i++) {
            c=0;
            ch=Character.toUpperCase(sb.charAt(i));
            switch(ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                c++;
                break;
            }
            if (c>0) {
                sb.deleteCharAt(i);
                ln--;
            }
        }
        System.out.println(sb);
    }
}