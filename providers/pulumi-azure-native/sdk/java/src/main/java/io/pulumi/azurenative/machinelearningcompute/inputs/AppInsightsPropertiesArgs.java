// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of App Insights.
 * 
 */
public final class AppInsightsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppInsightsPropertiesArgs Empty = new AppInsightsPropertiesArgs();

    /**
     * ARM resource ID of the App Insights.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public AppInsightsPropertiesArgs(@Nullable Output<String> resourceId) {
        this.resourceId = resourceId;
    }

    private AppInsightsPropertiesArgs() {
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppInsightsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppInsightsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }        public AppInsightsPropertiesArgs build() {
            return new AppInsightsPropertiesArgs(resourceId);
        }
    }
}
