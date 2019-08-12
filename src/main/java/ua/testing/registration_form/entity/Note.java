package ua.testing.registration_form.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Note {

    private Long id;

    private String firstName;

    private String secondName;

    private String patronymic;

    private String login;

    private String email;

    private String telegram;

}
