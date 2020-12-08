package Pages;

import static java.util.Arrays.stream;


public enum  EndPoints {

    CHARACTERS("char","/characters");



    private final String description;
    private final String url;




    EndPoints(String description, String url) {
        this.description = description;
        this.url = url;
    }
    public String getDescription(){
        return description;
    }

    public String getUrl(){
        return url;
    }

    public static EndPoints toEnum(String description){
        return stream(values()).filter(l -> l.description.equals(description)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(description + "not found"));
    }
    public static EndPoints  toEnum2(String description){
        return valueOf(description);
    }
}
