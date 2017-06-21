package org.fmarin.controller.field;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fmarin.controller.field.FieldBuilder.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FieldControllerUTest {

    @InjectMocks
    private FieldController controller;
    
    @Mock
    private FieldRepository mockedRepository;
    
    @Test
    public void list() {
        // Given
        List<Field> fields = Lists.newArrayList(
                aField().withId(1L).withName("Central Court").build(),
                aField().withId(2L).withName("Court #1").build()
        );

        when(mockedRepository.findAll()).thenReturn(fields);

        // When
        List<Field> result = controller.list();
        
        // Then
        assertThat(result).isEqualTo(fields);
    }
    
}