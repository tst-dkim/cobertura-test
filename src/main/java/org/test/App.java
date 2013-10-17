package org.test;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
			List<byte[]> values = new ArrayList<byte[]>();
			String c = "F";

			for (int i=0;i < 35;i++){
				byte val[] = new byte[1];
				val[0] = Byte.parseByte(c);
				values.add(val);
			}

			for (byte val[]: values){
				System.out.println(val);	
			}
    }
}
