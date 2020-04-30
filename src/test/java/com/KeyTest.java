package com;

import org.junit.jupiter.api.Test;
import util.TxtUtil;
//import util.TxtUtil;

import java.io.File;

public class KeyTest {

    @Test
    public void getInfo() {
        String path = "D:\\github\\hadoop";
        for (File file : new File(path).listFiles()) {
            String name = file.getName();
            if (name.contains(".")) {
                continue;
            }

            new File("D:\\github\\hadoop\\src\\main\\java\\" + name.toLowerCase()).mkdir();
            TxtUtil.writeTxt("D:\\github\\hadoop\\src\\main\\java\\" + name + "\\" + name + "Test.java", "package " + name.toLowerCase() + ";\n" +
                    "\n" +
                    "public class " + name + "Test {\n" +
                    "\n" +
                    "}");
            System.out.println(file.getName());
        }
    }
}
