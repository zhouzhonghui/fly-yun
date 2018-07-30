package cn.fly.yun.config.utils;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class DesEncrypt {

	public static String getMd5(String s) {
		return getMd5(s, "utf-8");
	}

	public static String getMd5(String s, String encoding) {
		byte abyte0[] = null;
		MessageDigest messagedigest;
		try {
			messagedigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException nosuchalgorithmexception) {
			throw new IllegalArgumentException("no md5 support");
		}
		try {
			messagedigest.update(s.getBytes(encoding));
		} catch (UnsupportedEncodingException e) {
			return null;
		}
		abyte0 = messagedigest.digest();
		return byte2hex(abyte0);
	}

	public static String byte2hex(byte abyte0[]) {
		StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
		for (int i = 0; i < abyte0.length; i++) {
			if ((abyte0[i] & 0xff) < 16) {
				stringbuffer.append("0");
			}
			stringbuffer.append(Long.toString((long) abyte0[i] & (long) 255, 16));
		}

		return stringbuffer.toString().toUpperCase();
	}


}
