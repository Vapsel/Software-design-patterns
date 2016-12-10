/**
 * Created by Vadym on 11/16/2016.
 */
public class Adapter {

    private OldLogger oldLogger;

    public Adapter(OldLogger oldLogger) {
        this.oldLogger = oldLogger;
    }

    public void newLog(String string){
        oldLogger.log(string.getBytes());
    }
}
