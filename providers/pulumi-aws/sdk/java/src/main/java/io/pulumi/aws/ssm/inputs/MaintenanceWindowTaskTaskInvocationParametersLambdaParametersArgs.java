// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs();

    /**
     * Pass client-specific information to the Lambda function that you are invoking.
     * 
     */
    @Import(name="clientContext")
      private final @Nullable Output<String> clientContext;

    public Output<String> getClientContext() {
        return this.clientContext == null ? Output.empty() : this.clientContext;
    }

    /**
     * JSON to provide to your Lambda function as input.
     * 
     */
    @Import(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * Specify a Lambda function version or alias name.
     * 
     */
    @Import(name="qualifier")
      private final @Nullable Output<String> qualifier;

    public Output<String> getQualifier() {
        return this.qualifier == null ? Output.empty() : this.qualifier;
    }

    public MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs(
        @Nullable Output<String> clientContext,
        @Nullable Output<String> payload,
        @Nullable Output<String> qualifier) {
        this.clientContext = clientContext;
        this.payload = payload;
        this.qualifier = qualifier;
    }

    private MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs() {
        this.clientContext = Output.empty();
        this.payload = Output.empty();
        this.qualifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientContext;
        private @Nullable Output<String> payload;
        private @Nullable Output<String> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientContext = defaults.clientContext;
    	      this.payload = defaults.payload;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder clientContext(@Nullable Output<String> clientContext) {
            this.clientContext = clientContext;
            return this;
        }
        public Builder clientContext(@Nullable String clientContext) {
            this.clientContext = Output.ofNullable(clientContext);
            return this;
        }
        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable String payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }
        public Builder qualifier(@Nullable Output<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = Output.ofNullable(qualifier);
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs(clientContext, payload, qualifier);
        }
    }
}
