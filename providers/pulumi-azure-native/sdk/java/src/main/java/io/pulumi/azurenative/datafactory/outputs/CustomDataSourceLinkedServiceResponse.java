// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomDataSourceLinkedServiceResponse {
    private final @Nullable List<Object> annotations;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable String description;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final String type;

    @OutputCustomType.Constructor({"annotations","connectVia","description","parameters","type"})
    private CustomDataSourceLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDataSourceLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDataSourceLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public CustomDataSourceLinkedServiceResponse build() {
            return new CustomDataSourceLinkedServiceResponse(annotations, connectVia, description, parameters, type);
        }
    }
}
