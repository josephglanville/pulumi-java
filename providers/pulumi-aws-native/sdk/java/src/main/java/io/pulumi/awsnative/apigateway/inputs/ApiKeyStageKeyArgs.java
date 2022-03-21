// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiKeyStageKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyStageKeyArgs Empty = new ApiKeyStageKeyArgs();

    /**
     * The ID of a RestApi resource that includes the stage with which you want to associate the API key.
     * 
     */
    @Import(name="restApiId")
      private final @Nullable Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId == null ? Output.empty() : this.restApiId;
    }

    /**
     * The name of the stage with which to associate the API key. The stage must be included in the RestApi resource that you specified in the RestApiId property.
     * 
     */
    @Import(name="stageName")
      private final @Nullable Output<String> stageName;

    public Output<String> getStageName() {
        return this.stageName == null ? Output.empty() : this.stageName;
    }

    public ApiKeyStageKeyArgs(
        @Nullable Output<String> restApiId,
        @Nullable Output<String> stageName) {
        this.restApiId = restApiId;
        this.stageName = stageName;
    }

    private ApiKeyStageKeyArgs() {
        this.restApiId = Output.empty();
        this.stageName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyStageKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> restApiId;
        private @Nullable Output<String> stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyStageKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
        }

        public Builder restApiId(@Nullable Output<String> restApiId) {
            this.restApiId = restApiId;
            return this;
        }
        public Builder restApiId(@Nullable String restApiId) {
            this.restApiId = Output.ofNullable(restApiId);
            return this;
        }
        public Builder stageName(@Nullable Output<String> stageName) {
            this.stageName = stageName;
            return this;
        }
        public Builder stageName(@Nullable String stageName) {
            this.stageName = Output.ofNullable(stageName);
            return this;
        }        public ApiKeyStageKeyArgs build() {
            return new ApiKeyStageKeyArgs(restApiId, stageName);
        }
    }
}
