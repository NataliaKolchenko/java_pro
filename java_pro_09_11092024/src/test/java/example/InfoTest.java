package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


class InfoTest {
    private final static Info INFO = new Info();

    @BeforeEach
    public void setUp() {
        InfoLogger.log.clear();
    }

    @Test
    void getInfoLoggerTest() {
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getRole()).thenReturn(Role.LEVEL_CEO);

        INFO.getInfo(employee);
        assertEquals(1, InfoLogger.log.size());
    }

    @Test
    void getInfoLoggerWithExceptTest() {
        Employee employee = null;

        assertThrows(NullPointerException.class, () -> INFO.getInfo(employee));
    }

    @Test
    void getInfoSecurityRoleTest() {
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getRole()).thenReturn(Role.LEVEL_SECURITY);

        assertEquals("Access denied", INFO.getInfo(employee));
    }

    @Test
    void getInfoCeoRoleTest() {
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getRole()).thenReturn(Role.LEVEL_CEO);

//        INFO.getInfo(employee);
        assertEquals("CEO", INFO.getInfo(employee));
    }

}