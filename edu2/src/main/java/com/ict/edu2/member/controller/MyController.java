package com.ict.edu2.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ict.edu2.member.dao.MemberDAO;
import com.ict.edu2.member.vo.VO;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/member")
@Slf4j
public class MyController {
    //test
    @Autowired
    private MemberDAO memberDAO;

    @GetMapping("/")
    public String Hello() {
        return "Hello World";
    }


    @GetMapping("/login")
    public Map<String, Object> logIn(VO vo 
    ) {
        log.info("\n"+"login 서버!!");
        log.info("\n"+vo.getM_id());
        log.info("\n"+vo.getM_pw());        
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("chk", 0);
        resMap.put("vo", vo);
        return resMap;
    }

    @PostMapping("/login")
    public Map<String, Object> logIn2(VO vo ) {
        log.info("\n"+"login 서버!!");
        log.info("\n"+vo.getM_id());
        log.info("\n"+vo.getM_pw());        
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("chk", 0);
        resMap.put("vo", vo);
        return resMap;
    }

    @GetMapping("/list")
    public Map<String, Object> getList() {
        
        List<VO> list = memberDAO.getList();

        Map<String , Object> resMap = new HashMap<>();
        resMap.put("list", list);
        return resMap;
    }
}
