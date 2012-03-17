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

import org.junit.Test;

/**
 * MurmurHash1のテスト。
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class MurmurHash1TestCase {

	@Test
	public void test() throws Exception {
		
		final String filename = "/testdata1.txt";
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						MurmurHash1TestCase.class.getResourceAsStream(filename), 
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
			
			assertThat(EncodeUtils.toUnsigned(MurmurHash1.digest32(data, seed, false)), is(expect));
			
		}
		
	}
	
}
