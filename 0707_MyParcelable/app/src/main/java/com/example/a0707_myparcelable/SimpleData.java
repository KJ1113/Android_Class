package com.example.a0707_myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {

    int number;
    String massage;

    public SimpleData(int number , String massage) {
        this.massage = massage;
        this.number = number;
    }
    public SimpleData(Parcel parcel){
        number = parcel.readInt();
        massage = parcel.readString();
    }
    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(number);
        parcel.writeString(massage);
    }
    public  static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        @Override
        public SimpleData createFromParcel(Parcel parcel) {
            return new SimpleData(parcel);
        }
        @Override
        public SimpleData[] newArray(int i) {
            return new SimpleData[i];
        }
    };
}
