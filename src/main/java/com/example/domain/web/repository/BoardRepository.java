package com.example.domain.web.repository;

import com.example.domain.Board;
import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByUser(User user);
}
