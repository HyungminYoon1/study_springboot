package com.yojulab.study_springboot.service;


import com.yojulab.study_springboot.dao.SharedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CarCompanyService {

    @Autowired
    SharedDao sharedDao;

    public Object getCarCompanyInfo(Map dataMap) {
        String sqlMapId = "CarCompany.selectCarCompanyInfo";

        Object result = sharedDao.getList(sqlMapId, dataMap);
        if (result == null) {
            return List.of(); // 빈 리스트를 반환하거나 적절한 처리를 함
        }
        return result;
    }
}
