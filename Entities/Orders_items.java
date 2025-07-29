package com.bookstore.bookstore.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name="Orders_items")

public class Orders_items {

        @Id
        private Long id;

        private Long userId;
        private Long bookId;
        private Integer quantity;

        @Column(nullable = false)
        private BigDecimal subtotal;


        // Constructors

        public Orders_items(Long userId, Long bookId, Integer quantity) {
                this.userId = userId;
                this.bookId = bookId;
                this.quantity = quantity;
        }

        public Orders_items() {

        }

        // Getters & setters
        public Long getId() {
                return id;
        }

        public Long getUserId() {
                return userId;
        }

        public void setUserId(Long userId) {
                this.userId = userId;
        }

        public Long getBookId() {
                return bookId;
        }

        public void setBookId(Long bookId) {
                this.bookId = bookId;
        }

        public Integer getQuantity() {
                return quantity;
        }

        public void setQuantity(Integer quantity) {
                this.quantity = quantity;
        }


        @Column(nullable = false, precision = 6, scale = 2)
        private BigDecimal price;

        public BigDecimal getSubtotal() {
                return price.multiply(BigDecimal.valueOf(quantity));
        }

}









