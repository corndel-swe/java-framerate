package gg.jte.generated.ondemand.exercises;
import java.util.List;
public final class Jted1e3Generated {
	public static final String JTE_NAME = "exercises/d1e3.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,16,16,17,17,18,18,18,19,19,24,24,24,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<String> shopping) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  <title>Day 1 | Exercise 3</title>\n</head>\n\n<body>\n  <h1>Shopping list</h1>\n\n  <ul>\n    ");
		jteOutput.writeContent("\n    ");
		for (var item : shopping) {
			jteOutput.writeContent("\n    <li>");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(item);
			jteOutput.writeContent("</li>\n    ");
		}
		jteOutput.writeContent("\n  </ul>\n</body>\n\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<String> shopping = (List<String>)params.get("shopping");
		render(jteOutput, jteHtmlInterceptor, shopping);
	}
}
