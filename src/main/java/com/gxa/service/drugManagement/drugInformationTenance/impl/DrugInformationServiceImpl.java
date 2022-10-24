package com.gxa.service.drugManagement.drugInformationTenance.impl;

import com.gxa.entity.drugManagement.drugInformationTenance.AfficacyDescription;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugOtherInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugPackageInformation;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationMapper;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 10:00
 */
@Service
public class DrugInformationServiceImpl implements DrugInformationService {
    @Autowired
    private DrugInformationMapper drugInformationMapper;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public List<DrugBasicInformation> list() {
        return drugInformationMapper.queryList();
    }

    @Override
    public List<DrugBasicInformation> search(String prescriptionCategory,Integer status,String createTime,String rules) {
        //将前端获取到的字符串数据拆分
        String start = null;
        String end = null;
        if(createTime!=null && createTime.indexOf(",")!=-1){
            String[] createTimeArray = createTime.split(",");
            start = createTimeArray[0].trim();
            end = createTimeArray[1].trim();
        }
        return drugInformationMapper.search(prescriptionCategory,status,start,end,rules);
    }

    @Override
    public void editStatus(Integer id) {
        //根据id查询到需要修改的状态
        DrugBasicInformation drugBasicInformation = drugInformationMapper.queryStatusById(id);
        System.out.println(drugBasicInformation);
        //状态取反,进行更新
        drugInformationMapper.updateStatus(id,drugBasicInformation.getStatus()==1?0:1);
    }

    @Override
    public DrugBasicInformation editPre(Integer id) {
        DrugBasicInformation drugBasicInformation = drugInformationMapper.queryDrugBasicInformationById(id);
        System.out.println("drugBasicInformation=" + drugBasicInformation);
        AfficacyDescription afficacyDescription = drugInformationMapper.queryAfficacyDescription(id);
        System.out.println("afficacyDescription=" + afficacyDescription);
        DrugOtherInformation drugOtherInformation = drugInformationMapper.queryDrugOtherInformationById(id);
        System.out.println("drugOtherInformation=" + drugOtherInformation);
        DrugPackageInformation drugPackageInformation = drugInformationMapper.queryDrugPackageInformationById(id);
        System.out.println("drugPackageInformation=" + drugPackageInformation);

        drugBasicInformation.setAfficacyDescription(afficacyDescription);
        drugBasicInformation.setDrugOtherInformation(drugOtherInformation);
        drugBasicInformation.setDrugPackageInformation(drugPackageInformation);
        return drugBasicInformation;
    }

    @Override
    public void save(DrugBasicInformation drugBasicInformation) {
        if(drugBasicInformation.getId()==null){//如果id为null,则为新增
            //设置新增时间
            String createTime = sdf.format(new Date());
            drugBasicInformation.setCreateTime(createTime);
            //查询数据库所有记录
            List<DrugBasicInformation> drugBasicInformations = drugInformationMapper.queryList();
            //定义id
            Integer id = null;
            //设置code
            Integer code = null;
            //判断是否存在数据,若没有数据则赋值id为1,
            // 若存在数据获取到最后一条数据
            if(drugBasicInformations != null) {
                id = drugBasicInformations.get(drugBasicInformations.size() - 1).getId() + 1;
                code = Integer.parseInt(drugBasicInformations.get(drugBasicInformations.size() - 1).getCode())+1;
            }else{
                id = 1;
                code = 1000001;
            }
            drugBasicInformation.setCode(String.valueOf(code));
            //设置三个小表的外键id，并调用mapper方法
            DrugPackageInformation drugPackageInformation = drugBasicInformation.getDrugPackageInformation();
            System.out.println("包装信息"+drugPackageInformation);
            drugPackageInformation.setDrugInfoId(id);
            drugInformationMapper.saveDrugPackageInformation(drugPackageInformation);

            DrugOtherInformation drugOtherInformation = drugBasicInformation.getDrugOtherInformation();
            System.out.println("其他信息"+drugOtherInformation);
            drugOtherInformation.setDrugInfoId(id);
            drugInformationMapper.saveDrugOtherInformation(drugOtherInformation);

            AfficacyDescription afficacyDescription = drugBasicInformation.getAfficacyDescription();
            System.out.println("功效信息"+afficacyDescription);
            afficacyDescription.setDrugInfoId(id);
            drugInformationMapper.saveAfficacyDescription(afficacyDescription);

            //将大表进行添加
            drugInformationMapper.save(drugBasicInformation);

            //初始化库存信息
            InventoryInfo inventoryInfo = new InventoryInfo();
            inventoryInfo.setLocationNo("12-1024");
            inventoryInfo.setStock(0);
            inventoryInfo.setPurchaseAmount(0.0);
            inventoryInfo.setRetailAmount(0.0);
            inventoryInfo.setDrugInfoId(id);
            drugInformationMapper.saveInventoryInfo(inventoryInfo);
        }else{//如果id不为null,则为修改
            Integer ids = drugBasicInformation.getId();

            DrugPackageInformation drugPackageInformation = drugBasicInformation.getDrugPackageInformation();
            drugPackageInformation.setDrugInfoId(ids);
            drugInformationMapper.updateDrugPackageInformation(drugPackageInformation);


            DrugOtherInformation drugOtherInformation = drugBasicInformation.getDrugOtherInformation();
            drugOtherInformation.setDrugInfoId(ids);
            drugInformationMapper.updateDrugOtherInformation(drugOtherInformation);

            AfficacyDescription afficacyDescription = drugBasicInformation.getAfficacyDescription();
            afficacyDescription.setDrugInfoId(ids);
            drugInformationMapper.updateAfficacyDescription(afficacyDescription);

            drugInformationMapper.update(drugBasicInformation);
        }
    }
}
