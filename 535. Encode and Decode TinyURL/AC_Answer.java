public class Codec {
    
    private String enciper = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuioplkjhgfdsazxcvbnm019837465";
    private Map<String, String> encoded = new HashMap<>();;
    private Map<String, String> cipher = new HashMap<>();
    private Random rd = new Random();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(encoded.containsKey(longUrl)){
            return "http://tinyurl.com/" + encoded.get(longUrl);
        }
        String code = generate();
        while(cipher.containsKey(code)) code = generate();
        cipher.put(code, longUrl);
        encoded.put(longUrl, code);
        return "http://tinyurl.com/" + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] separation = shortUrl.split("/");
        return cipher.get(separation[separation.length-1]);
    }
    
    public String generate(){
        int i=6;
        String code = "";
        while(i>0){
            code += enciper.charAt(rd.nextInt(enciper.length()));
            i--;
        }
        return code;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
