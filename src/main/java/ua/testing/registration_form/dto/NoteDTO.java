package ua.testing.registration_form.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NoteDTO {

    private String firstName;

    private String secondName;

    private String patronymic;

    private String login;

    private String email;

    private String telegram;

}
