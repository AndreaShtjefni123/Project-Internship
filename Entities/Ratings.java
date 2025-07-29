package com.bookstore.bookstore.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Ratings")

public class Ratings {


        @Id
        @Column(name = "Ratingsid")
        private Integer raitingsid;

        @Column(name = "ordersid", nullable = false)
        private Integer ordersId;

        @Column(name = "bookid", nullable = false)
        private Integer bookId;

        @Column(name = "RatedAt", nullable = false)
        private Integer ratedAt;




        public Integer getRaitingsid() {
            return raitingsid;
        }
        public Integer getOrdersId() {
            return ordersId;
        }
        public Integer getBookId() {
            return bookId;
        }
        public Integer getRatedAt() {
            return ratedAt;
        }
        public void setRaitingsid(Integer raitingsid) {
            this.raitingsid = raitingsid;
        }
        public void setOrderId(Integer orderId) {
            this.ordersId = orderId;
        }
        public void setBookId(Integer bookId) {
            this.bookId = bookId;
        }
        public void setRatedAt(Integer ratedAt) {
            this.ratedAt = ratedAt;
        }
    @ManyToOne
    @JoinColumn(name = "UsersID", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "BookID", nullable = false)
    private Book book;


    // Constructors
    public Ratings() { }

    public Ratings(Integer orderId, Integer bookId, Integer ratedAt) {
        this.ordersId = orderId;
        this.bookId = bookId;
        this.ratedAt = ratedAt;
    }

    }


