package com.bookstore.bookstore.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.util.List;


@Entity
@Table(name = "Users")
public class Users {



        @Id
        @Column(name = "UsersID")
        private Integer usersID;

        @Column(name = "UsersFName", length = 150)
        private String firstName;

        @Column(name = "UsersLName", length = 150)
        private String lastName;

        @Column(name = "UsersEmail", length = 200, unique = true)
        private String email;

        @Column(name = "UsersPhonenumber", length = 150 ,unique = true)
        private String phonenumber;

        @Column(name = "UsersPassword", length = 200)
        private String password;

        public Integer getUsersID() {
            return usersID;
        }
        public void setUsersID(Integer usersID) {
            this.usersID = usersID;
        }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhonenumber() {
            return phonenumber;
        }
        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //When you do something to the parent entity,
                                                            // JPA will also do it to the related child entities.
    private List<Orders> orders;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Ratings> ratings;





}


