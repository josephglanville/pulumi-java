// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServerPrivateLinkServiceConnectionStatePropertyResponse {
    private final String actionsRequired;
    private final String description;
    private final String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private ServerPrivateLinkServiceConnectionStatePropertyResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired);
        this.description = Objects.requireNonNull(description);
        this.status = Objects.requireNonNull(status);
    }

    public String getActionsRequired() {
        return this.actionsRequired;
    }
    public String getDescription() {
        return this.description;
    }
    public String getStatus() {
        return this.status;
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
