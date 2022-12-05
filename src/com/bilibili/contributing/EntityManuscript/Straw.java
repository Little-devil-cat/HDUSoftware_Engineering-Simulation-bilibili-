package com.bilibili.contributing.EntityManuscript;

import java.io.File;

public interface Straw {

    void Uplode();

    void setName(String Name);

    String getName();

    void setIntroduction(String Introduction);
    String getIntroduction();

    File getFile();

    void setLock(boolean Lock);
    boolean getLock();
    void setOvert(boolean Overt);
    boolean getOvert();
    void setNeedCheck(boolean NeedCheck);
    boolean getNeedCheck();
}
