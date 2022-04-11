// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateMetadataArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateArgs Empty = new ServiceTemplateArgs();

    /**
     * Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ServiceTemplateMetadataArgs> metadata;

    public Output<ServiceTemplateMetadataArgs> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * Structure is documented below.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<ServiceTemplateSpecArgs> spec;

    public Output<ServiceTemplateSpecArgs> getSpec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public ServiceTemplateArgs(
        @Nullable Output<ServiceTemplateMetadataArgs> metadata,
        @Nullable Output<ServiceTemplateSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    private ServiceTemplateArgs() {
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTemplateMetadataArgs> metadata;
        private @Nullable Output<ServiceTemplateSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(@Nullable Output<ServiceTemplateMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ServiceTemplateMetadataArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<ServiceTemplateSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable ServiceTemplateSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public ServiceTemplateArgs build() {
            return new ServiceTemplateArgs(metadata, spec);
        }
    }
}
