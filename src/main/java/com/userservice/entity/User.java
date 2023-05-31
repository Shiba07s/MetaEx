package com.userservice.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 @Builder
 @Entity
@Table(name="users")
public class User {
    @Id
    @Column(name = "ID")
     private String userId;
    @Column(name = "NAME")
       private  String name;
    @Column(name = "EMAIL")
      private  String email;
    @Column(name = "MOBILE")
      private String mobile;
    @Column(name = "ABOUT")
     private String about;



























































}
