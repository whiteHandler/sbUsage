package com.sb.service.impl;

import java.util.List;
import java.util.Map;

import com.sb.service.PeopleInfosService;
// import com.sb.dao.PeopleInfosDao;
import com.sb.mapper.PeopleInfosMapper;
import com.sb.po.PeopleInfos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service 
@Transactional
public class PeopleInfosServiceImpl implements PeopleInfosService{

    @Autowired 
    private PeopleInfosMapper peopleInfosMapper;

    static Logger logger = LoggerFactory.getLogger(PeopleInfosServiceImpl.class);
    @Override 
    public List<PeopleInfos> getAllPeopleInfos(){
        // List<PeopleInfos> infos = peopleInfosDao.selectAllPeopleInfos();
        List<PeopleInfos> infos = peopleInfosMapper.selectAllPeopleInfos();
        logger.info("test");
        return infos;
    }

    // @Override 
    // public Map getInfosByPlugin(Map params){
    //     Integer pageNum = Integer.parseInt(params.get("pageNum").toString());
    //     Integer pageSize = Integer.parseInt(params.get("pageSize").toString());
    //     logger.info("pageNum:{}", pageNum);
    //     PageHelper.startPage(pageNum, pageSize);
    //     List<PeopleInfos> infosLi = peopleInfosMapper.selectAllPeopleInfos();
    //     logger.info("infos:{}", infosLi);
    //     Page infosPage = (Page)infosLi;
    //     PageInfo<PeopleInfos> pageInfos = new PageInfo<PeopleInfos>(infosPage);
    //     return pageInfos;
    // }

}