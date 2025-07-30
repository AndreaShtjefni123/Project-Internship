package com.bookstore.bookstore.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="book")
public class Book {



        @Id
        @Column(name="book_id")
        private Integer bookId;

        @Column (name = "BookTitle", length = 150)
        private String bookTitle;

        @Column (name = "BookAuthor", length = 150)
        private String bookAuthor;


        @Column (name = "BookGenre", length = 150)
        private String bookGenre;

        @Column (name = "BookLanguage", length = 150)
        private String bookLanguage;
    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal price;

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        public BigDecimal getPrice() {
            return price;
        }

        public void setBookId(Integer bookId) {
            this.bookId = bookId;
        }
        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }
        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }
        public void setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
        }
        public void setBookLanguage(String bookLanguage) {
            this.bookLanguage = bookLanguage;
        }
        public Integer getBookId() {
            return bookId;
        }

        public String getBookTitle() {
            return bookTitle;
        }
        public String getBookAuthor() {
            return bookAuthor;
        }
        public String getBookGenre() {
            return bookGenre;
        }
        public String getBookLanguage() {
            return bookLanguage;
        }

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Ratings> ratings;
        
public void setArchived(boolean b) {

    }
}


