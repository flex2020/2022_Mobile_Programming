package com.a201812079.mobileprogramming2022;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {
    String name;
    int age;
    String comment;

    public SimpleData(String name, int age, String comment) {
        this.name = name;
        this.age = age;
        this.comment = comment;
    }


    protected SimpleData(Parcel in) {
        name = in.readString();
        age = in.readInt();
        comment = in.readString();
    }

    public static final Creator<SimpleData> CREATOR = new Creator<SimpleData>() {
        @Override
        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        @Override
        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeString(comment);
    }
}
