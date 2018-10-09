package alexis.tp2;

import android.os.Parcel;
import android.os.Parcelable;

public class Personne implements Parcelable {
    private String nom;
    private String prenom;
    private int age;

    public Personne() {}

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    protected Personne(Parcel in) {
        nom = in.readString();
        prenom = in.readString();
        age = in.readInt();
    }

    public static final Creator<Personne> CREATOR = new Creator<Personne>() {
        @Override
        public Personne createFromParcel(Parcel in) {
            return new Personne(in);
        }

        @Override
        public Personne[] newArray(int size) {
            return new Personne[size];
        }
    };

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeInt(age);
    }
}
