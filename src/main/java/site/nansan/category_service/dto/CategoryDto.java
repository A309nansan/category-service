package site.nansan.category_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import site.nansan.category_service.domain.Category;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto {

    private Long id;

    private String name;

    private String problemCode;

    private String imagePath;

    private String description;

    private String serviceName;

    public static CategoryDto from(
            Category category
    ) {

        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .problemCode(category.getProblemCode())
                .imagePath(category.getImagePath())
                .description(category.getDescription())
                .serviceName(category.getLevel() == 1 ? ServiceName.fromLabel(category.getName()) : null)
                .build();
    }
}

