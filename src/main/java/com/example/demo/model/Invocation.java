package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trace_id;
    private String timestamp;
    private String latency;
    private String http_status;
    private String cpu_use;
    private String mem_use_percent;
    private String mem_use_amount;
    private String file_write_rate;
    private String file_read_rate;
    private String net_send_rate;
    private String net_receive_rate;
    private String endtime;
    private String label;
    private String source;
    private String target;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    public String getHttp_status() {
        return http_status;
    }

    public void setHttp_status(String http_status) {
        this.http_status = http_status;
    }

    public String getCpu_use() {
        return cpu_use;
    }

    public void setCpu_use(String cpu_use) {
        this.cpu_use = cpu_use;
    }

    public String getMem_use_percent() {
        return mem_use_percent;
    }

    public void setMem_use_percent(String mem_use_percent) {
        this.mem_use_percent = mem_use_percent;
    }

    public String getMem_use_amount() {
        return mem_use_amount;
    }

    public void setMem_use_amount(String mem_use_amount) {
        this.mem_use_amount = mem_use_amount;
    }

    public String getFile_write_rate() {
        return file_write_rate;
    }

    public void setFile_write_rate(String file_write_rate) {
        this.file_write_rate = file_write_rate;
    }

    public String getFile_read_rate() {
        return file_read_rate;
    }

    public void setFile_read_rate(String file_read_rate) {
        this.file_read_rate = file_read_rate;
    }

    public String getNet_send_rate() {
        return net_send_rate;
    }

    public void setNet_send_rate(String net_send_rate) {
        this.net_send_rate = net_send_rate;
    }

    public String getNet_receive_rate() {
        return net_receive_rate;
    }

    public void setNet_receive_rate(String net_receive_rate) {
        this.net_receive_rate = net_receive_rate;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
