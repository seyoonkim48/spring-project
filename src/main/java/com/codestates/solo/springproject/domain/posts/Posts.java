package com.codestates.solo.springproject.domain.posts;

import com.codestates.solo.springproject.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //이건 JPA 어노테이션, 위의 둘은 롬복 어노테이션.
public class Posts extends BaseTimeEntity { // 실제 DB와 매칭될 클래스. JPA통해서 쿼리 날리는 경우, 실제 쿼리를 날리기보단 이 엔티티클래스 수정해서 작업~

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false) // 이거 안써도 컬럼인거 아는데, 문자열 길이 늘리는 등의 옵션 적을때 사용함.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // 타입이 VARCHAR가 아니라 TEXT임!
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
