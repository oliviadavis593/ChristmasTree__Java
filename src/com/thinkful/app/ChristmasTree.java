package com.thinkful.app; 

public class ChristmasTree {

    public static void main(String[] args ) {

      final String lineBreak = System.getProperty("line.separator");
       StringBuffer sb = new StringBuffer();

        sb.append("    * ");
        sb.append(lineBreak);
        sb.append("   *** ");
        sb.append(lineBreak);
        sb.append("  ***** ");
        sb.append(lineBreak);
        sb.append("   ***  ");
        sb.append(lineBreak);
        sb.append("  ***** ");
        sb.append(lineBreak);
        sb.append(" ******* ");
        sb.append(lineBreak);
        sb.append(" ********* ");
        sb.append(lineBreak);
        sb.append("  ******* ");
        sb.append(lineBreak);
        sb.append(" *********");
        sb.append(lineBreak);
        sb.append("***********");
        sb.append(lineBreak);
        sb.append("*************");
        sb.append(lineBreak);
        sb.append("    ***    ");
        sb.append(lineBreak);
        sb.append("    ***    ");
        sb.append(lineBreak);
        sb.append("    ***    ");

        System.out.println(sb.toString());
    }
}