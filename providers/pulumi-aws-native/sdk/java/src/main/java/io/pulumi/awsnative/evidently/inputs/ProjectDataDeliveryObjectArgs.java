// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.ProjectS3DestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Destinations for data.
 * 
 */
public final class ProjectDataDeliveryObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectDataDeliveryObjectArgs Empty = new ProjectDataDeliveryObjectArgs();

    @Import(name="logGroup")
      private final @Nullable Output<String> logGroup;

    public Output<String> getLogGroup() {
        return this.logGroup == null ? Codegen.empty() : this.logGroup;
    }

    @Import(name="s3")
      private final @Nullable Output<ProjectS3DestinationArgs> s3;

    public Output<ProjectS3DestinationArgs> getS3() {
        return this.s3 == null ? Codegen.empty() : this.s3;
    }

    public ProjectDataDeliveryObjectArgs(
        @Nullable Output<String> logGroup,
        @Nullable Output<ProjectS3DestinationArgs> s3) {
        this.logGroup = logGroup;
        this.s3 = s3;
    }

    private ProjectDataDeliveryObjectArgs() {
        this.logGroup = Codegen.empty();
        this.s3 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDataDeliveryObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> logGroup;
        private @Nullable Output<ProjectS3DestinationArgs> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDataDeliveryObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroup = defaults.logGroup;
    	      this.s3 = defaults.s3;
        }

        public Builder logGroup(@Nullable Output<String> logGroup) {
            this.logGroup = logGroup;
            return this;
        }
        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = Codegen.ofNullable(logGroup);
            return this;
        }
        public Builder s3(@Nullable Output<ProjectS3DestinationArgs> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable ProjectS3DestinationArgs s3) {
            this.s3 = Codegen.ofNullable(s3);
            return this;
        }        public ProjectDataDeliveryObjectArgs build() {
            return new ProjectDataDeliveryObjectArgs(logGroup, s3);
        }
    }
}
