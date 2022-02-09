// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEmailTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEmailTemplateArgs Empty = new GetEmailTemplateArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="templateName", required=true)
    private final String templateName;

    public String getTemplateName() {
        return this.templateName;
    }

    public GetEmailTemplateArgs(
        String resourceGroupName,
        String serviceName,
        String templateName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.templateName = Objects.requireNonNull(templateName, "expected parameter 'templateName' to be non-null");
    }

    private GetEmailTemplateArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.templateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String templateName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEmailTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.templateName = defaults.templateName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setTemplateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }

        public GetEmailTemplateArgs build() {
            return new GetEmailTemplateArgs(resourceGroupName, serviceName, templateName);
        }
    }
}
