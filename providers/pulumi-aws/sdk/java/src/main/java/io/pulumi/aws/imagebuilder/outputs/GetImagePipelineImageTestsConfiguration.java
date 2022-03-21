// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetImagePipelineImageTestsConfiguration {
    /**
     * Whether image tests are enabled.
     * 
     */
    private final Boolean imageTestsEnabled;
    /**
     * Number of minutes before image tests time out.
     * 
     */
    private final Integer timeoutMinutes;

    @CustomType.Constructor
    private GetImagePipelineImageTestsConfiguration(
        @CustomType.Parameter("imageTestsEnabled") Boolean imageTestsEnabled,
        @CustomType.Parameter("timeoutMinutes") Integer timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    /**
     * Whether image tests are enabled.
     * 
    */
    public Boolean getImageTestsEnabled() {
        return this.imageTestsEnabled;
    }
    /**
     * Number of minutes before image tests time out.
     * 
    */
    public Integer getTimeoutMinutes() {
        return this.timeoutMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineImageTestsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean imageTestsEnabled;
        private Integer timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineImageTestsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder imageTestsEnabled(Boolean imageTestsEnabled) {
            this.imageTestsEnabled = Objects.requireNonNull(imageTestsEnabled);
            return this;
        }
        public Builder timeoutMinutes(Integer timeoutMinutes) {
            this.timeoutMinutes = Objects.requireNonNull(timeoutMinutes);
            return this;
        }        public GetImagePipelineImageTestsConfiguration build() {
            return new GetImagePipelineImageTestsConfiguration(imageTestsEnabled, timeoutMinutes);
        }
    }
}
