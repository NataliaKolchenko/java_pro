package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class GeometricHolderTest {
    //    private List<Geometric> geometricList = new ArrayList<>();
    private static final GeometricHolder HOLDER = new GeometricHolder();
    private List<Geometric> innerList = HOLDER.getGeometricList();
    private Geometric geometric;

    @BeforeEach
    void setUp() {
        innerList.clear();
    }

    @Test
    void addToListPositiveTest() {
        geometric = new Geometric();
        HOLDER.addToList(geometric);
        assertEquals(1, innerList.size());
    }

    @Test
    void addToListWithExceptionTest() {
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToList(null));
    }

    @Test
    void addToSet() {
    }

    @Test
    void addToMap() {
    }

    @Test
    void getGeometricList() {
    }

    @Test
    void getGeometricSet() {
    }

    @Test
    void getGeometricMap() {
    }

    @Test
    void getListSize() {
    }

    @Test
    void getSetSize() {
    }

    @Test
    void getMapSize() {
    }
}