package io.metersphere.api.dto.dataCount.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 已执行的案例
 */
@Getter
@Setter
public class ExecutedCaseInfoDTO {
    //排名
    private int sortIndex;
    //案例名称
    private String caseName;
    //所属测试计划
    private String testPlan;
    //失败次数
    private Long failureTimes;
}
