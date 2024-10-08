package org.community.moyoyoung.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

// 김용
// 정기모임 가입 유저
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tbl_meetingUser")
@Builder
@Setter
public class MeetingUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Meeting meeting;

    @ManyToOne
    private MyUser myUser;
}
