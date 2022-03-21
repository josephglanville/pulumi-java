// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateMetadata;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpec;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplate extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplate Empty = new GetServiceTemplate();

    @Import(name="metadatas", required=true)
      private final List<GetServiceTemplateMetadata> metadatas;

    public List<GetServiceTemplateMetadata> getMetadatas() {
        return this.metadatas;
    }

    @Import(name="specs", required=true)
      private final List<GetServiceTemplateSpec> specs;

    public List<GetServiceTemplateSpec> getSpecs() {
        return this.specs;
    }

    public GetServiceTemplate(
        List<GetServiceTemplateMetadata> metadatas,
        List<GetServiceTemplateSpec> specs) {
        this.metadatas = Objects.requireNonNull(metadatas, "expected parameter 'metadatas' to be non-null");
        this.specs = Objects.requireNonNull(specs, "expected parameter 'specs' to be non-null");
    }

    private GetServiceTemplate() {
        this.metadatas = List.of();
        this.specs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateMetadata> metadatas;
        private List<GetServiceTemplateSpec> specs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.specs = defaults.specs;
        }

        public Builder metadatas(List<GetServiceTemplateMetadata> metadatas) {
            this.metadatas = Objects.requireNonNull(metadatas);
            return this;
        }
        public Builder metadatas(GetServiceTemplateMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        public Builder specs(List<GetServiceTemplateSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }
        public Builder specs(GetServiceTemplateSpec... specs) {
            return specs(List.of(specs));
        }        public GetServiceTemplate build() {
            return new GetServiceTemplate(metadatas, specs);
        }
    }
}
