// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork.inputs;

import io.pulumi.azurenative.delegatednetwork.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrchestratorIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrchestratorIdentityArgs Empty = new OrchestratorIdentityArgs();

    /**
     * The type of identity used for orchestrator cluster. Type 'SystemAssigned' will use an implicitly created identity orchestrator clusters
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public OrchestratorIdentityArgs(@Nullable Input<ResourceIdentityType> type) {
        this.type = type;
    }

    private OrchestratorIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratorIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratorIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public OrchestratorIdentityArgs build() {
            return new OrchestratorIdentityArgs(type);
        }
    }
}
