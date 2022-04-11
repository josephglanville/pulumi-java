// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppCampaignHookArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppCampaignHookArgs Empty = new AppCampaignHookArgs();

    /**
     * Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    @Import(name="lambdaFunctionName")
      private final @Nullable Output<String> lambdaFunctionName;

    public Output<String> getLambdaFunctionName() {
        return this.lambdaFunctionName == null ? Codegen.empty() : this.lambdaFunctionName;
    }

    /**
     * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    @Import(name="webUrl")
      private final @Nullable Output<String> webUrl;

    public Output<String> getWebUrl() {
        return this.webUrl == null ? Codegen.empty() : this.webUrl;
    }

    public AppCampaignHookArgs(
        @Nullable Output<String> lambdaFunctionName,
        @Nullable Output<String> mode,
        @Nullable Output<String> webUrl) {
        this.lambdaFunctionName = lambdaFunctionName;
        this.mode = mode;
        this.webUrl = webUrl;
    }

    private AppCampaignHookArgs() {
        this.lambdaFunctionName = Codegen.empty();
        this.mode = Codegen.empty();
        this.webUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCampaignHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lambdaFunctionName;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> webUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCampaignHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaFunctionName = defaults.lambdaFunctionName;
    	      this.mode = defaults.mode;
    	      this.webUrl = defaults.webUrl;
        }

        public Builder lambdaFunctionName(@Nullable Output<String> lambdaFunctionName) {
            this.lambdaFunctionName = lambdaFunctionName;
            return this;
        }
        public Builder lambdaFunctionName(@Nullable String lambdaFunctionName) {
            this.lambdaFunctionName = Codegen.ofNullable(lambdaFunctionName);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder webUrl(@Nullable Output<String> webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public Builder webUrl(@Nullable String webUrl) {
            this.webUrl = Codegen.ofNullable(webUrl);
            return this;
        }        public AppCampaignHookArgs build() {
            return new AppCampaignHookArgs(lambdaFunctionName, mode, webUrl);
        }
    }
}
