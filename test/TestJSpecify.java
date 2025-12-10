import static com.google.common.truth.Truth.assertThat;
import org.jspecify.annotations.Nullable;

public class TestJSpecify {
    @Nullable
    String name = null;

    @org.junit.Test
    public void testNull() {
        assertThat(name).isNull();
    }
}
