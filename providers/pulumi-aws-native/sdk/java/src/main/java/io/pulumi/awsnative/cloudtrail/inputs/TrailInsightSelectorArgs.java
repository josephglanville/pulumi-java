// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailInsightSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailInsightSelectorArgs Empty = new TrailInsightSelectorArgs();

    @InputImport(name="insightType")
    private final @Nullable Input<String> insightType;

    public Input<String> getInsightType() {
        return this.insightType == null ? Input.empty() : this.insightType;
    }

    public TrailInsightSelectorArgs(@Nullable Input<String> insightType) {
        this.insightType = insightType;
    }

    private TrailInsightSelectorArgs() {
        this.insightType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailInsightSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> insightType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailInsightSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightType = defaults.insightType;
        }

        public Builder setInsightType(@Nullable Input<String> insightType) {
            this.insightType = insightType;
            return this;
        }

        public Builder setInsightType(@Nullable String insightType) {
            this.insightType = Input.ofNullable(insightType);
            return this;
        }

        public TrailInsightSelectorArgs build() {
            return new TrailInsightSelectorArgs(insightType);
        }
    }
}