import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public  class RectangleTest  {
    @Test
    void shouldReturnArea8WhenLengthIs2AndBreadthIs4() {

        RectangleArea rectangle=new RectangleArea();
        int result=rectangle.calculateArea(2,4);
        assertThat(8,equalTo(result));

    }
}
