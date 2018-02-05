package com.testinformation.testinformation;

import java.io.Serializable;

/**
 * Created by erwin on 2/3/2018.
 */

public class Data implements Serializable{
    public int a;
    public int b;

    public Data (int a, int b){
        this.a=a;
        this.b=b;
    }
}
