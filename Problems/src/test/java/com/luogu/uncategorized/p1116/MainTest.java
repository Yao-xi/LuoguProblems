package com.luogu.uncategorized.p1116;

import com.luogu.p1000plus.p1116.Main;
import org.junit.Test;

public class MainTest {
    
    
    @Test
    public void getSwitchCount1Test01() {
        int count = Main.getSwitchCount1(new int[]{4, 3, 2, 1});
        System.out.println(count);
    }
    
    @Test
    public void getSwitchCount1Test02() {
        int count = Main.getSwitchCount1(new int[]{3, 1, 2, 4});
        System.out.println(count);
    }
    
    @Test
    public void getSwitchCount1Test03() {
        int count = Main.getSwitchCount1(new int[]{3, 4, 2, 1});
        System.out.println(count);
    }
}