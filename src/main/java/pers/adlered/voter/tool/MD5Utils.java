package pers.adlered.voter.tool;

import org.springframework.util.DigestUtils;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by han on 2020/2/20.
 */
public class MD5Utils {
    public static String MD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
    public static String md5Hex(String str){
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
    public static String MD2(String mStr){
        try {
// 获取MD2加密工具
            MessageDigest md = MessageDigest.getInstance("MD2");
// 加密
            byte[] digest = md.digest(mStr.getBytes());

// 获取二进制十六进制互转工具
            HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
// 将二进制数组转换为十六进制字符串
            String marshal = hexBinaryAdapter.marshal(digest);
// 输出结果
            return marshal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
