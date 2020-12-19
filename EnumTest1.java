
import java.util.ArrayList;
import java.util.List;

public class EnumTest1 {


    public static void main(String args[]) {

        RuleAlg alg = RuleAlg.ABC1;
        System.out.println(alg.getRuleNameUS());
        System.out.println(alg.getRuleIdUS());
        System.out.println(alg.getRuleNameCA());
        System.out.println(alg.getRuleIdCA());

        RuleAlg alg2[] = RuleAlg.values();

        System.out.println("Enum Values");

        for(RuleAlg algTemp : alg2) {
            System.out.println(algTemp.name());
            System.out.println(algTemp.getRuleNameUS());
            System.out.println(algTemp.getRuleIdUS());
            System.out.println(algTemp.getRuleNameCA());
            System.out.println(algTemp.getRuleIdCA());
        }
    }


    enum RuleAlg {
        ABC1("US", 1, "CA", 11),
        ABC2("US", 2, "CA", 22),
        ABC3("US", 3, "CA", 33),
        ABC4("US", 4),
        ABC5("US", 5);

        String ruleNameUS;
        int ruleIdUS;

        String ruleNameCA;
        int ruleIdCA;

        RuleAlg(String ruleNameUS, int ruleIdUS, String ruleNameCA, int ruleIdCA){
            this.ruleNameUS = ruleNameUS;
            this.ruleIdUS = ruleIdUS;
            this.ruleNameCA = ruleNameCA;
            this.ruleIdCA = ruleIdCA;
        }

        RuleAlg(String ruleNameUS, int ruleIdUS){
            this.ruleNameUS = ruleNameUS;
            this.ruleIdUS = ruleIdUS;
        }

        public String getRuleNameUS(){
            return ruleNameUS;
        }
        public int getRuleIdUS(){
            return ruleIdUS;
        }

        public String getRuleNameCA(){
            return ruleNameCA;
        }
        public int getRuleIdCA(){
            return ruleIdCA;
        }
    }
}

