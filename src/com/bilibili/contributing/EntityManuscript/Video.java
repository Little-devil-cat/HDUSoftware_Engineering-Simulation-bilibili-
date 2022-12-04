package com.bilibili.contributing.EntityManuscript;

import java.io.File;
import java.lang.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Video implements Straw {

    private String Name;
    private String Introduction;
    private File Video;
    private boolean Lock;
    private boolean Overt;
    private boolean NeedCheck;

    @Override
    public void setOvert(boolean Overt){
        this.Overt = Overt;
    }
    public void setLock(boolean Lock){
        this.Lock = Lock;
    }
    public void setNeedCheck(boolean NeedCheck){
        this.NeedCheck = NeedCheck;
    }

    public boolean getLock(){
        return Lock;
    }
    public boolean getOvert(){
        return Overt;
    }
    public boolean getNeedCheck(){
        return NeedCheck;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setIntroduction(String Introduction) {

        this.Introduction = Introduction;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public File getFile() {
        return Video;
    }


    public void Uplode() {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("video(*.mp4, *.flv, *.avi)", "mp4", "flv", "avi"));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            // 如果点击了"确定", 则获取选择的文件路径

            /*返回值:
             *     JFileChooser.CANCEL_OPTION: 点击了取消或关闭
             *     JFileChooser.APPROVE_OPTION: 点击了确认或保存
             *     JFileChooser.ERROR_OPTION: 出现错误*/

            // 获得被选择文件
            this.Video = fileChooser.getSelectedFile();
        }


    }
}
