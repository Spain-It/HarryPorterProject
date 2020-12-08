package Pages;

import java.util.HashMap;

public class ScenarioContext extends basePage {



    public ScenarioContext(){
        scenarioContext = new HashMap();
    }

    public enum ContextKey{
    Character,
    NoKeyCharacter,
     Days

    }
}
