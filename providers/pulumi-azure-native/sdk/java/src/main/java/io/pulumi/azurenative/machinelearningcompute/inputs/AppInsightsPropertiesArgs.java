// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppInsightsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppInsightsPropertiesArgs Empty = new AppInsightsPropertiesArgs();

    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public AppInsightsPropertiesArgs(@Nullable Input<String> resourceId) {
        this.resourceId = resourceId;
    }

    private AppInsightsPropertiesArgs() {
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppInsightsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppInsightsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public AppInsightsPropertiesArgs build() {
            return new AppInsightsPropertiesArgs(resourceId);
        }
    }
}
