// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverSyncConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverSyncConfigArgs Empty = new ResolverSyncConfigArgs();

    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    @Import(name="conflictDetection")
      private final @Nullable Output<String> conflictDetection;

    public Output<String> getConflictDetection() {
        return this.conflictDetection == null ? Output.empty() : this.conflictDetection;
    }

    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    @Import(name="conflictHandler")
      private final @Nullable Output<String> conflictHandler;

    public Output<String> getConflictHandler() {
        return this.conflictHandler == null ? Output.empty() : this.conflictHandler;
    }

    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    @Import(name="lambdaConflictHandlerConfig")
      private final @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig;

    public Output<ResolverSyncConfigLambdaConflictHandlerConfigArgs> getLambdaConflictHandlerConfig() {
        return this.lambdaConflictHandlerConfig == null ? Output.empty() : this.lambdaConflictHandlerConfig;
    }

    public ResolverSyncConfigArgs(
        @Nullable Output<String> conflictDetection,
        @Nullable Output<String> conflictHandler,
        @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig) {
        this.conflictDetection = conflictDetection;
        this.conflictHandler = conflictHandler;
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    private ResolverSyncConfigArgs() {
        this.conflictDetection = Output.empty();
        this.conflictHandler = Output.empty();
        this.lambdaConflictHandlerConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverSyncConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> conflictDetection;
        private @Nullable Output<String> conflictHandler;
        private @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverSyncConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictDetection = defaults.conflictDetection;
    	      this.conflictHandler = defaults.conflictHandler;
    	      this.lambdaConflictHandlerConfig = defaults.lambdaConflictHandlerConfig;
        }

        public Builder conflictDetection(@Nullable Output<String> conflictDetection) {
            this.conflictDetection = conflictDetection;
            return this;
        }
        public Builder conflictDetection(@Nullable String conflictDetection) {
            this.conflictDetection = Output.ofNullable(conflictDetection);
            return this;
        }
        public Builder conflictHandler(@Nullable Output<String> conflictHandler) {
            this.conflictHandler = conflictHandler;
            return this;
        }
        public Builder conflictHandler(@Nullable String conflictHandler) {
            this.conflictHandler = Output.ofNullable(conflictHandler);
            return this;
        }
        public Builder lambdaConflictHandlerConfig(@Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }
        public Builder lambdaConflictHandlerConfig(@Nullable ResolverSyncConfigLambdaConflictHandlerConfigArgs lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = Output.ofNullable(lambdaConflictHandlerConfig);
            return this;
        }        public ResolverSyncConfigArgs build() {
            return new ResolverSyncConfigArgs(conflictDetection, conflictHandler, lambdaConflictHandlerConfig);
        }
    }
}