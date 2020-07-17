package com.geely.design.pattern.creational.简单工厂模式;

public class VideoFactory {

    //　反射
    public Video getVideo (Class c){
        Video video = null;
        try {
            // 将子类的class对象转为父类对象
            video  = (Video) c.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }


    public Video getVideo (String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
