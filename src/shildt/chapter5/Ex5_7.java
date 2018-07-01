package shildt.chapter5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex5_7 {
    public static void main(String[] args) {
        //шифрование строкой из 8 символов
        String msg = "JavaCore";
        String key = "password";
        Encode encode = new Encode();
        String encodeStr = encode.encode(msg, key);
        System.out.println(encodeStr);
        String decodeStr = encode.decode(encodeStr, key);
        System.out.println(decodeStr);
    }
}
class Encode{
    private StringBuffer encodeString;
    private StringBuffer decodeString;

    public Encode(){
        encodeString = new StringBuffer();
        decodeString = new StringBuffer();
    }


    public String encode(String msg, String key){
        StringBuffer encodeKey = new StringBuffer(key);
        for(int i = 0; i < msg.length(); i++){
            encodeString.append((char)(msg.charAt(i) ^ encodeKey.charAt(i)));
            encodeKey.append(encodeKey.charAt(i));

        }
        String str = new String(encodeString);
        return str;
    }
    public String decode(String msg, String key){
        StringBuffer decodeKey = new StringBuffer(key);
        for(int i = 0; i < msg.length(); i++){
            decodeString.append((char)(msg.charAt(i) ^ decodeKey.charAt(i)));
            decodeKey.append(decodeKey.charAt(i));
        }
        String str = new String(decodeString);
        return str;
    }
}
