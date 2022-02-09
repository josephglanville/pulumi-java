// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.LoggingDetails;
import io.pulumi.azurenative.providerhub.enums.LoggingDirections;
import io.pulumi.azurenative.providerhub.inputs.LoggingRuleHiddenPropertyPathsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingRuleArgs Empty = new LoggingRuleArgs();

    @InputImport(name="action", required=true)
    private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    @InputImport(name="detailLevel", required=true)
    private final Input<Either<String,LoggingDetails>> detailLevel;

    public Input<Either<String,LoggingDetails>> getDetailLevel() {
        return this.detailLevel;
    }

    @InputImport(name="direction", required=true)
    private final Input<Either<String,LoggingDirections>> direction;

    public Input<Either<String,LoggingDirections>> getDirection() {
        return this.direction;
    }

    @InputImport(name="hiddenPropertyPaths")
    private final @Nullable Input<LoggingRuleHiddenPropertyPathsArgs> hiddenPropertyPaths;

    public Input<LoggingRuleHiddenPropertyPathsArgs> getHiddenPropertyPaths() {
        return this.hiddenPropertyPaths == null ? Input.empty() : this.hiddenPropertyPaths;
    }

    public LoggingRuleArgs(
        Input<String> action,
        Input<Either<String,LoggingDetails>> detailLevel,
        Input<Either<String,LoggingDirections>> direction,
        @Nullable Input<LoggingRuleHiddenPropertyPathsArgs> hiddenPropertyPaths) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.detailLevel = Objects.requireNonNull(detailLevel, "expected parameter 'detailLevel' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.hiddenPropertyPaths = hiddenPropertyPaths;
    }

    private LoggingRuleArgs() {
        this.action = Input.empty();
        this.detailLevel = Input.empty();
        this.direction = Input.empty();
        this.hiddenPropertyPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private Input<Either<String,LoggingDetails>> detailLevel;
        private Input<Either<String,LoggingDirections>> direction;
        private @Nullable Input<LoggingRuleHiddenPropertyPathsArgs> hiddenPropertyPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.detailLevel = defaults.detailLevel;
    	      this.direction = defaults.direction;
    	      this.hiddenPropertyPaths = defaults.hiddenPropertyPaths;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setDetailLevel(Input<Either<String,LoggingDetails>> detailLevel) {
            this.detailLevel = Objects.requireNonNull(detailLevel);
            return this;
        }

        public Builder setDetailLevel(Either<String,LoggingDetails> detailLevel) {
            this.detailLevel = Input.of(Objects.requireNonNull(detailLevel));
            return this;
        }

        public Builder setDirection(Input<Either<String,LoggingDirections>> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(Either<String,LoggingDirections> direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder setHiddenPropertyPaths(@Nullable Input<LoggingRuleHiddenPropertyPathsArgs> hiddenPropertyPaths) {
            this.hiddenPropertyPaths = hiddenPropertyPaths;
            return this;
        }

        public Builder setHiddenPropertyPaths(@Nullable LoggingRuleHiddenPropertyPathsArgs hiddenPropertyPaths) {
            this.hiddenPropertyPaths = Input.ofNullable(hiddenPropertyPaths);
            return this;
        }

        public LoggingRuleArgs build() {
            return new LoggingRuleArgs(action, detailLevel, direction, hiddenPropertyPaths);
        }
    }
}
