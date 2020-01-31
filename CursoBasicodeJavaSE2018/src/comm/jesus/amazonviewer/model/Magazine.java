package comm.jesus.amazonviewer.model;

import java.util.Arrays;
import java.util.Date;

public class Magazine extends Publication{
	
	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Magazine [id=%s, getTitle()=%s, getEditionDate()=%s, getEditorial()=%s, getAuthors()=%s]",
				id, getTitle(), getEditionDate(), getEditorial(), Arrays.toString(getAuthors()));
	}

	
			
}
