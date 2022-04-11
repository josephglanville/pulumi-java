// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * The name of the app.
     * 
     */
    @Import(name="appName", required=true)
      private final Output<String> appName;

    public Output<String> getAppName() {
        return this.appName;
    }

    /**
     * The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
     * 
     */
    @Import(name="appType", required=true)
      private final Output<String> appType;

    public Output<String> getAppType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @Import(name="domainId", required=true)
      private final Output<String> domainId;

    public Output<String> getDomainId() {
        return this.domainId;
    }

    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
     * 
     */
    @Import(name="resourceSpec")
      private final @Nullable Output<AppResourceSpecArgs> resourceSpec;

    public Output<AppResourceSpecArgs> getResourceSpec() {
        return this.resourceSpec == null ? Codegen.empty() : this.resourceSpec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The user profile name.
     * 
     */
    @Import(name="userProfileName", required=true)
      private final Output<String> userProfileName;

    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }

    public AppArgs(
        Output<String> appName,
        Output<String> appType,
        Output<String> domainId,
        @Nullable Output<AppResourceSpecArgs> resourceSpec,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userProfileName) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.appType = Objects.requireNonNull(appType, "expected parameter 'appType' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.resourceSpec = resourceSpec;
        this.tags = tags;
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
    }

    private AppArgs() {
        this.appName = Codegen.empty();
        this.appType = Codegen.empty();
        this.domainId = Codegen.empty();
        this.resourceSpec = Codegen.empty();
        this.tags = Codegen.empty();
        this.userProfileName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appName;
        private Output<String> appType;
        private Output<String> domainId;
        private @Nullable Output<AppResourceSpecArgs> resourceSpec;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.appType = defaults.appType;
    	      this.domainId = defaults.domainId;
    	      this.resourceSpec = defaults.resourceSpec;
    	      this.tags = defaults.tags;
    	      this.userProfileName = defaults.userProfileName;
        }

        public Builder appName(Output<String> appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        public Builder appName(String appName) {
            this.appName = Output.of(Objects.requireNonNull(appName));
            return this;
        }
        public Builder appType(Output<String> appType) {
            this.appType = Objects.requireNonNull(appType);
            return this;
        }
        public Builder appType(String appType) {
            this.appType = Output.of(Objects.requireNonNull(appType));
            return this;
        }
        public Builder domainId(Output<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        public Builder domainId(String domainId) {
            this.domainId = Output.of(Objects.requireNonNull(domainId));
            return this;
        }
        public Builder resourceSpec(@Nullable Output<AppResourceSpecArgs> resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public Builder resourceSpec(@Nullable AppResourceSpecArgs resourceSpec) {
            this.resourceSpec = Codegen.ofNullable(resourceSpec);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userProfileName(Output<String> userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }
        public Builder userProfileName(String userProfileName) {
            this.userProfileName = Output.of(Objects.requireNonNull(userProfileName));
            return this;
        }        public AppArgs build() {
            return new AppArgs(appName, appType, domainId, resourceSpec, tags, userProfileName);
        }
    }
}
