package site.nansan.category_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.nansan.category_service.domain.Category;
import site.nansan.category_service.dto.CategoryDto;
import site.nansan.category_service.dto.CategoryResponse;
import site.nansan.category_service.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryResponse getCategories(Long parentId) {

        List<Category> categories = repository.findCategoriesByParentId(parentId);
        List<CategoryDto> categoriesDto = categories.stream()
                .map(CategoryDto::from)
                .collect(Collectors.toList());

        return CategoryResponse.from(parentId, categoriesDto);
    }
}
