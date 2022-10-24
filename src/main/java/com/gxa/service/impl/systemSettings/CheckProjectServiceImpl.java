package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.CPSViceTable;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.mapper.systemSettings.CheckProjectSetMapper;
import com.gxa.service.systemSettings.CheckProjectSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CheckProjectServiceImpl implements CheckProjectSetService {
    @Autowired
    private CheckProjectSetMapper checkProjectSet_mapper;
    @Override
    public List<CPSMainTable> selectAll() {
        List<CPSMainTable> CPSMainTables = checkProjectSet_mapper.selectALl();
        return CPSMainTables;
    }

    @Override
    public void update(CPSEdit cpsEdit) {
        Date date = new Date();
        cpsEdit.setCreationTime(date);
        checkProjectSet_mapper.update(cpsEdit);
    }

    @Override
    public void insert(CPSEdit cpsEdit) {
        Date date = new Date();
        cpsEdit.setCreationTime(date);
        checkProjectSet_mapper.insert(cpsEdit);
    }

    @Override
    public void delete(int id,String projectStatus) {
        if(projectStatus.equals("0")){
            checkProjectSet_mapper.change(id);
        }else {
            checkProjectSet_mapper.delete(id);
        }
    }

    @Override
    public List<CPSMainTable> select(CPSEdit cpsEdit) {
        if (cpsEdit.getProjectStatus().length()==0 && cpsEdit.getProjectName().length()==0 ){


            System.out.println("111111111111111111");
            List<CPSMainTable> cpsMainTables = checkProjectSet_mapper.selectALl();
            return cpsMainTables;
        }else if(cpsEdit.getProjectStatus().length()==0 ) {

            System.out.println("2222222222222222222");
            List<CPSMainTable> select = checkProjectSet_mapper.select(cpsEdit);
            return select;
        }else if (cpsEdit.getProjectStatus().length()!=0 && cpsEdit.getProjectName().length()!=0 ) {


            System.out.println("333333333333333333333");
            List<CPSMainTable> select = checkProjectSet_mapper.select2(cpsEdit);
            return select;
        }else if (cpsEdit.getProjectStatus().length()!=0 && cpsEdit.getProjectName().length()==0 ) {

            System.out.println("44444444444444444");
            List<CPSMainTable> select = checkProjectSet_mapper.select1(cpsEdit);
            return select;
        }

        System.out.println("555555555555555555555");
        return null;
    }

    @Override
    public List<CPSViceTable> drop() {
        List<CPSViceTable> drop = checkProjectSet_mapper.drop();
        return drop;
    }

    @Override
    public void dropA(String unit) {
        checkProjectSet_mapper.dropA(unit);

//        if (unit.length()==0 && projectCategory.length()>0 && invoiceItem.length()>0){
//            checkProjectSet_mapper.xll(projectCategory,invoiceItem);
//        } if (unit.length()==0 && projectCategory.length()==0 && invoiceItem.length()>0){
//            checkProjectSet_mapper.xxl(invoiceItem);
//        } if (unit.length()==0 && projectCategory.length()==0 && invoiceItem.length()==0){
//            System.out.println("");
//        } if (unit.length()>0 && projectCategory.length()==0 && invoiceItem.length()>0){
//            checkProjectSet_mapper.lxl(unit,invoiceItem);
//        }if (unit.length()>0 && projectCategory.length()==0 && invoiceItem.length()==0){
//            checkProjectSet_mapper.lxx(unit);
//        }if (unit.length()>0 && projectCategory.length()>0 && invoiceItem.length()==0){
//            checkProjectSet_mapper.lxx(unit,projectCategory);
//        }
//        checkProjectSet_mapper.dropA(unit,projectCategory,invoiceItem);
    }

    @Override
    public void dropB(String projectCategory) {
        checkProjectSet_mapper.dropB(projectCategory);
    }

    @Override
    public void dropC(String invoiceItem) {
        checkProjectSet_mapper.dropC(invoiceItem);
    }


}


