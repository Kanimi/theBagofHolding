package com.qa.controllers;
import com.qa.models.DbData;
import com.qa.repository.DbDataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DbDataControllerTest {

    @InjectMocks
    private DbDataController dbdataController;

    @Mock
    private DbDataRepository repository;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllDice(){
        List<DbData> diceList = new ArrayList<>();
        DbData dice = new DbData();
        dice.setAmount(20L);
        dice.setColour("Brown");
        dice.setMaterial("Plastic");
        dice.setType("D6");
        diceList.add(dice);

        when(repository.findAll()).thenReturn(diceList);
        assertEquals(dbdataController.listAllDice().get(0).getType(), "D6");
    }


}