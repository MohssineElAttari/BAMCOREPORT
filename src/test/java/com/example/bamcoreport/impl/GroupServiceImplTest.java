package com.example.bamcoreport.impl;

import com.example.bamcoreport.model.entity.Group;
import com.example.bamcoreport.model.entity.User;
import com.example.bamcoreport.repository.GroupRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class GroupServiceImplTest {


    @Mock
    private GroupRepository groupRepository;

    @InjectMocks
    private GroupServiceImpl groupService;



    @Test
    void getAllGroup() {
        LocalDateTime now = LocalDateTime.now();
        Group group1 = new Group(1L,"group1","group1","group1","group1",new User(),now,now);
        Group group2 = new Group(2L,"group2","group2","group2","group2",new User(),now,now);
        Group group3 = new Group(3L,"group3","group3","group3","group3",new User(),now,now);

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        Mockito.when(groupService.getAllGroup()).thenReturn(groups);
        assertNotNull(groupService.getAllGroup());
    }

    @Test
    void createGroup() {
    }

    @Test
    void updateGroup() {
    }

    @Test
    void deleteGroup() {
    }

    @Test
    void getGroupById() {
    }
}