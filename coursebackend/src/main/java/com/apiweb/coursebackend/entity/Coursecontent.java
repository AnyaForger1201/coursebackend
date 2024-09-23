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

    @Column(name = "Buổi 1: Giới thiệu bản thân và người khác")
    private String Buoi1;

    @Column(name = "Buổi 2: Giao tiếp trong các tình huống hàng ngày")
    private String Buoi2;

    @Column(name = "Buổi 3: Giao tiếp trong công việc")
    private String Buoi3;

    @Column(name = "Buổi 4: Phát âm chuẩn tiếng Anh")
    private String Buoi4;

    @Column(name = "Buổi 5: Giao tiếp khi đi du lịch")
    private String Buoi5;

    @Column(name = "Buổi 6: Giao tiếp qua điện thoại")
    private String Buoi6;

    @Column(name = "Buổi 7: Giao tiếp trong tình huống khẩn cấp")
    private String Buoi7;

    @Column(name = "Buổi 8: Ôn tập và kiểm tra")
    private String Buoi8;
}
