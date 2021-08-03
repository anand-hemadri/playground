/**
 * 
 */
package net.matrix.bookstore.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author anand.hemadri
 *
 */
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {

    }

    public Author(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    /**
     * @return the books
     */
    public Set<Book> getBooks() {
	return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Set<Book> books) {
	this.books = books;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (!(obj instanceof Author)) {
	    return false;
	}
	final Author other = (Author) obj;
	return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
	final StringBuilder builder = new StringBuilder();
	builder.append("Author [id=").append(id).append(", fristName=").append(firstName).append(", lastName=")
		.append(lastName).append("]");
	return builder.toString();
    }
}
