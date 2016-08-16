import java.util.*;
public class Comic {
	
	private ArrayList<Day> m_schedule;
	private String m_title;
	private ComicDate m_startDate;
	
	public enum Day{
		NONE,
		WSUNDAY, WMONDAY, WTUESDAY, WWEDNESDAY, WTHURSDAY, WFRIDAY, WSATURDAY,
		BWSUNDAY, BWMONDAY, BWTUESDAY, BWWEDNESDAY, BWTHURSDAY, BWFRIDAY, BWSATURDAY,
		MSUNDAY, MMONDAY, MTUESDAY, MWEDNESDAY, MTHURSDAY, MFRIDAY, MSATURDAY,
		BMSUNDAY, BMMONDAY, BMTUESDAY, BMWEDNESDAY, BMTHURSDAY, BMFRIDAY, BMSATURDAY
		
	}
	
	public class ComicDate{
		
		private Date m_date;
		private boolean m_verified;
		
		public ComicDate(Date date){
			m_date = date;
		}
		
		public Date getDate(){
			return(m_date);
		}
		
		public boolean isVerified(){
			return(m_verified);
		}
		
		public void setVerified(boolean value){
			m_verified = value;
		}
		
		
	}
	
	public Comic(){
		setTitle("Awaiting Title");
	}
	
	public Comic(String title){
		setTitle(title);
	}
	
	public void setTitle(String title){
		m_title = title;
	}
	
	public void setDate(){
		
	}
	
	// Add a new day to the schedule.
	public boolean addDay(Day dayToAdd){
		if(m_schedule.contains(dayToAdd)){
			return(false);
		}else{
			m_schedule.add(dayToAdd);
			return(true);
		}
	}
	
	// Remove a day from the schedule.
	public boolean removeDay(Day dayToRemove){
		if(m_schedule.contains(dayToRemove)){
			m_schedule.remove(dayToRemove);
			return(true);
		}else{
			return(false);
		}
	}
	

}
