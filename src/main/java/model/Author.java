package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Authors")
public class Author {
	
	private String author_code;
	private String author_first_name;
	private String author_last_name;


	public Author() {

	}
	
	public Author(String author_code, String author_first_name, String author_last_name) {
		super();
		this.author_code = author_code;
		this.author_first_name = author_first_name;
		this.author_last_name = author_last_name;
	}
	
    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="author_code", nullable=false)
    public String getAuthor_code() {
		return author_code;
	}
	public void setAuthor_code(String author_code) {
		this.author_code = author_code;
	}


    @Column(name="author_first_name", nullable= false)
	public String getAuthor_first_name() {
		return author_first_name;
	}
	public void setAuthor_first_name(String author_first_name) {
		this.author_first_name = author_first_name;
	}

    @Column(name="author_last_name", nullable= false)
	public String getAuthor_last_name() {
		return author_last_name;
	}
	public void setAuthor_last_name(String author_last_name) {
		this.author_last_name = author_last_name;
	}
    
}
