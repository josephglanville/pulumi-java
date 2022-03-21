// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BastionActiveSessionResponse {
    /**
     * The protocol used to connect to the target.
     * 
     */
    private final String protocol;
    /**
     * The type of the resource.
     * 
     */
    private final String resourceType;
    /**
     * Duration in mins the session has been active.
     * 
     */
    private final Double sessionDurationInMins;
    /**
     * A unique id for the session.
     * 
     */
    private final String sessionId;
    /**
     * The time when the session started.
     * 
     */
    private final Object startTime;
    /**
     * The host name of the target.
     * 
     */
    private final String targetHostName;
    /**
     * The IP Address of the target.
     * 
     */
    private final String targetIpAddress;
    /**
     * The resource group of the target.
     * 
     */
    private final String targetResourceGroup;
    /**
     * The resource id of the target.
     * 
     */
    private final String targetResourceId;
    /**
     * The subscription id for the target virtual machine.
     * 
     */
    private final String targetSubscriptionId;
    /**
     * The user name who is active on this session.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private BastionActiveSessionResponse(
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("sessionDurationInMins") Double sessionDurationInMins,
        @CustomType.Parameter("sessionId") String sessionId,
        @CustomType.Parameter("startTime") Object startTime,
        @CustomType.Parameter("targetHostName") String targetHostName,
        @CustomType.Parameter("targetIpAddress") String targetIpAddress,
        @CustomType.Parameter("targetResourceGroup") String targetResourceGroup,
        @CustomType.Parameter("targetResourceId") String targetResourceId,
        @CustomType.Parameter("targetSubscriptionId") String targetSubscriptionId,
        @CustomType.Parameter("userName") String userName) {
        this.protocol = protocol;
        this.resourceType = resourceType;
        this.sessionDurationInMins = sessionDurationInMins;
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.targetHostName = targetHostName;
        this.targetIpAddress = targetIpAddress;
        this.targetResourceGroup = targetResourceGroup;
        this.targetResourceId = targetResourceId;
        this.targetSubscriptionId = targetSubscriptionId;
        this.userName = userName;
    }

    /**
     * The protocol used to connect to the target.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Duration in mins the session has been active.
     * 
    */
    public Double getSessionDurationInMins() {
        return this.sessionDurationInMins;
    }
    /**
     * A unique id for the session.
     * 
    */
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * The time when the session started.
     * 
    */
    public Object getStartTime() {
        return this.startTime;
    }
    /**
     * The host name of the target.
     * 
    */
    public String getTargetHostName() {
        return this.targetHostName;
    }
    /**
     * The IP Address of the target.
     * 
    */
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }
    /**
     * The resource group of the target.
     * 
    */
    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
    }
    /**
     * The resource id of the target.
     * 
    */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }
    /**
     * The subscription id for the target virtual machine.
     * 
    */
    public String getTargetSubscriptionId() {
        return this.targetSubscriptionId;
    }
    /**
     * The user name who is active on this session.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionActiveSessionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String protocol;
        private String resourceType;
        private Double sessionDurationInMins;
        private String sessionId;
        private Object startTime;
        private String targetHostName;
        private String targetIpAddress;
        private String targetResourceGroup;
        private String targetResourceId;
        private String targetSubscriptionId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionActiveSessionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.resourceType = defaults.resourceType;
    	      this.sessionDurationInMins = defaults.sessionDurationInMins;
    	      this.sessionId = defaults.sessionId;
    	      this.startTime = defaults.startTime;
    	      this.targetHostName = defaults.targetHostName;
    	      this.targetIpAddress = defaults.targetIpAddress;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.targetSubscriptionId = defaults.targetSubscriptionId;
    	      this.userName = defaults.userName;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder sessionDurationInMins(Double sessionDurationInMins) {
            this.sessionDurationInMins = Objects.requireNonNull(sessionDurationInMins);
            return this;
        }
        public Builder sessionId(String sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }
        public Builder startTime(Object startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder targetHostName(String targetHostName) {
            this.targetHostName = Objects.requireNonNull(targetHostName);
            return this;
        }
        public Builder targetIpAddress(String targetIpAddress) {
            this.targetIpAddress = Objects.requireNonNull(targetIpAddress);
            return this;
        }
        public Builder targetResourceGroup(String targetResourceGroup) {
            this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
            return this;
        }
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }
        public Builder targetSubscriptionId(String targetSubscriptionId) {
            this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public BastionActiveSessionResponse build() {
            return new BastionActiveSessionResponse(protocol, resourceType, sessionDurationInMins, sessionId, startTime, targetHostName, targetIpAddress, targetResourceGroup, targetResourceId, targetSubscriptionId, userName);
        }
    }
}
