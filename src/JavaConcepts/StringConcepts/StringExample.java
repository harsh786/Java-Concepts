package JavaConcepts.StringConcepts;

public class StringExample {

    public static void main(String[] args) {

        String str1="harsh";
        String str2=new String("harsh");

        str2.contains("ha");
        str2.charAt(0);
        str2.compareTo("harsh");
        str2.concat("kumar");
        str2.startsWith("ha");
        str2.endsWith("ar");
        str2.trim();
        str2.indexOf("ha");
        str2.lastIndexOf("ar");
        str2.isEmpty();
        str2.length();
        str2.toLowerCase();
        str2.toUpperCase();
        str2.split(" ");
        str2.lines();
        str2.replace('a','s');
        str2.substring(0,2);
        char[] arr= str2.toCharArray();
        int len=arr.length;
        str2.intern();


        StringBuilder builder=new StringBuilder("harsh");
        builder.append('c');
        builder.append(true);
        builder.indexOf("har");
        builder.compareTo(new StringBuilder("har"));
        builder.delete(3,4);
        builder.deleteCharAt(4);
        builder.substring(5);
        builder.reverse();
        builder.setCharAt(2,'r');
        builder.insert(3,'c');
        builder.length();



    }
}
