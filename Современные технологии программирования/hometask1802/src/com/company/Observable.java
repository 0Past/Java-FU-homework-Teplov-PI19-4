package com.company;

public class Observable {
    private StrBuilderChLis ChangeLis;
    private StringBuilder stringBuilder;
    public void setOnChangeLis(StrBuilderChLis onChangeLis) {
        this.ChangeLis = onChangeLis;
    }
    public Observable() {
        stringBuilder = new StringBuilder();
    }
    private void alertStrBuilderChLis(){
        if(ChangeLis != null){
            ChangeLis.Change(this);
        }
    }
    public Observable append(Object obj){
        stringBuilder.append(obj);
        alertStrBuilderChLis();
        return this;
    }
    public Observable replace(int start, int end, String str){
        stringBuilder.replace(start, end, str);
        alertStrBuilderChLis();
        return this;
    }
    public Observable insert(int index, char[] str, int offset, int len){
        stringBuilder.insert(index, str, offset, len);
        alertStrBuilderChLis();
        return this;
    }
    public Observable delete(int start, int end){
        stringBuilder.delete(start, end);
        alertStrBuilderChLis();
        return this;
    }
    public Observable deleteCharAt(int index){
        stringBuilder.deleteCharAt(index);
        alertStrBuilderChLis();
        return this;
    }
    public Observable reverse(){
        stringBuilder.reverse();
        alertStrBuilderChLis();
        return this;
    }
    public Observable substring(int start){
        stringBuilder.substring(start);
        alertStrBuilderChLis();
        return this;
    }
    public Observable substring(int start, int end) {
        stringBuilder.substring(start, end);
        alertStrBuilderChLis();
        return this;
    }
}
