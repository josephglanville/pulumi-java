// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotfleethub;

import io.pulumi.awsnative.iotfleethub.inputs.ApplicationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="applicationDescription")
      private final @Nullable Input<String> applicationDescription;

    public Input<String> getApplicationDescription() {
        return this.applicationDescription == null ? Input.empty() : this.applicationDescription;
    }

    /**
     * Application Name, should be between 1 and 256 characters.
     * 
     */
    @InputImport(name="applicationName")
      private final @Nullable Input<String> applicationName;

    public Input<String> getApplicationName() {
        return this.applicationName == null ? Input.empty() : this.applicationName;
    }

    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core. For more info on configuring this attribute, see https://docs.aws.amazon.com/iot/latest/apireference/API_iotfleethub_CreateApplication.html#API_iotfleethub_CreateApplication_RequestSyntax
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the application.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ApplicationTagArgs>> tags;

    public Input<List<ApplicationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Input<String> applicationDescription,
        @Nullable Input<String> applicationName,
        Input<String> roleArn,
        @Nullable Input<List<ApplicationTagArgs>> tags) {
        this.applicationDescription = applicationDescription;
        this.applicationName = applicationName;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.applicationDescription = Input.empty();
        this.applicationName = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationDescription;
        private @Nullable Input<String> applicationName;
        private Input<String> roleArn;
        private @Nullable Input<List<ApplicationTagArgs>> tags;

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

        public Builder setApplicationDescription(@Nullable Input<String> applicationDescription) {
            this.applicationDescription = applicationDescription;
            return this;
        }

        public Builder setApplicationDescription(@Nullable String applicationDescription) {
            this.applicationDescription = Input.ofNullable(applicationDescription);
            return this;
        }

        public Builder setApplicationName(@Nullable Input<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setApplicationName(@Nullable String applicationName) {
            this.applicationName = Input.ofNullable(applicationName);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ApplicationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ApplicationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(applicationDescription, applicationName, roleArn, tags);
        }
    }
}
