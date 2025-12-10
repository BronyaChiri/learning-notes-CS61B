import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
import org.jspecify.annotations.Nullable;
public class average {
    public static void main(String[] args){
        int a=3,b=7,avg=0;


    }
    public average(){

    }

    public static double tripple(double a){
        double c=0;
        c = 3.0*a;
        return c;
    }

    @Test
    public void commonnum(){
        double input=2.0;
        double expected=6.0;
        double actual = average.tripple(input);
        assertThat(actual).isEqualTo(expected);
    }
}
