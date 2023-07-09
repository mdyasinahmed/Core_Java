public class stringBuilder{
    public static void main(String args[]){
        String str = "h";
        str += "e";
        str += "l";
        str += "l";
        str += "o";

        System.out.println(str);


        //Declaring String builder
        StringBuilder sb = new StringBuilder("Yasin");
        System.out.println(sb);

        // String Builder Functions:
        /**
         * CharAt
         * Set Character At Index
         * Insert
         * Delete
         * Append
         * Length
         */
        // CharAt
        System.out.println(sb.charAt(0)); // -> Y

        // Set Char at Index
        // sb = sb.SetChar(0,E);

        //insert
        sb.insert(0,'M');
        System.out.println(sb);

        //delete
        // sb.delete(1,1)
        // System.out.println(sb);

        //append

        StringBuilder stb = new StringBuilder("B");

        stb.append("A");
        stb.append("N");
        stb.append("G");
        stb.append("L");
        stb.append("A");
        stb.append("D");
        stb.append("E");
        stb.append("S");
        stb.append("H");

        System.out.println(stb);

        // length
        System.out.println("StringBuilder Length is: " + sb.length());
    }
}