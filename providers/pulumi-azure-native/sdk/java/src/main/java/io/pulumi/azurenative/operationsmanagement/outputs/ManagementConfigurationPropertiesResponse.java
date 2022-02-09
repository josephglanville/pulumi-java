// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.outputs;

import io.pulumi.azurenative.operationsmanagement.outputs.ArmTemplateParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementConfigurationPropertiesResponse {
    private final @Nullable String applicationId;
    private final List<ArmTemplateParameterResponse> parameters;
    private final String parentResourceType;
    private final String provisioningState;
    private final Object template;

    @OutputCustomType.Constructor({"applicationId","parameters","parentResourceType","provisioningState","template"})
    private ManagementConfigurationPropertiesResponse(
        @Nullable String applicationId,
        List<ArmTemplateParameterResponse> parameters,
        String parentResourceType,
        String provisioningState,
        Object template) {
        this.applicationId = applicationId;
        this.parameters = Objects.requireNonNull(parameters);
        this.parentResourceType = Objects.requireNonNull(parentResourceType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.template = Objects.requireNonNull(template);
    }

    public Optional<String> getApplicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    public List<ArmTemplateParameterResponse> getParameters() {
        return this.parameters;
    }
    public String getParentResourceType() {
        return this.parentResourceType;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Object getTemplate() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private List<ArmTemplateParameterResponse> parameters;
        private String parentResourceType;
        private String provisioningState;
        private Object template;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.parameters = defaults.parameters;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.template = defaults.template;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setParameters(List<ArmTemplateParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTemplate(Object template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public ManagementConfigurationPropertiesResponse build() {
            return new ManagementConfigurationPropertiesResponse(applicationId, parameters, parentResourceType, provisioningState, template);
        }
    }
}
