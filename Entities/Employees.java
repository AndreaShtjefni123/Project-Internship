package com.bookstore.bookstore.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="employees")

public class Employees {


        @Id
        @Column(name="empid")
        private Integer empid;

        @Column(name = "EmpFName", length = 150)
        private String firstName;

        @Column(name = "EmpLName", length = 150)
        private String lastName;

        @Column(name = "EmpEmail", length = 200, unique = true)
        private String email;

        @Column(name = "EmpPhonenumber", length = 150 ,unique = true)
        private String phonenumber;

        @Column(name = "EmpAge")
        private Integer empAge;

        public Integer getEmpid() {
            return empid;
        }
        public void setEmpid(Integer empid) {
            this.empid = empid;
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
        public Integer getEmpAge() {
            return empAge;
        }
        public void setEmpAge(Integer empAge) {
            this.empAge = empAge;
        }
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Orders> orders;

}

