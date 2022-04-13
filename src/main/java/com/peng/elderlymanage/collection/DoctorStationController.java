package com.peng.elderlymanage.collection;

import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.DoctorStation;
import com.peng.elderlymanage.server.DoctorStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: DoctorStation
 * @description:
 * @author: 空城丶
 * @create: 2022-03-30 17:19
 **/
@RestController
@RequestMapping("/station")
public class DoctorStationController {
    @Autowired
    private DoctorStationService doctorStationService;
    @Autowired
    private Result result;
    @GetMapping
    public DoctorStation selectOne(@RequestParam("stationid") int stationid){
        DoctorStation doctorStation = doctorStationService.selectOne(stationid);
        return doctorStation;
    }
    @GetMapping("/getStation")
    public Result getStation(){
       List<DoctorStation> station=doctorStationService.getAllStation();
       return result.success(station);
    }
}
