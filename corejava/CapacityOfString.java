public class CapacityOfString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder( 150);
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(1));

        
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
    
}
