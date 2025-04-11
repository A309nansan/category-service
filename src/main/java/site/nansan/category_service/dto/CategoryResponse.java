package site.nansan.category_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CategoryResponse {

    private Long parentId;

    private List<CategoryDto> categories;

    public static CategoryResponse from(
            Long parentId,
            List<CategoryDto> categoriesDto
    ) {

        return CategoryResponse.builder()
                .parentId(parentId)
                .categories(categoriesDto)
                .build();
    }
}