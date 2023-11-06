package util;


import java.util.logging.Logger;

public class UtilReflection {
    public static final Logger log = Logger.getLogger("POC-Reflection");

    private UtilReflection(){}

    public static Logger log(){
        return log;
    }
}
