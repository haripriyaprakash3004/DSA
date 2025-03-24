public class Codec {
    static final Map<String,String> map = new HashMap<>();
    static final String BASE_HOST = "http://tinyurl.com";
    static final Random rand = new Random();
    public String getRandomKey(){
        String Characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<6;i++){
            sb.append(Characters.charAt(rand.nextInt(Characters.length())));
        }
        return sb.toString();
    }
    public String encode(String longUrl) {
        String key = getRandomKey();
        String shortUrl = BASE_HOST + key;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));