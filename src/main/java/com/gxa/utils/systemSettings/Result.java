package com.gxa.utils.systemSettings;


import com.gxa.entity.systemSettings.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;
    private String sec;
    private String error;

    public Result(EMEmployeeTable em_employeeTable) {
        this.em_employeeTable = em_employeeTable;
    }

    public Result(RolesTable roles_table) {
        this.roles_table = roles_table;
    }

    public Result(int code, String sec, String error) {
        this.code = code;
        this.sec = sec;
        this.error = error;
    }

    public Result(CPSMainTable cps_mainTable) {
        this.cps_mainTable = cps_mainTable;
    }

    // private CPS_ViceTable cps_viceTable;
    private CPSMainTable cps_mainTable;
    private EMEmployeeTable em_employeeTable;
    private Function function;
    private JurisdictionTable jurisdiction_table;
    private RolesTable roles_table;













        private String msg ;
        private Integer count;
        private Object data;


        public Result(Integer code, String msg, Integer count, Object data) {
            this.code = code;
            this.msg = msg;
            this.count = count;
            this.data = data;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "code=" + code +
                    ", msg='" + msg + '\'' +
                    ", count=" + count +
                    ", data=" + data +
                    '}';
        }


}
