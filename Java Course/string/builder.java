package string;

public class builder {
    public static void main(String args[]) {
        StringBuilder sb= new StringBuilder("shravan");
        System.out.println(sb);
        //char at index
        //System.out.println(sb.charAt(2));
        sb.setCharAt(4, 'w');
        System.out.println(sb);
        sb.insert(0, 'p');
        System.out.println(sb);
        //delete the extra p
        sb.delete(0, 1);
        System.out.println(sb);
        //append
        sb.append(" love");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
