// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs();

    /**
     * Information about the Amazon S3 bucket containing the application code.
     * 
     */
    @Import(name="s3ContentLocation")
      private final @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation;

    public Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> getS3ContentLocation() {
        return this.s3ContentLocation == null ? Output.empty() : this.s3ContentLocation;
    }

    /**
     * The text-format code for the application.
     * 
     */
    @Import(name="textContent")
      private final @Nullable Output<String> textContent;

    public Output<String> getTextContent() {
        return this.textContent == null ? Output.empty() : this.textContent;
    }

    public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs(
        @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation,
        @Nullable Output<String> textContent) {
        this.s3ContentLocation = s3ContentLocation;
        this.textContent = textContent;
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs() {
        this.s3ContentLocation = Output.empty();
        this.textContent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation;
        private @Nullable Output<String> textContent;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3ContentLocation = defaults.s3ContentLocation;
    	      this.textContent = defaults.textContent;
        }

        public Builder s3ContentLocation(@Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation) {
            this.s3ContentLocation = s3ContentLocation;
            return this;
        }
        public Builder s3ContentLocation(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs s3ContentLocation) {
            this.s3ContentLocation = Output.ofNullable(s3ContentLocation);
            return this;
        }
        public Builder textContent(@Nullable Output<String> textContent) {
            this.textContent = textContent;
            return this;
        }
        public Builder textContent(@Nullable String textContent) {
            this.textContent = Output.ofNullable(textContent);
            return this;
        }        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs(s3ContentLocation, textContent);
        }
    }
}
