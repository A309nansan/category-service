package site.nansan.category_service.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import site.nansan.category_service.domain.Category;
import site.nansan.category_service.domain.QCategory;

import java.util.List;

@RequiredArgsConstructor
public class CategoryRepositoryImpl implements CategoryRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Category> findCategoriesByParentId(Long parentId) {
        QCategory category = QCategory.category;

        if (parentId == null) {
            return queryFactory.selectFrom(category)
                    .where(category.parent.isNull())
                    .orderBy(category.id.asc())
                    .fetch();
        } else {
            return queryFactory.selectFrom(category)
                    .where(category.parent.id.eq(parentId))
                    .orderBy(category.id.asc())
                    .fetch();
        }
    }
}
