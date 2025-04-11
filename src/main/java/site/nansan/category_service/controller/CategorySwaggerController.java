package site.nansan.category_service.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.nansan.category_service.dto.CategoryResponse;

@Tag(name = "Problem Category API", description = "문제 카테고리 관련 API.")
public interface CategorySwaggerController {

    @Operation(
            summary = "카테고리 조회",
            description = "parentId 파라미터에 따라 최상위(부모가 없는) 또는 특정 부모의 하위 카테고리를 조회합니다. parentId가 없으면 최상위 카테고리를, 있으면 해당 parentId를 가진 카테고리를 반환합니다."
    )
    @GetMapping("/list")
    ResponseEntity<CategoryResponse> getCategories(@RequestParam(name = "parent_id", required = false) Long parentId);
}