
package com.akexorcist.googledirection.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2016-08-10T15:14+0900")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Agency$$Parcelable
    implements Parcelable, ParcelWrapper<com.akexorcist.googledirection.model.Agency>
{

    private com.akexorcist.googledirection.model.Agency agency$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Agency$$Parcelable.Creator$$0 CREATOR = new Agency$$Parcelable.Creator$$0();

    public Agency$$Parcelable(android.os.Parcel parcel$$0) {
        com.akexorcist.googledirection.model.Agency agency$$2;
        if (parcel$$0 .readInt() == -1) {
            agency$$2 = null;
        } else {
            agency$$2 = readcom_akexorcist_googledirection_model_Agency(parcel$$0);
        }
        agency$$0 = agency$$2;
    }

    public Agency$$Parcelable(com.akexorcist.googledirection.model.Agency agency$$4) {
        agency$$0 = agency$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (agency$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_akexorcist_googledirection_model_Agency(agency$$0, parcel$$1, flags);
        }
    }

    private com.akexorcist.googledirection.model.Agency readcom_akexorcist_googledirection_model_Agency(android.os.Parcel parcel$$2) {
        com.akexorcist.googledirection.model.Agency agency$$1;
        agency$$1 = new com.akexorcist.googledirection.model.Agency();
        agency$$1 .name = parcel$$2 .readString();
        agency$$1 .url = parcel$$2 .readString();
        return agency$$1;
    }

    private void writecom_akexorcist_googledirection_model_Agency(com.akexorcist.googledirection.model.Agency agency$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(agency$$3 .name);
        parcel$$3 .writeString(agency$$3 .url);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.akexorcist.googledirection.model.Agency getParcel() {
        return agency$$0;
    }

    public final static class Creator$$0
        implements Creator<Agency$$Parcelable>
    {


        @Override
        public Agency$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Agency$$Parcelable(parcel$$4);
        }

        @Override
        public Agency$$Parcelable[] newArray(int size) {
            return new Agency$$Parcelable[size] ;
        }

    }

}
