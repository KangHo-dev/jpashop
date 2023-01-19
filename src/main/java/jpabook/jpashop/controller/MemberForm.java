package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    /**
     * 사용자 화면에서 넘어오는 validation 이랑 실제 도메인이 원하는 validation이 다를 수 있다.
     */
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;


}
