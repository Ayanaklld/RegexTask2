public class RegexTask2 {
    public static void main(String[] args) {
        try {
            String path = "https://vk.com/profile/alex";
//            String path = "http://domain.zone/frag1/frag2/frag/frag4";
//            String path = "https://youtu.be";
            UrlParser urlParser = new UrlParser(path);
            System.out.println("Protocol: " + urlParser.getProtocol());
            System.out.println("Host: " + urlParser.getHost());
            System.out.println("URI: " + urlParser.getUri());
        } catch (NotValidUrlException e) {
            System.out.println("Invalid URL provided: " + e.getMessage());
        }
    }
}
