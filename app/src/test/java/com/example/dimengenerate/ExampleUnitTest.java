package com.example.dimengenerate;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private final String DIR = "/Users/one/Android/workspace/ifarmer/dimens/library/src/main/res/";
    private final int[] target = {
            240,
            319,
            320,
            343,
            338,
            347,
            348,
            349,
            352,
            360,
            362,
            363,
            368,
            374,
            376,
            379,
            380,
            381,
            382,
            384,
            392,
            393,
            400,
            404,
            410,
            411,
            417,
            423,
            426,
            432,
            447,
            450,
            451,
            457,
            461,
            462,
            480,
            490,
            530,
            533,
            592,
            600,
            640,
            662,
            676,
            720,
            744,
            768,
            800,
            811,
            820,
            823,
            960,
            961,
            1024,
            1280,
            1365
    };

    @Test
    public void createDimen() {
        File root = new File(DIR);
        if (!root.exists()) {
            return;
        }
        for (int sw : target) {
            Writer out = null;
            try {
                File dir = new File(DIR + "values-sw" + sw + "dp");
                if (!dir.exists()) {
                    // 先创建目录
                    dir.mkdir();
                }
                File f = new File(dir.getAbsolutePath() + File.separator + "dimens.xml");
                if (f.exists()) {
                    // 如果已经存在，不重新创建
                    continue;
                }
                f.createNewFile();
                out = new FileWriter(f);
                String content = create(sw);
                out.write(content);
            } catch (IOException exception) {

            } finally {
                try {
                    if (null != out) {
                        out.close();
                        out = null;
                    }
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private String create(double width) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buffer.append("<resources xmlns:tools=\"http://schemas.android.com/tools\" tools:ignore=\"MissingDefaultResource\">");
        for (int i = 1; i <= 750; i++) {
            double a = width / 750 * i;
            DecimalFormat df = new DecimalFormat("#0.0000");
            buffer.append(" <dimen name=\"x" + i + "\">" + df.format(a) + "dp</dimen>");
        }
        for (int i = 1; i <= 750; i++) {
            double a = width / 750 * i;
            DecimalFormat df = new DecimalFormat("#0.0000");
            buffer.append(" <dimen name=\"m" + i + "\">-" + df.format(a) + "dp</dimen>");
        }
        buffer.append("</resources>");
        return buffer.toString();
    }
}