// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEventInvokeConfigDestinationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigDestinationConfigGetArgs Empty = new FunctionEventInvokeConfigDestinationConfigGetArgs();

    /**
     * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    @Import(name="onFailure")
      private final @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs> onFailure;

    public Output<FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs> getOnFailure() {
        return this.onFailure == null ? Output.empty() : this.onFailure;
    }

    /**
     * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    @Import(name="onSuccess")
      private final @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs> onSuccess;

    public Output<FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs> getOnSuccess() {
        return this.onSuccess == null ? Output.empty() : this.onSuccess;
    }

    public FunctionEventInvokeConfigDestinationConfigGetArgs(
        @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs> onFailure,
        @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs> onSuccess) {
        this.onFailure = onFailure;
        this.onSuccess = onSuccess;
    }

    private FunctionEventInvokeConfigDestinationConfigGetArgs() {
        this.onFailure = Output.empty();
        this.onSuccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs> onFailure;
        private @Nullable Output<FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs> onSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
        }

        public Builder onFailure(@Nullable Output<FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs> onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        public Builder onFailure(@Nullable FunctionEventInvokeConfigDestinationConfigOnFailureGetArgs onFailure) {
            this.onFailure = Output.ofNullable(onFailure);
            return this;
        }
        public Builder onSuccess(@Nullable Output<FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs> onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }
        public Builder onSuccess(@Nullable FunctionEventInvokeConfigDestinationConfigOnSuccessGetArgs onSuccess) {
            this.onSuccess = Output.ofNullable(onSuccess);
            return this;
        }        public FunctionEventInvokeConfigDestinationConfigGetArgs build() {
            return new FunctionEventInvokeConfigDestinationConfigGetArgs(onFailure, onSuccess);
        }
    }
}
