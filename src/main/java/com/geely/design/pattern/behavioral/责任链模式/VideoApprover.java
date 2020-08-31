package com.geely.design.pattern.behavioral.责任链模式;

public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(course.getVideo() != null && !"".equals(course.getVideo())){
            System.out.println(course.getVideo()+"已有手记，批准");
            if(super.approver!=null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getVideo()+"没有手记，不批准流程介绍");
            return;
        }
    }
}
