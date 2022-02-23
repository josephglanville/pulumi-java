// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
 * 
 */
public final class ApplicationInsightsComponentAnalyticsItemPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInsightsComponentAnalyticsItemPropertiesArgs Empty = new ApplicationInsightsComponentAnalyticsItemPropertiesArgs();

    /**
     * A function alias, used when the type of the item is Function
     * 
     */
    @InputImport(name="functionAlias")
      private final @Nullable Input<String> functionAlias;

    public Input<String> getFunctionAlias() {
        return this.functionAlias == null ? Input.empty() : this.functionAlias;
    }

    public ApplicationInsightsComponentAnalyticsItemPropertiesArgs(@Nullable Input<String> functionAlias) {
        this.functionAlias = functionAlias;
    }

    private ApplicationInsightsComponentAnalyticsItemPropertiesArgs() {
        this.functionAlias = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentAnalyticsItemPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionAlias;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentAnalyticsItemPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAlias = defaults.functionAlias;
        }

        public Builder setFunctionAlias(@Nullable Input<String> functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = Input.ofNullable(functionAlias);
            return this;
        }
        public ApplicationInsightsComponentAnalyticsItemPropertiesArgs build() {
            return new ApplicationInsightsComponentAnalyticsItemPropertiesArgs(functionAlias);
        }
    }
}
