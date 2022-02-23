// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.ProjectS3DestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Destinations for data.
 * 
 */
public final class ProjectDataDeliveryObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectDataDeliveryObjectArgs Empty = new ProjectDataDeliveryObjectArgs();

    @InputImport(name="logGroup")
      private final @Nullable Input<String> logGroup;

    public Input<String> getLogGroup() {
        return this.logGroup == null ? Input.empty() : this.logGroup;
    }

    @InputImport(name="s3")
      private final @Nullable Input<ProjectS3DestinationArgs> s3;

    public Input<ProjectS3DestinationArgs> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    public ProjectDataDeliveryObjectArgs(
        @Nullable Input<String> logGroup,
        @Nullable Input<ProjectS3DestinationArgs> s3) {
        this.logGroup = logGroup;
        this.s3 = s3;
    }

    private ProjectDataDeliveryObjectArgs() {
        this.logGroup = Input.empty();
        this.s3 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDataDeliveryObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logGroup;
        private @Nullable Input<ProjectS3DestinationArgs> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDataDeliveryObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroup = defaults.logGroup;
    	      this.s3 = defaults.s3;
        }

        public Builder setLogGroup(@Nullable Input<String> logGroup) {
            this.logGroup = logGroup;
            return this;
        }

        public Builder setLogGroup(@Nullable String logGroup) {
            this.logGroup = Input.ofNullable(logGroup);
            return this;
        }

        public Builder setS3(@Nullable Input<ProjectS3DestinationArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable ProjectS3DestinationArgs s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }
        public ProjectDataDeliveryObjectArgs build() {
            return new ProjectDataDeliveryObjectArgs(logGroup, s3);
        }
    }
}
