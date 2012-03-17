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
 * byte配列を整数に変換するユーティリティクラス。
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class EncodeUtils {
	
	/**
	 * byte配列のi番目から4バイト読み取り、BigEndianとみなした整数を返す。
	 * @param b データ
	 * @param i オフセット
	 * @return BigEndianとみなした整数
	 */
	public static int toIntBE(byte[] b, int i) {
		return ((b[i+0] << 24) + (b[i+1] << 16) + (b[i+2] << 8) + (b[i+3] << 0));
	}

	/**
	 * byte配列のi番目から4バイト読み取り、LittleEndianとみなした整数を返す。
	 * @param b データ
	 * @param i オフセット
	 * @return LittleEndianとみなした整数
	 */
	public static int toIntLE(byte[] b, int i) {
		return ((b[i+3] << 24) + (b[i+2] << 16) + (b[i+1] << 8) + (b[i+0] << 0));
	}
	
	/**
	 * byte配列のi番目から8バイト読み取り、BigEndianとみなした整数を返す。
	 * @param b データ
	 * @param i オフセット
	 * @return BigEndianとみなした整数
	 */
	public static long toLongBE(byte[] b, int i) {
		
		return (((long)b[i+0] << 56) +
				((long)(b[i+1] & 255) << 48) +
				((long)(b[i+2] & 255) << 40) +
				((long)(b[i+3] & 255) << 32) +
				((long)(b[i+4] & 255) << 24) +
				((b[i+5] & 255) << 16) +
				((b[i+6] & 255) <<  8) +
				((b[i+7] & 255) <<  0));
		
	}

	/**
	 * byte配列のi番目から8バイト読み取り、LittleEndianとみなした整数を返す。
	 * @param b データ
	 * @param i オフセット
	 * @return LittleEndianとみなした整数
	 */
	public static long toLongLE(byte[] b, int i) {
		
		return (((long)b[i+7] << 56) +
				((long)(b[i+6] & 255) << 48) +
				((long)(b[i+5] & 255) << 40) +
				((long)(b[i+4] & 255) << 32) +
				((long)(b[i+3] & 255) << 24) +
				((b[i+2] & 255) << 16) +
				((b[i+1] & 255) <<  8) +
				((b[i+0] & 255) <<  0));
		
	}
	
}
