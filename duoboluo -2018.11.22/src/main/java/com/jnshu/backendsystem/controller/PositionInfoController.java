package com.jnshu.backendsystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.backendsystem.pojo.PositionInfo;
import com.jnshu.backendsystem.pojo.PositionInfo2;
import com.jnshu.backendsystem.pojo.Result;
import com.jnshu.backendsystem.service.PositionService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
public class PositionInfoController {

    @Autowired
    PositionService positionService;
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: 2018/11/10 后端前台
    // TODO: 2018/11/3 搜索职位
    @PostMapping(value = "/duoboluo/u/search_position_list")
    public Result searchPositionList(String positionName, Integer isRecommend, int[] positionType, int[] education, String[] city, int[] companyIndustry,
                                     int[] workExperience, int[] salary, Long beginDate, Long endDate,
                                     @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                     @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("positionName:" + positionName + "\n" + "isRecommend:" + isRecommend +
                "\n" + "education:" + education + "\n" + "companyIndustry:" + companyIndustry + "\n" +
                "workExperience:" + workExperience + "\n" + "salary:" + salary +
                "\n" + "page:" + page + "\n" + "size:" + size + "\n" + "beginDate:" + beginDate + "\n" + "endDate" + endDate + "\n");
        logger.info("------------------------");
        Result result = new Result();
        HashMap data = new HashMap();
        try {
            PageHelper.startPage(page, size);
            List<PositionInfo2> positionInfoList = positionService.searchPositionList(positionName, isRecommend, positionType, education, city, companyIndustry, workExperience, salary, beginDate, endDate);
            PageInfo<PositionInfo2> pageInfo = new PageInfo<PositionInfo2>(positionInfoList);
            data.put("total", pageInfo.getTotal());
            data.put("positionInfoList", pageInfo.getList());
            logger.info("查询返回的结果为：" + pageInfo.getList());
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("查询异常，重新输入查询条件");
            return result;
        }
    }

    // TODO: 2018/11/4 返回4个最新推荐职位
    @GetMapping(value = "/duoboluo/u/positionList/four_recommend_position")
    public Result fourRecommendPosition() {
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        PageInfo pageInfo = new PageInfo();
        try {
            List fourRecommendPositionList = positionService.fourRecommendPosition();
            data.put("fourRecommendPositionList", fourRecommendPositionList);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            result.setCode(4000);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }

    // TODO: 2018/11/4 获取最新或推荐职位
    @GetMapping(value = "/duoboluo/u/diversity_position_list")
    public Result getsearchNewOrRecommendPosition(
            @RequestParam(value = "isRecommend", required = false, defaultValue = "0") Integer isRecommend,
            @RequestParam(value = "total", required = false, defaultValue = "20") Integer total) {
        logger.info("------------输入请求参数------------");
        logger.info("isRecommend:" + isRecommend + "\n" + "total:" + total + "\n");
        logger.info("------------------------");
        Result result = new Result();
        List list = new ArrayList();
        HashMap data = new HashMap();
        try {
            List searchNewOrRecommendPositionList = positionService.searchNewOrRecommendPosition(isRecommend, total);
            data.put("searchNewOrRecommendPositionList", searchNewOrRecommendPositionList);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }

    // TODO: 2018/11/5 职位介绍
    @GetMapping(value = "/duoboluo/u/position_info")
    public Result getPositionDetail(Long positionId) {
        logger.info("------------输入请求参数------------");
        logger.info("positionId:" + positionId + "\n");
        logger.info("------------------------");
        Result result = new Result();
        List list = new ArrayList();
        HashMap data = new HashMap();
        try {
            list = positionService.getPositionDetail(positionId);
            if (list.size() == 0) {
                result.setCode(40001);
                result.setMessage("找不到该职位的详细信息，请确认职位id是否正确再试！");
                return result;
            } else {
                data.put("getPositionDetail", list);
                result.setCode(0);
                result.setMessage("SUCCESS");
                result.setData(data);
                logger.info("查询该职位的信息" + list.toString());
                return result;
            }
        } catch (RuntimeException e) {
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10 搜索职位信息列表
    @PostMapping(value = "/a/company/position/{companyId}")
    public Result qureyPositionList(@PathVariable Long companyId, String companyName, String positionName, Integer positionType, Integer education, Integer workExperience, Integer salary, Integer isOnline, Long beginDate, Long endDate,
                                    @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                    @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("positionName:" + positionName + "\n" + "companyName:" + companyName + "\n" + "ompanyId:" + companyId +
                "\n" + "education:" + education + "\n" + "positionType:" + positionType + "\n" + "isOnline:" + isOnline + "\n" +
                "workExperience:" + workExperience + "\n" + "salary:" + salary +
                "\n" + "page:" + page + "\n" + "size:" + size + "\n" + "beginDate:" + beginDate + "\n" + "endDate" + endDate + "\n");
        logger.info("------------------------");
        Result result = new Result();
        HashMap data = new HashMap();
        try {
            PageHelper.startPage(page, size);
            List<PositionInfo2> positionInfoList = positionService.qureyPositionList(companyId, companyName, positionName, positionType, education, workExperience, salary, isOnline, beginDate, endDate);
            PageInfo<PositionInfo2> pageInfo = new PageInfo<PositionInfo2>(positionInfoList);
            data.put("total", pageInfo.getTotal());
            data.put("positionInfoList", pageInfo.getList());
            logger.info("查询返回的结果为：" + pageInfo.getList());
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("查询异常，重新输入查询条件");
            return result;
        }
    }


    // TODO: 2018/11/10 新增职位信息
    @PostMapping(value = "/a/position")
    public Result insertPositionInfo(PositionInfo record) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "record:" + record + "\n");
        logger.info("--------------------------------");
        try {
            Integer i = positionService.insertPositionByCompanyId(record);
            result.setCode(i);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeException e) {
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/10 查询单个职位信息
    @GetMapping(value = "/a/position/{positionId}")
    public Result qureyOnePosition(@PathVariable Long positionId) {
        Result result = new Result();
        HashMap data = new HashMap();
        List<PositionInfo2> list;
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "positionId:" + positionId + "\n");
        logger.info("--------------------------------");
        try {
            list = positionService.qureyOnePosition(positionId);
            logger.info(list.toString());
            data.put("qureyOnePosition", list);
            result.setData(data);
            result.setCode(1);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeException e) {
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/10 更新职位信息
    @PutMapping("/a/position/{positionId}")
    public Result updateByPOsitionId(PositionInfo record) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "record:" + record + "\n");
        logger.info("--------------------------------");
        try {
            Integer i = positionService.updateByPositionId(record);
            result.setCode(i);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeException e) {
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/10 删除职位信息
    @DeleteMapping("/a/position/{positionId}")
    public Result deleteByPositionId(@PathVariable Long positionId) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "positionId:" + positionId + "\n");
        logger.info("--------------------------------");
        int statue = positionService.qureyIsOnline(positionId);
        if (statue == 0) {
            try {
                Integer i = positionService.deleteByPositionId(positionId);
                result.setCode(i);
                result.setMessage("SUCCESS");
                return result;
            } catch (RuntimeException e) {
                e.toString();
                result.setCode(40001);
                result.setMessage("系统繁忙，请稍后重试");
                return result;
            }
        } else {
            result.setCode(40000);
            result.setMessage("存在上线职位信息，请先下架该职位信息，再进行删除");
            return result;
        }
    }

    // TODO: 2018/11/10  更改职位状态
    @PutMapping("/a/position/online/{positionId}")
    public Result upadtePositionInfoByPositionId(@PathVariable Long positionId,Integer isOnline){
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "positionId:" + positionId + "\n" + "isOnline:" + isOnline + "\n");
        logger.info("--------------------------------");
            try {
                Integer i = positionService.updatePositionInfoByPositionIid(positionId,isOnline);
                result.setCode(i);
                result.setMessage("SUCCESS");
                return result;
            } catch (RuntimeException e) {
                e.toString();
                result.setCode(40001);
                result.setMessage("系统繁忙，请稍后重试");
                return result;
            }
    }
}
