package io.pebbletemplates.pebble;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * @version 1.0
 * @name: zhangyongxiang
 * @author: zhangyongxiang@baidu.com
 * @date 2024/2/1 18:21
 * @description:
 **/

public class BacklsashTest {
    
    public static void main(final String[] args) throws IOException {
        final Pattern compile = Pattern.compile("\\\\(')");
        System.out.println(compile.matcher("\'").find());
        // System.out.println("xxx".replaceAll("\\\\(')", "$1"));
        
        // final PebbleEngine pebbleEngine = new PebbleEngine.Builder().build();
        // final PebbleTemplate literalTemplate =
        // pebbleEngine.getLiteralTemplate(
        // "{{ comment | replace({'\\\\':'\\\\\\\\'}) }}");
        // final Writer writer = new StringWriter();
        // final Map<String, Object> context = new HashMap<>();
        // context.put("comment", "abc\\\\'bccc");
        // literalTemplate.evaluate(writer, context);
        // Filter filter;
        // System.out.println(writer.toString());
        
    }
    
}
