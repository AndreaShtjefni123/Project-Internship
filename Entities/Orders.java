package com.bookstore.bookstore.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@Entity
@Table(name = "Orders")
public class Orders {

        @Id
        @Column(name = "Ordersid")
        private Integer ordersid;

        @Column(name = "OrderDate", length = 150)
        private String orderDate;

        @Column(name = "UsersID")
        private Integer usersID;

        @Column(name="empid")
        private Integer empid;

        public Integer getOrdersid() {
                return ordersid;
        }
        public void setOrdersid(Integer ordersid) {
                this.ordersid = ordersid;
        }
        public String getOrderDate() {
                return orderDate;
        }

        public void setOrderDate(String orderDate) {
                this.orderDate = orderDate;
        }
        public Integer getUsersID() {
                return usersID;
        }
        public void setUsersID(Integer usersID) {
                this.usersID = usersID;
        }
        public Integer getEmpid() {
                return empid;
        }
        public void setEmpid(Integer empid) {
                this.empid = empid;
        }

        @ManyToOne
        @JoinColumn(name = "UsersID", nullable = false) // one user per order
        private Users user;

        @ManyToOne
        @JoinColumn(name = "EmployeeID", nullable = false) // one employee per order
        private Employees employee;


}


