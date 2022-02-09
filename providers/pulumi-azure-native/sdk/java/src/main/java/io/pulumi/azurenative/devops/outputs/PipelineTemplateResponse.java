// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineTemplateResponse {
    private final String id;
    private final @Nullable Map<String,String> parameters;

    @OutputCustomType.Constructor({"id","parameters"})
    private PipelineTemplateResponse(
        String id,
        @Nullable Map<String,String> parameters) {
        this.id = Objects.requireNonNull(id);
        this.parameters = parameters;
    }

    public String getId() {
        return this.id;
    }
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Map<String,String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public PipelineTemplateResponse build() {
            return new PipelineTemplateResponse(id, parameters);
        }
    }
}
