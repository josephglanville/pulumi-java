// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.ManagedIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A class represent managed identities used for request and response
 * 
 */
public final class ManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * Represent the identity type: systemAssigned, userAssigned, None
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<Either<String,ManagedIdentityType>> type;

    public Output<Either<String,ManagedIdentityType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * Get or set the user assigned identities
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Output<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Output.empty() : this.userAssignedIdentities;
    }

    public ManagedIdentityArgs(
        @Nullable Output<Either<String,ManagedIdentityType>> type,
        @Nullable Output<Map<String,Object>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedIdentityArgs() {
        this.type = Output.empty();
        this.userAssignedIdentities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ManagedIdentityType>> type;
        private @Nullable Output<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable Output<Either<String,ManagedIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,ManagedIdentityType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Output.ofNullable(userAssignedIdentities);
            return this;
        }
        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(type, userAssignedIdentities);
        }
    }
}
