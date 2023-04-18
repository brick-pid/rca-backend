package com.example.demo.POJO;

import com.example.demo.model.Invocation;

public class InvocationPair {
    private String source;
    private String target;

    private int count = 1;

    private double probability;

    public InvocationPair(String source, String target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public boolean equals(Object obj) {
        InvocationPair o = (InvocationPair) obj;
        if(o.getSource().equals(this.source) && o.getTarget().equals(this.target)) {
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    public void increase() {
        this.count++;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public InvocationPair reverse() {
        return new InvocationPair(this.target, this.source);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
