import org.apache.lucene.search.spell.JaroWinklerDistance;
import org.apache.lucene.search.spell.LevensteinDistance;

public class TestBatch {

    public static void main(String[] arg) throws Exception {

        String one = "今日の東京は非常に寒いです。でも、天気は快晴ですよ！";
        String two = "今日の京都は非常に暑いです。";

        //1に近いほど似ている
        LevensteinDistance l_algo = new LevensteinDistance();

        JaroWinklerDistance j_algo = new JaroWinklerDistance();

        System.out.println("実行結果(LevensteinDistance):" + l_algo.getDistance(one,two));
        System.out.println("実行結果(JaroWinklerDistance):" + j_algo.getDistance(one,two));

    }

}