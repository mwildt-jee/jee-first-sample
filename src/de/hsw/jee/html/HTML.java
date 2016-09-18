package de.hsw.jee.html;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A simple helper class that can be used to generate hierarchical HTML Markup-Content based
 * on String concatenation.
 * 
 * @author Malte Wildt
 *
 */
public class HTML{
	
	public static String TAG(String tagname, String ... elements){
		return TAG(tagname, null, elements);
	}
	
	public static String TAG( String tagname, Map<String, String> attrs, String ... elements){
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("<%s", tagname));
		if(null != attrs){
			for(Entry<String, String> attr : attrs.entrySet()){
				sb.append(" " + attr.getKey());
				if(null != attr.getValue()){
					sb.append("=\"" + attr.getValue() + "\"");
				}
			}
		}
		if(elements != null && elements.length > 0){
			sb.append(">");
			for(String element : elements){
				sb.append(element);
			}
			sb.append(String.format("</%s>", tagname));	
		} else {
			sb.append("/>");
		}
		return sb.toString();
	}
	
	public static String BODY(String ... elements){
		return TAG("body", elements);
	}
	
	public static String BR(){
		return TAG("br");
	}
	
	public static String HTML(String ... elements){
		return TAG("html", elements);
	}
	
	public static String P(String ... elements){
		return TAG("p", elements);
	}
	
	public static String INPUT(String type, String name, String value){
		Map<String, String> map = new HashMap<String, String>();
		map.put("type", type);
		map.put("name", name);
		if(null != value){
			map.put("value", value);
		}
		return TAG("input", map);
	}
	
	public static String TEXTAREA(String name, String value){
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		return TAG("textarea", value);
	}
	
	public static String TEXTAREA(String name){
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		return TAG("textarea", map, "");
	}
	
	public static String FORM(String action, String method, String ... elements){
		Map<String, String> map = new HashMap<String, String>();
		map.put("action", action);
		map.put("method", method);
		return TAG("form", map, elements);
	}
	
	public static String INPUT(String type, String name){
		return INPUT(type, name, null);
	}
	
	
	public static String DIV(String ... elements){
		return TAG("div", elements);
	}
	
	public static String H1(String ... elements){
		return TAG("h1", elements);
	}
	
	public static String H2(String ... elements){
		return TAG("h2", elements);
	}
	
	public static String UL(String ... elements){
		return TAG("ul", elements);
	}
	
	public static String LI(String ... elements){
		return TAG("li", elements);
	}
	
	public static String TD(String ... elements){
		return TAG("td", elements);
	}
	
	public static String TABLE(String ... elements){
		return TAG("table", elements);
	}
	
	public static String ROW(String ... elements){
		String[] es = Arrays.stream(elements).map((String e) -> HTML.TD(e)).toArray(HTML::allocateStringArray); 
		return TAG("tr", es);
	}
	
	public static String[] allocateStringArray(int i){
		return new String[i];
	}
	
	
}