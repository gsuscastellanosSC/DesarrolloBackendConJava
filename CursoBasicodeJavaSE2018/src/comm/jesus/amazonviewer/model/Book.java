package comm.jesus.amazonviewer.model;

import java.util.Arrays;
import java.util.Date;

public class Book extends Publication implements IVisualizable{
	
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public Book(String title, Date editionDate, String editorial, String[] authors, String isbn, boolean readed, int timeReaded) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		this.readed = readed;
		this.timeReaded = timeReaded;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [id=%s, isbn=%s, readed=%s, timeReaded=%s, getTitle()=%s, getEditionDate()=%s, getEditorial()=%s, getAuthors()=%s]",
				id, isbn, readed, timeReaded, getTitle(), getEditionDate(), getEditorial(),
				Arrays.toString(getAuthors()));
	}

	@Override
	public Date starToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}
	}
	
	

}
