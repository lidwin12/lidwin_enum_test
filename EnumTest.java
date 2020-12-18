import java.util.ArrayList;
import java.util.List;

public class EnumTest {


    public static void main(String args[]) {
        List<RuleAlg> ruleAlgList = new ArrayList<>();

        ruleAlgList.add(RuleAlgUS.ABC);
        ruleAlgList.add(RuleAlgUS.XYZ);
        ruleAlgList.add(RuleAlgCA.ABC);
        ruleAlgList.add(RuleAlgCA.XYZ);

        for(RuleAlg ruleAlg : ruleAlgList) {
            System.out.println(ruleAlg.getRuleName());
            System.out.println(ruleAlg.getRuleId());
        }

        String inputRule = "ABC";

        RuleAlg[] algArray = RuleAlgUS.values();
        for(RuleAlg alg : algArray) {
            if(alg.toString().equals(inputRule)) {
                System.out.println(alg.getRuleId());
            }
        }

        RuleAlg alg = RuleAlgUS.ABC;
        System.out.println(alg.getRuleId());
    }


    static interface RuleAlg {
         String getRuleName();
         int getRuleId();
    }

    static enum RuleAlgUS implements RuleAlg {
        ABC("ABC", 1), XYZ("XYZ", 2);

        String ruleName;
        int ruleId;

        RuleAlgUS(String ruleName, int ruleId){
            this.ruleName = ruleName;
            this.ruleId = ruleId;
        }

        public String getRuleName(){
            return ruleName;
        }
        public int getRuleId(){
            return ruleId;
        }
    }

    static enum RuleAlgCA implements RuleAlg {
        ABC("ABC", 3), XYZ("XYZ", 4);

        String ruleName;
        int ruleId;

        RuleAlgCA(String ruleName, int ruleId){
            this.ruleName = ruleName;
            this.ruleId = ruleId;
        }

        public String getRuleName(){
            return ruleName;
        }
        public int getRuleId(){
            return ruleId;
        }
    }
}

