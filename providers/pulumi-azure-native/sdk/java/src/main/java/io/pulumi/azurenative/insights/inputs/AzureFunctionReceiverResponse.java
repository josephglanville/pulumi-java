// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFunctionReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFunctionReceiverResponse Empty = new AzureFunctionReceiverResponse();

    @InputImport(name="functionAppResourceId", required=true)
    private final String functionAppResourceId;

    public String getFunctionAppResourceId() {
        return this.functionAppResourceId;
    }

    @InputImport(name="functionName", required=true)
    private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    @InputImport(name="httpTriggerUrl", required=true)
    private final String httpTriggerUrl;

    public String getHttpTriggerUrl() {
        return this.httpTriggerUrl;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="useCommonAlertSchema")
    private final @Nullable Boolean useCommonAlertSchema;

    public Optional<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Optional.empty() : Optional.ofNullable(this.useCommonAlertSchema);
    }

    public AzureFunctionReceiverResponse(
        String functionAppResourceId,
        String functionName,
        String httpTriggerUrl,
        String name,
        @Nullable Boolean useCommonAlertSchema) {
        this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId, "expected parameter 'functionAppResourceId' to be non-null");
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl, "expected parameter 'httpTriggerUrl' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? false : useCommonAlertSchema;
    }

    private AzureFunctionReceiverResponse() {
        this.functionAppResourceId = null;
        this.functionName = null;
        this.httpTriggerUrl = null;
        this.name = null;
        this.useCommonAlertSchema = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionAppResourceId;
        private String functionName;
        private String httpTriggerUrl;
        private String name;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.functionName = defaults.functionName;
    	      this.httpTriggerUrl = defaults.httpTriggerUrl;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setFunctionAppResourceId(String functionAppResourceId) {
            this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
            return this;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public AzureFunctionReceiverResponse build() {
            return new AzureFunctionReceiverResponse(functionAppResourceId, functionName, httpTriggerUrl, name, useCommonAlertSchema);
        }
    }
}
