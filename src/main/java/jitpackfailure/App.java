package jitpackfailure;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class App
{
    public static void main( String[] args )
    {
        Parser parser = Parser.builder().build();
        Node document = parser.parse("This  *should* be runnable");
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        System.out.println("\n" + renderer.render(document));
    }
}
