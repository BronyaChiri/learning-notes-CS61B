import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class Avg {
    public static void main(String[] args){

        System.out.println("Hello world");
    }
    
    @Test
    public static void testIsTrue(){
        int input = 5;
        int expect = 15;
        float actual = Avg.triple(input);
        assertThat(actual).isEqualTo(expect);

    }
    public static float triple(int x ){
        float triplex = 3*x ;
        return triplex;
    }
}
