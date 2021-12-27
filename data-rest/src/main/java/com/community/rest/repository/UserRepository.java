package com.community.rest.repository;

import com.community.rest.domain.Board;
import com.community.rest.domain.User;
import com.community.rest.domain.projection.UserOnlyContainName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(excerptProjection = UserOnlyContainName.class)
public interface UserRepository extends JpaRepository<User, Long> {

//    @Override
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    <S extends Board> S save(S entity);
}
