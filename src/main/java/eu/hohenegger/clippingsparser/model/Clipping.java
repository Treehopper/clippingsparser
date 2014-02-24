package eu.hohenegger.clippingsparser.model;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Clipping {

	
	public static enum DocType {
		BOOKMARK, HIGHLIGHT, NOTE
	}

	private String title;
	private String content;
	private DocType type;
	private String toLocation;
	private String fromLocation;
	private Date date;
	private DateFormat dateFormatter;// = DateFormat.getDateInstance(); //= new SimpleDateFormat("EEEE, MMMM dd, yyyy");
	private static DateFormat dateOutputFormatter = new SimpleDateFormat("yyyy-MM-dd, HH:mm");
	
	public Clipping() {
		
//		dateFormatter = new SimpleDateFormat("MMMM dd yyyy", DateFormatSymbols.getInstance(Locale.US));	
		dateFormatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy, KK:mm a", DateFormatSymbols.getInstance(Locale.US));
		
//		Locale.ENGLISH
//		dateFormatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");//new SimpleDateFormat("MMMM dd yyyy");
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return this.title + this.content;
	}

	public DocType getType() {
		return type;
	}

	public void setType(DocType type) {
		this.type = type;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String date) {

//		System.out.println(date.equals((date.replaceAll("\\p{Cntrl}", ""))));
		try {
			this.date = dateFormatter.parse(date);
//			System.out.println(this.date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public String getDateString() {
		return getDateOutputFormatter().format(this.date);
	}

	static public DateFormat getDateOutputFormatter() {
		return dateOutputFormatter;
	}

	
//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
//	}






}
