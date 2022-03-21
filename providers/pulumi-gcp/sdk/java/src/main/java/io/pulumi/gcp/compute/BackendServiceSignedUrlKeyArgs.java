// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceSignedUrlKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceSignedUrlKeyArgs Empty = new BackendServiceSignedUrlKeyArgs();

    /**
     * The backend service this signed URL key belongs.
     * 
     */
    @Import(name="backendService", required=true)
      private final Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService;
    }

    /**
     * 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="keyValue", required=true)
      private final Output<String> keyValue;

    public Output<String> getKeyValue() {
        return this.keyValue;
    }

    /**
     * Name of the signed URL key.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public BackendServiceSignedUrlKeyArgs(
        Output<String> backendService,
        Output<String> keyValue,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.keyValue = Objects.requireNonNull(keyValue, "expected parameter 'keyValue' to be non-null");
        this.name = name;
        this.project = project;
    }

    private BackendServiceSignedUrlKeyArgs() {
        this.backendService = Output.empty();
        this.keyValue = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceSignedUrlKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backendService;
        private Output<String> keyValue;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceSignedUrlKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.keyValue = defaults.keyValue;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder backendService(Output<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder backendService(String backendService) {
            this.backendService = Output.of(Objects.requireNonNull(backendService));
            return this;
        }
        public Builder keyValue(Output<String> keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }
        public Builder keyValue(String keyValue) {
            this.keyValue = Output.of(Objects.requireNonNull(keyValue));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public BackendServiceSignedUrlKeyArgs build() {
            return new BackendServiceSignedUrlKeyArgs(backendService, keyValue, name, project);
        }
    }
}
