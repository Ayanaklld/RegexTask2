import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {
    private String protocol;
    private String host;
    private String uri;

    public UrlParser(String url) throws NotValidUrlException {
        Pattern pattern = Pattern.compile("^(https?://)([^/]+)(/.*)?$");
        Matcher matcher = pattern.matcher(url);

        if (matcher.matches()){
            this.protocol = matcher.group(1);
            this.host = matcher.group(2);
            this.uri = matcher.group(3) != null ? matcher.group(3) : "";
        } else {
            throw new NotValidUrlException("Invalid URL");
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getUri() {
        return uri;
    }
}
