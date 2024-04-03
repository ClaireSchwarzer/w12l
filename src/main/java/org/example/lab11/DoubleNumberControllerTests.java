package org.example.lab11;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(DoubleNumberController.class)
public class DoubleNumberControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doubleNumberShouldReturnDoubledValue() throws Exception {
        this.mockMvc.perform(get("/double?number=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("6"));
    }
}
