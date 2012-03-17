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

/**
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class EncodeUtils {
	
	public static int toIntBE(byte[] b, int i) {
		return ((b[i+0] << 24) + (b[i+1] << 16) + (b[i+2] << 8) + (b[i+3] << 0));
	}

	public static int toIntLE(byte[] b, int i) {
		return ((b[i+3] << 24) + (b[i+2] << 16) + (b[i+1] << 8) + (b[i+0] << 0));
	}
	
	public static long toLongBE(byte[] b, int offset) {
		
		return (((long)b[offset+0] << 56) +
				((long)(b[offset+1] & 255) << 48) +
				((long)(b[offset+2] & 255) << 40) +
				((long)(b[offset+3] & 255) << 32) +
				((long)(b[offset+4] & 255) << 24) +
				((b[offset+5] & 255) << 16) +
				((b[offset+6] & 255) <<  8) +
				((b[offset+7] & 255) <<  0));
		
	}

	public static long toLongLE(byte[] b, int offset) {
		
		return (((long)b[offset+7] << 56) +
				((long)(b[offset+6] & 255) << 48) +
				((long)(b[offset+5] & 255) << 40) +
				((long)(b[offset+4] & 255) << 32) +
				((long)(b[offset+3] & 255) << 24) +
				((b[offset+2] & 255) << 16) +
				((b[offset+1] & 255) <<  8) +
				((b[offset+0] & 255) <<  0));
		
	}
	
}
