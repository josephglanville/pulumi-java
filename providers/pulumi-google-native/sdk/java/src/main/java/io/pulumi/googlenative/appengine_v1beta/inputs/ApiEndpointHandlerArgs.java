// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Uses Google Cloud Endpoints to handle requests.
 * 
 */
public final class ApiEndpointHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiEndpointHandlerArgs Empty = new ApiEndpointHandlerArgs();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="scriptPath")
      private final @Nullable Output<String> scriptPath;

    public Output<String> getScriptPath() {
        return this.scriptPath == null ? Output.empty() : this.scriptPath;
    }

    public ApiEndpointHandlerArgs(@Nullable Output<String> scriptPath) {
        this.scriptPath = scriptPath;
    }

    private ApiEndpointHandlerArgs() {
        this.scriptPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiEndpointHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiEndpointHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder scriptPath(@Nullable Output<String> scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Builder scriptPath(@Nullable String scriptPath) {
            this.scriptPath = Output.ofNullable(scriptPath);
            return this;
        }
        public ApiEndpointHandlerArgs build() {
            return new ApiEndpointHandlerArgs(scriptPath);
        }
    }
}
