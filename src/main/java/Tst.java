import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Tst {
    public static void main(String... args){
        var engineManager = new ScriptEngineManager();
        var factories = engineManager.getEngineFactories();
        for (ScriptEngineFactory factory : factories){
            System.out.printf("%s ", factory);
        }
    }
}
