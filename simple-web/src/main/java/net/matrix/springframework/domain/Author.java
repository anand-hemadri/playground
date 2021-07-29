/**
 * 
 */
package net.matrix.springframework.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
    private String fristName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {

    }

    public Author(String fristName, String lastName) {
	this.fristName = fristName;
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
     * @return the fristName
     */
    public String getFristName() {
	return fristName;
    }

    /**
     * @param fristName the fristName to set
     */
    public void setFristName(String fristName) {
	this.fristName = fristName;
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
	return Objects.hash(books, fristName, id, lastName);
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
	return Objects.equals(books, other.books) && Objects.equals(fristName, other.fristName)
		&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
    }

    @Override
    public String toString() {
	final int maxLen = 5;
	final StringBuilder builder = new StringBuilder();
	builder.append("Author [id=").append(id).append(", fristName=").append(fristName).append(", lastName=")
		.append(lastName).append(", books=").append(books != null ? toString(books, maxLen) : null).append("]");
	return builder.toString();
    }

    private String toString(Collection<?> collection, int maxLen) {
	final StringBuilder builder = new StringBuilder();
	builder.append("[");
	int i = 0;
	for (final Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
	    if (i > 0) {
		builder.append(", ");
	    }
	    builder.append(iterator.next());
	}
	builder.append("]");
	return builder.toString();
    }

}
