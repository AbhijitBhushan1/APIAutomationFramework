package Utils;

import sun.awt.windows.ThemeReader;

import java.util.HashMap;
import java.util.Map;

public class UniversalHeader {
    public static Map<String,String> header;
    public static Map<String,String> getHeader()
    {
        header=new HashMap<>();
        header.put("Content-Type","application/json");
        header.put("Authorization","Bearer "+"abc6873022444258af9b83e819278302ee529da099c0c779fafc2e454b3ee784");
        return header;
    }
}
