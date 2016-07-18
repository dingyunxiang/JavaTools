package cn.dingyunxiang.AutoScanPackage;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dingyunxiang on 16/7/18.
 */
public class ScanClassTest {

    @Test
    public void testDoScan() throws Exception {
        ScanClass scan = new ScanClass();
        Set s = new LinkedHashSet();

        scan.doScan("cn.dingyunxiang.FastJson","/Users/dingyunxiang/Documents/java/Jersey-test/src/main/java",s);

        System.out.println(s.size());

    }
}