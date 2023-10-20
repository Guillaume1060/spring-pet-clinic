package com.udemy.springpetclinic.controllers;

import com.udemy.springpetclinic.model.Owner;
import com.udemy.springpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// Extension to use Mockito
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    // Adding Mock
    @Mock
    OwnerService ownerService;
    // Injecting our Mocks into the controller
    @InjectMocks
    OwnerController controller;
    Set<Owner> owners;
    MockMvc mockMvc;
    @BeforeEach
    void setUp() {
        // Setting up an HashSet with 2 owners
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        // Building the MockMvc with our controller
        mockMvc = MockMvcBuilders
                .standaloneSetup(controller)
                .build();
    }

    @Test
    void listOwners() throws Exception {
        // Setup to return owners when our ownerService call findAll
        when(ownerService.findAll()).thenReturn(owners);

        // Using our mockMvc checkout our routes, view and attribute.
        mockMvc.perform(get("/owners"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }

    @Test
    // Idem with a different path
    void listOwnersByIndex() throws Exception {
        when(ownerService.findAll()).thenReturn(owners);

        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }

    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("notImplemented"));

        // Checking our service is not call.
        verifyNoInteractions(ownerService);
    }

    @Test
    void displayOwner() throws Exception {
        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1l).build());

        mockMvc.perform(get("/owners/123"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownerDetails"))
                .andExpect(model().attribute("owner", hasProperty("id", is(1l))));
    }
}