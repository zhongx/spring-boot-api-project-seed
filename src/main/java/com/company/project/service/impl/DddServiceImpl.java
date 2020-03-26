package com.company.project.service.impl;

import com.company.project.dao.DddMapper;
import com.company.project.model.Ddd;
import com.company.project.service.DddService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/26.
 */
@Service
@Transactional
public class DddServiceImpl extends AbstractService<Ddd> implements DddService {
    @Resource
    private DddMapper dddMapper;

}
