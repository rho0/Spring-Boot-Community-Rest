package com.community.rest.domain.projection;

import com.community.rest.domain.Board;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "getOnlyTitle", types = {Board.class})
public interface BoardOnlyContainTile {
    String getTitle();
}
