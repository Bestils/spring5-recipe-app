package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gladus on 18.06.2018.
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue =4l;

        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }
    @Test
    public void getDescripton() throws Exception{

    }

    @Test
    public void getRecipes() throws Exception {

    }
}
