// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.LoggingRuleResponseHiddenPropertyPaths;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoggingRuleResponse {
    private final String action;
    private final String detailLevel;
    private final String direction;
    private final @Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths;

    @OutputCustomType.Constructor({"action","detailLevel","direction","hiddenPropertyPaths"})
    private LoggingRuleResponse(
        String action,
        String detailLevel,
        String direction,
        @Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths) {
        this.action = Objects.requireNonNull(action);
        this.detailLevel = Objects.requireNonNull(detailLevel);
        this.direction = Objects.requireNonNull(direction);
        this.hiddenPropertyPaths = hiddenPropertyPaths;
    }

    public String getAction() {
        return this.action;
    }
    public String getDetailLevel() {
        return this.detailLevel;
    }
    public String getDirection() {
        return this.direction;
    }
    public Optional<LoggingRuleResponseHiddenPropertyPaths> getHiddenPropertyPaths() {
        return Optional.ofNullable(this.hiddenPropertyPaths);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String detailLevel;
        private String direction;
        private @Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.detailLevel = defaults.detailLevel;
    	      this.direction = defaults.direction;
    	      this.hiddenPropertyPaths = defaults.hiddenPropertyPaths;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDetailLevel(String detailLevel) {
            this.detailLevel = Objects.requireNonNull(detailLevel);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setHiddenPropertyPaths(@Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths) {
            this.hiddenPropertyPaths = hiddenPropertyPaths;
            return this;
        }

        public LoggingRuleResponse build() {
            return new LoggingRuleResponse(action, detailLevel, direction, hiddenPropertyPaths);
        }
    }
}
