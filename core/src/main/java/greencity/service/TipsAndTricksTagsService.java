package greencity.service;

import greencity.entity.TipsAndTricksTag;
import java.util.List;

/**
 * Provides the interface to manage {@link TipsAndTricksTag} entity.
 */
public interface TipsAndTricksTagsService {
    /**
     * Method that allow you to find all {@link TipsAndTricksTag}.
     *
     * @return list of {@link TipsAndTricksTag}'s names
     */
    List<String> findAll();

    /**
     * Method that allow you to find {@link TipsAndTricksTag} by name.
     *
     * @param name a value of {@link String}
     * @return {@link TipsAndTricksTag}
     */
    TipsAndTricksTag findByName(String name);
}