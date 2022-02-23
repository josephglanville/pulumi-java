// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.SystemDataResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Shared Private Link Resource
 * 
 */
public final class SharedPrivateLinkResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourceResponse Empty = new SharedPrivateLinkResourceResponse();

    /**
     * The group id from the provider of resource the shared private link resource is for
     * 
     */
    @InputImport(name="groupId", required=true)
      private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource id of the resource the shared private link resource is for
     * 
     */
    @InputImport(name="privateLinkResourceId", required=true)
      private final String privateLinkResourceId;

    public String getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Provisioning state of the shared private link resource
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The request message for requesting approval of the shared private link resource
     * 
     */
    @InputImport(name="requestMessage")
      private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    /**
     * Status of the shared private link resource
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @InputImport(name="systemData", required=true)
      private final SystemDataResponse systemData;

    public SystemDataResponse getSystemData() {
        return this.systemData;
    }

    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SharedPrivateLinkResourceResponse(
        String groupId,
        String id,
        String name,
        String privateLinkResourceId,
        String provisioningState,
        @Nullable String requestMessage,
        String status,
        SystemDataResponse systemData,
        String type) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.requestMessage = requestMessage;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.systemData = Objects.requireNonNull(systemData, "expected parameter 'systemData' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SharedPrivateLinkResourceResponse() {
        this.groupId = null;
        this.id = null;
        this.name = null;
        this.privateLinkResourceId = null;
        this.provisioningState = null;
        this.requestMessage = null;
        this.status = null;
        this.systemData = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String id;
        private String name;
        private String privateLinkResourceId;
        private String provisioningState;
        private @Nullable String requestMessage;
        private String status;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateLinkResourceId(String privateLinkResourceId) {
            this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SharedPrivateLinkResourceResponse build() {
            return new SharedPrivateLinkResourceResponse(groupId, id, name, privateLinkResourceId, provisioningState, requestMessage, status, systemData, type);
        }
    }
}
