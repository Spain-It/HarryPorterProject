package Pages;

import java.util.HashMap;

public abstract class basePage {
    static HashMap scenarioContext=new HashMap();

    public void set(ScenarioContext.ContextKey key, Object value){

        scenarioContext.put(key,value);
    }

    public static Object get(ScenarioContext.ContextKey key){
        return scenarioContext.get(key);
    }
}
