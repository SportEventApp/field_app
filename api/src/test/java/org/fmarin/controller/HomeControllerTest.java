package org.fmarin.controller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeControllerTest {

    @Test
    public void helloWorld() throws Exception {
        // Given
        // When
        HomeController homeController = new HomeController();

        // Then
        assertThat(homeController.home()).isEqualTo("Hello world");
    }
}