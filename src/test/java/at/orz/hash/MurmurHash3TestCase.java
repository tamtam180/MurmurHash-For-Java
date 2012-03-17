/*
 * Copyright (C) 2012 tamtam180
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.orz.hash;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

import org.junit.Test;

/**
 * MurmurHash1のテスト。
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class MurmurHash3TestCase {

	@Test
	public void test_x86_32() throws Exception {
		
		final String filename = "/testdata3_x86_32.txt";
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						MurmurHash3TestCase.class.getResourceAsStream(filename), 
						"utf-8"
						));
		
		String line;
		while ((line = in.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty()) {
				continue;
			}
			String[] items = line.split("\t");
			byte[] data = items[0].getBytes("utf-8");
			int seed = Integer.parseInt(items[1]);
			long expect = Long.parseLong(items[2]);
			
			assertThat(expect, is(EncodeUtils.toUnsigned(MurmurHash3.digest32_x86(data, seed, false))));
			
		}
		
	}

	@Test
	public void test_x86_128() throws Exception {
		
		final String filename = "/testdata3_x86_128.txt";
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						MurmurHash3TestCase.class.getResourceAsStream(filename), 
						"utf-8"
						));
		
		String line;
		while ((line = in.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty()) {
				continue;
			}
			String[] items = line.split("\t");
			byte[] data = items[0].getBytes("utf-8");
			int seed = Integer.parseInt(items[1]);
			long expect1 = Long.parseLong(items[2]);
			long expect2 = Long.parseLong(items[3]);
			long expect3 = Long.parseLong(items[4]);
			long expect4 = Long.parseLong(items[5]);
			
			int[] values = MurmurHash3.digest128_x86(data, seed, false);
			assertThat(expect1, is(EncodeUtils.toUnsigned(values[0])));
			assertThat(expect2, is(EncodeUtils.toUnsigned(values[1])));
			assertThat(expect3, is(EncodeUtils.toUnsigned(values[2])));
			assertThat(expect4, is(EncodeUtils.toUnsigned(values[3])));
			
		}
		
	}

	@Test
	public void test_x64_128() throws Exception {
		
		final String filename = "/testdata3_x64_128.txt";
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						MurmurHash3TestCase.class.getResourceAsStream(filename), 
						"utf-8"
						));
		
		String line;
		while ((line = in.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty()) {
				continue;
			}
			String[] items = line.split("\t");
			byte[] data = items[0].getBytes("utf-8");
			int seed = Integer.parseInt(items[1]);
			BigInteger expect1 = new BigInteger(items[2]);
			BigInteger expect2 = new BigInteger(items[3]);
			
			long[] values = MurmurHash3.digest128_x64(data, seed, false);
			
			assertThat(EncodeUtils.toUnsigned(values[0]), is(expect1));
			assertThat(EncodeUtils.toUnsigned(values[1]), is(expect2));
			
		}
		
	}


}
