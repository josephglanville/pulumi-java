// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.aws.appsync.outputs.ResolverSyncConfigLambdaConflictHandlerConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResolverSyncConfig {
    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    private final @Nullable String conflictDetection;
    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    private final @Nullable String conflictHandler;
    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    private final @Nullable ResolverSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig;

    @CustomType.Constructor
    private ResolverSyncConfig(
        @CustomType.Parameter("conflictDetection") @Nullable String conflictDetection,
        @CustomType.Parameter("conflictHandler") @Nullable String conflictHandler,
        @CustomType.Parameter("lambdaConflictHandlerConfig") @Nullable ResolverSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig) {
        this.conflictDetection = conflictDetection;
        this.conflictHandler = conflictHandler;
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
    */
    public Optional<String> getConflictDetection() {
        return Optional.ofNullable(this.conflictDetection);
    }
    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
    */
    public Optional<String> getConflictHandler() {
        return Optional.ofNullable(this.conflictHandler);
    }
    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
    */
    public Optional<ResolverSyncConfigLambdaConflictHandlerConfig> getLambdaConflictHandlerConfig() {
        return Optional.ofNullable(this.lambdaConflictHandlerConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverSyncConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conflictDetection;
        private @Nullable String conflictHandler;
        private @Nullable ResolverSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverSyncConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictDetection = defaults.conflictDetection;
    	      this.conflictHandler = defaults.conflictHandler;
    	      this.lambdaConflictHandlerConfig = defaults.lambdaConflictHandlerConfig;
        }

        public Builder conflictDetection(@Nullable String conflictDetection) {
            this.conflictDetection = conflictDetection;
            return this;
        }
        public Builder conflictHandler(@Nullable String conflictHandler) {
            this.conflictHandler = conflictHandler;
            return this;
        }
        public Builder lambdaConflictHandlerConfig(@Nullable ResolverSyncConfigLambdaConflictHandlerConfig lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }        public ResolverSyncConfig build() {
            return new ResolverSyncConfig(conflictDetection, conflictHandler, lambdaConflictHandlerConfig);
        }
    }
}