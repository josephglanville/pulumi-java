// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServerPrivateLinkServiceConnectionStatePropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerPrivateLinkServiceConnectionStatePropertyResponse Empty = new ServerPrivateLinkServiceConnectionStatePropertyResponse();

    /**
     * The actions required for private link service connection.
     * 
     */
    @InputImport(name="actionsRequired", required=true)
      private final String actionsRequired;

    public String getActionsRequired() {
        return this.actionsRequired;
    }

    /**
     * The private link service connection description.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public ServerPrivateLinkServiceConnectionStatePropertyResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired, "expected parameter 'actionsRequired' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ServerPrivateLinkServiceConnectionStatePropertyResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateLinkServiceConnectionStatePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateLinkServiceConnectionStatePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ServerPrivateLinkServiceConnectionStatePropertyResponse build() {
            return new ServerPrivateLinkServiceConnectionStatePropertyResponse(actionsRequired, description, status);
        }
    }
}
