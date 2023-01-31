
package preasses;

public class RecordIn {
    private final int code;
    private final String name;
    private final String Pre;
    
    RecordIn(int code, String name, String Pre){
        this.code = code;
        this.name = name;
        this.Pre = Pre;
    }
    
    public int getCode(){
    return code;
    }
    public String getName(){
    return name;
    }
    public String getpre(){
    return Pre; 
    }
    public String toString(){
    return code+" "+name+" "+Pre;
    }
}
