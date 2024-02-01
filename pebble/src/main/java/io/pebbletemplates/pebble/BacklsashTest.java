package io.pebbletemplates.pebble;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import io.pebbletemplates.pebble.extension.Filter;
import io.pebbletemplates.pebble.template.PebbleTemplate;

/**
 * @version 1.0
 * @name: zhangyongxiang
 * @author: zhangyongxiang@baidu.com
 * @date 2024/2/1 18:21
 * @description:
 **/

public class BacklsashTest {
    
    public static void main(final String[] args) throws IOException {
        final PebbleEngine pebbleEngine = new PebbleEngine.Builder().build();
        final PebbleTemplate literalTemplate = pebbleEngine.getLiteralTemplate(
                "COMMENT='{{- comment | replace({\"\\\\\":\"\\\\\"}) | raw -}}'");
        final Writer writer = new StringWriter();
        final Map<String, Object> context = new HashMap<>();
        context.put("comment", "abc\\\\'bccc");
        literalTemplate.evaluate(writer, context);
        Filter filter;
        System.out.println(writer.toString());
        
    }
    
}
