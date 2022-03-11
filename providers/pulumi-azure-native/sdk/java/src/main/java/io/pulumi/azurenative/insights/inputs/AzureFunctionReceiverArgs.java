// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An azure function receiver.
 * 
 */
public final class AzureFunctionReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFunctionReceiverArgs Empty = new AzureFunctionReceiverArgs();

    /**
     * The azure resource id of the function app.
     * 
     */
    @InputImport(name="functionAppResourceId", required=true)
      private final Output<String> functionAppResourceId;

    public Output<String> getFunctionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * The function name in the function app.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final Output<String> functionName;

    public Output<String> getFunctionName() {
        return this.functionName;
    }

    /**
     * The http trigger url where http request sent to.
     * 
     */
    @InputImport(name="httpTriggerUrl", required=true)
      private final Output<String> httpTriggerUrl;

    public Output<String> getHttpTriggerUrl() {
        return this.httpTriggerUrl;
    }

    /**
     * The name of the azure function receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @InputImport(name="useCommonAlertSchema")
      private final @Nullable Output<Boolean> useCommonAlertSchema;

    public Output<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Output.empty() : this.useCommonAlertSchema;
    }

    public AzureFunctionReceiverArgs(
        Output<String> functionAppResourceId,
        Output<String> functionName,
        Output<String> httpTriggerUrl,
        Output<String> name,
        @Nullable Output<Boolean> useCommonAlertSchema) {
        this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId, "expected parameter 'functionAppResourceId' to be non-null");
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl, "expected parameter 'httpTriggerUrl' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? Output.ofNullable(false) : useCommonAlertSchema;
    }

    private AzureFunctionReceiverArgs() {
        this.functionAppResourceId = Output.empty();
        this.functionName = Output.empty();
        this.httpTriggerUrl = Output.empty();
        this.name = Output.empty();
        this.useCommonAlertSchema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionAppResourceId;
        private Output<String> functionName;
        private Output<String> httpTriggerUrl;
        private Output<String> name;
        private @Nullable Output<Boolean> useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.functionName = defaults.functionName;
    	      this.httpTriggerUrl = defaults.httpTriggerUrl;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder functionAppResourceId(Output<String> functionAppResourceId) {
            this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
            return this;
        }

        public Builder functionAppResourceId(String functionAppResourceId) {
            this.functionAppResourceId = Output.of(Objects.requireNonNull(functionAppResourceId));
            return this;
        }

        public Builder functionName(Output<String> functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder functionName(String functionName) {
            this.functionName = Output.of(Objects.requireNonNull(functionName));
            return this;
        }

        public Builder httpTriggerUrl(Output<String> httpTriggerUrl) {
            this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
            return this;
        }

        public Builder httpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = Output.of(Objects.requireNonNull(httpTriggerUrl));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = Output.ofNullable(useCommonAlertSchema);
            return this;
        }
        public AzureFunctionReceiverArgs build() {
            return new AzureFunctionReceiverArgs(functionAppResourceId, functionName, httpTriggerUrl, name, useCommonAlertSchema);
        }
    }
}
