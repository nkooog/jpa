package com.example.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsersId is a Querydsl query type for UsersId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QUsersId extends BeanPath<UsersId> {

    private static final long serialVersionUID = -2019470308L;

    public static final QUsersId usersId = new QUsersId("usersId");

    public final StringPath tenantId = createString("tenantId");

    public final StringPath usrId = createString("usrId");

    public QUsersId(String variable) {
        super(UsersId.class, forVariable(variable));
    }

    public QUsersId(Path<? extends UsersId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsersId(PathMetadata metadata) {
        super(UsersId.class, metadata);
    }

}

