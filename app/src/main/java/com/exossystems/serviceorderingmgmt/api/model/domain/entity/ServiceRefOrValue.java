package com.exossystems.serviceorderingmgmt.api.model.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceRefOrValue extends BaseBundled implements Serializable {
    private String category;
    private String description;
    private String endDate;
    private boolean hasStarted;
    private String href;
    private String id;
    private boolean isBundle;
    private boolean isServiceEnabled;
    private boolean isStateful;
    private String name;
    private String serviceDate;
    private String serviceType;
    private String startDate;
    private String startMode;
    private String state;
    private String referredType;
    private String serviceOrderItemId;
    private String supportingService;
    private String serviceRelationshipId;
}
