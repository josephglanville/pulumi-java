// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.BatchPoolIdentityResponseUserAssignedIdentities;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchPoolIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchPoolIdentityResponse Empty = new BatchPoolIdentityResponse();

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="userAssignedIdentities")
    private final @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Map<String,BatchPoolIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public BatchPoolIdentityResponse(
        String type,
        @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private BatchPoolIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchPoolIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchPoolIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public BatchPoolIdentityResponse build() {
            return new BatchPoolIdentityResponse(type, userAssignedIdentities);
        }
    }
}
