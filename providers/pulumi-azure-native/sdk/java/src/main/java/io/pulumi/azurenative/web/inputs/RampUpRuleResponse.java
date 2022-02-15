// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RampUpRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RampUpRuleResponse Empty = new RampUpRuleResponse();

    @InputImport(name="actionHostName")
    private final @Nullable String actionHostName;

    public Optional<String> getActionHostName() {
        return this.actionHostName == null ? Optional.empty() : Optional.ofNullable(this.actionHostName);
    }

    @InputImport(name="changeDecisionCallbackUrl")
    private final @Nullable String changeDecisionCallbackUrl;

    public Optional<String> getChangeDecisionCallbackUrl() {
        return this.changeDecisionCallbackUrl == null ? Optional.empty() : Optional.ofNullable(this.changeDecisionCallbackUrl);
    }

    @InputImport(name="changeIntervalInMinutes")
    private final @Nullable Integer changeIntervalInMinutes;

    public Optional<Integer> getChangeIntervalInMinutes() {
        return this.changeIntervalInMinutes == null ? Optional.empty() : Optional.ofNullable(this.changeIntervalInMinutes);
    }

    @InputImport(name="changeStep")
    private final @Nullable Double changeStep;

    public Optional<Double> getChangeStep() {
        return this.changeStep == null ? Optional.empty() : Optional.ofNullable(this.changeStep);
    }

    @InputImport(name="maxReroutePercentage")
    private final @Nullable Double maxReroutePercentage;

    public Optional<Double> getMaxReroutePercentage() {
        return this.maxReroutePercentage == null ? Optional.empty() : Optional.ofNullable(this.maxReroutePercentage);
    }

    @InputImport(name="minReroutePercentage")
    private final @Nullable Double minReroutePercentage;

    public Optional<Double> getMinReroutePercentage() {
        return this.minReroutePercentage == null ? Optional.empty() : Optional.ofNullable(this.minReroutePercentage);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="reroutePercentage")
    private final @Nullable Double reroutePercentage;

    public Optional<Double> getReroutePercentage() {
        return this.reroutePercentage == null ? Optional.empty() : Optional.ofNullable(this.reroutePercentage);
    }

    public RampUpRuleResponse(
        @Nullable String actionHostName,
        @Nullable String changeDecisionCallbackUrl,
        @Nullable Integer changeIntervalInMinutes,
        @Nullable Double changeStep,
        @Nullable Double maxReroutePercentage,
        @Nullable Double minReroutePercentage,
        @Nullable String name,
        @Nullable Double reroutePercentage) {
        this.actionHostName = actionHostName;
        this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
        this.changeIntervalInMinutes = changeIntervalInMinutes;
        this.changeStep = changeStep;
        this.maxReroutePercentage = maxReroutePercentage;
        this.minReroutePercentage = minReroutePercentage;
        this.name = name;
        this.reroutePercentage = reroutePercentage;
    }

    private RampUpRuleResponse() {
        this.actionHostName = null;
        this.changeDecisionCallbackUrl = null;
        this.changeIntervalInMinutes = null;
        this.changeStep = null;
        this.maxReroutePercentage = null;
        this.minReroutePercentage = null;
        this.name = null;
        this.reroutePercentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RampUpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionHostName;
        private @Nullable String changeDecisionCallbackUrl;
        private @Nullable Integer changeIntervalInMinutes;
        private @Nullable Double changeStep;
        private @Nullable Double maxReroutePercentage;
        private @Nullable Double minReroutePercentage;
        private @Nullable String name;
        private @Nullable Double reroutePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RampUpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionHostName = defaults.actionHostName;
    	      this.changeDecisionCallbackUrl = defaults.changeDecisionCallbackUrl;
    	      this.changeIntervalInMinutes = defaults.changeIntervalInMinutes;
    	      this.changeStep = defaults.changeStep;
    	      this.maxReroutePercentage = defaults.maxReroutePercentage;
    	      this.minReroutePercentage = defaults.minReroutePercentage;
    	      this.name = defaults.name;
    	      this.reroutePercentage = defaults.reroutePercentage;
        }

        public Builder setActionHostName(@Nullable String actionHostName) {
            this.actionHostName = actionHostName;
            return this;
        }

        public Builder setChangeDecisionCallbackUrl(@Nullable String changeDecisionCallbackUrl) {
            this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
            return this;
        }

        public Builder setChangeIntervalInMinutes(@Nullable Integer changeIntervalInMinutes) {
            this.changeIntervalInMinutes = changeIntervalInMinutes;
            return this;
        }

        public Builder setChangeStep(@Nullable Double changeStep) {
            this.changeStep = changeStep;
            return this;
        }

        public Builder setMaxReroutePercentage(@Nullable Double maxReroutePercentage) {
            this.maxReroutePercentage = maxReroutePercentage;
            return this;
        }

        public Builder setMinReroutePercentage(@Nullable Double minReroutePercentage) {
            this.minReroutePercentage = minReroutePercentage;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setReroutePercentage(@Nullable Double reroutePercentage) {
            this.reroutePercentage = reroutePercentage;
            return this;
        }

        public RampUpRuleResponse build() {
            return new RampUpRuleResponse(actionHostName, changeDecisionCallbackUrl, changeIntervalInMinutes, changeStep, maxReroutePercentage, minReroutePercentage, name, reroutePercentage);
        }
    }
}