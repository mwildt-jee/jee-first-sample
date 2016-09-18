package de.hsw.jee.html;

public class HTML{
	public static String TAG(String tagname, String ... elements){
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("<%s>", tagname));
		for(String element : elements){
			sb.append(element);
		}
		sb.append(String.format("</%s>", tagname));	
		return sb.toString();
	}
	
	public static String BODY(String ... elements){
		return TAG("body", elements);
	}
	
	public static String HTML(String ... elements){
		return TAG("html", elements);
	}
	
	public static String P(String ... elements){
		return TAG("p", elements);
	}
	
	public static String H1(String ... elements){
		return TAG("h1", elements);
	}
}