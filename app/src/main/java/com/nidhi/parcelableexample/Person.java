package com.nidhi.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by nidhi on 8/11/2017.
 */

public class Person implements Parcelable {

    private String firstname;
    private String lastname;
    private String qualification;

    public Person() {
        super();
    }

    public Person(Parcel in) {
        this.firstname=in.readString();
        this.lastname=in.readString();
        this.qualification=in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int i) {
            return new Person[i];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void writeToParcel(Parcel in, int i) {
        in.writeString(this.firstname);
        in.writeString(this.lastname);
        in.writeString(this.qualification);
    }
}
