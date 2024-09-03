package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class GeometricHolderTest {
    //    private List<Geometric> geometricList = new ArrayList<>();
    private static final GeometricHolder HOLDER = new GeometricHolder();
    private List<Geometric> innerList = HOLDER.getGeometricList();
    private Set<Geometric> innerSet = HOLDER.getGeometricSet();
    private Map<Double, Geometric> innerMap = HOLDER.getGeometricMap();
    private Geometric geometric;

    @BeforeEach
    void setUp() {
        innerList.clear();
        innerSet.clear();
        innerMap.clear();
        geometric = new Geometric();
    }

    @Test
    void addToListPositiveTest() {
        HOLDER.addToList(geometric);
        assertEquals(1, innerList.size());
        assertTrue(innerList.contains(geometric));
    }

    @Test
    void addToListWithNullExceptionTest() {
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToList(null));
    }

    @Test
    void addToSet() {
        HOLDER.addToSet(geometric);
        Set<Geometric> set = HOLDER.getGeometricSet();

        assertEquals(1, set.size());
        assertTrue(set.contains(geometric));
    }

    @Test
    void addToSettWithNullExceptionTest() {
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToSet(null));
    }

    @Test
    void addToMapTest() {
        HOLDER.addToMap(1.0, geometric);
        Map<Double, Geometric> map = HOLDER.getGeometricMap();

        assertEquals(1, map.size());
        assertTrue(map.containsKey(1.0));
        assertEquals(geometric, map.get(1.0));
    }

    @Test
    void addToMapWithNullExceptionTest() {
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToMap(1.0, null));
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToMap(null, geometric));
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToMap(null, null));
    }

    @Test
    void getGeometricListTest() {
        Geometric geometric1 = new Geometric();
        Geometric geometric2 = new Geometric();
        HOLDER.addToList(geometric1);
        HOLDER.addToList(geometric2);

        List<Geometric> list = HOLDER.getGeometricList();

        assertNotNull(list);
        assertEquals(2, list.size());
        assertTrue(list.contains(geometric1));
        assertTrue(list.contains(geometric2));
    }

    @Test
    void getGeometricList_EmptyTest() {
        List<Geometric> list = HOLDER.getGeometricList();
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    void getGeometricSet() {
        Geometric geometric1 = new Geometric();
        Geometric geometric2 = new Geometric();
        HOLDER.addToSet(geometric1);
        HOLDER.addToSet(geometric2);

        Set<Geometric> set = HOLDER.getGeometricSet();

        assertNotNull(set);
        assertEquals(2, set.size());
        assertTrue(set.contains(geometric1));
        assertTrue(set.contains(geometric2));
    }

    @Test
    void getGeometricSet_EmptyTest() {
        Set<Geometric> set = HOLDER.getGeometricSet();
        assertNotNull(set);
        assertEquals(0, set.size());
    }

    @Test
    void getGeometricMap() {
        Geometric geometric1 = new Geometric();
        Geometric geometric2 = new Geometric();
        HOLDER.addToMap(1.0, geometric1);
        HOLDER.addToMap(2.0, geometric2);

        Map<Double, Geometric> map = HOLDER.getGeometricMap();

        assertNotNull(map);
        assertEquals(2, map.size());
        assertTrue(map.containsKey(1.0));
        assertTrue(map.containsKey(2.0));
        assertTrue(map.containsValue(geometric1));
        assertTrue(map.containsValue(geometric2));
        assertEquals(geometric1, map.get(1.0));
        assertEquals(geometric2, map.get(2.0));
    }

    @Test
    void getGeometricMap_EmptyTest() {
        Map<Double, Geometric> map = HOLDER.getGeometricMap();

        assertNotNull(map);
        assertEquals(0, map.size());
    }

    @Test
    void getListSizeTest() {
        Geometric geometric1 = new Geometric();
        Geometric geometric2 = new Geometric();
        HOLDER.addToList(geometric1);
        HOLDER.addToList(geometric2);

        int size = HOLDER.getListSize();

        assertEquals(2, size);
    }

    @Test
    void GetListSize_EmptyTest() {
        int size = HOLDER.getListSize();

        assertEquals(0, size);
    }

    @Test
    void getSetSize() {
        HOLDER.addToSet(new Geometric());
        HOLDER.addToSet(new Geometric());

        int size = HOLDER.getSetSize();

        assertEquals(2, size);
    }

    @Test
    void testGetSetSize_Empty() {
        int size = HOLDER.getSetSize();

        assertEquals(0, size);
    }


    @Test
    void getMapSize() {
        HOLDER.addToMap(1.0, new Geometric());
        HOLDER.addToMap(2.0, new Geometric());

        int size = HOLDER.getMapSize();

        assertEquals(2, size);
    }

    @Test
    void getMapSize_Empty() {
        int size = HOLDER.getMapSize();

        assertEquals(0, size);
    }
}