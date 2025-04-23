package site.nansan.category_service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import site.nansan.category_service.domain.Category;
import site.nansan.category_service.repository.CategoryRepository;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class CategoryDataInitializer implements CommandLineRunner {

    private final CategoryRepository repository;

    @Override
    public void run(String... args) throws Exception {


        final String BASE_URL = "assets/images/category/";
        final String EN_BASE_URL = BASE_URL + "en/";
        final String M_BASE_URL = BASE_URL + "m/";

        // ----- 1. Top-level 카테고리 (level 1) -----
        Category EN = Category.builder()
                .name("수 인식(EN)")
                .problemCode(null)
                .imagePath(BASE_URL + "number_puzzles.webp")
                .description(null)
                .level(1)
                .parent(null)
                .build();
        Category M = Category.builder()
                .name("사칙연산(M)")
                .problemCode(null)
                .imagePath(BASE_URL + "calc_operation.webp")
                .description(null)
                .level(1)
                .parent(null)
                .build();
        Category TEST = Category.builder()
                .name("테스트(BASA)")
                .problemCode(null)
                .imagePath(BASE_URL + "test_main.webp")
                .description(null)
                .level(1)
                .parent(null)
                .build();
        repository.saveAll(Arrays.asList(EN, M, TEST));

        // ----- 2. 두 번째 JSON 배열 (top1의 자식) -----
        // 상위인 top1("수 인식(EN)")의 자식으로 등록 (parent = top1)
        Category enlv1s1 = Category.builder()
                .name("1과: 한 자릿 수 인식")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "1/1.webp")
                .description("1부터 9 까지의 수를 구체물이나 반 구체물로 나타낼 수 있어요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv1s2 = Category.builder()
                .name("2과: 심상화된 수직선")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "1/2.webp")
                .description("수 막대, 구체물, 수직선 등을 이용하여 수의 순서를 나타낼 수 있어요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv1s3 = Category.builder()
                .name("3과: 수량 변별")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "1/3.webp")
                .description("주어진 수량과 수의 순서를 학습해요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv1s4 = Category.builder()
                .name("4과: 초기 덧 · 뺄셈")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "1/4.webp")
                .description("1부터 9까지의 개념을 학습해요.")
                .level(2)
                .parent(EN)
                .build();

        Category enlv2s1 = Category.builder()
                .name("1과: 두 자릿 수 인식")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/1.webp")
                .description("'십몇'을 기준으로 1 큰 수와 1 작은 수를 학습해요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv2s2 = Category.builder()
                .name("2과: 심상화된 수직선")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/2.webp")
                .description("'십 몇'을 수직선 위에 나타낼 수 있어요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv2s3 = Category.builder()
                .name("3과: 수량 변별")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/3.webp")
                .description("1부터 20까지 수의 크기를 비교할 수 있어요.")
                .level(2)
                .parent(EN)
                .build();
        Category enlv2s4 = Category.builder()
                .name("4과: 다양한 수 세기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/4.webp")
                .description("두 배 수의 원리를 이해할 수 있어요.")
                .level(2)
                .parent(EN)
                .build();
        repository.saveAll(Arrays.asList(enlv1s1, enlv1s2, enlv1s3, enlv1s4, enlv2s1, enlv2s2, enlv2s3, enlv2s4));

        // ----- EN Level 1, Subject 1의 하위 카테고리 -----
        Category enlv1s1c1 = Category.builder()
                .name("숫자 이름 알기")
                .problemCode("enlv1s1c1gn1")
                .imagePath(EN_BASE_URL + "1/1/1.webp")
                .description("1부터 9까지를 읽을 수 있어요.")
                .level(3)
                .parent(enlv1s1)
                .build();
        Category enlv1s1c2 = Category.builder()
                .name("1 큰 수와 1 작은 수")
                .problemCode("enlv1s1c2gn1")
                .imagePath(EN_BASE_URL + "1/1/2.webp")
                .description("1만큼 크거나 작은 수를 알 수 있어요.")
                .level(3)
                .parent(enlv1s1)
                .build();
        Category enlv1s1c3 = Category.builder()
                .name("구체물 수 세기")
                .problemCode("enlv1s1c3gn1")
                .imagePath(EN_BASE_URL + "1/1/3.webp")
                .description("구체물의 수를 셀 수 있어요.")
                .level(3)
                .parent(enlv1s1)
                .build();
        Category enlv1s1c4 = Category.builder()
                .name("반 구체물 수 세기")
                .problemCode("enlv1s1c4gn1")
                .imagePath(EN_BASE_URL + "1/1/4.webp")
                .description("반 구체물의 수를 셀 수 있어요.")
                .level(3)
                .parent(enlv1s1)
                .build();
        repository.saveAll(Arrays.asList(enlv1s1c1, enlv1s1c2, enlv1s1c3, enlv1s1c4));

        // ----- EN Level 1, Subject 2의 하위 카테고리 -----
        Category enlv1s2c1 = Category.builder()
                .name("1부터 9까지 순서 알기")
                .problemCode("enlv1s2c1gn1")
                .imagePath(EN_BASE_URL + "1/2/1.webp")
                .description("수직선 위에서 1부터 9까지의 위치를 찾을 수 있어요.")
                .level(3)
                .parent(enlv1s2)
                .build();
        Category enlv1s2c2 = Category.builder()
                .name("1부터 9까지 거꾸로 세기")
                .problemCode("enlv1s2c2gn1")
                .imagePath(EN_BASE_URL + "1/2/2.webp")
                .description("수직선 위에서 1부터 9까지를 거꾸로 셀 수 있어요.")
                .level(3)
                .parent(enlv1s2)
                .build();
        Category enlv1s2c3 = Category.builder()
                .name("빠진 수 찾기")
                .problemCode("enlv1s2c3gn1")
                .imagePath(EN_BASE_URL + "1/2/3.webp")
                .description("수직선 위에서 1부터 9까지중에 빠진 수를 찾을 수 있어요.")
                .level(3)
                .parent(enlv1s2)
                .build();
        repository.saveAll(Arrays.asList(enlv1s2c1, enlv1s2c2, enlv1s2c3));

        // ----- EN Level 1, Subject 3의 하위 카테고리 -----
        Category enlv1s3c1 = Category.builder()
                .name("수량을 수로 표상하기")
                .problemCode("enlv1s3c1kc1")
                .imagePath(EN_BASE_URL + "1/3/1.webp")
                .description("수량을 수직선 상에 1부터 9까지를 표시할 수 있어요.")
                .level(3)
                .parent(enlv1s3)
                .build();
        Category enlv1s3c2 = Category.builder()
                .name("수를 수량으로 표상하기")
                .problemCode("enlv1s3c2kc1")
                .imagePath(EN_BASE_URL + "1/3/2.webp")
                .description("숫자 1부터 9까지를 양으로 나타낼 수 있어요.")
                .level(3)
                .parent(enlv1s3)
                .build();
        Category enlv1s3c3 = Category.builder()
                .name("순서 찾기")
                .problemCode("enlv1s3c3kc1")
                .imagePath(EN_BASE_URL + "1/3/3.webp")
                .description("주어진 양과 수의 순서를 공부해요.")
                .level(3)
                .parent(enlv1s3)
                .build();
        repository.saveAll(Arrays.asList(enlv1s3c1, enlv1s3c2, enlv1s3c3));

        // ----- EN Level 1, Subject 4의 하위 카테고리 -----
        Category enlv1s4c1 = Category.builder()
                .name("묶어 세기")
                .problemCode("enlv1s4c1jy1")
                .imagePath(EN_BASE_URL + "1/4/1.webp")
                .description("1부터 9까지의 수를 묶음으로 표현할 수 있어요.")
                .level(3)
                .parent(enlv1s4)
                .build();
        Category enlv1s4c2 = Category.builder()
                .name("1부터 9까지 모으기")
                .problemCode("enlv1s4c2jy1")
                .imagePath(EN_BASE_URL + "1/4/2.webp")
                .description("1부터 9까지의 수를 찾을 수 있어요.")
                .level(3)
                .parent(enlv1s4)
                .build();
        Category enlv1s4c3 = Category.builder()
                .name("1부터 9까지 가르기")
                .problemCode("enlv1s4c3jy1")
                .imagePath(EN_BASE_URL + "1/4/3.webp")
                .description("1부터 9까지의 수를 가를 수 있어요.")
                .level(3)
                .parent(enlv1s4)
                .build();
        repository.saveAll(Arrays.asList(enlv1s4c1, enlv1s4c2, enlv1s4c3));

        // ----- EN Level 2, Subject 1의 하위 카테고리 -----
        Category enlv2s1c1 = Category.builder()
                .name("10 알아보기")
                .problemCode("enlv2s1c1gn1")
                .imagePath(EN_BASE_URL + "2/1/1.webp")
                .description("두 자릿 수의 개념을 이해할 수 있어요.")
                .level(3)
                .parent(enlv2s1)
                .build();
        Category enlv2s1c2 = Category.builder()
                .name("'십 몇'의 1 큰 수, 1 작은 수")
                .problemCode("enlv2s1c2gn1")
                .imagePath(EN_BASE_URL + "2/1/2.webp")
                .description("'1 큰 수'와 '1 작은 수'를 알 수 있어요.")
                .level(3)
                .parent(enlv2s1)
                .build();
        Category enlv2s1c3 = Category.builder()
                .name("구체물 세기 (50까지)")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/1/3.webp")
                .description("50까지의 수를 구체물을 사용하여 나타낼 수 있어요.")
                .level(3)
                .parent(enlv2s1)
                .build();
        Category enlv2s1c4 = Category.builder()
                .name("100까지의 수 세기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/1/4.webp")
                .description("100까지의 수를 읽고 쓸 수 있어요.")
                .level(3)
                .parent(enlv2s1)
                .build();
        repository.saveAll(Arrays.asList(enlv2s1c1, enlv2s1c2, enlv2s1c3, enlv2s1c4));

        // ----- EN Level 2, Subject 2의 하위 카테고리 -----
        Category enlv2s2c1 = Category.builder()
                .name("'십 몇'의 순서와 위치 알기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/2/1.webp")
                .description("'십 몇'을 순서대로 나타낼 수 있어요.")
                .level(3)
                .parent(enlv2s2)
                .build();
        Category enlv2s2c2 = Category.builder()
                .name("빠진 수 찾기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/2/2.webp")
                .description("수열에서 빠진 수를 찾을 수 있어요.")
                .level(3)
                .parent(enlv2s2)
                .build();
        Category enlv2s2c3 = Category.builder()
                .name("수직선 이용하기 (1)")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/2/3.webp")
                .description("1부터 20까지를 수직선 위에 나타낼 수 있어요.")
                .level(3)
                .parent(enlv2s2)
                .build();
        Category enlv2s2c4 = Category.builder()
                .name("수직선 이용하기 (2)")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/2/4.webp")
                .description("수직선 위을 '십 몇'을 나타낼 수 있어요.")
                .level(3)
                .parent(enlv2s2)
                .build();
        repository.saveAll(Arrays.asList(enlv2s2c1, enlv2s2c2, enlv2s2c3, enlv2s2c4));

        // ----- EN Level 2, Subject 3의 하위 카테고리 -----
        Category enlv2s3c1 = Category.builder()
                .name("'십 몇'의 양과 수 순서 짓기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/3/1.webp")
                .description("'1부터 20까지의 수와 수량을 순서 지을 수 있어요.")
                .level(3)
                .parent(enlv2s3)
                .build();
        Category enlv2s3c2 = Category.builder()
                .name("양 비교하기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/3/2.webp")
                .description("1부터 20까지의 수량을 비교할 수 있어요.")
                .level(3)
                .parent(enlv2s3)
                .build();
        Category enlv2s3c3 = Category.builder()
                .name("수 비교하기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/3/3.webp")
                .description("1부터 20까지의 수를 비교할 수 있어요.")
                .level(3)
                .parent(enlv2s3)
                .build();
        Category enlv2s3c4 = Category.builder()
                .name("수와 양 비교하기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/3/4.webp")
                .description("1부터 20까지의 수와 수량을 섞어서 비교할 수 있어요.")
                .level(3)
                .parent(enlv2s3)
                .build();
        repository.saveAll(Arrays.asList(enlv2s3c1, enlv2s3c2, enlv2s3c3, enlv2s3c4));

        // ----- EN Level 2, Subject 4의 하위 카테고리 -----
        Category enlv2s4c1 = Category.builder()
                .name("두 배 수")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/4/1.webp")
                .description("두 배 수 지식을 익힐 수 있어요.")
                .level(3)
                .parent(enlv2s4)
                .build();
        Category enlv2s4c2 = Category.builder()
                .name("뛰어 세기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/4/2.webp")
                .description("1부터 50까지의 수를 다양한 방법으로 뛰어 셀 수 있어요.")
                .level(3)
                .parent(enlv2s4)
                .build();
        Category enlv2s4c3 = Category.builder()
                .name("거꾸로 뛰어 세기")
                .problemCode(null)
                .imagePath(EN_BASE_URL + "2/4/3.webp")
                .description("1부터 50까지의 수를 다양한 방법으로 거꾸로 뛰어 셀 수 있어요.")
                .level(3)
                .parent(enlv2s4)
                .build();
        repository.saveAll(Arrays.asList(enlv2s4c1, enlv2s4c2, enlv2s4c3));

        // ----- 3. m_category_1.json (부모: top2, JSON의 level 2 -> 도메인 level = 3) -----
        Category m1 = Category.builder()
                .name("1과: 덧셈과 뺄셈 시작하기")
                .problemCode(null)
                .imagePath(M_BASE_URL + "1.webp")
                .description("1부터 9까지 숫자의 덧셈과 뺄셈에 대해 배워요.")
                .level(2)
                .parent(M)
                .build();
        Category m2 = Category.builder()
                .name("2과: 두 자릿수의 덧셈과 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "2.webp")
                .description("두 자릿수를 더하고 빼는 연습을 해요.")
                .level(2)
                .parent(M)
                .build();
        Category m3 = Category.builder()
                .name("3과: 받아올림 있는 덧셈과 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "3.webp")
                .description("'받아올림'과 '받아내림'의 개념을 배워요.")
                .level(2)
                .parent(M)
                .build();
        Category m4 = Category.builder()
                .name("4과: 세 자릿수의 덧셈과 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "4.webp")
                .description("세 자릿수를 더하고 빼는 연습을 해요.")
                .level(2)
                .parent(M)
                .build();
        Category m5 = Category.builder()
                .problemCode(null)
                .name("5과: 곱셈과 나눗셈 시작하기")
                .imagePath(M_BASE_URL + "5.webp")
                .description("간단한 곱하기와 나누기 연산을 배우고, 네 자릿수를 더하고 빼는 연습을 해요.")
                .level(2)
                .parent(M)
                .build();
        Category m6 = Category.builder()
                .name("6과: 곱셈과 나눗셈 익숙해지기")
                .problemCode(null)
                .imagePath(M_BASE_URL + "6.webp")
                .description("곱셈구구표를 활용하여, 곱하기와 나누기 연산을 연습해요.")
                .level(2)
                .parent(M)
                .build();
        repository.saveAll(Arrays.asList(m1, m2, m3, m4, m5, m6));

        // ----- 4. m_category_2.json (부모: M, JSON의 level 3 -> 도메인 level = 4) -----
        Category m1_1 = Category.builder()
                .name("합이 9 이하인 덧셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "1/1.webp")
                .description("두 수의 합이 9 이하인 덧셈을 연습해요.")
                .level(3)
                .parent(m1)
                .build();
        Category m1_2 = Category.builder()
                .name("한 자릿수끼리의 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "1/2.webp")
                .description("1부터 9까지의 수들만으로 뺄셈을 연습해요.")
                .level(3)
                .parent(m1)
                .build();
        Category m1_3 = Category.builder()
                .name("합이 10 이상인 덧셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "1/3.webp")
                .description("두 수의 합이 10 이상인 덧셈을 연습해요.")
                .level(3)
                .parent(m1)
                .build();
        Category m1_4 = Category.builder()
                .name("10 - 몇의 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "1/4.webp")
                .description("10에서 한 자릿수를 빼는 연습을 통해 보수 개념을 학습해요.")
                .level(3)
                .parent(m1)
                .build();
        repository.saveAll(Arrays.asList(m1_1, m1_2, m1_3, m1_4));

        // ----- 4. m_category_2.json (부모: M, JSON의 level 3 -> 도메인 level = 4) -----
        Category m2_1 = Category.builder()
                .name("받아올림 없는 두 자릿수 + 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "2/1.webp")
                .description("받아올림이 없이, 두 자릿수와 한자리 수의 덧셈을 연습해요.")
                .level(3)
                .parent(m2)
                .build();
        Category m2_2 = Category.builder()
                .name("받아내림 없는 두 자릿수 - 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "2/2.webp")
                .description("받아내림이 없이, 두 자릿수와 한 자릿수의 뺄셈을 연습해요.")
                .level(3)
                .parent(m2)
                .build();
        Category m2_3 = Category.builder()
                .name("받아올림 없는 두 자릿수 + 두 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "2/3.webp")
                .description("받아올림이 없이, 두 자릿수끼리의 덧셈을 연습해요.")
                .level(3)
                .parent(m2)
                .build();
        Category m2_4 = Category.builder()
                .name("받아내림 없는 두 자릿수 + 두 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "2/4.webp")
                .description("받아내림이 없이, 두 자릿수끼리의 뺄셈을 연습해요.")
                .level(3)
                .parent(m2)
                .build();
        repository.saveAll(Arrays.asList(m2_1, m2_2, m2_3, m2_4));

        // ----- 5. m_category_3.json (부모: s3, JSON의 level 3 -> 도메인 level = 4) -----
        Category m3_1 = Category.builder()
                .name("받아올림 있는 두 자릿수 + 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "3/1.webp")
                .description("받아올림이 있는 두 자릿수와 한 자릿수의 덧셈을 배워요.")
                .level(3)
                .parent(m3)
                .build();
        Category m3_2 = Category.builder()
                .name("받아내림 있는 두 자릿수 - 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "3/2.webp")
                .description("받아내림이 있는 두 자릿수와 한 자릿수의 뺄셈을 배워요.")
                .level(3)
                .parent(m3)
                .build();
        Category m3_3 = Category.builder()
                .name("받아올림 있는 두 자릿수 + 두 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "3/3.webp")
                .description("받아올림이 있는 두 자릿수끼리의 덧셈을 배워요.")
                .level(3)
                .parent(m3)
                .build();
        Category m3_4 = Category.builder()
                .name("받아내림 있는 두 자릿수 - 두 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "3/4.webp")
                .description("받아내림이 있는 두 자릿수끼리의 뺄셈을 배워요.")
                .level(3)
                .parent(m3)
                .build();
        repository.saveAll(Arrays.asList(m3_1, m3_2, m3_3, m3_4));

        // ----- 6. m_category_4.json (부모: s4, JSON의 level 3 -> 도메인 level = 4) -----
        Category m4_1 = Category.builder()
                .name("받아올림 없는 세 자릿수 + 세 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "4/1.webp")
                .description("받아올림이 없는 세 자릿수끼리의 덧셈을 배워요.")
                .level(3)
                .parent(m4)
                .build();
        Category m4_2 = Category.builder()
                .name("받아내림 없는 세 자릿수 - 세 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "4/2.webp")
                .description("받아내림이 없는 세 자릿수끼리의 뺄셈을 배워요.")
                .level(3)
                .parent(m4)
                .build();
        Category m4_3 = Category.builder()
                .name("받아올림 있는 세 자릿수 + 세 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "4/3.webp")
                .description("받아올림이 있는 세 자릿수끼리의 덧셈을 배워요.")
                .level(3)
                .parent(m4)
                .build();
        Category m4_4 = Category.builder()
                .name("받아내림 있는 세 자릿수 - 세 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "4/4.webp")
                .description("받아내림이 없는 세 자릿수까리의 덧셈을 배워요.")
                .level(3)
                .parent(m4)
                .build();
        repository.saveAll(Arrays.asList(m4_1, m4_2, m4_3, m4_4));

        // ----- 7. m_category_5.json (부모: s5, JSON의 level 3 -> 도메인 level = 4) -----
        Category m5_1 = Category.builder()
                .name("구구단을 이용한 나눗셈의 몫 구하기")
                .problemCode(null)
                .imagePath(M_BASE_URL + "5/1.webp")
                .description("구구단을 활용하여 나눗셈의 몫을 구하는 방법을 배워요.")
                .level(3)
                .parent(m5)
                .build();
        Category m5_2 = Category.builder()
                .name("두 자릿수와 한 자릿수의 곱셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "5/2.webp")
                .description("두 자릿수와 한 자릿수의 곱셈을 단계별로 연습해요.")
                .level(3)
                .parent(m5)
                .build();
        Category m5_3 = Category.builder()
                .name("네 자릿수의 덧셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "5/3.webp")
                .description("네 자릿수를 더하는 복잡한 덧셈 문제를 연습해요.")
                .level(3)
                .parent(m5)
                .build();
        Category m5_4 = Category.builder()
                .name("네 자릿수의 뺄셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "5/4.webp")
                .description("네 자릿수를 빼는 복잡한 뺄셈 문제를 연습해요.")
                .level(3)
                .parent(m5)
                .build();
        repository.saveAll(Arrays.asList(m5_1, m5_2, m5_3, m5_4));

        // ----- 8. m_category_6.json (부모: s6, JSON의 level 3 -> 도메인 level = 4) -----
        Category m6_1 = Category.builder()
                .name("세 자릿수 x 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "6/1.webp")
                .description("세 자릿수와 한 자릿수의 곱셈을 단계적으로 해결해요.")
                .level(3)
                .parent(m6)
                .build();
        Category m6_2 = Category.builder()
                .name("두 자릿수 x 두 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "6/2.webp")
                .description("두 자릿수끼리의 곱셈 문제를 연습해요.")
                .level(3)
                .parent(m6)
                .build();
        Category m6_3 = Category.builder()
                .name("두 자릿수 ÷ 한 자릿수")
                .problemCode(null)
                .imagePath(M_BASE_URL + "6/3.webp")
                .description("두 자릿수와 한 자릿수의 나눗셈은 단계적으로 해결해요.")
                .level(3)
                .parent(m6)
                .build();
        Category m6_4 = Category.builder()
                .name("나머지가 있는 나눗셈")
                .problemCode(null)
                .imagePath(M_BASE_URL + "6/4.webp")
                .description("나머지가 남는 나눗셈 유형을 연습하고 해결해요.")
                .level(3)
                .parent(m6)
                .build();
        repository.saveAll(Arrays.asList(m6_1, m6_2, m6_3, m6_4));
    }
}
