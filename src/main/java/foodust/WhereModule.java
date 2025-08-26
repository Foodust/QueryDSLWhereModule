package foodust;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class WhereModule {
    public BooleanExpression likeSide(StringPath path, String data) {
        return data != null ? path.like("%" + data + "%") : null;
    }

    public BooleanExpression likeRight(StringPath path, String data) {
        return data != null ? path.like(data + "%") : null;
    }

    public BooleanExpression likeLeft(StringPath path, String data) {
        return data != null ? path.like("%" + data) : null;
    }

    public BooleanBuilder likeLeftOr(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like("%" + text)).forEach(booleanBuilder::or);
        return booleanBuilder;
    }

    public BooleanBuilder likeRightOr(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like(text + "%")).forEach(booleanBuilder::or);
        return booleanBuilder;
    }

    public BooleanBuilder likeLeftAnd(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like("%" + text)).forEach(booleanBuilder::and);
        return booleanBuilder;
    }

    public BooleanBuilder likeRightAnd(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like(text + "%")).forEach(booleanBuilder::and);
        return booleanBuilder;
    }

    public BooleanBuilder likeSideOr(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like("%" + text + "%")).forEach(booleanBuilder::or);
        return booleanBuilder;
    }

    public BooleanBuilder likeSideAnd(String text, StringPath... stringPaths) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if (text == null)
            return null;
        Arrays.stream(stringPaths).map(stringPath -> stringPath.like("%" + text + "%")).forEach(booleanBuilder::and);
        return booleanBuilder;
    }

    public BooleanExpression is(StringPath path, String data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(ComparablePath<Character> path, Character data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(BooleanPath path, Boolean data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(NumberPath<Integer> path, Integer data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(NumberPath<Float> path, Float data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(NumberPath<Double> path, Double data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(NumberPath<Long> path, Long data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression is(NumberPath<Integer> path, Integer data, Integer base) {
        return data != null ? path.eq(data) : path.eq(base);
    }

    public BooleanExpression is(NumberPath<Float> path, Float data, Float base) {
        return data != null ? path.eq(data) : path.eq(base);
    }

    public BooleanExpression is(NumberPath<Double> path, Double data, Double base) {
        return data != null ? path.eq(data) : path.eq(base);
    }

    public BooleanExpression is(NumberPath<Long> path, Long data, Long base) {
        return data != null ? path.eq(data) : path.eq(base);
    }

    public BooleanExpression date(DateTimePath<LocalDateTime> path, LocalDateTime data) {
        return data != null ? path.eq(data) : null;
    }

    public BooleanExpression dateLoe(DateTimePath<LocalDateTime> path, LocalDateTime data) {
        return data != null ? path.loe(data) : null;
    }

    public BooleanExpression dateLt(DateTimePath<LocalDateTime> path, LocalDateTime data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression dateGoe(DateTimePath<LocalDateTime> path, LocalDateTime data) {
        return data != null ? path.goe(data) : null;
    }

    public BooleanExpression dateGt(DateTimePath<LocalDateTime> path, LocalDateTime data) {
        return data != null ? path.gt(data) : null;
    }

    public BooleanExpression dateBetween(DateTimePath<LocalDateTime> path, LocalDateTime before, LocalDateTime after) {
        return (before != null && after != null) ? path.between(before, after) : null;
    }

    public BooleanExpression dateBetween(DateTimePath<LocalDateTime> path, String before, String after) {
        return (before != null && after != null) ? path.between(LocalDateTime.parse(before), LocalDateTime.parse(after)) : null;
    }

    public BooleanExpression lt(StringPath path, String data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression lt(NumberPath<Integer> path, String data) {
        return data != null ? path.lt(Integer.parseInt(data)) : null;
    }

    public BooleanExpression lt(NumberPath<Integer> path, Integer data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression lt(NumberPath<Float> path, Float data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression lt(NumberPath<Double> path, Double data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression lt(NumberPath<Long> path, Long data) {
        return data != null ? path.lt(data) : null;
    }

    public BooleanExpression in(NumberPath<Long> path, List<Long> data) {
        return data != null && !data.isEmpty() ? path.in(data) : null;
    }

    public BooleanExpression in(StringPath path, List<String> data) {
        return data != null && !data.isEmpty() ? path.in(data) : null;
    }

    public OrderSpecifier<?> order(StringPath path, String order) {
        return order != null ?
                new OrderSpecifier<>(Order.DESC, path, OrderSpecifier.NullHandling.Default) :
                new OrderSpecifier<>(Order.ASC, path, OrderSpecifier.NullHandling.Default);
    }
}
