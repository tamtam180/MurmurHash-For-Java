/**
 * 
 */
package at.orz.hash;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import org.junit.Test;

/**
 * @author tamtam
 *
 */
public class MurmurHash1TestCase {

	@Test
	public void test() throws Exception {
		
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
//				new File("/home/tamtam/work/smhasher-read-only/Platform.h")));
//		byte[] buf = new byte[1024];
//		int len;
//		while ((len = in.read(buf)) != -1) {
//			out.write(buf, 0, len);
//		}
//		in.close();
//		
//		MurmurHash1 hash1 = new MurmurHash1();
//		long h = 0xffffffffL & hash1.digest(out.toByteArray(), 12345, false);
//		
//		System.out.println(h);
//		
//		System.out.println(0xffffffffL & MurmurHash2.digest32(out.toByteArray(), 12345, false));
//		System.out.println(MurmurHash2.digest64(out.toByteArray(), 12345L, false));
//		
//		System.out.println("-----");
//		System.out.println(MurmurHash3.digest32_x86(out.toByteArray(), 12345, false));
//
//		int[] xx = MurmurHash3.digest128_x86(out.toByteArray(), 12345, false);
//		System.out.println("-----");
//		System.out.println(xx[0]);
//		System.out.println(xx[1]);
//		System.out.println(xx[2]);
//		System.out.println(xx[3]);
//		
//		long[] yy = MurmurHash3.digest128_x64(out.toByteArray(), 12345, false);
//		System.out.println("-----");
//		System.out.println(yy[0]);
//		System.out.println(yy[1]);
		
	}
	
}
