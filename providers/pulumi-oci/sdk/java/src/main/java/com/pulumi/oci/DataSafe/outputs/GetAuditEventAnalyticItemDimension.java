// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditEventAnalyticItemDimension {
    /**
     * @return Time of audit event occurrence in the target database.
     * 
     */
    private final List<String> auditEventTimes;
    /**
     * @return Type of auditing.
     * 
     */
    private final List<String> auditTypes;
    /**
     * @return Name of the host machine from which the session was spawned.
     * 
     */
    private final List<String> clientHostnames;
    /**
     * @return The client identifier in each Oracle session.
     * 
     */
    private final List<String> clientIds;
    /**
     * @return The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     * 
     */
    private final List<String> clientPrograms;
    /**
     * @return Name of the database user whose actions were audited.
     * 
     */
    private final List<String> dbUserNames;
    /**
     * @return Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     * 
     */
    private final List<String> eventNames;
    /**
     * @return Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     * 
     */
    private final List<String> objectTypes;
    /**
     * @return Class of the target that was audited.
     * 
     */
    private final List<String> targetClasses;
    /**
     * @return The OCID of the target database that was audited.
     * 
     */
    private final List<String> targetIds;
    /**
     * @return The name of the target database that was audited.
     * 
     */
    private final List<String> targetNames;

    @CustomType.Constructor
    private GetAuditEventAnalyticItemDimension(
        @CustomType.Parameter("auditEventTimes") List<String> auditEventTimes,
        @CustomType.Parameter("auditTypes") List<String> auditTypes,
        @CustomType.Parameter("clientHostnames") List<String> clientHostnames,
        @CustomType.Parameter("clientIds") List<String> clientIds,
        @CustomType.Parameter("clientPrograms") List<String> clientPrograms,
        @CustomType.Parameter("dbUserNames") List<String> dbUserNames,
        @CustomType.Parameter("eventNames") List<String> eventNames,
        @CustomType.Parameter("objectTypes") List<String> objectTypes,
        @CustomType.Parameter("targetClasses") List<String> targetClasses,
        @CustomType.Parameter("targetIds") List<String> targetIds,
        @CustomType.Parameter("targetNames") List<String> targetNames) {
        this.auditEventTimes = auditEventTimes;
        this.auditTypes = auditTypes;
        this.clientHostnames = clientHostnames;
        this.clientIds = clientIds;
        this.clientPrograms = clientPrograms;
        this.dbUserNames = dbUserNames;
        this.eventNames = eventNames;
        this.objectTypes = objectTypes;
        this.targetClasses = targetClasses;
        this.targetIds = targetIds;
        this.targetNames = targetNames;
    }

    /**
     * @return Time of audit event occurrence in the target database.
     * 
     */
    public List<String> auditEventTimes() {
        return this.auditEventTimes;
    }
    /**
     * @return Type of auditing.
     * 
     */
    public List<String> auditTypes() {
        return this.auditTypes;
    }
    /**
     * @return Name of the host machine from which the session was spawned.
     * 
     */
    public List<String> clientHostnames() {
        return this.clientHostnames;
    }
    /**
     * @return The client identifier in each Oracle session.
     * 
     */
    public List<String> clientIds() {
        return this.clientIds;
    }
    /**
     * @return The application from which the audit event was generated. Examples SQL Plus or SQL Developer.
     * 
     */
    public List<String> clientPrograms() {
        return this.clientPrograms;
    }
    /**
     * @return Name of the database user whose actions were audited.
     * 
     */
    public List<String> dbUserNames() {
        return this.dbUserNames;
    }
    /**
     * @return Name of the detail action executed by the user on the target database. i.e ALTER SEQUENCE, CREATE TRIGGER, CREATE INDEX.
     * 
     */
    public List<String> eventNames() {
        return this.eventNames;
    }
    /**
     * @return Type of object in the source database affected by the action. i.e PL/SQL, SYNONYM, PACKAGE BODY.
     * 
     */
    public List<String> objectTypes() {
        return this.objectTypes;
    }
    /**
     * @return Class of the target that was audited.
     * 
     */
    public List<String> targetClasses() {
        return this.targetClasses;
    }
    /**
     * @return The OCID of the target database that was audited.
     * 
     */
    public List<String> targetIds() {
        return this.targetIds;
    }
    /**
     * @return The name of the target database that was audited.
     * 
     */
    public List<String> targetNames() {
        return this.targetNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditEventAnalyticItemDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> auditEventTimes;
        private List<String> auditTypes;
        private List<String> clientHostnames;
        private List<String> clientIds;
        private List<String> clientPrograms;
        private List<String> dbUserNames;
        private List<String> eventNames;
        private List<String> objectTypes;
        private List<String> targetClasses;
        private List<String> targetIds;
        private List<String> targetNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditEventAnalyticItemDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditEventTimes = defaults.auditEventTimes;
    	      this.auditTypes = defaults.auditTypes;
    	      this.clientHostnames = defaults.clientHostnames;
    	      this.clientIds = defaults.clientIds;
    	      this.clientPrograms = defaults.clientPrograms;
    	      this.dbUserNames = defaults.dbUserNames;
    	      this.eventNames = defaults.eventNames;
    	      this.objectTypes = defaults.objectTypes;
    	      this.targetClasses = defaults.targetClasses;
    	      this.targetIds = defaults.targetIds;
    	      this.targetNames = defaults.targetNames;
        }

        public Builder auditEventTimes(List<String> auditEventTimes) {
            this.auditEventTimes = Objects.requireNonNull(auditEventTimes);
            return this;
        }
        public Builder auditEventTimes(String... auditEventTimes) {
            return auditEventTimes(List.of(auditEventTimes));
        }
        public Builder auditTypes(List<String> auditTypes) {
            this.auditTypes = Objects.requireNonNull(auditTypes);
            return this;
        }
        public Builder auditTypes(String... auditTypes) {
            return auditTypes(List.of(auditTypes));
        }
        public Builder clientHostnames(List<String> clientHostnames) {
            this.clientHostnames = Objects.requireNonNull(clientHostnames);
            return this;
        }
        public Builder clientHostnames(String... clientHostnames) {
            return clientHostnames(List.of(clientHostnames));
        }
        public Builder clientIds(List<String> clientIds) {
            this.clientIds = Objects.requireNonNull(clientIds);
            return this;
        }
        public Builder clientIds(String... clientIds) {
            return clientIds(List.of(clientIds));
        }
        public Builder clientPrograms(List<String> clientPrograms) {
            this.clientPrograms = Objects.requireNonNull(clientPrograms);
            return this;
        }
        public Builder clientPrograms(String... clientPrograms) {
            return clientPrograms(List.of(clientPrograms));
        }
        public Builder dbUserNames(List<String> dbUserNames) {
            this.dbUserNames = Objects.requireNonNull(dbUserNames);
            return this;
        }
        public Builder dbUserNames(String... dbUserNames) {
            return dbUserNames(List.of(dbUserNames));
        }
        public Builder eventNames(List<String> eventNames) {
            this.eventNames = Objects.requireNonNull(eventNames);
            return this;
        }
        public Builder eventNames(String... eventNames) {
            return eventNames(List.of(eventNames));
        }
        public Builder objectTypes(List<String> objectTypes) {
            this.objectTypes = Objects.requireNonNull(objectTypes);
            return this;
        }
        public Builder objectTypes(String... objectTypes) {
            return objectTypes(List.of(objectTypes));
        }
        public Builder targetClasses(List<String> targetClasses) {
            this.targetClasses = Objects.requireNonNull(targetClasses);
            return this;
        }
        public Builder targetClasses(String... targetClasses) {
            return targetClasses(List.of(targetClasses));
        }
        public Builder targetIds(List<String> targetIds) {
            this.targetIds = Objects.requireNonNull(targetIds);
            return this;
        }
        public Builder targetIds(String... targetIds) {
            return targetIds(List.of(targetIds));
        }
        public Builder targetNames(List<String> targetNames) {
            this.targetNames = Objects.requireNonNull(targetNames);
            return this;
        }
        public Builder targetNames(String... targetNames) {
            return targetNames(List.of(targetNames));
        }        public GetAuditEventAnalyticItemDimension build() {
            return new GetAuditEventAnalyticItemDimension(auditEventTimes, auditTypes, clientHostnames, clientIds, clientPrograms, dbUserNames, eventNames, objectTypes, targetClasses, targetIds, targetNames);
        }
    }
}
