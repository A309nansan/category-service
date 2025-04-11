package site.nansan.category_service.repository;

import site.nansan.category_service.domain.Category;

import java.util.List;

public interface CategoryRepositoryCustom {
    List<Category> findCategoriesByParentId(Long parentId);
}
