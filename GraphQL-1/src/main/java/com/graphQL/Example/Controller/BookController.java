package com.graphQL.Example.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphQL.Example.Entity.Book;
import com.graphQL.Example.service.BookService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@MutationMapping("createBook")
	public Book createb(@Argument BookInput  book) {
		Book b=new Book();
		b.setTitle(book.getTitle());
		b.setAuthor(book.getAuthor());
		b.setDescription(book.getDescription());
		b.setPages(book.getPages());
		b.setPrice(book.getPrice());
		return this.bookService.create(b);
	}


	@QueryMapping("allBook")
	public List<Book>getAllBook()
	{
		return this.bookService.getAllBook();
	}
	
	@QueryMapping("getBook")
	public Book get(@Argument("bookId") int bookId)
	{
		return bookService.getBookById(bookId);
	}
	
	@MutationMapping("updateBook")
	public Book updateBooks(@Argument updateInput  book) {
		Book b=new Book();
		b.setTitle(book.getTitle());
		b.setAuthor(book.getAuthor());
		b.setDescription(book.getDescription());
		b.setPages(book.getPages());
		b.setPrice(book.getPrice());
		return this.bookService.create(b);
	}

 public class BookInput{
	
	private String title;
	private String description;
	private String author;
	private double price;
	private int pages;	
	
	
	 public BookInput() {
	    }

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getPages() {
			return pages;
		}

		public void setPages(int pages) {
			this.pages = pages;
		}
	}

 public class updateInput{
		
		private String title;
		private String description;
		private String author;
		private double price;
		private int pages;	
		
		
		 public updateInput() {
		    }

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public int getPages() {
				return pages;
			}

			public void setPages(int pages) {
				this.pages = pages;
			}
		}

}
