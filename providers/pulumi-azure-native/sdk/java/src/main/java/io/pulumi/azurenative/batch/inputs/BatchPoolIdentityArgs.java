// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.PoolIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BatchPoolIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchPoolIdentityArgs Empty = new BatchPoolIdentityArgs();

    @InputImport(name="type", required=true)
    private final Input<PoolIdentityType> type;

    public Input<PoolIdentityType> getType() {
        return this.type;
    }

    @InputImport(name="userAssignedIdentities")
    private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public BatchPoolIdentityArgs(
        Input<PoolIdentityType> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private BatchPoolIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchPoolIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PoolIdentityType> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchPoolIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(Input<PoolIdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(PoolIdentityType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }

        public BatchPoolIdentityArgs build() {
            return new BatchPoolIdentityArgs(type, userAssignedIdentities);
        }
    }
}
