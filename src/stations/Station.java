package stations;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Station {
    private final String name;
    private final String ip;

    public Station(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public String getName() {
            return name;
    }
    public String getRusName() {
        try {
            return new String(name.getBytes("windows-1251"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getIp() {
        return ip;
    }
}
