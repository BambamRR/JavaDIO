import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> BrazilState = new HashMap<>();
        BrazilState.put("PE", "Pernambuco");
        BrazilState.put("AC","Acre");
        BrazilState.put("AP","Amapá");
        BrazilState.put("Al","Alagoas");
        BrazilState.put("AM","Amazonas");
        BrazilState.put("BA","Bahia");
        BrazilState.put("CE","Ceará");
        BrazilState.put("ES","Espirito Santo");
        BrazilState.put("GO","Goiás");
        BrazilState.put("MA","Maranhão");
        BrazilState.put("MT","Mato Grosso");
        BrazilState.put("MS","Mato Grosso do Sul");
        BrazilState.put("MG","Minas Gerais");
        BrazilState.put("PA","Pará");
        BrazilState.put("PB","Paraíba");
        BrazilState.put("PR","Paraná");
        BrazilState.put("PI","Piauí");
        BrazilState.put("RJ","Rio de Janeiro");
        BrazilState.put("RN","Rio Grande do Norte");
        BrazilState.put("RS","Rio Grande do Sul");
        BrazilState.put("RO","Rondonia");
        BrazilState.put("RR","Roraima");
        BrazilState.put("SC","Santa Catarina");
        BrazilState.put("SP","São Paulo");
        BrazilState.put("SE","Sergipe");
        BrazilState.put("TO","Tocantins");

        System.out.println(BrazilState); //Print complete list

        BrazilState.remove("MG");
        //Verify if contains the value
        System.out.println(BrazilState.containsValue("Minas Gerais"));

        BrazilState.put("DF", "Distrito Federal");

        BrazilState.remove("Mato Grosso do Sul");

        Iterator<String> iterator = BrazilState.keySet().iterator();

        for(Map.Entry<String, String> mapNav: BrazilState.entrySet()){
            System.out.println(mapNav.getValue() + "(" + mapNav.getKey() + ")");
        }







    }




}
