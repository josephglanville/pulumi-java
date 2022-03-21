// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverSyncConfigLambdaConflictHandlerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverSyncConfigLambdaConflictHandlerConfigGetArgs Empty = new ResolverSyncConfigLambdaConflictHandlerConfigGetArgs();

    /**
     * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    @Import(name="lambdaConflictHandlerArn")
      private final @Nullable Output<String> lambdaConflictHandlerArn;

    public Output<String> getLambdaConflictHandlerArn() {
        return this.lambdaConflictHandlerArn == null ? Output.empty() : this.lambdaConflictHandlerArn;
    }

    public ResolverSyncConfigLambdaConflictHandlerConfigGetArgs(@Nullable Output<String> lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
    }

    private ResolverSyncConfigLambdaConflictHandlerConfigGetArgs() {
        this.lambdaConflictHandlerArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverSyncConfigLambdaConflictHandlerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lambdaConflictHandlerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverSyncConfigLambdaConflictHandlerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaConflictHandlerArn = defaults.lambdaConflictHandlerArn;
        }

        public Builder lambdaConflictHandlerArn(@Nullable Output<String> lambdaConflictHandlerArn) {
            this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
            return this;
        }
        public Builder lambdaConflictHandlerArn(@Nullable String lambdaConflictHandlerArn) {
            this.lambdaConflictHandlerArn = Output.ofNullable(lambdaConflictHandlerArn);
            return this;
        }        public ResolverSyncConfigLambdaConflictHandlerConfigGetArgs build() {
            return new ResolverSyncConfigLambdaConflictHandlerConfigGetArgs(lambdaConflictHandlerArn);
        }
    }
}
