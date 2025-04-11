package site.nansan.category_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ServiceName {

    en("수 인식(EN)"),
    m("사칙연산(M)"),
    test("테스트(BASA)");

    private final String label;

    public static String fromLabel(String label) {

        return Arrays.stream(ServiceName.values())
                .filter(serviceName -> serviceName.label.equals(label))
                .map(Enum::name)
                .findFirst()
                .orElse(null); // 매칭 안 될 경우 null 반환
    }
}
