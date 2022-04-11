// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.ResourceIdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The workspace managed identity
 * 
 */
public final class ManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * The type of managed identity for the workspace
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ManagedIdentityArgs(@Nullable Output<ResourceIdentityType> type) {
        this.type = type;
    }

    private ManagedIdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(type);
        }
    }
}
