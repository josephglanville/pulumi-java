// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotfleethub;

import io.pulumi.awsnative.iotfleethub.inputs.ApplicationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * Application Description, should be between 1 and 2048 characters.
     * 
     */
    @Import(name="applicationDescription")
      private final @Nullable Output<String> applicationDescription;

    public Output<String> getApplicationDescription() {
        return this.applicationDescription == null ? Output.empty() : this.applicationDescription;
    }

    /**
     * Application Name, should be between 1 and 256 characters.
     * 
     */
    @Import(name="applicationName")
      private final @Nullable Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName == null ? Output.empty() : this.applicationName;
    }

    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core. For more info on configuring this attribute, see https://docs.aws.amazon.com/iot/latest/apireference/API_iotfleethub_CreateApplication.html#API_iotfleethub_CreateApplication_RequestSyntax
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the application.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ApplicationTagArgs>> tags;

    public Output<List<ApplicationTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Output<String> applicationDescription,
        @Nullable Output<String> applicationName,
        Output<String> roleArn,
        @Nullable Output<List<ApplicationTagArgs>> tags) {
        this.applicationDescription = applicationDescription;
        this.applicationName = applicationName;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.applicationDescription = Output.empty();
        this.applicationName = Output.empty();
        this.roleArn = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationDescription;
        private @Nullable Output<String> applicationName;
        private Output<String> roleArn;
        private @Nullable Output<List<ApplicationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDescription = defaults.applicationDescription;
    	      this.applicationName = defaults.applicationName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder applicationDescription(@Nullable Output<String> applicationDescription) {
            this.applicationDescription = applicationDescription;
            return this;
        }
        public Builder applicationDescription(@Nullable String applicationDescription) {
            this.applicationDescription = Output.ofNullable(applicationDescription);
            return this;
        }
        public Builder applicationName(@Nullable Output<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Output.ofNullable(applicationName);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<List<ApplicationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ApplicationTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ApplicationTagArgs... tags) {
            return tags(List.of(tags));
        }        public ApplicationArgs build() {
            return new ApplicationArgs(applicationDescription, applicationName, roleArn, tags);
        }
    }
}
