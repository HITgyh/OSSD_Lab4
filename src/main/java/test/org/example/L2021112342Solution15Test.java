package test.org.example;

import org.example.Solution;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
* Solution Tester.
*
* @author <Guo Yihang>
* @since <pre>11月 10, 2023</pre>
* @version 1.0
*/
public class L2021112342Solution15Test {

@Before
public void before(){
}

@After
public void after() {
}

/**
*
* Method: compareVersion
* Equal Versions:{0,("1.01", "1.001")} , {0,("1.0", "1.0.0")}
* Less Than Versions:{-1,("0.1", "1.1")}
* Greater Than Versions:{1,("1.2", "1.1")}
*
*/
@Test
public void testCompareVersion() {
//TODO: Test goes here...
    Solution solution = new Solution();
    assertEquals(0, solution.compareVersion("1.01", "1.001"));
    assertEquals(0, solution.compareVersion("1.0", "1.0.0"));

}
@Test
public void testCompareVersionLessThan() {
    Solution solution = new Solution();
    assertEquals(-1, solution.compareVersion("0.1", "1.1"));
}

@Test
public void testCompareVersionGreaterThan() {
    Solution solution = new Solution();
    assertEquals(1, solution.compareVersion("1.2", "1.1"));
}



}
