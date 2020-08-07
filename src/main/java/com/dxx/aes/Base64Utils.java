package com.dxx.aes;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

/**
 * <b>功能：</b>Base64工具类<br>
 * <ul>
 * <hr>
 * </ul>
 */
public class Base64Utils {

	/**
	 * <b>功能描述：</b>BASE64字符串解码为二进制数据<br>
	 * <b>修订记录：</b><br>
	 * @return 二进制数组
	 */
	public static byte[] decode(String base64) {
		return Base64.decodeBase64(base64.getBytes(Charset.forName("UTF-8")));
	}

	/**
	 * <b>功能描述：</b>进制数据编码为BASE64字符串<br>
	 * <b>修订记录：</b><br>
	 * @return String
	 */
	public static String encode(byte[] bytes) {
		return new String(Base64.encodeBase64(bytes), Charset.forName("UTF-8"));
	}
}