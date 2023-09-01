package com.ict.edu2.member.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Getter
// @Setter
// @RequiredAgeConstructor : final 이나 @NonNull 인 필드값만 파라미터로 받는 생성자
// @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정



@Data
// 인자가 없는 기본 생성자 자동 생성
@NoArgsConstructor
// 모든 인자가 들어있는 생성자 자동 생성ㅌ
@AllArgsConstructor
public class VO {
    private String m_id, m_pw, m_name, m_age, m_reg;
}
