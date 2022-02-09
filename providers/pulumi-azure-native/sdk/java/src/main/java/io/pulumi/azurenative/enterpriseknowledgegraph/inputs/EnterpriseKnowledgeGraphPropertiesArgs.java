// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKnowledgeGraphPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKnowledgeGraphPropertiesArgs Empty = new EnterpriseKnowledgeGraphPropertiesArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    public EnterpriseKnowledgeGraphPropertiesArgs(
        @Nullable Input<String> description,
        @Nullable Input<Object> metadata,
        @Nullable Input<String> provisioningState) {
        this.description = description;
        this.metadata = metadata;
        this.provisioningState = provisioningState;
    }

    private EnterpriseKnowledgeGraphPropertiesArgs() {
        this.description = Input.empty();
        this.metadata = Input.empty();
        this.provisioningState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Object> metadata;
        private @Nullable Input<String> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public EnterpriseKnowledgeGraphPropertiesArgs build() {
            return new EnterpriseKnowledgeGraphPropertiesArgs(description, metadata, provisioningState);
        }
    }
}
