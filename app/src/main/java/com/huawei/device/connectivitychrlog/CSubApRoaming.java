package com.huawei.device.connectivitychrlog;

public class CSubApRoaming extends ChrLogBaseModel {
    public ENCSubEventId enSubEventId;
    public LogInt iFirst_Channel;
    public LogInt iFirst_Rssi;
    public LogInt iSecond_Channel;
    public LogInt iSecond_Rssi;

    public CSubApRoaming() {
        this.enSubEventId = new ENCSubEventId();
        this.iFirst_Rssi = new LogInt();
        this.iFirst_Channel = new LogInt();
        this.iSecond_Rssi = new LogInt();
        this.iSecond_Channel = new LogInt();
        this.lengthMap.put("enSubEventId", Integer.valueOf(2));
        this.fieldMap.put("enSubEventId", this.enSubEventId);
        this.lengthMap.put("iFirst_Rssi", Integer.valueOf(4));
        this.fieldMap.put("iFirst_Rssi", this.iFirst_Rssi);
        this.lengthMap.put("iFirst_Channel", Integer.valueOf(4));
        this.fieldMap.put("iFirst_Channel", this.iFirst_Channel);
        this.lengthMap.put("iSecond_Rssi", Integer.valueOf(4));
        this.fieldMap.put("iSecond_Rssi", this.iSecond_Rssi);
        this.lengthMap.put("iSecond_Channel", Integer.valueOf(4));
        this.fieldMap.put("iSecond_Channel", this.iSecond_Channel);
        this.enSubEventId.setValue("ApRoaming");
    }
}
