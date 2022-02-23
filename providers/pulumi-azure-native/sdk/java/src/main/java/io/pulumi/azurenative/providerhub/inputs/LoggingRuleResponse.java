// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.LoggingRuleResponseHiddenPropertyPaths;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingRuleResponse Empty = new LoggingRuleResponse();

    @InputImport(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    @InputImport(name="detailLevel", required=true)
      private final String detailLevel;

    public String getDetailLevel() {
        return this.detailLevel;
    }

    @InputImport(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    @InputImport(name="hiddenPropertyPaths")
      private final @Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths;

    public Optional<LoggingRuleResponseHiddenPropertyPaths> getHiddenPropertyPaths() {
        return this.hiddenPropertyPaths == null ? Optional.empty() : Optional.ofNullable(this.hiddenPropertyPaths);
    }

    public LoggingRuleResponse(
        String action,
        String detailLevel,
        String direction,
        @Nullable LoggingRuleResponseHiddenPropertyPaths hiddenPropertyPaths) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.detailLevel = Objects.requireNonNull(detailLevel, "expected parameter 'detailLevel' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.hiddenPropertyPaths = hiddenPropertyPaths;
    }

    private LoggingRuleResponse() {
        this.action = null;
        this.detailLevel = null;
        this.direction = null;
        this.hiddenPropertyPaths = null;
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
