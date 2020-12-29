
import java.util.*;

public class EnumTest1 {


    public static void main(String args[]) {
        RuleAlg alg = RuleAlg.ABC3;
        System.out.println(alg.getRuleName());
        Map countryMap = alg.getCountryAndTier();

        String code = (String) countryMap.get("US");
        System.out.println(code);
    }


    enum RuleAlg {
        ABC1("ABC1","US:1,CA:2"),
        ABC2("ABC2","US:4,CA:3"),
        ABC3("ABC3","US:6");

        String ruleName;
        String countryAndTier;

        RuleAlg(String ruleName, String countryAndTier) {
            this.ruleName = ruleName;
            this.countryAndTier = countryAndTier;
        }

        public String getRuleName() {
            return ruleName;
        }

        public Map getCountryAndTier() {
            Map<String, String> countryAndTierMap = new HashMap<>();

            String[] countryAndTierStr = countryAndTier.split(",");
            for(int i  = 0; i < countryAndTierStr.length; i++ ) {
                String countryAndTierStr1 = countryAndTierStr[i];
                String[] countryAndTierStr2 = countryAndTierStr1.split(":");
                countryAndTierMap.put(countryAndTierStr2[0], countryAndTierStr2[1]);
            }
            return countryAndTierMap;
        }
    }

}

