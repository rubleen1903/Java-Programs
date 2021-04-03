import java.util.*;
import java.io.*;
class Cfile
{
            public static void main(String args[])throws IOException
            {
                        int nl=1,nw=0;           
                        char ch;
                        Scanner scr=new Scanner(System.in);
System.out.println("Rubleen Kaur - 07613203118");
                        System.out.print("\nEnter File name: ");
                        String str=scr.nextLine();
                        FileInputStream f=new FileInputStream(str);
                        int n=f.available();
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)f.read();
                                    if(ch=='\n')
                                    nl++;
                                    else if(ch==' ')
                                                nw++;
                                                                       
                        }
                        System.out.println("\nNumber of lines : "+nl);
                        System.out.println("\nNumber of words : "+(nl+nw));
                        System.out.println("\nNumber of characters : "+n);
                       

            }
}

