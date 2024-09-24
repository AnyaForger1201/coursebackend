package com.apiweb.coursebackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coursecontent")

public class Coursecontent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Buoi1")
    private String Buoi1;

    @Column(name = "Buoi2")
    private String Buoi2;

    @Column(name = "Buoi3")
    private String Buoi3;

    @Column(name = "Buoi4")
    private String Buoi4;

    @Column(name = "Buoi5")
    private String Buoi5;

    @Column(name = "Buoi6")
    private String Buoi6;

    @Column(name = "Buoi7")
    private String Buoi7;

    @Column(name = "Buoi8")
    private String Buoi8;
}
