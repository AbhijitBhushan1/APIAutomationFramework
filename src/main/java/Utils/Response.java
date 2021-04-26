package Utils;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private Integer statusCode;
    private String body;
    private String statusline;
}
