package comm.jesus.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{

	private int id;
	private int sesionQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration, int sesionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.sesionQuantity=sesionQuantity;
		this.chapters = chapters;
	}
			
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSesionQuantity() {
		return sesionQuantity;
	}
	public void setSesionQuantity(int sesionQuantity) {
		this.sesionQuantity = sesionQuantity;
	}
	public ArrayList<Chapter> getChapter() {
		return chapters;
	}
	public void setChapter(ArrayList<Chapter> chapter) {
		this.chapters = chapter;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Chapter.makeChaptersList()));
			
		}
		
		return series;
	}
}
