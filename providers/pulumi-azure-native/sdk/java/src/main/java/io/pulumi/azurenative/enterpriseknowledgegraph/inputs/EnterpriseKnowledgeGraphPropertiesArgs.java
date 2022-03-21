// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the EnterpriseKnowledgeGraph.
 * 
 */
public final class EnterpriseKnowledgeGraphPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKnowledgeGraphPropertiesArgs Empty = new EnterpriseKnowledgeGraphPropertiesArgs();

    /**
     * The description of the EnterpriseKnowledgeGraph
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies the metadata  of the resource.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The state of EnterpriseKnowledgeGraph provisioning
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    public EnterpriseKnowledgeGraphPropertiesArgs(
        @Nullable Output<String> description,
        @Nullable Output<Object> metadata,
        @Nullable Output<String> provisioningState) {
        this.description = description;
        this.metadata = metadata;
        this.provisioningState = provisioningState;
    }

    private EnterpriseKnowledgeGraphPropertiesArgs() {
        this.description = Output.empty();
        this.metadata = Output.empty();
        this.provisioningState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Object> metadata;
        private @Nullable Output<String> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }        public EnterpriseKnowledgeGraphPropertiesArgs build() {
            return new EnterpriseKnowledgeGraphPropertiesArgs(description, metadata, provisioningState);
        }
    }
}
