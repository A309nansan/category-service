package site.nansan.category_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import site.nansan.category_service.dto.CategoryResponse;
import site.nansan.category_service.service.CategoryService;

@RestController
@RequiredArgsConstructor
public class CategoryController implements CategorySwaggerController{

    private final CategoryService service;

    @Override
    public ResponseEntity<CategoryResponse> getCategories(Long parentId) {

        return ResponseEntity.ok(service.getCategories(parentId));
    }
}
